package dev.frontal.sdk;

import org.jspecify.annotations.Nullable;

/** Authentication or authorization failure returned by the API. */
public final class AuthException extends FrontalException {
    public AuthException(@Nullable String code, @Nullable String message, @Nullable String requestId, int statusCode) {
        this(code, message, requestId, statusCode, null);
    }

    public AuthException(
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            int statusCode,
            @Nullable String responseBody) {
        this(code, message, requestId, statusCode, responseBody, false);
    }

    public AuthException(
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            int statusCode,
            @Nullable String responseBody,
            boolean responseBodyTruncated) {
        super(code, message, requestId, statusCode, false, null, responseBody, responseBodyTruncated);
    }
}
