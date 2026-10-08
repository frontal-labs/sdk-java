package dev.frontal.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Typed access boundary for one API domain. */
public final class ServiceClient {
  private final ApiService service;
  private final ApiClient client;

  ServiceClient(ApiService service, ApiClient client) {
    this.service = Objects.requireNonNull(service, "service");
    this.client = Objects.requireNonNull(client, "client");
  }

  public ApiService service() {
    return service;
  }

  public <T> T request(Endpoint endpoint, Class<T> responseType)
      throws IOException, InterruptedException {
    return request(endpoint, List.of(), Map.of(), null, responseType);
  }

  public <T> T request(Endpoint endpoint, List<String> pathParams, Class<T> responseType)
      throws IOException, InterruptedException {
    return request(endpoint, pathParams, Map.of(), null, responseType);
  }

  public <T> T request(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      Object body,
      Class<T> responseType)
      throws IOException, InterruptedException {
    verify(endpoint);
    return client.request(endpoint, pathParams, query, body, responseType);
  }

  public <T> T request(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      Object body,
      TypeReference<T> responseType)
      throws IOException, InterruptedException {
    verify(endpoint);
    return client.request(endpoint, pathParams, query, body, responseType);
  }

  public byte[] requestBytes(
      Endpoint endpoint, List<String> pathParams, Map<String, ?> query, Object body)
      throws IOException, InterruptedException {
    verify(endpoint);
    return client.requestBytes(endpoint, pathParams, query, body);
  }

  public ApiResponse execute(
      Endpoint endpoint, List<String> pathParams, Map<String, ?> query, Object body)
      throws IOException, InterruptedException {
    verify(endpoint);
    return client.execute(endpoint, pathParams, query, body);
  }

  public <T> T requestForm(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      Map<String, String> fields,
      Map<String, Path> files,
      Class<T> responseType)
      throws IOException, InterruptedException {
    verify(endpoint);
    return client.requestForm(endpoint, pathParams, query, fields, files, responseType);
  }

  public <T> T requestForm(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      Map<String, String> fields,
      Map<String, Path> files,
      TypeReference<T> responseType)
      throws IOException, InterruptedException {
    verify(endpoint);
    return client.requestForm(endpoint, pathParams, query, fields, files, responseType);
  }

  public ApiResponse executeForm(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      Map<String, String> fields,
      Map<String, Path> files)
      throws IOException, InterruptedException {
    verify(endpoint);
    return client.executeForm(endpoint, pathParams, query, fields, files);
  }

  public InputStream stream(Endpoint endpoint, List<String> pathParams, Map<String, ?> query)
      throws IOException, InterruptedException {
    verify(endpoint);
    return client.stream(endpoint, pathParams, query);
  }

  public ApiStream streamResponse(Endpoint endpoint, List<String> pathParams, Map<String, ?> query)
      throws IOException, InterruptedException {
    verify(endpoint);
    return client.streamResponse(endpoint, pathParams, query);
  }

  private void verify(Endpoint endpoint) {
    Objects.requireNonNull(endpoint, "endpoint");
    if (endpoint.service() != service) {
      throw new IllegalArgumentException(
          "Endpoint belongs to " + endpoint.service().value() + ", not " + service.value());
    }
  }
}
