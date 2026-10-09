package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.Nullable;

/** A function returned by the Functions API. Timestamps are ISO-8601 strings. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public record FunctionResource(
        @JsonProperty("id") String id,
        @JsonProperty("name") String name,
        @JsonProperty("description") @Nullable String description,
        @JsonProperty("runtime") FunctionRuntime runtime,
        @JsonProperty("entrypoint") String entrypoint,
        @JsonProperty("status") FunctionStatus status,
        @JsonProperty("version") int version,
        @JsonProperty("latestVersion") @Nullable Integer latestVersion,
        @JsonProperty("memory") @Nullable Integer memory,
        @JsonProperty("timeout") @Nullable Integer timeout,
        @JsonProperty("permissions") @Nullable FunctionPermission permissions,
        @JsonProperty("createdAt") String createdAt,
        @JsonProperty("updatedAt") String updatedAt) {}
