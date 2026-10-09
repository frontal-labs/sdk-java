package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.jspecify.annotations.Nullable;

/** Permission declarations attached to a function definition. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public record FunctionPermission(
        @JsonProperty("ontology") @Nullable List<String> ontology,
        @JsonProperty("actions") @Nullable List<String> actions) {}
