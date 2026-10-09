package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import org.jspecify.annotations.Nullable;

/** Result of a function invocation. The result retains arbitrary caller-defined JSON. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public record FunctionInvocationResult(
        @JsonProperty("executionId") String executionId,
        @JsonProperty("result") @Nullable JsonNode result,
        @JsonProperty("error") @Nullable String error,
        @JsonProperty("status") @Nullable FunctionStatus status) {}
