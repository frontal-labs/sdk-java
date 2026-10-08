package dev.frontal.sdk;

import org.jspecify.annotations.Nullable;

/** An HTTP error outside the more specific authentication, validation, rate, or server classes. */
public final class ApiException extends FrontalException {
    private final String responseBody;

    public ApiException(
            int statusCode,
            @Nullable String code,
            @Nullable String message,
            @Nullable String requestId,
            String responseBody) {
        super(code, message, requestId, statusCode, statusCode == 408 || statusCode == 425);
        this.responseBody = responseBody;
    }

    public String responseBody() {
        return responseBody;
    }
}
