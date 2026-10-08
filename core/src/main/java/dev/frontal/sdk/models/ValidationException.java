package dev.frontal.sdk;

import org.jspecify.annotations.Nullable;

/** The API rejected request parameters or a request body. */
public final class ValidationException extends FrontalException {
    public ValidationException(
            @Nullable String code, @Nullable String message, @Nullable String requestId, int statusCode) {
        super(code, message, requestId, statusCode, false);
    }
}
