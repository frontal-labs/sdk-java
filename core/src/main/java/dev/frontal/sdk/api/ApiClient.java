package dev.frontal.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Flow;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jspecify.annotations.Nullable;

/** Shared OkHttp transport for all Frontal services. */
public final class ApiClient implements AutoCloseable {
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final MediaType OCTET_STREAM = MediaType.parse("application/octet-stream");

    private final ClientConfig config;
    private final OkHttpClient httpClient;
    private final ObjectMapper objectMapper;
    private final @Nullable AuthProvider authProvider;
    private final boolean ownsHttpClient;

    public ApiClient(ClientConfig config) {
        this(config, createHttpClient(config), new ObjectMapper(), apiKeyAuth(config), true);
    }

    public ApiClient(ClientConfig config, AuthProvider authProvider) {
        this(config, createHttpClient(config), new ObjectMapper(), authProvider, true);
    }

    public ApiClient(ClientConfig config, OkHttpClient httpClient, ObjectMapper objectMapper) {
        this(config, httpClient, objectMapper, apiKeyAuth(config), false);
    }

    public ApiClient(
            ClientConfig config, OkHttpClient httpClient, ObjectMapper objectMapper, AuthProvider authProvider) {
        this(config, httpClient, objectMapper, authProvider, false);
    }

    private ApiClient(
            ClientConfig config,
            OkHttpClient httpClient,
            ObjectMapper objectMapper,
            @Nullable AuthProvider authProvider,
            boolean ownsHttpClient) {
        this.config = Objects.requireNonNull(config, "config");
        this.httpClient = Objects.requireNonNull(httpClient, "httpClient");
        this.objectMapper = Objects.requireNonNull(objectMapper, "objectMapper")
                .copy()
                .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        this.authProvider = authProvider;
        this.ownsHttpClient = ownsHttpClient;
    }

    public ObjectMapper objectMapper() {
        return objectMapper;
    }

    public ClientConfig config() {
        return config;
    }

    public <T> @Nullable T request(
            Endpoint endpoint,
            List<String> pathParams,
            Map<String, ?> query,
            @Nullable Object body,
            Class<T> responseType)
            throws IOException, InterruptedException {
        return decode(execute(endpoint, pathParams, query, body).body(), responseType);
    }

    public <T> @Nullable T request(
            Endpoint endpoint,
            List<String> pathParams,
            Map<String, ?> query,
            @Nullable Object body,
            TypeReference<T> responseType)
            throws IOException, InterruptedException {
        byte[] response = execute(endpoint, pathParams, query, body).body();
        return response.length == 0 ? null : objectMapper.readValue(response, responseType);
    }

    /** Executes an endpoint and returns the successful status, headers, and raw response bytes. */
    public ApiResponse execute(Endpoint endpoint, List<String> pathParams, Map<String, ?> query, @Nullable Object body)
            throws IOException, InterruptedException {
        Objects.requireNonNull(endpoint, "endpoint");
        if (endpoint.method() == HttpMethod.STREAM || endpoint.method() == HttpMethod.POSTFORMDATA) {
            throw new IllegalArgumentException("Use stream() or executeForm() for this endpoint kind");
        }
        RequestBody requestBody = requestBody(endpoint.method(), body);
        String contentType = contentType(endpoint.method(), body);
        String accept = endpoint.method() == HttpMethod.GETRAW
                ? "application/pdf, application/octet-stream, */*"
                : "application/json, application/octet-stream";
        return exchange(endpoint, pathParams, query, requestBody, contentType, accept);
    }

    /** Sends a request and returns its body as bytes. */
    public byte[] requestBytes(Endpoint endpoint, List<String> pathParams, Map<String, ?> query, @Nullable Object body)
            throws IOException, InterruptedException {
        return execute(endpoint, pathParams, query, body).body();
    }

    public <T> @Nullable T requestForm(
            Endpoint endpoint,
            List<String> pathParams,
            Map<String, ?> query,
            Map<String, String> fields,
            Map<String, Path> files,
            Class<T> responseType)
            throws IOException, InterruptedException {
        return decode(executeForm(endpoint, pathParams, query, fields, files).body(), responseType);
    }

