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

import static com.github.tomakehurst.wiremock.common.ContentTypes.AUTHORIZATION;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.github.tomakehurst.wiremock.client.BasicCredentials;
import com.github.tomakehurst.wiremock.http.HttpHeader;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ClientBasicAuthenticatorTest {

  @Test
  public void generatesCorrectAuthorizationHeader() {
    ClientBasicAuthenticator authenticator = new ClientBasicAuthenticator("testuser", "testpassword");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader authHeader = headers.get(0);
    assertThat(authHeader.key(), is(AUTHORIZATION));
    
    String expectedValue = new BasicCredentials("testuser", "testpassword").asAuthorizationHeaderValue();
    assertThat(authHeader.firstValue(), is(expectedValue));
  }

  @Test
  public void generatesHeaderWithEmptyUsername() {
    ClientBasicAuthenticator authenticator = new ClientBasicAuthenticator("", "password");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader authHeader = headers.get(0);
    assertThat(authHeader.key(), is(AUTHORIZATION));
    
    String expectedValue = new BasicCredentials("", "password").asAuthorizationHeaderValue();
    assertThat(authHeader.firstValue(), is(expectedValue));
  }

  @Test
  public void generatesHeaderWithEmptyPassword() {
    ClientBasicAuthenticator authenticator = new ClientBasicAuthenticator("username", "");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader authHeader = headers.get(0);
    assertThat(authHeader.key(), is(AUTHORIZATION));
    
    String expectedValue = new BasicCredentials("username", "").asAuthorizationHeaderValue();
    assertThat(authHeader.firstValue(), is(expectedValue));
  }

  @Test
  public void generatesHeaderWithSpecialCharacters() {
    ClientBasicAuthenticator authenticator = new ClientBasicAuthenticator("user@domain.com", "p@ss:w0rd!");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader authHeader = headers.get(0);
    assertThat(authHeader.key(), is(AUTHORIZATION));
    
    String expectedValue = new BasicCredentials("user@domain.com", "p@ss:w0rd!").asAuthorizationHeaderValue();
    assertThat(authHeader.firstValue(), is(expectedValue));
  }
}

