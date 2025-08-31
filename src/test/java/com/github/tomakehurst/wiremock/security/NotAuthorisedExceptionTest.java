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
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;

import org.junit.jupiter.api.Test;

public class NotAuthorisedExceptionTest {

  @Test
  public void canBeCreatedWithNoArguments() {
    NotAuthorisedException exception = new NotAuthorisedException();
    
    assertThat(exception.getMessage(), nullValue());
    assertThat(exception.getCause(), nullValue());
  }

  @Test
  public void canBeCreatedWithMessage() {
    String message = "Access denied";
    NotAuthorisedException exception = new NotAuthorisedException(message);
    
    assertThat(exception.getMessage(), is(message));
    assertThat(exception.getCause(), nullValue());
  }

  @Test
  public void canBeCreatedWithMessageAndCause() {
    String message = "Authentication failed";
    Throwable cause = new RuntimeException("Invalid credentials");
    NotAuthorisedException exception = new NotAuthorisedException(message, cause);
    
    assertThat(exception.getMessage(), is(message));
    assertThat(exception.getCause(), sameInstance(cause));
  }

  @Test
  public void isRuntimeException() {
    NotAuthorisedException exception = new NotAuthorisedException();
    
    assertThat(exception instanceof RuntimeException, is(true));
  }
}