    public <T> @Nullable T requestForm(
            Endpoint endpoint,
            List<String> pathParams,
            Map<String, ?> query,
            Map<String, String> fields,
            Map<String, Path> files,
            TypeReference<T> responseType)
            throws IOException, InterruptedException {
        byte[] response =
                executeForm(endpoint, pathParams, query, fields, files).body();
        return response.length == 0 ? null : objectMapper.readValue(response, responseType);
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
        MultipartBody.Builder multipart = new MultipartBody.Builder().setType(MultipartBody.FORM);
        Objects.requireNonNull(fields, "fields")
                .forEach((name, value) -> multipart.addFormDataPart(safeHeader(name), value));
        for (Map.Entry<String, Path> entry :
                Objects.requireNonNull(files, "files").entrySet()) {
            Path path = Objects.requireNonNull(entry.getValue(), "multipart file path");
            String mediaType = Files.probeContentType(path);
            RequestBody file = RequestBody.create(
                    MediaType.parse(mediaType == null ? OCTET_STREAM.toString() : mediaType), path.toFile());
            multipart.addFormDataPart(
                    safeHeader(entry.getKey()), safeHeader(path.getFileName().toString()), file);
        }
        return exchange(endpoint, pathParams, query, multipart.build(), null, "application/json");
    }

    /** Returns a live response body for a contract endpoint marked {@code STREAM}. */
    public InputStream stream(Endpoint endpoint, List<String> pathParams, Map<String, ?> query)
            throws IOException, InterruptedException {
        return streamResponse(endpoint, pathParams, query).body();
    }

    /** Opens a streaming response while preserving its status and headers. */
    public ApiStream streamResponse(Endpoint endpoint, List<String> pathParams, Map<String, ?> query)
            throws IOException, InterruptedException {
        return newPendingStream(endpoint, pathParams, query).execute();
    }

    private PendingStream newPendingStream(Endpoint endpoint, List<String> pathParams, Map<String, ?> query) {
        Objects.requireNonNull(endpoint, "endpoint");
        if (endpoint.method() != HttpMethod.STREAM) {
            throw new IllegalArgumentException("stream requires a STREAM endpoint");
        }
        String requestId = UUID.randomUUID().toString();
        Request request = buildRequest(endpoint, pathParams, query, null, null, "text/event-stream", requestId);
        OkHttpClient streamingClient = httpClient
                .newBuilder()
                .callTimeout(0, TimeUnit.MILLISECONDS)
                .readTimeout(0, TimeUnit.MILLISECONDS)
                .build();
        return new PendingStream(streamingClient.newCall(request), requestId);
    }

    private final class PendingStream {
        private final Call call;
        private final String requestId;

        private PendingStream(Call call, String requestId) {
            this.call = call;
            this.requestId = requestId;
        }

        private ApiStream execute() throws IOException {
            Response response;
            try {
                response = call.execute();
            } catch (IOException exception) {
                throw new NetworkException("Could not open Frontal event stream", requestId, exception);
            }
            ResponseBody responseBody = response.body();
            if (!response.isSuccessful()) {
                byte[] bytes;
                try (response) {
                    bytes = readBounded(
                            responseBody == null ? InputStream.nullInputStream() : responseBody.byteStream());
                }
                throw toFrontalException(
                        response.code(),
                        response.header("x-request-id", requestId),
                        response.header("retry-after"),
                        bytes);
            }
            if (responseBody == null) {
                response.close();
                throw new IOException("Frontal stream response did not include a body");
            }
            return new ApiStream(response.code(), response.headers().toMultimap(), responseBody.byteStream());
        }

        private void cancel() {
            call.cancel();
        }
    }

    /** Returns a backpressure-aware publisher of SSE event data. */
    public Flow.Publisher<String> streamPublisher(Endpoint endpoint, List<String> pathParams, Map<String, ?> query) {
        return SseEventPublisher.cancellable(() -> {
            PendingStream pending = newPendingStream(endpoint, pathParams, query);
            return new SseEventPublisher.StreamSource() {
                @Override
                public SseEventIterator open() throws IOException {
                    return new SseEventIterator(pending.execute());
                }

                @Override
                public void cancel() {
                    pending.cancel();
                }
            };
        });
    }

    /** Returns a blocking iterator over SSE event data. The caller must close it. */
    public SseEventIterator streamEvents(Endpoint endpoint, List<String> pathParams, Map<String, ?> query)
            throws IOException, InterruptedException {
        return new SseEventIterator(streamResponse(endpoint, pathParams, query));
    }

