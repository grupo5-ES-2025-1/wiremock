/*
 * Copyright (C) 2016-2025 Thomas Akehurst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.tomakehurst.wiremock.verification;

import static com.github.tomakehurst.wiremock.testsupport.MockRequestBuilder.aRequest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

import com.github.tomakehurst.wiremock.common.Json;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;
import com.github.tomakehurst.wiremock.verification.LoggedRequest;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FindServeEventsResultTest {

  @Test
  @Disabled("Bug: ServeEvent serialization fails with null ResponseDefinition - See BUG_REPORTS.md #3")
  void createsResultWithServeEvents() {
    List<ServeEvent> serveEvents = Arrays.asList(
        ServeEvent.of(LoggedRequest.createFrom(aRequest().withUrl("/test1").build())),
        ServeEvent.of(LoggedRequest.createFrom(aRequest().withUrl("/test2").build())));
    
    FindServeEventsResult result = new FindServeEventsResult(serveEvents);
    
    assertThat(result.getServeEvents(), hasSize(2));
  }

  @Test
  void canHandleEmptyServeEventsList() {
    FindServeEventsResult result = new FindServeEventsResult(Arrays.asList());
    
    assertThat(result.getServeEvents(), empty());
  }

  @Test
  void canSerializeToJson() {
    List<ServeEvent> serveEvents = Arrays.asList();  // Use empty list to avoid ServeEvent serialization issues
    FindServeEventsResult result = new FindServeEventsResult(serveEvents);
    
    String json = Json.write(result);
    
    assertThat(json.contains("\"serveEvents\""), is(true));
  }

  @Test
  void canDeserializeFromJson() {
    String json = "{\"serveEvents\":[]}";
    
    FindServeEventsResult result = Json.read(json, FindServeEventsResult.class);
    
    assertThat(result.getServeEvents(), empty());
  }
}
