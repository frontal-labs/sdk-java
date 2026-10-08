package dev.frontal.sdk;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Builds request URIs and encodes path and query values as UTF-8. */
public final class RequestUriBuilder {
    private RequestUriBuilder() {}

    public static URI build(URI baseUrl, Endpoint endpoint, List<String> pathParameters, Map<String, ?> query) {
        Objects.requireNonNull(baseUrl, "baseUrl");
        Objects.requireNonNull(endpoint, "endpoint");
        List<String> parameters = pathParameters == null ? List.of() : pathParameters;
        if (parameters.size() != endpoint.pathParameterCount()) {
            throw new IllegalArgumentException(
                    "Expected " + endpoint.pathParameterCount() + " path parameters, got " + parameters.size());
        }

        String path = endpoint.path();
        for (String parameter : parameters) {
            if (parameter == null) {
                throw new IllegalArgumentException("Path parameters must not be null");
            }
            path = path.replaceFirst(
                    "\\{param\\}", java.util.regex.Matcher.quoteReplacement(encodePathSegment(parameter)));
        }

        int queryOffset = path.indexOf('?');
        String endpointQuery = queryOffset < 0 ? "" : path.substring(queryOffset + 1);
        String endpointPath = queryOffset < 0 ? path : path.substring(0, queryOffset);
        StringBuilder uri = new StringBuilder(trimTrailingSlash(baseUrl.toString())).append(endpointPath);
        String queryString = encodeQuery(query);
        if (!endpointQuery.isEmpty() || !queryString.isEmpty()) {
            uri.append('?');
            if (!endpointQuery.isEmpty()) {
                uri.append(endpointQuery);
            }
            if (!queryString.isEmpty()) {
                if (!endpointQuery.isEmpty()) {
                    uri.append('&');
                }
                uri.append(queryString);
            }
        }
        return URI.create(uri.toString());
    }

    /** Encodes a single path segment so slashes and reserved characters stay within that segment. */
    public static String encodePathSegment(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8)
                .replace("+", "%20")
                .replace("%7E", "~");
    }

    private static String encodeQuery(Map<String, ?> query) {
        if (query == null || query.isEmpty()) {
            return "";
        }
        List<String> pairs = new ArrayList<>();
        query.forEach((name, value) -> {
            if (name == null || value == null) {
                return;
            }
            String wireName = toSnakeCase(name);
            if (value instanceof Iterable<?> values) {
                values.forEach(item -> addPair(pairs, wireName, item));
            } else if (value.getClass().isArray()) {
                int length = java.lang.reflect.Array.getLength(value);
                for (int index = 0; index < length; index++) {
                    addPair(pairs, wireName, java.lang.reflect.Array.get(value, index));
                }
            } else {
                addPair(pairs, wireName, value);
            }
        });
        return String.join("&", pairs);
    }

    private static void addPair(List<String> pairs, String name, Object value) {
        if (value != null) {
            pairs.add(encodeQueryComponent(name) + "=" + encodeQueryComponent(value.toString()));
        }
    }

    private static String encodeQueryComponent(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8).replace("+", "%20");
    }

    private static String toSnakeCase(String value) {
        return value.replaceAll("([a-z0-9])([A-Z])", "$1_$2").toLowerCase(java.util.Locale.ROOT);
    }

    private static String trimTrailingSlash(String value) {
        int end = value.length();
        while (end > 0 && value.charAt(end - 1) == '/') {
            end--;
        }
        return value.substring(0, end);
    }
}