    private ApiResponse exchange(
            Endpoint endpoint,
            List<String> pathParams,
            Map<String, ?> query,
            @Nullable RequestBody requestBody,
            @Nullable String contentType,
            String accept)
            throws IOException, InterruptedException {
        String requestId = UUID.randomUUID().toString();
        int attempts = endpoint.method().wireMethod().equals("GET") ? config.maxRetries() + 1 : 1;
        for (int attempt = 0; attempt < attempts; attempt++) {
            Request request = buildRequest(endpoint, pathParams, query, requestBody, contentType, accept, requestId);
            Response response;
            try {
                response = httpClient.newCall(request).execute();
            } catch (IOException exception) {
                if (attempt + 1 < attempts) {
                    waitBeforeRetry(attempt, null);
                    continue;
                }
                throw new NetworkException("Frontal request failed before receiving a response", requestId, exception);
            }
            byte[] responseBytes;
            int status;
            String responseRequestId;
            String retryAfter;
            Map<String, List<String>> responseHeaders;
            try (response) {
                status = response.code();
                responseRequestId = response.header("x-request-id", requestId);
                retryAfter = response.header("retry-after");
                responseHeaders = response.headers().toMultimap();
                ResponseBody responseBody = response.body();
                responseBytes = responseBody == null ? new byte[0] : readBounded(responseBody.byteStream());
            }
            if (status >= 200 && status < 300) {
                return new ApiResponse(status, responseHeaders, responseBytes);
            }
            if (endpoint.method().wireMethod().equals("GET") && attempt + 1 < attempts && isRetryableStatus(status)) {
                waitBeforeRetry(attempt, retryAfter);
                continue;
            }
            throw toFrontalException(status, responseRequestId, retryAfter, responseBytes);
        }
        throw new NetworkException("Frontal request failed", requestId, null);
    }

    private Request buildRequest(
            Endpoint endpoint,
            List<String> pathParams,
            Map<String, ?> query,
            @Nullable RequestBody body,
            @Nullable String contentType,
            String accept,
            String requestId) {
        URI uri = RequestUriBuilder.build(
                endpoint.service() == ApiService.AI ? config.aiBaseUrl() : config.apiBaseUrl(),
                endpoint,
                pathParams,
                query);
        Request.Builder builder = new Request.Builder()
                .url(uri.toString())
                .header("Accept", accept)
                .header("User-Agent", config.userAgent())
                .header("X-Request-Id", requestId)
                .header("X-Frontal-Environment", config.environment());
        config.headers().forEach(builder::header);
        if (contentType != null) {
            builder.header("Content-Type", contentType);
        }
        if (authProvider != null) {
            authProvider.apply(builder);
        }
        RequestBody effectiveBody = body;
        String method = endpoint.method().wireMethod();
        if (effectiveBody == null && needsRequestBody(method)) {
            effectiveBody = RequestBody.create(new byte[0], JSON);
        }
        if (config.debug()) {
            System.err.printf("Frontal SDK %s %s requestId=%s%n", method, endpoint.path(), requestId);
        }
        return builder.method(method, effectiveBody).build();
    }

    private @Nullable RequestBody requestBody(HttpMethod method, @Nullable Object body) throws IOException {
        if (body == null) {
            return null;
        }
        if (method == HttpMethod.GET
                || method == HttpMethod.GETRAW
                || method == HttpMethod.DELETE
                || method == HttpMethod.HEAD
                || method == HttpMethod.OPTIONS) {
            throw new IllegalArgumentException("This endpoint does not accept a request body");
        }
        if (method == HttpMethod.POSTRAW) {
            if (!(body instanceof byte[] bytes)) {
                throw new IllegalArgumentException("POSTRAW request bodies must be byte[]");
            }
            return RequestBody.create(bytes, OCTET_STREAM);
        }
        JsonNode tree = objectMapper.valueToTree(body);
        return RequestBody.create(objectMapper.writeValueAsBytes(camelToSnake(tree)), JSON);
    }

    private @Nullable String contentType(HttpMethod method, @Nullable Object body) {
        if (body == null) {
            return null;
        }
        return method == HttpMethod.POSTRAW ? OCTET_STREAM.toString() : JSON.toString();
    }

    private JsonNode camelToSnake(JsonNode node) {
        if (node.isObject()) {
            ObjectNode converted = objectMapper.createObjectNode();
            node.fields()
                    .forEachRemaining(entry -> converted.set(toSnake(entry.getKey()), camelToSnake(entry.getValue())));
            return converted;
        }
        if (node.isArray()) {
            ArrayNode converted = objectMapper.createArrayNode();
            node.forEach(item -> converted.add(camelToSnake(item)));
            return converted;
        }
        return node;
    }

    private String toSnake(String key) {
        return key.replaceAll("([a-z0-9])([A-Z])", "$1_$2").toLowerCase(java.util.Locale.ROOT);
    }

