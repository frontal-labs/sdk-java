package dev.frontal.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/** A successful streaming HTTP response. Close it to release the connection. */
public final class ApiStream implements AutoCloseable {
    private final int statusCode;
    private final Map<String, List<String>> headers;
    private final InputStream body;

    public ApiStream(int statusCode, Map<String, List<String>> headers, InputStream body) {
        this.statusCode = statusCode;
        this.headers = Objects.requireNonNull(headers, "headers").entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> List.copyOf(entry.getValue())));
        this.body = Objects.requireNonNull(body, "body");
    }

    public int statusCode() {
        return statusCode;
    }

    public Map<String, List<String>> headers() {
        return headers;
    }

    public InputStream body() {
        return body;
    }

    @Override
    public void close() throws IOException {
        body.close();
    }
}
