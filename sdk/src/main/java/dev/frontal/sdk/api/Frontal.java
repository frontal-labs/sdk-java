package dev.frontal.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.time.Duration;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

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
                        case AUDIT -> new AuditClient(apiClient);
                        case AUTH -> new AuthClient(apiClient);
                        case BILLING -> new BillingClient(apiClient);
                        case BLOB -> new BlobClient(apiClient);
                        case CONNECTORS -> new ConnectorsClient(apiClient);
                        case CONNECTION_TESTS -> new ConnectionTestsClient(apiClient);
                        case DATA -> new DataClient(apiClient);
                        case EVENTS -> new EventsClient(apiClient);
                        case GOVERNANCE -> new GovernanceClient(apiClient);
                        case INVOCATIONS -> new InvocationsClient(apiClient);
                        case LINEAGE -> new LineageClient(apiClient);
                        case OBSERVABILITY -> new ObservabilityClient(apiClient);
                        case ONTOLOGY -> new OntologyClient(apiClient);
                        case PIPELINES -> new PipelinesClient(apiClient);
                        case PROVIDERS -> new ProvidersClient(apiClient);
                        case REACT -> new ReactClient(apiClient);
                        case SCHEDULES -> new SchedulesClient(apiClient);
                        case WEBHOOKS -> new WebhooksClient(apiClient);
                        case WEBHOOK_ENDPOINTS -> new WebhookEndpointsClient(apiClient);
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
        ApiService requestedService = Objects.requireNonNull(service, "service");
        ServiceClient serviceClient = services.get(requestedService);
        if (serviceClient == null) {
            throw new IllegalArgumentException("Service is not available in this SDK: " + requestedService.value());
        }
        return serviceClient;
    }

    public AgentsClient agents() {
        return (AgentsClient) service(ApiService.AGENTS);
    }

    public AiClient ai() {
        return (AiClient) service(ApiService.AI);
    }

    public AuditClient audit() {
        return (AuditClient) service(ApiService.AUDIT);
    }

    public AuthClient auth() {
        return (AuthClient) service(ApiService.AUTH);
    }

    public BillingClient billing() {
        return (BillingClient) service(ApiService.BILLING);
    }

    public BlobClient blob() {
        return (BlobClient) service(ApiService.BLOB);
    }

    public ConnectorsClient connectors() {
        return (ConnectorsClient) service(ApiService.CONNECTORS);
    }

    public ConnectionTestsClient connectionTests() {
        return (ConnectionTestsClient) service(ApiService.CONNECTION_TESTS);
    }

    public DataClient data() {
        return (DataClient) service(ApiService.DATA);
    }

    public EventsClient events() {
        return (EventsClient) service(ApiService.EVENTS);
    }

    public GovernanceClient governance() {
        return (GovernanceClient) service(ApiService.GOVERNANCE);
    }

    public LineageClient lineage() {
        return (LineageClient) service(ApiService.LINEAGE);
    }

    public ObservabilityClient observability() {
        return (ObservabilityClient) service(ApiService.OBSERVABILITY);
    }

    public OntologyClient ontology() {
        return (OntologyClient) service(ApiService.ONTOLOGY);
    }

    public InvocationsClient invocations() {
        return (InvocationsClient) service(ApiService.INVOCATIONS);
    }

    public PipelinesClient pipelines() {
        return (PipelinesClient) service(ApiService.PIPELINES);
    }

    public ProvidersClient providers() {
        return (ProvidersClient) service(ApiService.PROVIDERS);
    }

    public ReactClient react() {
        return (ReactClient) service(ApiService.REACT);
    }

    public SchedulesClient schedules() {
        return (SchedulesClient) service(ApiService.SCHEDULES);
    }

    public WebhooksClient webhooks() {
        return (WebhooksClient) service(ApiService.WEBHOOKS);
    }

    public WebhookEndpointsClient webhookEndpoints() {
        return (WebhookEndpointsClient) service(ApiService.WEBHOOK_ENDPOINTS);
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
        private @Nullable ObjectMapper objectMapper;

        private Builder() {}

        public Builder apiKey(String apiKey) {
            config.apiKey(apiKey);
            return this;
        }

        public Builder apiBaseUrl(String baseUrl) {
            config.apiBaseUrl(baseUrl);
            return this;
        }

        public Builder apiBaseUrl(URI baseUrl) {
            config.apiBaseUrl(baseUrl);
            return this;
        }

        public Builder aiBaseUrl(String baseUrl) {
            config.aiBaseUrl(baseUrl);
            return this;
        }

        public Builder aiBaseUrl(URI baseUrl) {
            config.aiBaseUrl(baseUrl);
            return this;
        }

        public Builder environment(String environment) {
            config.environment(environment);
            return this;
        }

        public Builder debug(boolean debug) {
            config.debug(debug);
            return this;
        }

        public Builder requestTimeout(Duration timeout) {
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

        public Builder maxResponseBytes(long maxResponseBytes) {
            config.maxResponseBytes(maxResponseBytes);
            return this;
        }

        /** Sets the maximum raw error body retained for diagnostics. */
        public Builder maxErrorBodyBytes(int maxErrorBodyBytes) {
            config.maxErrorBodyBytes(maxErrorBodyBytes);
            return this;
        }

        public Builder userAgent(String userAgent) {
            config.userAgent(userAgent);
            return this;
        }

        public Builder headers(Map<String, String> headers) {
            config.headers(headers);
            return this;
        }

        public Builder header(String name, String value) {
            config.header(name, value);
            return this;
        }

        /** Supplies JSON settings; the SDK copies the mapper so later caller changes are isolated. */
        public Builder objectMapper(ObjectMapper objectMapper) {
            this.objectMapper =
                    Objects.requireNonNull(objectMapper, "objectMapper").copy();
            return this;
        }

        public Frontal build() {
            ClientConfig builtConfig = config.build();
            @Nullable ObjectMapper configuredMapper = objectMapper;
            return configuredMapper == null
                    ? new Frontal(builtConfig)
                    : new Frontal(new ApiClient(builtConfig, configuredMapper));
        }
    }
}
