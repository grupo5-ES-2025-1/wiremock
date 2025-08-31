/*
 * Copyright (C) 2017-2025 Thomas Akehurst
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
import org.junit.jupiter.api.Test;

public class NoAuthenticatorTest {

  @Test
  public void alwaysAuthenticatesSuccessfully() {
    NoAuthenticator authenticator = new NoAuthenticator();
    Request request = aRequest().build();
    
    assertThat(authenticator.authenticate(request), is(true));
  }

  @Test
  public void authenticatesWithHeaders() {
    NoAuthenticator authenticator = new NoAuthenticator();
    Request request = aRequest()
        .withHeader("Authorization", "Bearer token123")
        .withHeader("X-API-Key", "apikey123")
        .build();
    
    assertThat(authenticator.authenticate(request), is(true));
  }

  @Test
  public void authenticatesNullRequest() {
    NoAuthenticator authenticator = new NoAuthenticator();
    
    assertThat(authenticator.authenticate(null), is(true));
  }
}

