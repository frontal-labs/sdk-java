package dev.frontal.sdk;

/** Service domains exposed by the Frontal API. */
public enum ApiService {
    AGENTS("agents"),
    AI("ai"),
    AUDIT("audit"),
    AUTH("auth"),
    BILLING("billing"),
    BLOB("blob"),
    CONNECTORS("connectors"),
    DATA("data"),
    GOVERNANCE("governance"),
    LINEAGE("lineage"),
    OBSERVABILITY("observability"),
    ONTOLOGY("ontology"),
    PIPELINES("pipelines"),
    REACT("react"),
    SANDBOX("sandbox"),
    SCHEDULES("schedules"),
    WEBHOOKS("webhooks"),
    WORKFLOWS("workflows"),
    ACTION_RUNS("action-runs"),
    CONNECTION_TESTS("connection-tests"),
    EVENTS("events"),
    INTEGRATIONS("integrations"),
    INVOCATIONS("invocations"),
    PROVIDERS("providers"),
    WEBHOOK_ENDPOINTS("webhook-endpoints");

    private final String value;

    ApiService(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
