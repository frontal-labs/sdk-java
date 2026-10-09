package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

/** Input accepted by synchronous and asynchronous invocation operations. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record FunctionInvocationInput(
        @JsonProperty("functionId") String functionId,
        @JsonProperty("version") @Nullable Integer version,
        @JsonProperty("input") @Nullable JsonNode input) {
    public FunctionInvocationInput {
        Objects.requireNonNull(functionId, "functionId");
        if (version != null && version <= 0) {
            throw new IllegalArgumentException("version must be positive");
        }
    }

    public FunctionInvocationInput(String functionId, JsonNode input) {
        this(functionId, null, input);
    }

    public FunctionInvocationInput(String functionId) {
        this(functionId, null, null);
    }
}
