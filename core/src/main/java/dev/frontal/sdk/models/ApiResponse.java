package dev.frontal.sdk;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

/** Successful HTTP response metadata and raw response bytes. */
@SuppressWarnings("ArrayRecordComponent")
public record ApiResponse(int statusCode, Map<String, List<String>> headers, byte[] body) {
    public ApiResponse {
        Objects.requireNonNull(headers, "headers");
        Objects.requireNonNull(body, "body");
        headers = headers.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> List.copyOf(entry.getValue())));
        body = body.clone();
    }

    @Override
    public byte[] body() {
        return body.clone();
    }

    public String bodyText() {
        return new String(body, StandardCharsets.UTF_8);
    }

    /** Returns the request ID echoed by the API, if present. */
    public @Nullable String requestId() {
        return headers.entrySet().stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase("x-request-id"))
                .flatMap(entry -> entry.getValue().stream())
                .findFirst()
                .orElse(null);
    }

    public boolean isSuccessful() {
        return statusCode >= 200 && statusCode < 300;
    }
}
