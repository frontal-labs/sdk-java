package dev.frontal.sdk;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

/** Base type for structured Frontal API and transport failures. */
public abstract sealed class FrontalException extends IOException
        permits ApiException,
                AuthException,
                RateLimitException,
                ServerException,
                ValidationException,
                NetworkException {
    private final String code;
    private final String requestId;
    private final int statusCode;
    private final boolean retryable;

    protected FrontalException(
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            int statusCode,
            boolean retryable) {
        super(message == null || message.isBlank() ? "Frontal request failed" : message);
        this.code = Objects.requireNonNullElse(code, "UNKNOWN_ERROR");
        this.requestId =
                Objects.requireNonNullElseGet(requestId, () -> UUID.randomUUID().toString());
        this.statusCode = statusCode;
        this.retryable = retryable;
    }

    protected FrontalException(
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            int statusCode,
            boolean retryable,
            @Nullable Throwable cause) {
        super(message == null || message.isBlank() ? "Frontal request failed" : message, cause);
        this.code = Objects.requireNonNullElse(code, "UNKNOWN_ERROR");
        this.requestId =
                Objects.requireNonNullElseGet(requestId, () -> UUID.randomUUID().toString());
        this.statusCode = statusCode;
        this.retryable = retryable;
    }

    public final String code() {
        return code;
    }

    public final String requestId() {
        return requestId;
    }

    public final int statusCode() {
        return statusCode;
    }

    public final boolean retryable() {
        return retryable;
    }
}
