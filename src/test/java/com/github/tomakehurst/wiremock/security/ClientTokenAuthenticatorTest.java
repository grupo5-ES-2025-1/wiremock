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

import static com.github.tomakehurst.wiremock.common.ContentTypes.AUTHORIZATION;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.github.tomakehurst.wiremock.http.HttpHeader;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ClientTokenAuthenticatorTest {

  @Test
  public void generatesCorrectTokenAuthorizationHeader() {
    ClientTokenAuthenticator authenticator = new ClientTokenAuthenticator("mytoken123");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader authHeader = headers.get(0);
    assertThat(authHeader.key(), is(AUTHORIZATION));
    assertThat(authHeader.firstValue(), is("Token mytoken123"));
  }

  @Test
  public void generatesHeaderWithEmptyToken() {
    ClientTokenAuthenticator authenticator = new ClientTokenAuthenticator("");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader authHeader = headers.get(0);
    assertThat(authHeader.key(), is(AUTHORIZATION));
    assertThat(authHeader.firstValue(), is("Token "));
  }

  @Test
  public void generatesHeaderWithTokenContainingSpaces() {
    ClientTokenAuthenticator authenticator = new ClientTokenAuthenticator("token with spaces");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader authHeader = headers.get(0);
    assertThat(authHeader.key(), is(AUTHORIZATION));
    assertThat(authHeader.firstValue(), is("Token token with spaces"));
  }

  @Test
  public void generatesHeaderWithSpecialCharacters() {
    ClientTokenAuthenticator authenticator = new ClientTokenAuthenticator("token!@#$%^&*()");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader authHeader = headers.get(0);
    assertThat(authHeader.key(), is(AUTHORIZATION));
    assertThat(authHeader.firstValue(), is("Token token!@#$%^&*()"));
  }
}

