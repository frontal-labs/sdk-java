package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

/** Create or update payload for a function. JSON schemas remain caller-defined JSON values. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record FunctionDefinition(
        @JsonProperty("name") String name,
        @JsonProperty("description") @Nullable String description,
        @JsonProperty("runtime") FunctionRuntime runtime,
        @JsonProperty("entrypoint") String entrypoint,
        @JsonProperty("source") @Nullable String source,
        @JsonProperty("inputSchema") @Nullable JsonNode inputSchema,
        @JsonProperty("outputSchema") @Nullable JsonNode outputSchema,
        @JsonProperty("dependencies") @Nullable List<String> dependencies,
        @JsonProperty("envVars") @Nullable Map<String, String> envVars,
        @JsonProperty("secrets") @Nullable List<String> secrets,
        @JsonProperty("memory") @Nullable Integer memory,
        @JsonProperty("timeout") @Nullable Integer timeout,
        @JsonProperty("permissions") @Nullable FunctionPermission permissions) {

    public FunctionDefinition {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(runtime, "runtime");
        Objects.requireNonNull(entrypoint, "entrypoint");
        if (name.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }
        if (memory != null && memory <= 0) {
            throw new IllegalArgumentException("memory must be positive");
        }
        if (timeout != null && timeout <= 0) {
            throw new IllegalArgumentException("timeout must be positive");
        }
        if (dependencies != null) {
            dependencies = List.copyOf(dependencies);
        }
        if (envVars != null) {
            envVars = Map.copyOf(envVars);
        }
        if (secrets != null) {
            secrets = List.copyOf(secrets);
        }
    }

    /** Starts a builder with the required function name. */
    public static Builder builder(String name) {
        return new Builder(name);
    }

    /** Builder for a function definition with the required fields called out explicitly. */
    public static final class Builder {
        private final String name;
        private @Nullable String description;
        private @Nullable FunctionRuntime runtime;
        private @Nullable String entrypoint;
        private @Nullable String source;
        private @Nullable JsonNode inputSchema;
        private @Nullable JsonNode outputSchema;
        private @Nullable List<String> dependencies;
        private @Nullable Map<String, String> envVars;
        private @Nullable List<String> secrets;
        private @Nullable Integer memory;
        private @Nullable Integer timeout;
        private @Nullable FunctionPermission permissions;

        private Builder(String name) {
            this.name = Objects.requireNonNull(name, "name");
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder runtime(FunctionRuntime runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder entrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }

        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public Builder inputSchema(JsonNode inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }

        public Builder outputSchema(JsonNode outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }

        public Builder dependencies(List<String> dependencies) {
            this.dependencies = dependencies;
            return this;
        }

        public Builder envVars(Map<String, String> envVars) {
            this.envVars = envVars;
            return this;
        }

        public Builder secrets(List<String> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder memory(int memory) {
            this.memory = memory;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder permissions(FunctionPermission permissions) {
            this.permissions = permissions;
            return this;
        }

        public FunctionDefinition build() {
            return new FunctionDefinition(
                    name,
                    description,
                    Objects.requireNonNull(runtime, "runtime"),
                    Objects.requireNonNull(entrypoint, "entrypoint"),
                    source,
                    inputSchema,
                    outputSchema,
                    dependencies,
                    envVars,
                    secrets,
                    memory,
                    timeout,
                    permissions);
        }
    }
}
