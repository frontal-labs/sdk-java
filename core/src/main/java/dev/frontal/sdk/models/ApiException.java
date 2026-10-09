package dev.frontal.sdk;

import org.jspecify.annotations.Nullable;

/** An HTTP error outside the more specific authentication, validation, rate, or server classes. */
public final class ApiException extends FrontalException {
    public ApiException(
            int statusCode,
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            String responseBody) {
        this(statusCode, code, message, requestId, responseBody, false);
    }

    public ApiException(
            int statusCode,
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            String responseBody,
            boolean responseBodyTruncated) {
        super(
                code,
                message,
                requestId,
                statusCode,
                statusCode == 408 || statusCode == 425,
                null,
                responseBody,
                responseBodyTruncated);
    }
}
