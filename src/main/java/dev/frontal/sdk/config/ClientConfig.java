package dev.frontal.sdk;

import java.net.URI;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/** Immutable connection, authentication, timeout, and retry settings for the SDK. */
public final class ClientConfig {
  public static final URI DEFAULT_API_BASE_URL = URI.create("https://api.frontal.dev/v1");
  public static final URI DEFAULT_AI_BASE_URL = URI.create("https://ai.frontal.dev");

  private final String apiKey;
  private final URI apiBaseUrl;
  private final URI aiBaseUrl;
  private final Duration connectTimeout;
  private final Duration requestTimeout;
  private final int maxRetries;
  private final long maxResponseBytes;
  private final String userAgent;
  private final Map<String, String> headers;

  private ClientConfig(Builder builder) {
    apiKey = builder.apiKey;
    apiBaseUrl = normalizeBaseUrl(builder.apiBaseUrl, "apiBaseUrl");
    aiBaseUrl = normalizeBaseUrl(builder.aiBaseUrl, "aiBaseUrl");
    connectTimeout = positive(builder.connectTimeout, "connectTimeout");
    requestTimeout = positive(builder.requestTimeout, "requestTimeout");
    if (builder.maxRetries < 0 || builder.maxRetries > 10) {
      throw new IllegalArgumentException("maxRetries must be between 0 and 10");
    }
    if (builder.maxResponseBytes <= 0) {
      throw new IllegalArgumentException("maxResponseBytes must be positive");
    }
    maxRetries = builder.maxRetries;
    maxResponseBytes = builder.maxResponseBytes;
    userAgent = requireText(builder.userAgent, "userAgent");
    headers = Map.copyOf(builder.headers);
  }

  /** Creates the default configuration without authentication. */
  public ClientConfig() {
    this(builder());
  }

  /** Creates a default configuration that authenticates with a Frontal API key. */
  public ClientConfig(String apiKey) {
    this(builder().apiKey(apiKey));
  }

  /** Compatibility constructor for explicit connection settings. */
  public ClientConfig(
      String apiKey,
      URI baseUrl,
      Duration timeout,
      int maxRetries,
      long maxResponseBytes,
      Map<String, String> headers) {
    this(
        builder()
            .apiKey(apiKey)
            .apiBaseUrl(baseUrl)
            .requestTimeout(timeout)
            .maxRetries(maxRetries)
            .maxResponseBytes(maxResponseBytes)
            .headers(headers));
  }

  public static Builder builder() {
    return new Builder();
  }

  /** Loads the API key and optional API base URL from the environment. */
  public static ClientConfig fromEnvironment() {
    String apiKey = System.getenv("FRONTAL_API_KEY");
    if (apiKey == null || apiKey.isBlank()) {
      throw new IllegalStateException("Set FRONTAL_API_KEY before creating the client");
    }
    Builder builder = builder().apiKey(apiKey);
    String apiUrl = System.getenv("FRONTAL_API_URL");
    if (apiUrl != null && !apiUrl.isBlank()) {
      builder.apiBaseUrl(apiUrl);
    }
    String aiUrl = System.getenv("FRONTAL_AI_URL");
    if (aiUrl != null && !aiUrl.isBlank()) {
      builder.aiBaseUrl(aiUrl);
    }
    return builder.build();
  }

  public String apiKey() {
    return apiKey;
  }

  public URI apiBaseUrl() {
    return apiBaseUrl;
  }

  public URI aiBaseUrl() {
    return aiBaseUrl;
  }

  /** Returns the general API base URL for compatibility with earlier SDK versions. */
  public URI baseUrl() {
    return apiBaseUrl;
  }

  public Duration connectTimeout() {
    return connectTimeout;
  }

  public Duration requestTimeout() {
    return requestTimeout;
  }

  /** Returns the request timeout for compatibility with earlier SDK versions. */
  public Duration timeout() {
    return requestTimeout;
  }

