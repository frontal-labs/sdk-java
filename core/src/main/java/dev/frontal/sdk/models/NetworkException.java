package dev.frontal.sdk;

import org.jspecify.annotations.Nullable;

/** A connection failure before a usable HTTP response was received. */
public final class NetworkException extends FrontalException {
    public NetworkException(String message, @Nullable String requestId, @Nullable Throwable cause) {
        super("NETWORK_ERROR", message, requestId, 0, true, cause);
    }
}
