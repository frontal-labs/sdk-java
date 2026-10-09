package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Identifier returned when an asynchronous function invocation is started. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record FunctionAsyncInvocation(
        @JsonProperty("executionId") String executionId) {}
