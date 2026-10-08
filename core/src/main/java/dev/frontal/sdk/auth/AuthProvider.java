package dev.frontal.sdk;

import okhttp3.Request;

/** Applies SDK authentication to an outgoing request. */
@FunctionalInterface
public interface AuthProvider {
    void apply(Request.Builder request);
}
