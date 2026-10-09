package dev.frontal.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Flow;
import org.jspecify.annotations.Nullable;

/** Typed access boundary for one API domain. */
public class ServiceClient {
    private final ApiService service;
    private final ApiClient client;

    ServiceClient(ApiService service, ApiClient client) {
        this.service = Objects.requireNonNull(service, "service");
        this.client = Objects.requireNonNull(client, "client");
    }

    public ApiService service() {
        return service;
    }

    protected ApiClient client() {
        return client;
    }

    public <T> @Nullable T request(Endpoint endpoint, Class<T> responseType) throws IOException, InterruptedException {
        return request(endpoint, List.of(), QueryParams.empty(), null, responseType);
    }

    public <T> @Nullable T request(Endpoint endpoint, List<String> pathParams, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(endpoint, pathParams, QueryParams.empty(), null, responseType);
    }

    public <T> @Nullable T request(
            Endpoint endpoint,
            List<String> pathParams,
            QueryParams query,
            @Nullable JsonNode body,
            Class<T> responseType)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.request(endpoint, pathParams, query, body, responseType);
    }

    public <T> @Nullable T request(
            Endpoint endpoint,
            List<String> pathParams,
            QueryParams query,
            @Nullable JsonNode body,
            TypeReference<T> responseType)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.request(endpoint, pathParams, query, body, responseType);
    }

    public byte[] requestBytes(Endpoint endpoint, List<String> pathParams, QueryParams query, @Nullable JsonNode body)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.requestBytes(endpoint, pathParams, query, body);
    }

    /** Opens a successful response body without buffering it. The caller must close the result. */
    public ApiStream streamBody(Endpoint endpoint, List<String> pathParams, QueryParams query, @Nullable JsonNode body)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.streamBody(endpoint, pathParams, query, body);
    }

    public ApiResponse execute(Endpoint endpoint, List<String> pathParams, QueryParams query, @Nullable JsonNode body)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.execute(endpoint, pathParams, query, body);
    }

    public ApiResponse executeRaw(Endpoint endpoint, List<String> pathParams, QueryParams query, byte[] body)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.executeRaw(endpoint, pathParams, query, body);
    }

    public <T> @Nullable T requestRaw(
            Endpoint endpoint, List<String> pathParams, QueryParams query, byte[] body, Class<T> responseType)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.requestRaw(endpoint, pathParams, query, body, responseType);
    }

    public <T> @Nullable T requestRaw(
            Endpoint endpoint, List<String> pathParams, QueryParams query, byte[] body, TypeReference<T> responseType)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.requestRaw(endpoint, pathParams, query, body, responseType);
    }

    public byte[] requestRawBytes(Endpoint endpoint, List<String> pathParams, QueryParams query, byte[] body)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.requestRawBytes(endpoint, pathParams, query, body);
    }

    public <T> @Nullable T requestForm(
            Endpoint endpoint,
            List<String> pathParams,
            QueryParams query,
            Map<String, String> fields,
            Map<String, Path> files,
            Class<T> responseType)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.requestForm(endpoint, pathParams, query, fields, files, responseType);
    }

    public <T> @Nullable T requestForm(
            Endpoint endpoint,
            List<String> pathParams,
            QueryParams query,
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
            QueryParams query,
            Map<String, String> fields,
            Map<String, Path> files)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.executeForm(endpoint, pathParams, query, fields, files);
    }

    public InputStream stream(Endpoint endpoint, List<String> pathParams, QueryParams query)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.stream(endpoint, pathParams, query);
    }

    public ApiStream streamResponse(Endpoint endpoint, List<String> pathParams, QueryParams query)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.streamResponse(endpoint, pathParams, query);
    }

    /** Opens a reactive stream of event payloads from a {@code STREAM} endpoint. */
    public Flow.Publisher<String> streamPublisher(Endpoint endpoint, List<String> pathParams, QueryParams query) {
        verify(endpoint);
        return client.streamPublisher(endpoint, pathParams, query);
    }

    /** Opens a blocking iterator of event payloads; close it to release the HTTP connection. */
    public SseEventIterator streamEvents(Endpoint endpoint, List<String> pathParams, QueryParams query)
            throws IOException, InterruptedException {
        verify(endpoint);
        return client.streamEvents(endpoint, pathParams, query);
    }

    private void verify(Endpoint endpoint) {
        Objects.requireNonNull(endpoint, "endpoint");
        if (endpoint.service() != service) {
            throw new IllegalArgumentException(
                    "Endpoint belongs to " + endpoint.service().value() + ", not " + service.value());
        }
    }
}
