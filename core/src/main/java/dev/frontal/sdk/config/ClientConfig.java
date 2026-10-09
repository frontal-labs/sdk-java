package dev.frontal.sdk;

import java.net.URI;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

/** Immutable connection, authentication, timeout, and retry settings for the SDK. */
public final class ClientConfig {
    public static final URI DEFAULT_API_BASE_URL = URI.create("https://api.frontal.dev/v1");
    public static final URI DEFAULT_AI_BASE_URL = URI.create("https://ai.frontal.dev");
    private static final int DEFAULT_MAX_RETRIES = 2;
    private static final int DEFAULT_FUNCTIONS_MAX_RETRIES = 3;

    private final @Nullable String apiKey;
    private final URI apiBaseUrl;
    private final URI aiBaseUrl;
    private final Duration connectTimeout;
    private final Duration requestTimeout;
    private final int maxRetries;
    private final boolean maxRetriesExplicit;
    private final long maxResponseBytes;
    private final int maxErrorBodyBytes;
    private final String userAgent;
    private final String environment;
    private final boolean debug;
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
        if (builder.maxErrorBodyBytes <= 0) {
            throw new IllegalArgumentException("maxErrorBodyBytes must be positive");
        }
        maxRetries = builder.maxRetries;
        maxRetriesExplicit = builder.maxRetriesExplicit;
        maxResponseBytes = builder.maxResponseBytes;
        maxErrorBodyBytes = builder.maxErrorBodyBytes;
        userAgent = requireText(builder.userAgent, "userAgent");
        environment = requireText(builder.environment, "environment").toLowerCase(Locale.ROOT);
        debug = builder.debug;
        Map<String, String> validatedHeaders = new LinkedHashMap<>();
        java.util.Set<String> normalizedNames = new java.util.HashSet<>();
        builder.headers.forEach((name, value) -> {
            validateHeader(name, value);
            if (!normalizedNames.add(name.toLowerCase(Locale.ROOT))) {
                throw new IllegalArgumentException("Duplicate header name ignoring case: " + name);
            }
            validatedHeaders.put(name, value);
        });
        headers = Map.copyOf(validatedHeaders);
    }

    /** Creates the default configuration without authentication. */
    public ClientConfig() {
        this(builder());
    }

    /** Creates a default configuration that authenticates with a Frontal API key. */
    public ClientConfig(String apiKey) {
        this(builder().apiKey(apiKey));
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
        String environment = System.getenv("FRONTAL_ENV");
        if (environment != null && !environment.isBlank()) {
            builder.environment(environment);
        }
        String debug = System.getenv("FRONTAL_DEBUG");
        if (debug != null && !debug.isBlank()) {
            builder.debug(Boolean.parseBoolean(debug));
        }
        String timeoutMillis = System.getenv("FRONTAL_TIMEOUT");
        if (timeoutMillis != null && !timeoutMillis.isBlank()) {
            try {
                builder.requestTimeout(Duration.ofMillis(Long.parseLong(timeoutMillis.trim())));
            } catch (NumberFormatException exception) {
                throw new IllegalStateException("FRONTAL_TIMEOUT must be a positive number of milliseconds", exception);
            }
        }
        return builder.build();
    }

    public @Nullable String apiKey() {
        return apiKey;
    }

    public URI apiBaseUrl() {
        return apiBaseUrl;
    }

    public URI aiBaseUrl() {
        return aiBaseUrl;
    }

    public Duration connectTimeout() {
        return connectTimeout;
    }

    public Duration requestTimeout() {
        return requestTimeout;
    }

    public int maxRetries() {
        return maxRetries;
    }

    int maxRetriesFor(ApiService service) {
        Objects.requireNonNull(service, "service");
        if (!maxRetriesExplicit && service == ApiService.FUNCTIONS) {
            return DEFAULT_FUNCTIONS_MAX_RETRIES;
        }
        return maxRetries;
    }

    public long maxResponseBytes() {
        return maxResponseBytes;
    }

    /** Maximum error response bytes retained for diagnostics. */
    public int maxErrorBodyBytes() {
        return maxErrorBodyBytes;
    }

    public String userAgent() {
        return userAgent;
    }

    public String environment() {
        return environment;
    }

    public boolean debug() {
        return debug;
    }

    public Map<String, String> headers() {
        return headers;
    }

    private static URI normalizeBaseUrl(URI value, String name) {
        Objects.requireNonNull(value, name);
        String scheme = value.getScheme();
        if (value.getHost() == null || !("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme))) {
            throw new IllegalArgumentException(name + " must be an absolute HTTP or HTTPS URL");
        }
        if (value.getRawUserInfo() != null || value.getRawQuery() != null || value.getRawFragment() != null) {
            throw new IllegalArgumentException(name + " must not include user info, a query, or a fragment");
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

    private static void validateHeader(String name, String value) {
        requireText(name, "header name");
        Objects.requireNonNull(value, "header value");
        for (int index = 0; index < name.length(); index++) {
            char character = name.charAt(index);
            boolean valid = (character >= '0' && character <= '9')
                    || (character >= 'A' && character <= 'Z')
                    || (character >= 'a' && character <= 'z')
                    || "!#$%&'*+-.^_`|~".indexOf(character) >= 0;
            if (!valid) {
                throw new IllegalArgumentException("Invalid HTTP header name: " + name);
            }
        }
        if (value.indexOf('\r') >= 0 || value.indexOf('\n') >= 0) {
            throw new IllegalArgumentException("HTTP header values must not contain line breaks");
        }
    }

    /** Mutable builder used to create an immutable client configuration. */
    public static final class Builder {
        private @Nullable String apiKey;
        private URI apiBaseUrl = DEFAULT_API_BASE_URL;
        private URI aiBaseUrl = DEFAULT_AI_BASE_URL;
        private Duration connectTimeout = Duration.ofSeconds(10);
        private Duration requestTimeout = Duration.ofSeconds(30);
        private int maxRetries = DEFAULT_MAX_RETRIES;
        private boolean maxRetriesExplicit;
        private long maxResponseBytes = 64L * 1024 * 1024;
        private int maxErrorBodyBytes = 16 * 1024;
        private String userAgent = "frontal-java-sdk/2.0.0";
        private String environment = "development";
        private boolean debug;
        private final Map<String, String> headers = new LinkedHashMap<>();

        private Builder() {}

        public Builder apiKey(String apiKey) {
            String value = requireText(apiKey, "apiKey");
            this.apiKey = value;
            return this;
        }

        public Builder apiBaseUrl(String apiBaseUrl) {
            return apiBaseUrl(URI.create(apiBaseUrl));
        }

        public Builder apiBaseUrl(URI apiBaseUrl) {
            this.apiBaseUrl = Objects.requireNonNull(apiBaseUrl, "apiBaseUrl");
            return this;
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

        public Builder maxRetries(int maxRetries) {
            this.maxRetries = maxRetries;
            this.maxRetriesExplicit = true;
            return this;
        }

        public Builder maxResponseBytes(long maxResponseBytes) {
            this.maxResponseBytes = maxResponseBytes;
            return this;
        }

        public Builder maxErrorBodyBytes(int maxErrorBodyBytes) {
            this.maxErrorBodyBytes = maxErrorBodyBytes;
            return this;
        }

        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public Builder environment(String environment) {
            this.environment = requireText(environment, "environment");
            return this;
        }

        public Builder debug(boolean debug) {
            this.debug = debug;
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