  public int maxRetries() {
    return maxRetries;
  }

  public long maxResponseBytes() {
    return maxResponseBytes;
  }

  public String userAgent() {
    return userAgent;
  }

  public Map<String, String> headers() {
    return headers;
  }

  private static URI normalizeBaseUrl(URI value, String name) {
    Objects.requireNonNull(value, name);
    String scheme = value.getScheme();
    if (value.getHost() == null
        || !("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme))) {
      throw new IllegalArgumentException(name + " must be an absolute HTTP or HTTPS URL");
    }
    String normalized = value.toString();
    while (normalized.endsWith("/")) {
      normalized = normalized.substring(0, normalized.length() - 1);
    }
    return URI.create(normalized);
  }

  private static Duration positive(Duration value, String name) {
    Objects.requireNonNull(value, name);
    if (value.isZero() || value.isNegative()) {
      throw new IllegalArgumentException(name + " must be positive");
    }
    return value;
  }

  private static String requireText(String value, String name) {
    Objects.requireNonNull(value, name);
    if (value.isBlank()) {
      throw new IllegalArgumentException(name + " must not be blank");
    }
    return value;
  }

  /** Mutable builder used to create an immutable client configuration. */
  public static final class Builder {
    private String apiKey;
    private URI apiBaseUrl = DEFAULT_API_BASE_URL;
    private URI aiBaseUrl = DEFAULT_AI_BASE_URL;
    private Duration connectTimeout = Duration.ofSeconds(10);
    private Duration requestTimeout = Duration.ofSeconds(30);
    private int maxRetries = 2;
    private long maxResponseBytes = 64L * 1024 * 1024;
    private String userAgent = "frontal-java-sdk/0.1.0";
    private final Map<String, String> headers = new LinkedHashMap<>();

    private Builder() {}

    public Builder apiKey(String apiKey) {
      this.apiKey = requireText(apiKey, "apiKey");
      return this;
    }

    public Builder apiBaseUrl(String apiBaseUrl) {
      return apiBaseUrl(URI.create(apiBaseUrl));
    }

    public Builder apiBaseUrl(URI apiBaseUrl) {
      this.apiBaseUrl = Objects.requireNonNull(apiBaseUrl, "apiBaseUrl");
      return this;
    }

    /** Alias for {@link #apiBaseUrl(URI)}. */
    public Builder baseUrl(URI baseUrl) {
      return apiBaseUrl(baseUrl);
    }

    public Builder baseUrl(String baseUrl) {
      return apiBaseUrl(baseUrl);
    }

    public Builder aiBaseUrl(String aiBaseUrl) {
      return aiBaseUrl(URI.create(aiBaseUrl));
    }

    public Builder aiBaseUrl(URI aiBaseUrl) {
      this.aiBaseUrl = Objects.requireNonNull(aiBaseUrl, "aiBaseUrl");
      return this;
    }

    public Builder connectTimeout(Duration connectTimeout) {
      this.connectTimeout = connectTimeout;
      return this;
    }

    public Builder requestTimeout(Duration requestTimeout) {
      this.requestTimeout = requestTimeout;
      return this;
    }

    /** Alias for {@link #requestTimeout(Duration)}. */
    public Builder timeout(Duration timeout) {
      return requestTimeout(timeout);
    }

    public Builder maxRetries(int maxRetries) {
      this.maxRetries = maxRetries;
      return this;
    }

    public Builder maxResponseBytes(long maxResponseBytes) {
      this.maxResponseBytes = maxResponseBytes;
      return this;
    }

    public Builder userAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }

    public Builder header(String name, String value) {
      headers.put(requireText(name, "header name"), Objects.requireNonNull(value, "header value"));
      return this;
    }

    public Builder headers(Map<String, String> headers) {
      this.headers.clear();
      this.headers.putAll(Objects.requireNonNull(headers, "headers"));
      return this;
    }

    public ClientConfig build() {
      return new ClientConfig(this);
    }
  }
}
