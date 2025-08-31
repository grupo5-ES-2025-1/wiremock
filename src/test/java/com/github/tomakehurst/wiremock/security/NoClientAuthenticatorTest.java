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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import com.github.tomakehurst.wiremock.http.HttpHeader;
import java.util.List;
import org.junit.jupiter.api.Test;

public class NoClientAuthenticatorTest {

  @Test
  public void generatesEmptyHeaderList() {
    NoClientAuthenticator authenticator = new NoClientAuthenticator();
    
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    
    assertThat(headers, notNullValue());
    assertThat(headers, empty());
  }

  @Test
  public void staticFactoryMethodWorks() {
    NoClientAuthenticator authenticator = NoClientAuthenticator.noClientAuthenticator();
    
    assertThat(authenticator, notNullValue());
    List<HttpHeader> headers = authenticator.generateAuthHeaders();
    assertThat(headers, empty());
  }

  @Test
  public void multipleInstancesGenerateEmptyLists() {
    NoClientAuthenticator authenticator1 = new NoClientAuthenticator();
    NoClientAuthenticator authenticator2 = NoClientAuthenticator.noClientAuthenticator();
    
    assertThat(authenticator1.generateAuthHeaders(), empty());
    assertThat(authenticator2.generateAuthHeaders(), empty());
  }
}

