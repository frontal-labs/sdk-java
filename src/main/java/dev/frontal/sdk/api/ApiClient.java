package dev.frontal.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/** HTTP transport with typed JSON, binary, multipart, and streaming response support. */
public final class ApiClient {
  private final ClientConfig config;
  private final HttpClient httpClient;
  private final ObjectMapper objectMapper;
  private final AuthProvider authProvider;

  public ApiClient(ClientConfig config) {
    this(
        config,
        HttpClient.newBuilder()
            .connectTimeout(config.connectTimeout())
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build(),
        new ObjectMapper(),
        config.apiKey() == null ? null : new ApiKeyAuthProvider(config.apiKey()));
  }

  public ApiClient(ClientConfig config, AuthProvider authProvider) {
    this(
        config,
        HttpClient.newBuilder()
            .connectTimeout(config.connectTimeout())
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build(),
        new ObjectMapper(),
        authProvider);
  }

  public ApiClient(ClientConfig config, HttpClient httpClient, ObjectMapper objectMapper) {
    this(
        config,
        httpClient,
        objectMapper,
        config.apiKey() == null ? null : new ApiKeyAuthProvider(config.apiKey()));
  }

  public ApiClient(
      ClientConfig config,
      HttpClient httpClient,
      ObjectMapper objectMapper,
      AuthProvider authProvider) {
    this.config = Objects.requireNonNull(config, "config");
    this.httpClient = Objects.requireNonNull(httpClient, "httpClient");
    this.objectMapper = Objects.requireNonNull(objectMapper, "objectMapper");
    this.authProvider = authProvider;
  }

  public ObjectMapper objectMapper() {
    return objectMapper;
  }

  public <T> T request(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      Object body,
      Class<T> responseType)
      throws IOException, InterruptedException {
    return decode(execute(endpoint, pathParams, query, body).body(), responseType);
  }

  public <T> T request(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      Object body,
      TypeReference<T> responseType)
      throws IOException, InterruptedException {
    byte[] response = execute(endpoint, pathParams, query, body).body();
    if (response.length == 0) {
      return null;
    }
    return objectMapper.readValue(response, responseType);
  }

  /** Executes an endpoint and returns the successful response status, headers, and raw bytes. */
  public ApiResponse execute(
      Endpoint endpoint, List<String> pathParams, Map<String, ?> query, Object body)
      throws IOException, InterruptedException {
    Objects.requireNonNull(endpoint, "endpoint");
    if (endpoint.method() == HttpMethod.STREAM || endpoint.method() == HttpMethod.POSTFORMDATA) {
      throw new IllegalArgumentException("Use stream() or executeForm() for this endpoint kind");
    }
    HttpRequest.BodyPublisher publisher = HttpRequest.BodyPublishers.noBody();
    String contentType = null;
    if (body != null) {
      if (endpoint.method() == HttpMethod.GET
          || endpoint.method() == HttpMethod.GETRAW
          || endpoint.method() == HttpMethod.DELETE
          || endpoint.method() == HttpMethod.HEAD) {
        throw new IllegalArgumentException("This endpoint does not accept a request body");
      }
      if (endpoint.method() == HttpMethod.POSTRAW) {
        if (!(body instanceof byte[] raw)) {
          throw new IllegalArgumentException("POSTRAW request bodies must be byte[]");
        }
        publisher = HttpRequest.BodyPublishers.ofByteArray(raw);
        contentType = "application/octet-stream";
      } else {
        publisher = HttpRequest.BodyPublishers.ofByteArray(objectMapper.writeValueAsBytes(body));
        contentType = "application/json";
      }
    }
    String accept =
        endpoint.method() == HttpMethod.GETRAW
            ? "application/pdf, application/octet-stream, */*"
            : "application/json, application/octet-stream";
    return exchange(endpoint, pathParams, query, publisher, contentType, accept);
  }

  /** Sends a request and returns its response body as bytes. */
  public byte[] requestBytes(
      Endpoint endpoint, List<String> pathParams, Map<String, ?> query, Object body)
      throws IOException, InterruptedException {
    return execute(endpoint, pathParams, query, body).body();
  }

  public <T> T requestForm(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      Map<String, String> fields,
      Map<String, Path> files,
      Class<T> responseType)
      throws IOException, InterruptedException {
    return decode(executeForm(endpoint, pathParams, query, fields, files).body(), responseType);
  }

