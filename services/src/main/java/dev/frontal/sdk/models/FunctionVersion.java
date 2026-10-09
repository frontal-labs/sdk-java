package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.Nullable;

/** Immutable source version of a function. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public record FunctionVersion(
        @JsonProperty("version") int version,
        @JsonProperty("source") String source,
        @JsonProperty("createdAt") String createdAt,
        @JsonProperty("publishedBy") @Nullable String publishedBy) {}
