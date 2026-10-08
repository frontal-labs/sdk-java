package dev.frontal.sdk;

import java.util.Objects;

/** A contract-backed API route. Path placeholders are positional and use {@code {param}}. */
public record Endpoint(ApiService service, HttpMethod method, String path) {
  public Endpoint {
    Objects.requireNonNull(service, "service");
    Objects.requireNonNull(method, "method");
    Objects.requireNonNull(path, "path");
    if (!path.startsWith("/")) {
      throw new IllegalArgumentException("Endpoint paths must begin with '/'");
    }
  }

  public int pathParameterCount() {
    int count = 0;
    int offset = 0;
    while ((offset = path.indexOf("{param}", offset)) >= 0) {
      count++;
      offset += "{param}".length();
    }
    return count;
  }
}
