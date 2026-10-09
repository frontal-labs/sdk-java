package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import org.jspecify.annotations.Nullable;

/** Current status and output of a function execution. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public record FunctionExecution(
        @JsonProperty("id") String id,
        @JsonProperty("functionId") String functionId,
        @JsonProperty("version") int version,
        @JsonProperty("status") FunctionStatus status,
        @JsonProperty("input") @Nullable JsonNode input,
        @JsonProperty("output") @Nullable JsonNode output,
        @JsonProperty("error") @Nullable String error,
        @JsonProperty("startedAt") @Nullable String startedAt,
        @JsonProperty("completedAt") @Nullable String completedAt,
        @JsonProperty("durationMs") @Nullable Long durationMs) {}
