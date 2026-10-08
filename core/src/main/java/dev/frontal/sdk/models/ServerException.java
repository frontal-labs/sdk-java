package dev.frontal.sdk;

import org.jspecify.annotations.Nullable;

/** The API returned a server-side failure. */
public final class ServerException extends FrontalException {
    private final String responseBody;

    public ServerException(
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            int statusCode,
            String responseBody) {
        super(code, message, requestId, statusCode, isRetryableStatus(statusCode));
        this.responseBody = responseBody;
    }

    public String responseBody() {
        return responseBody;
    }

    static boolean isRetryableStatus(int statusCode) {
        return statusCode == 500 || statusCode == 502 || statusCode == 503 || statusCode == 504;
    }
}
