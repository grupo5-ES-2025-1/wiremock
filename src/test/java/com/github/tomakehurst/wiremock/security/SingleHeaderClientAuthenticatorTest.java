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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.github.tomakehurst.wiremock.http.HttpHeader;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SingleHeaderClientAuthenticatorTest {

  @Test
  public void generatesSingleHeaderWithKeyAndValue() {
    SingleHeaderClientAuthenticator authenticator = 
        new SingleHeaderClientAuthenticator("X-API-Key", "secret123");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader header = headers.get(0);
    assertThat(header.key(), is("X-API-Key"));
    assertThat(header.firstValue(), is("secret123"));
  }

  @Test
  public void generatesHeaderWithEmptyKey() {
    SingleHeaderClientAuthenticator authenticator = 
        new SingleHeaderClientAuthenticator("", "value123");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader header = headers.get(0);
    assertThat(header.key(), is(""));
    assertThat(header.firstValue(), is("value123"));
  }

  @Test
  public void generatesHeaderWithEmptyValue() {
    SingleHeaderClientAuthenticator authenticator = 
        new SingleHeaderClientAuthenticator("X-Custom-Header", "");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader header = headers.get(0);
    assertThat(header.key(), is("X-Custom-Header"));
    assertThat(header.firstValue(), is(""));
  }

  @Test
  public void generatesHeaderWithSpecialCharacters() {
    SingleHeaderClientAuthenticator authenticator = 
        new SingleHeaderClientAuthenticator("X-Special", "value!@#$%^&*()");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader header = headers.get(0);
    assertThat(header.key(), is("X-Special"));
    assertThat(header.firstValue(), is("value!@#$%^&*()"));
  }

  @Test
  public void generatesAuthorizationHeader() {
    SingleHeaderClientAuthenticator authenticator = 
        new SingleHeaderClientAuthenticator("Authorization", "Bearer token123");
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers.size(), is(1));
    HttpHeader header = headers.get(0);
    assertThat(header.key(), is("Authorization"));
    assertThat(header.firstValue(), is("Bearer token123"));
  }
}

