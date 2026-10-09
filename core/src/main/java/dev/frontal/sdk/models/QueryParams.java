package dev.frontal.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Immutable typed query parameters. Add the same name more than once to send repeated values. */
public final class QueryParams {
    private static final QueryParams EMPTY = new QueryParams(Map.of());

    private final Map<String, List<String>> values;

    private QueryParams(Map<String, List<String>> values) {
        this.values = values;
    }

    /** Returns a reusable empty query parameter set. */
    public static QueryParams empty() {
        return EMPTY;
    }

    /** Creates a builder for query parameters. */
    public static Builder builder() {
        return new Builder();
    }

    /** Creates a single string query parameter. */
    public static QueryParams of(String name, String value) {
        return builder().add(name, value).build();
    }

    Map<String, List<String>> values() {
        return values;
    }

    /** Mutable builder used to create an immutable query parameter set. */
    public static final class Builder {
        private final Map<String, List<String>> values = new LinkedHashMap<>();

        /** Adds a string query value. */
        public Builder add(String name, String value) {
            requireName(name);
            values.computeIfAbsent(name, ignored -> new ArrayList<>()).add(Objects.requireNonNull(value, "value"));
            return this;
        }

        /** Adds a numeric query value. */
        public Builder add(String name, Number value) {
            return add(name, Objects.requireNonNull(value, "value").toString());
        }

        /** Adds a boolean query value. */
        public Builder add(String name, boolean value) {
            return add(name, Boolean.toString(value));
        }

        /** Adds repeated string values. */
        public Builder addAll(String name, Iterable<String> values) {
            Objects.requireNonNull(values, "values").forEach(value -> add(name, value));
            return this;
        }

        /** Builds immutable query parameters. */
        public QueryParams build() {
            if (values.isEmpty()) {
                return QueryParams.empty();
            }
            Map<String, List<String>> copy = new LinkedHashMap<>();
            values.forEach((name, items) -> copy.put(name, List.copyOf(items)));
            return new QueryParams(Collections.unmodifiableMap(copy));
        }

        private static void requireName(String name) {
            Objects.requireNonNull(name, "name");
            if (name.isBlank()) {
                throw new IllegalArgumentException("Query parameter names must not be blank");
            }
        }
    }
}
