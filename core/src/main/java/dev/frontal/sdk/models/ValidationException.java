package dev.frontal.sdk;

import org.jspecify.annotations.Nullable;

/** The API rejected request parameters or a request body. */
public final class ValidationException extends FrontalException {
    public ValidationException(
            @Nullable String code, @Nullable String message, @Nullable String requestId, int statusCode) {
        this(code, message, requestId, statusCode, null);
    }

    public ValidationException(
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            int statusCode,
            @Nullable String responseBody) {
        this(code, message, requestId, statusCode, responseBody, false);
    }

    public ValidationException(
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            int statusCode,
            @Nullable String responseBody,
            boolean responseBodyTruncated) {
        super(code, message, requestId, statusCode, false, null, responseBody, responseBodyTruncated);
    }
}
