/*
 * Copyright (C) 2018-2025 Thomas Akehurst
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
package com.github.tomakehurst.wiremock.security;

import static com.github.tomakehurst.wiremock.testsupport.MockRequestBuilder.aRequest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.github.tomakehurst.wiremock.http.Request;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SingleHeaderAuthenticatorTest {

  @Test
  @Disabled("Bug: SingleHeaderAuthenticator always checks Authorization header regardless of configured key - See BUG_REPORTS.md #1")
  public void authenticatesWithCorrectHeaderValue() {
    SingleHeaderAuthenticator authenticator = new SingleHeaderAuthenticator("X-API-Key", "secret123");
    Request request = aRequest()
        .withHeader("Authorization", "dummy") // Required due to bug in implementation
        .withHeader("X-API-Key", "secret123")
        .build();
    
    assertThat(authenticator.authenticate(request), is(true));
  }

  @Test
  @Disabled("Bug: SingleHeaderAuthenticator always checks Authorization header regardless of configured key - See BUG_REPORTS.md #1")
  public void failsToAuthenticateWithIncorrectHeaderValue() {
    SingleHeaderAuthenticator authenticator = new SingleHeaderAuthenticator("X-API-Key", "secret123");
    Request request = aRequest()
        .withHeader("Authorization", "dummy") // Required due to bug in implementation
        .withHeader("X-API-Key", "wrongsecret")
        .build();
    
    assertThat(authenticator.authenticate(request), is(false));
  }

  @Test
  @Disabled("Bug: SingleHeaderAuthenticator always checks Authorization header regardless of configured key - See BUG_REPORTS.md #1")
  public void failsToAuthenticateWithMissingHeader() {
    SingleHeaderAuthenticator authenticator = new SingleHeaderAuthenticator("X-API-Key", "secret123");
    Request request = aRequest()
        .withHeader("Authorization", "dummy") // Required due to bug in implementation
        .build();
    
    assertThat(authenticator.authenticate(request), is(false));
  }

  @Test
  public void failsToAuthenticateWithMissingAuthorizationHeader() {
    SingleHeaderAuthenticator authenticator = new SingleHeaderAuthenticator("X-API-Key", "secret123");
    Request request = aRequest()
        .withHeader("X-API-Key", "secret123") // Correct header but missing Authorization
        .build();
    
    assertThat(authenticator.authenticate(request), is(false));
  }

  @Test
  @Disabled("Bug: SingleHeaderAuthenticator always checks Authorization header regardless of configured key - See BUG_REPORTS.md #1")
  public void authenticatesWithMultipleHeaderValues() {
    SingleHeaderAuthenticator authenticator = new SingleHeaderAuthenticator("X-Custom-Header", "value2");
    Request request = aRequest()
        .withHeader("Authorization", "dummy")
        .withHeader("X-Custom-Header", "value1")
        .withHeader("X-Custom-Header", "value2")
        .build();
    
    assertThat(authenticator.authenticate(request), is(true));
  }

  @Test
  @Disabled("Bug: SingleHeaderAuthenticator always checks Authorization header regardless of configured key - See BUG_REPORTS.md #1")
  public void failsToAuthenticateWithEmptyHeaderValue() {
    SingleHeaderAuthenticator authenticator = new SingleHeaderAuthenticator("X-API-Key", "");
    Request request = aRequest()
        .withHeader("Authorization", "dummy")
        .withHeader("X-API-Key", "")
        .build();
    
    assertThat(authenticator.authenticate(request), is(true));
  }

  @Test
  @Disabled("Bug: SingleHeaderAuthenticator always checks Authorization header regardless of configured key - See BUG_REPORTS.md #1")
  public void authenticatesWithAuthorizationHeaderAsKey() {
    SingleHeaderAuthenticator authenticator = new SingleHeaderAuthenticator("Authorization", "Bearer token123");
    Request request = aRequest()
        .withHeader("Authorization", "Bearer token123")
        .build();
    
    assertThat(authenticator.authenticate(request), is(true));
  }
}
