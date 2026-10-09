package dev.frontal.sdk;

import java.time.Duration;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

/** The request exceeded an API rate limit. */
public final class RateLimitException extends FrontalException {
    private final Duration retryAfter;

    public RateLimitException(
            @Nullable String code, @Nullable String message, @Nullable String requestId, Duration retryAfter) {
        this(code, message, requestId, retryAfter, null);
    }

    public RateLimitException(
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            Duration retryAfter,
            @Nullable String responseBody) {
        this(code, message, requestId, retryAfter, responseBody, false);
    }

    public RateLimitException(
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            Duration retryAfter,
            @Nullable String responseBody,
            boolean responseBodyTruncated) {
        super(code, message, requestId, 429, true, null, responseBody, responseBodyTruncated);
        this.retryAfter = Objects.requireNonNull(retryAfter, "retryAfter");
    }

    public Duration retryAfter() {
        return retryAfter;
    }
}
