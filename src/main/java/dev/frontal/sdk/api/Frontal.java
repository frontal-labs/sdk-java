package dev.frontal.sdk;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

/** Root Frontal client with a domain-scoped accessor for every API service. */
public final class Frontal {
  private final ApiClient apiClient;
  private final Map<ApiService, ServiceClient> services;

  public Frontal(String apiKey) {
    this(new ClientConfig(apiKey));
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
      services.put(service, new ServiceClient(service, apiClient));
    }
  }

  public static Frontal fromEnvironment() {
    return new Frontal(ClientConfig.fromEnvironment());
  }

  public ApiClient apiClient() {
    return apiClient;
  }

  public ServiceClient service(ApiService service) {
    return services.get(Objects.requireNonNull(service, "service"));
  }

  public ServiceClient agents() { return service(ApiService.AGENTS); }
  public ServiceClient ai() { return service(ApiService.AI); }
  public ServiceClient audit() { return service(ApiService.AUDIT); }
  public ServiceClient auth() { return service(ApiService.AUTH); }
  public ServiceClient billing() { return service(ApiService.BILLING); }
  public ServiceClient blob() { return service(ApiService.BLOB); }
  public ServiceClient connectors() { return service(ApiService.CONNECTORS); }
  public ServiceClient data() { return service(ApiService.DATA); }
  public ServiceClient governance() { return service(ApiService.GOVERNANCE); }
  public ServiceClient lineage() { return service(ApiService.LINEAGE); }
  public ServiceClient observability() { return service(ApiService.OBSERVABILITY); }
  public ServiceClient ontology() { return service(ApiService.ONTOLOGY); }
  public ServiceClient pipelines() { return service(ApiService.PIPELINES); }
  public ServiceClient react() { return service(ApiService.REACT); }
  public ServiceClient sandbox() { return service(ApiService.SANDBOX); }
  public ServiceClient schedules() { return service(ApiService.SCHEDULES); }
  public ServiceClient webhooks() { return service(ApiService.WEBHOOKS); }
  public ServiceClient workflows() { return service(ApiService.WORKFLOWS); }
}
