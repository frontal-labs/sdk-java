package dev.frontal.sdk;

import org.jspecify.annotations.Nullable;

/** The API returned a server-side failure. */
public final class ServerException extends FrontalException {
    public ServerException(
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            int statusCode,
            String responseBody) {
        this(code, message, requestId, statusCode, responseBody, false);
    }

    public ServerException(
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            int statusCode,
            String responseBody,
            boolean responseBodyTruncated) {
        super(
                code,
                message,
                requestId,
                statusCode,
                isRetryableStatus(statusCode),
                null,
                responseBody,
                responseBodyTruncated);
    }

    static boolean isRetryableStatus(int statusCode) {
        return statusCode == 500 || statusCode == 502 || statusCode == 503 || statusCode == 504;
    }
}
