package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

/** First page of executions returned by the Functions API. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record FunctionExecutionListResponse(
        @JsonProperty("executions") List<FunctionExecution> executions,
        @JsonProperty("pagination") FunctionPagination pagination) {
    public FunctionExecutionListResponse {
        executions = List.copyOf(Objects.requireNonNull(executions, "executions"));
        Objects.requireNonNull(pagination, "pagination");
    }
}
