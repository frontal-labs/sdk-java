package dev.frontal.sdk;

import java.net.http.HttpRequest;
import java.util.Objects;

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
  public void apply(HttpRequest.Builder request) {
    request.setHeader("Authorization", "Bearer " + apiKey);
  }
}
