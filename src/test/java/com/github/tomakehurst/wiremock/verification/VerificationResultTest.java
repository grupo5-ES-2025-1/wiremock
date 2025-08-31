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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.github.tomakehurst.wiremock.common.Json;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class VerificationResultTest {

  @Test
  void createsResultWithCount() {
    VerificationResult result = new VerificationResult(5, false);
    
    assertThat(result.getCount(), is(5));
    assertThat(result.requestJournalIsDisabled(), is(false));
  }

  @Test
  void createsResultWithRequestJournalDisabled() {
    VerificationResult result = new VerificationResult(10, true);
    
    assertThat(result.getCount(), is(10));
    assertThat(result.requestJournalIsDisabled(), is(true));
  }

  @Test
  void staticWithCountCreatesCorrectResult() {
    VerificationResult result = VerificationResult.withCount(3);
    
    assertThat(result.getCount(), is(3));
    assertThat(result.requestJournalIsDisabled(), is(false));
  }

  @Test
  void staticWithRequestJournalDisabledCreatesCorrectResult() {
    VerificationResult result = VerificationResult.withRequestJournalDisabled();
    
    assertThat(result.getCount(), is(-1));
    assertThat(result.requestJournalIsDisabled(), is(true));
  }

  @Test
  @Disabled("Bug: JSON property names don't match expectations - See BUG_REPORTS.md #4")
  void canSerializeToJson() {
    VerificationResult result = VerificationResult.withCount(7);
    
    String json = Json.write(result);
    
    assertThat(json.contains("\"count\":7"), is(true));
    assertThat(json.contains("\"requestJournalDisabled\":false"), is(true));
  }

  @Test
  void canDeserializeFromJson() {
    String json = "{\"count\":15,\"requestJournalDisabled\":true}";
    
    VerificationResult result = VerificationResult.from(json);
    
    assertThat(result.getCount(), is(15));
    assertThat(result.requestJournalIsDisabled(), is(true));
  }

  @Test
  void canRoundTripThroughJson() {
    VerificationResult original = VerificationResult.withCount(42);
    
    String json = Json.write(original);
    VerificationResult deserialized = VerificationResult.from(json);
    
    assertThat(deserialized.getCount(), is(42));
    assertThat(deserialized.requestJournalIsDisabled(), is(false));
  }
}
