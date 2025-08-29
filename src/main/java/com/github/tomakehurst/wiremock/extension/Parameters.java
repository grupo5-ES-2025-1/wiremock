/*
 * Copyright (C) 2015-2025 Thomas Akehurst
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
package com.github.tomakehurst.wiremock.extension;

import com.github.tomakehurst.wiremock.common.Json;
import com.github.tomakehurst.wiremock.common.Metadata;
import java.util.LinkedHashMap;
import java.util.Map;

/** The type Parameters. */
public class Parameters extends Metadata {

  /**
   * Empty parameters.
   *
   * @return the parameters
   */
  public static Parameters empty() {
    return new Parameters();
  }

  /**
   * From parameters.
   *
   * @param parameterMap the parameter map
   * @return the parameters
   */
  public static Parameters from(Map<String, Object> parameterMap) {
    Parameters parameters = new Parameters();
    parameters.putAll(parameterMap);
    return parameters;
  }

  /**
   * One parameters.
   *
   * @param name the name
   * @param value the value
   * @return the parameters
   */
  public static Parameters one(String name, Object value) {
    return from(Map.of(name, value));
  }

  /**
   * Of parameters.
   *
   * @param <T> the type parameter
   * @param myData the my data
   * @return the parameters
   */
  public static <T> Parameters of(T myData) {
    return from(Json.objectToMap(myData));
  }

  /**
   * Merge parameters.
   *
   * @param other the other
   * @return the parameters
   */
  public Parameters merge(Parameters other) {
    Map<String, Object> attributes = new LinkedHashMap<>(this);
    attributes.putAll(other);
    return Parameters.from(attributes);
  }
}