    private FrontalException toFrontalException(
            int status, String requestId, @Nullable String retryAfter, byte[] body) {
        String responseBody = new String(body, StandardCharsets.UTF_8);
        @Nullable String code = null;
        @Nullable String message = null;
        try {
            JsonNode error = objectMapper.readTree(body);
            if (error != null && error.has("error")) {
                error = error.path("error");
            }
            if (error != null) {
                code = textOrNull(error.path("code"));
                message = textOrNull(error.path("message"));
            }
        } catch (IOException ignored) {
            // Preserve plain-text error bodies in the exception.
        }
        if (status == 401 || status == 403) {
            return new AuthException(code, message, requestId, status);
        }
        if (status == 400 || status == 422) {
            return new ValidationException(code, message, requestId, status);
        }
        if (status == 429) {
            return new RateLimitException(code, message, requestId, parseRetryAfter(retryAfter));
        }
        if (status >= 500) {
            return new ServerException(code, message, requestId, status, responseBody);
        }
        return new ApiException(status, code, message, requestId, responseBody);
    }

    private @Nullable String textOrNull(JsonNode node) {
        return node.isTextual() ? node.asText() : null;
    }

    private byte[] readBounded(InputStream stream) throws IOException {
        try (InputStream input = stream;
                ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[8192];
            long total = 0;
            int read;
            while ((read = input.read(buffer)) >= 0) {
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

    private void waitBeforeRetry(int attempt, @Nullable String retryAfter) throws InterruptedException {
        long delayMillis = Math.min(5_000L, 100L << Math.min(attempt, 5));
        Duration serverDelay = parseRetryAfter(retryAfter);
        if (retryAfter != null && !retryAfter.isBlank()) {
            delayMillis = Math.min(5_000L, serverDelay.toMillis());
        }
        TimeUnit.MILLISECONDS.sleep(delayMillis);
    }

    private Duration parseRetryAfter(@Nullable String retryAfter) {
        if (retryAfter == null || retryAfter.isBlank()) {
            return Duration.ZERO;
        }
        try {
            return Duration.ofSeconds(Math.max(0L, Long.parseLong(retryAfter.trim())));
        } catch (NumberFormatException ignored) {
            try {
                Instant at = ZonedDateTime.parse(retryAfter, DateTimeFormatter.RFC_1123_DATE_TIME)
                        .toInstant();
                return Duration.between(Instant.now(), at).isNegative()
                        ? Duration.ZERO
                        : Duration.between(Instant.now(), at);
            } catch (RuntimeException invalidDate) {
                return Duration.ZERO;
            }
        }
    }

    private boolean isRetryableStatus(int status) {
        return status == 408 || status == 425 || status == 429 || ServerException.isRetryableStatus(status);
    }

    private boolean needsRequestBody(String method) {
        return !method.equals("GET") && !method.equals("HEAD") && !method.equals("DELETE");
    }

    private String safeHeader(String value) {
        Objects.requireNonNull(value, "multipart field name");
        if (value.indexOf('\r') >= 0 || value.indexOf('\n') >= 0 || value.indexOf('"') >= 0) {
            throw new IllegalArgumentException("Multipart names cannot contain CR, LF, or quotes");
        }
        return value;
    }

    private <T> @Nullable T decode(byte[] response, Class<T> type) throws IOException {
        Objects.requireNonNull(type, "responseType");
        if (response.length == 0 || type == Void.class || type == void.class) {
            return null;
        }
        if (type == byte[].class) {
            return type.cast(response);
        }
        return objectMapper.readValue(response, type);
    }

    private static OkHttpClient createHttpClient(ClientConfig config) {
        return new OkHttpClient.Builder()
                .connectTimeout(config.connectTimeout().toMillis(), TimeUnit.MILLISECONDS)
                .readTimeout(config.requestTimeout().toMillis(), TimeUnit.MILLISECONDS)
                .callTimeout(config.requestTimeout().toMillis(), TimeUnit.MILLISECONDS)
                .followRedirects(true)
                .build();
    }

    private static @Nullable AuthProvider apiKeyAuth(ClientConfig config) {
        @Nullable String apiKey = config.apiKey();
        return apiKey == null ? null : new ApiKeyAuthProvider(apiKey);
    }

    @Override
    public void close() {
        if (ownsHttpClient) {
            httpClient.dispatcher().executorService().shutdown();
            httpClient.connectionPool().evictAll();
        }
    }
}