  public <T> T requestForm(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      Map<String, String> fields,
      Map<String, Path> files,
      TypeReference<T> responseType)
      throws IOException, InterruptedException {
    byte[] response = executeForm(endpoint, pathParams, query, fields, files).body();
    if (response.length == 0) {
      return null;
    }
    return objectMapper.readValue(response, responseType);
  }

  /** Sends multipart form data and returns response metadata and raw bytes. */
  public ApiResponse executeForm(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      Map<String, String> fields,
      Map<String, Path> files)
      throws IOException, InterruptedException {
    Objects.requireNonNull(endpoint, "endpoint");
    if (endpoint.method() != HttpMethod.POSTFORMDATA) {
      throw new IllegalArgumentException("executeForm requires a POSTFORMDATA endpoint");
    }
    Objects.requireNonNull(fields, "fields");
    Objects.requireNonNull(files, "files");
    String boundary = "frontal-" + java.util.UUID.randomUUID();
    return exchange(
        endpoint,
        pathParams,
        query,
        multipart(boundary, fields, files),
        "multipart/form-data; boundary=" + boundary,
        "application/json");
  }

  /** Returns the live body stream for a contract endpoint marked {@code STREAM}. */
  public InputStream stream(Endpoint endpoint, List<String> pathParams, Map<String, ?> query)
      throws IOException, InterruptedException {
    return streamResponse(endpoint, pathParams, query).body();
  }

