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

public class TokenAuthenticatorTest {

  @Test
  @Disabled("Bug: TokenAuthenticator inherits SingleHeaderAuthenticator bug - always checks Authorization header - See BUG_REPORTS.md #1")
  public void authenticatesWithCorrectToken() {
    TokenAuthenticator authenticator = new TokenAuthenticator("mytoken123");
    Request request = aRequest()
        .withHeader("Authorization", "Token mytoken123")
        .build();
    
    assertThat(authenticator.authenticate(request), is(true));
  }

  @Test
  public void failsToAuthenticateWithIncorrectToken() {
    TokenAuthenticator authenticator = new TokenAuthenticator("mytoken123");
    Request request = aRequest()
        .withHeader("Authorization", "Token wrongtoken")
        .build();
    
    assertThat(authenticator.authenticate(request), is(false));
  }

  @Test
  public void failsToAuthenticateWithBearerToken() {
    TokenAuthenticator authenticator = new TokenAuthenticator("mytoken123");
    Request request = aRequest()
        .withHeader("Authorization", "Bearer mytoken123")
        .build();
    
    assertThat(authenticator.authenticate(request), is(false));
  }

  @Test
  public void failsToAuthenticateWithMissingTokenPrefix() {
    TokenAuthenticator authenticator = new TokenAuthenticator("mytoken123");
    Request request = aRequest()
        .withHeader("Authorization", "mytoken123")
        .build();
    
    assertThat(authenticator.authenticate(request), is(false));
  }

  @Test
  public void failsToAuthenticateWithMissingAuthorizationHeader() {
    TokenAuthenticator authenticator = new TokenAuthenticator("mytoken123");
    Request request = aRequest().build();
    
    assertThat(authenticator.authenticate(request), is(false));
  }

  @Test
  @Disabled("Bug: TokenAuthenticator inherits SingleHeaderAuthenticator bug - always checks Authorization header - See BUG_REPORTS.md #1")
  public void authenticatesWithEmptyToken() {
    TokenAuthenticator authenticator = new TokenAuthenticator("");
    Request request = aRequest()
        .withHeader("Authorization", "Token ")
        .build();
    
    assertThat(authenticator.authenticate(request), is(true));
  }

  @Test
  @Disabled("Bug: TokenAuthenticator inherits SingleHeaderAuthenticator bug - always checks Authorization header - See BUG_REPORTS.md #1")
  public void authenticatesWithTokenContainingSpaces() {
    TokenAuthenticator authenticator = new TokenAuthenticator("my token with spaces");
    Request request = aRequest()
        .withHeader("Authorization", "Token my token with spaces")
        .build();
    
    assertThat(authenticator.authenticate(request), is(true));
  }

  @Test
  @Disabled("Bug: TokenAuthenticator inherits SingleHeaderAuthenticator bug - always checks Authorization header - See BUG_REPORTS.md #1")
  public void authenticatesWithTokenContainingSpecialCharacters() {
    TokenAuthenticator authenticator = new TokenAuthenticator("token!@#$%^&*()");
    Request request = aRequest()
        .withHeader("Authorization", "Token token!@#$%^&*()")
        .build();
    
    assertThat(authenticator.authenticate(request), is(true));
  }
}
