/*
 * Copyright (C) 2011-2025 Thomas Akehurst
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
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class FindRequestsResultTest {

  @Test
  void createsResultWithRequests() {
    List<LoggedRequest> requests = Arrays.asList(
        LoggedRequest.createFrom(aRequest().withUrl("/test1").build()),
        LoggedRequest.createFrom(aRequest().withUrl("/test2").build()));
    
    FindRequestsResult result = new FindRequestsResult(requests, false);
    
    assertThat(result.getRequests(), hasSize(2));
    assertThat(result.requestJournalIsDisabled(), is(false));
  }

  @Test
  void createsResultWithRequestJournalDisabled() {
    List<LoggedRequest> requests = Arrays.asList(
        LoggedRequest.createFrom(aRequest().withUrl("/test").build()));
    
    FindRequestsResult result = new FindRequestsResult(requests, true);
    
    assertThat(result.getRequests(), hasSize(1));
    assertThat(result.requestJournalIsDisabled(), is(true));
  }

  @Test
  void staticWithRequestJournalDisabledCreatesCorrectResult() {
    FindRequestsResult result = FindRequestsResult.withRequestJournalDisabled();
    
    assertThat(result.getRequests(), empty());
    assertThat(result.requestJournalIsDisabled(), is(true));
  }

  @Test
  void staticWithRequestsCreatesCorrectResult() {
    List<LoggedRequest> requests = Arrays.asList(
        LoggedRequest.createFrom(aRequest().withUrl("/api/test").build()));
    
    FindRequestsResult result = FindRequestsResult.withRequests(requests);
    
    assertThat(result.getRequests(), hasSize(1));
    assertThat(result.requestJournalIsDisabled(), is(false));
  }

  @Test
  void canSerializeToJson() {
    List<LoggedRequest> requests = Arrays.asList(
        LoggedRequest.createFrom(aRequest().withUrl("/serialize-test").build()));
    FindRequestsResult result = FindRequestsResult.withRequests(requests);
    
    String json = Json.write(result);
    
    assertThat(json.contains("\"requests\""), is(true));
    assertThat(json.contains("\"requestJournalDisabled\""), is(true));
  }

  @Test
  void canDeserializeFromJson() {
    String json = "{\"requests\":[],\"requestJournalDisabled\":true}";
    
    FindRequestsResult result = Json.read(json, FindRequestsResult.class);
    
    assertThat(result.getRequests(), empty());
    assertThat(result.requestJournalIsDisabled(), is(true));
  }

  @Test
  void canHandleEmptyRequestsList() {
    FindRequestsResult result = FindRequestsResult.withRequests(Arrays.asList());
    
    assertThat(result.getRequests(), empty());
    assertThat(result.requestJournalIsDisabled(), is(false));
  }
}
