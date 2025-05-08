/*
 * Copyright (C) 2025 Thomas Akehurst
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
package com.github.tomakehurst.wiremock.proxy;

import static com.github.tomakehurst.wiremock.common.ContentTypes.CONTENT_LENGTH;

import com.github.tomakehurst.wiremock.common.ContentTypes;
import com.github.tomakehurst.wiremock.common.Gzip;
import com.github.tomakehurst.wiremock.extension.ResponseTransformerV2;
import com.github.tomakehurst.wiremock.http.HttpHeader;
import com.github.tomakehurst.wiremock.http.HttpHeaders;
import com.github.tomakehurst.wiremock.http.Response;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * At the moment this transformer works with Proxy responses to replace the host and port. If we
 * decide to extend this to a generic host/port replacement we should rename the class and update
 * the transformer name
 */
public class ProxiedHostnameRewriteResponseTransformer implements ResponseTransformerV2 {

  @Override
  public Response transform(Response response, ServeEvent serveEvent) {

    var substitutions = getSubstitutions(serveEvent);

    // Update headers
    List<HttpHeader> updatedHeaderList =
        response.getHeaders().all().stream()
            .map(
                header ->
                    new HttpHeader(
                        header.key(),
                        header.values().stream()
                            .map(
                                value -> {
                                  for (Map.Entry<String, String> substitution :
                                      substitutions.entrySet()) {
                                    value =
                                        value.replace(
                                            substitution.getKey(), substitution.getValue());
                                  }
                                  return value;
                                })
                            .collect(Collectors.toList())))
            .collect(Collectors.toList());
    HttpHeaders updatedHeaders = new HttpHeaders(updatedHeaderList);

    Response.Builder responseBuilder = Response.Builder.like(response).headers(updatedHeaders);

    // Update body if applicable
    byte[] initialBody = response.getBody();
    if (initialBody != null
        && initialBody.length > 0
        && ContentTypes.determineIsTextFromMimeType(getMimeType(response))) {
      byte[] updatedBody;
      if (Gzip.isGzipped(initialBody)) {
        String uncompressedBody = Gzip.unGzipToString(initialBody);
        for (Map.Entry<String, String> substitution : substitutions.entrySet()) {
          uncompressedBody =
              uncompressedBody.replace(substitution.getKey(), substitution.getValue());
        }
        updatedBody = Gzip.gzip(uncompressedBody.getBytes());
      } else {
        String responseBodyAsString = response.getBodyAsString();

        for (Map.Entry<String, String> substitution : substitutions.entrySet()) {
          responseBodyAsString =
              responseBodyAsString.replace(substitution.getKey(), substitution.getValue());
        }

        updatedBody = responseBodyAsString.getBytes();
      }
      responseBuilder.body(updatedBody);

      // Update Content-Length header if present
      if (updatedHeaders.getHeader(CONTENT_LENGTH).isPresent()) {
        responseBuilder.headers(
            setContentTypeHeader(updatedHeaders, String.valueOf(updatedBody.length)));
      }
    }

    return responseBuilder.build();
  }

  @Override
  public String getName() {
    return "proxied-hostname-rewrite";
  }

  @Override
  public boolean applyGlobally() {
    return false;
  }

  private static HttpHeaders setContentTypeHeader(HttpHeaders headers, String value) {
    List<HttpHeader> filteredHeaders =
        headers.all().stream()
            .filter(h -> !h.keyEquals(CONTENT_LENGTH))
            .collect(Collectors.toList());
    filteredHeaders.add(new HttpHeader(CONTENT_LENGTH, value));
    return new HttpHeaders(filteredHeaders);
  }

  private static String getMimeType(Response response) {
    HttpHeaders responseHeaders = response.getHeaders();
    return responseHeaders != null && responseHeaders.getContentTypeHeader() != null
        ? responseHeaders.getContentTypeHeader().mimeTypePart()
        : null;
  }

  /**
   * This method can be used to pull substitution data from other sources such as stub metadata
   *
   * @param serveEvent the serveEvent for this request/response
   * @return The Map of substitutions to make
   */
  private static Map<String, String> getSubstitutions(ServeEvent serveEvent) {
    Map<String, String> substitutions = Map.of();

    if (serveEvent.getResponseDefinition().isProxyResponse()) {
      String requestHost = serveEvent.getRequest().getHost();
      String requestPort = ":" + serveEvent.getRequest().getPort();

      URI proxyTargetUrl = URI.create(serveEvent.getResponseDefinition().getProxyBaseUrl());
      String proxyTargetHost = proxyTargetUrl.getHost();
      String proxyTargetPort = ":" + proxyTargetUrl.getPort();

      substitutions =
          Map.of(
              proxyTargetHost, requestHost,
              proxyTargetPort, requestPort);
    }

    return substitutions;
  }
}
