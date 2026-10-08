package dev.frontal.sdk;

import java.net.URI;
import java.time.Duration;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

/** Root client. Every service accessor shares one configured transport. */
public final class Frontal implements AutoCloseable {
    private final ApiClient apiClient;
    private final Map<ApiService, ServiceClient> services;

    public Frontal(String apiKey) {
        this(ClientConfig.builder().apiKey(apiKey).build());
    }

    public Frontal(ClientConfig config) {
        this(new ApiClient(config));
    }

    /** Creates a client with a custom authentication provider. */
    public Frontal(ClientConfig config, AuthProvider authProvider) {
        this(new ApiClient(config, authProvider));
    }

    public Frontal(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "apiClient");
        this.services = new EnumMap<>(ApiService.class);
        for (ApiService service : ApiService.values()) {
            ServiceClient serviceClient =
                    switch (service) {
                        case AI -> new AiClient(apiClient);
                        case AGENTS -> new AgentsClient(apiClient);
                        case WORKFLOWS -> new WorkflowsClient(apiClient);
                        default -> new ServiceClient(service, apiClient);
                    };
            services.put(service, serviceClient);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Frontal fromEnvironment() {
        return new Frontal(ClientConfig.fromEnvironment());
    }

    public ApiClient apiClient() {
        return apiClient;
    }

    public ServiceClient service(ApiService service) {
        return Objects.requireNonNull(services.get(Objects.requireNonNull(service, "service")));
    }

    public AgentsClient agents() {
        return (AgentsClient) service(ApiService.AGENTS);
    }

    public AiClient ai() {
        return (AiClient) service(ApiService.AI);
    }

    public ServiceClient audit() {
        return service(ApiService.AUDIT);
    }

    public ServiceClient actionRuns() {
        return service(ApiService.ACTION_RUNS);
    }

    public ServiceClient auth() {
        return service(ApiService.AUTH);
    }

    public ServiceClient billing() {
        return service(ApiService.BILLING);
    }

    public ServiceClient blob() {
        return service(ApiService.BLOB);
    }

    public ServiceClient connectors() {
        return service(ApiService.CONNECTORS);
    }

    public ServiceClient connectionTests() {
        return service(ApiService.CONNECTION_TESTS);
    }

    public ServiceClient data() {
        return service(ApiService.DATA);
    }

    public ServiceClient events() {
        return service(ApiService.EVENTS);
    }

    public ServiceClient governance() {
        return service(ApiService.GOVERNANCE);
    }

    public ServiceClient lineage() {
        return service(ApiService.LINEAGE);
    }

    public ServiceClient integrations() {
        return service(ApiService.INTEGRATIONS);
    }

    public ServiceClient observability() {
        return service(ApiService.OBSERVABILITY);
    }

    public ServiceClient ontology() {
        return service(ApiService.ONTOLOGY);
    }

    public ServiceClient invocations() {
        return service(ApiService.INVOCATIONS);
    }

    public ServiceClient pipelines() {
        return service(ApiService.PIPELINES);
    }

    public ServiceClient providers() {
        return service(ApiService.PROVIDERS);
    }

    public ServiceClient react() {
        return service(ApiService.REACT);
    }

    public ServiceClient sandbox() {
        return service(ApiService.SANDBOX);
    }

    public ServiceClient schedules() {
        return service(ApiService.SCHEDULES);
    }

    public ServiceClient webhooks() {
        return service(ApiService.WEBHOOKS);
    }

    public ServiceClient webhookEndpoints() {
        return service(ApiService.WEBHOOK_ENDPOINTS);
    }

    public WorkflowsClient workflows() {
        return (WorkflowsClient) service(ApiService.WORKFLOWS);
    }

    @Override
    public void close() {
        apiClient.close();
    }

    /** Fluent configuration for constructing a testable client. */
    public static final class Builder {
        private final ClientConfig.Builder config = ClientConfig.builder();

        private Builder() {}

        public Builder apiKey(String apiKey) {
            config.apiKey(apiKey);
            return this;
        }

        public Builder baseUrl(String baseUrl) {
            config.apiBaseUrl(baseUrl);
            return this;
        }

        public Builder baseUrl(URI baseUrl) {
            config.apiBaseUrl(baseUrl);
            return this;
        }

        public Builder apiBaseUrl(String baseUrl) {
            return baseUrl(baseUrl);
        }

        public Builder aiBaseUrl(String baseUrl) {
            config.aiBaseUrl(baseUrl);
            return this;
        }

        public Builder environment(String environment) {
            config.environment(environment);
            return this;
        }

        public Builder env(String environment) {
            return environment(environment);
        }

        public Builder debug(boolean debug) {
            config.debug(debug);
            return this;
        }

        public Builder timeout(Duration timeout) {
            config.requestTimeout(timeout);
            return this;
        }

        public Builder connectTimeout(Duration timeout) {
            config.connectTimeout(timeout);
            return this;
        }

        public Builder maxRetries(int attempts) {
            config.maxRetries(attempts);
            return this;
        }

        public Builder header(String name, String value) {
            config.header(name, value);
            return this;
        }

        public Frontal build() {
            return new Frontal(config.build());
        }
    }
}
