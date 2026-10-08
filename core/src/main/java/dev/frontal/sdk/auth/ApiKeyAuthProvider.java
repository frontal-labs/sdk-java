package dev.frontal.sdk;

import java.util.Objects;
import okhttp3.Request;

/** Adds a Frontal API key as a Bearer authorization token. */
public final class ApiKeyAuthProvider implements AuthProvider {
    private final String apiKey;

    public ApiKeyAuthProvider(String apiKey) {
        Objects.requireNonNull(apiKey, "apiKey");
        if (apiKey.isBlank()) {
            throw new IllegalArgumentException("apiKey must not be blank");
        }
        this.apiKey = apiKey;
    }

    @Override
    public void apply(Request.Builder request) {
        request.header("Authorization", "Bearer " + apiKey);
    }
}
