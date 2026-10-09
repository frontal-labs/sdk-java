package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

/** First page of functions returned by the Functions API. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record FunctionListResponse(
        @JsonProperty("functions") List<FunctionResource> functions,
        @JsonProperty("pagination") FunctionPagination pagination) {
    public FunctionListResponse {
        functions = List.copyOf(Objects.requireNonNull(functions, "functions"));
        Objects.requireNonNull(pagination, "pagination");
    }
}
