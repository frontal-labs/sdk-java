package dev.frontal.sdk;

/** Contract route groups used to identify endpoint ownership. */
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
    CONNECTION_TESTS("connection-tests"),
    EVENTS("events"),
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