  /** Opens a streaming response while preserving its status and headers. */
  public ApiStream streamResponse(Endpoint endpoint, List<String> pathParams, Map<String, ?> query)
      throws IOException, InterruptedException {
    Objects.requireNonNull(endpoint, "endpoint");
    if (endpoint.method() != HttpMethod.STREAM) {
      throw new IllegalArgumentException("stream requires a STREAM endpoint");
    }
    HttpRequest request =
        buildRequest(
            endpoint,
            pathParams,
            query,
            HttpRequest.BodyPublishers.noBody(),
            null,
            "text/event-stream");
    HttpResponse<InputStream> response =
        httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());
    if (response.statusCode() < 200 || response.statusCode() >= 300) {
      try (InputStream responseBody = response.body()) {
        throw toApiException(
            response.statusCode(),
            response.headers().firstValue("x-request-id").orElse(null),
            readBounded(responseBody));
      }
    }
    return new ApiStream(response.statusCode(), response.headers().map(), response.body());
  }

  private ApiResponse exchange(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      HttpRequest.BodyPublisher publisher,
      String contentType,
      String accept)
      throws IOException, InterruptedException {
    int attempts = endpoint.method().wireMethod().equals("GET") ? config.maxRetries() + 1 : 1;
    IOException lastFailure = null;
    for (int attempt = 0; attempt < attempts; attempt++) {
      HttpRequest request =
          buildRequest(endpoint, pathParams, query, publisher, contentType, accept);
      HttpResponse<InputStream> response;
      try {
        response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());
      } catch (IOException exception) {
        lastFailure = exception;
        if (attempt + 1 == attempts) {
          throw exception;
        }
        waitBeforeRetry(attempt, null);
        continue;
      }

      byte[] bytes;
      try (InputStream bodyStream = response.body()) {
        bytes = readBounded(bodyStream);
      }
      if (response.statusCode() >= 200 && response.statusCode() < 300) {
        return new ApiResponse(response.statusCode(), response.headers().map(), bytes);
      }
      if (endpoint.method().wireMethod().equals("GET")
          && attempt + 1 < attempts
          && (response.statusCode() == 429 || response.statusCode() >= 500)) {
        waitBeforeRetry(attempt, response.headers().firstValue("retry-after").orElse(null));
        continue;
      }
      throw toApiException(
          response.statusCode(), response.headers().firstValue("x-request-id").orElse(null), bytes);
    }
    throw Objects.requireNonNull(lastFailure, "request failed without a response");
  }

  private HttpRequest buildRequest(
      Endpoint endpoint,
      List<String> pathParams,
      Map<String, ?> query,
      HttpRequest.BodyPublisher publisher,
      String contentType,
      String accept) {
    URI baseUrl = endpoint.service() == ApiService.AI ? config.aiBaseUrl() : config.apiBaseUrl();
    URI uri = RequestUriBuilder.build(baseUrl, endpoint, pathParams, query);
    HttpRequest.Builder builder =
        HttpRequest.newBuilder(uri)
            .timeout(config.requestTimeout())
            .header("Accept", accept)
            .header("User-Agent", config.userAgent());
    config.headers().forEach(builder::setHeader);
    if (contentType != null) {
      builder.setHeader("Content-Type", contentType);
    }
    if (authProvider != null) {
      authProvider.apply(builder);
    }
    return builder.method(endpoint.method().wireMethod(), publisher).build();
  }

  private byte[] readBounded(InputStream stream) throws IOException {
    try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
      byte[] buffer = new byte[8192];
      long total = 0;
      int read;
      while ((read = stream.read(buffer)) >= 0) {
        total += read;
        if (total > config.maxResponseBytes()) {
          throw new IOException(
              "Response exceeded configured limit of " + config.maxResponseBytes() + " bytes");
        }
        output.write(buffer, 0, read);
      }
      return output.toByteArray();
    }
  }

  private ApiException toApiException(int status, String requestId, byte[] body) {
    String response = new String(body, StandardCharsets.UTF_8);
    String code = null;
    String message = null;
    try {
      JsonNode error = objectMapper.readTree(body);
      if (error != null) {
        JsonNode nested = error.path("error");
        if (!nested.isMissingNode()) {
          error = nested;
        }
        code = textOrNull(error.path("code"));
        message = textOrNull(error.path("message"));
      }
    } catch (IOException ignored) {
      // Keep the response body for non-JSON errors.
    }
    return new ApiException(status, code, message, requestId, response);
  }

  private String textOrNull(JsonNode node) {
    return node.isTextual() ? node.asText() : null;
  }

  private void waitBeforeRetry(int attempt, String retryAfter) throws InterruptedException {
    long millis = 100L * (1L << Math.min(attempt, 5));
    if (retryAfter != null) {
      try {
        millis = Math.min(5_000L, Math.max(0L, Long.parseLong(retryAfter.trim()) * 1_000L));
      } catch (NumberFormatException ignored) {
        // Fall back to bounded exponential backoff for HTTP-date values.
      }
    }
    TimeUnit.MILLISECONDS.sleep(Math.min(5_000L, millis));
  }

  private HttpRequest.BodyPublisher multipart(
      String boundary, Map<String, String> fields, Map<String, Path> files) throws IOException {
    List<HttpRequest.BodyPublisher> parts = new ArrayList<>();
    for (Map.Entry<String, String> field : fields.entrySet()) {
      parts.add(
          publisher(
              "--"
                  + boundary
                  + "\r\nContent-Disposition: form-data; name=\""
                  + safeHeader(field.getKey())
                  + "\"\r\n\r\n"));
      parts.add(publisher(Objects.requireNonNull(field.getValue(), "multipart field value")));
      parts.add(publisher("\r\n"));
    }
    for (Map.Entry<String, Path> file : files.entrySet()) {
      Path path = Objects.requireNonNull(file.getValue(), "multipart file path");
      String filename = safeHeader(path.getFileName().toString());
      String type = Files.probeContentType(path);
      parts.add(
          publisher(
              "--"
                  + boundary
                  + "\r\nContent-Disposition: form-data; name=\""
                  + safeHeader(file.getKey())
                  + "\"; filename=\""
                  + filename
                  + "\"\r\n"));
      parts.add(
          publisher(
              "Content-Type: " + (type == null ? "application/octet-stream" : type) + "\r\n\r\n"));
      try {
        parts.add(HttpRequest.BodyPublishers.ofFile(path));
      } catch (FileNotFoundException exception) {
        throw new IOException("Could not read multipart file " + path, exception);
      }
      parts.add(publisher("\r\n"));
    }
    parts.add(publisher("--" + boundary + "--\r\n"));
    return HttpRequest.BodyPublishers.concat(parts.toArray(HttpRequest.BodyPublisher[]::new));
  }

  private HttpRequest.BodyPublisher publisher(String content) {
    return HttpRequest.BodyPublishers.ofByteArray(content.getBytes(StandardCharsets.UTF_8));
  }

  private String safeHeader(String value) {
    if (value.indexOf('\r') >= 0 || value.indexOf('\n') >= 0 || value.indexOf('"') >= 0) {
      throw new IllegalArgumentException(
          "Multipart field names and filenames cannot contain CR, LF, or quotes");
    }
    return value;
  }

  private <T> T decode(byte[] response, Class<T> type) throws IOException {
    Objects.requireNonNull(type, "responseType");
    if (response.length == 0 || type == Void.class || type == void.class) {
      return null;
    }
    if (type == byte[].class) {
      return type.cast(response);
    }
    return objectMapper.readValue(response, type);
  }
}
