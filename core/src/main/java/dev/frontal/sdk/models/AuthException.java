package dev.frontal.sdk;

import org.jspecify.annotations.Nullable;

/** Authentication or authorization failure returned by the API. */
public final class AuthException extends FrontalException {
    public AuthException(@Nullable String code, @Nullable String message, @Nullable String requestId, int statusCode) {
        super(code, message, requestId, statusCode, false);
    }
}
