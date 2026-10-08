package dev.frontal.sdk;

import java.net.http.HttpRequest;

/** Applies SDK authentication to an outgoing request. */
@FunctionalInterface
public interface AuthProvider {
    void apply(HttpRequest.Builder request);
}
