package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

/** First page of versions returned for a function. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record FunctionVersionListResponse(
        @JsonProperty("versions") List<FunctionVersion> versions,
        @JsonProperty("pagination") FunctionPagination pagination) {
    public FunctionVersionListResponse {
        versions = List.copyOf(Objects.requireNonNull(versions, "versions"));
        Objects.requireNonNull(pagination, "pagination");
    }
}
