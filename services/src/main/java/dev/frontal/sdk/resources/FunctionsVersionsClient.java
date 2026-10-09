package dev.frontal.sdk;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

/** Operations for function versions. */
public final class FunctionsVersionsClient extends ServiceClient {
    FunctionsVersionsClient(ApiClient client) {
        super(ApiService.FUNCTIONS, client);
    }

    /** Lists versions for a function, optionally using {@code cursor} and {@code limit}. */
    public FunctionVersionListResponse list(String functionId, QueryParams query)
            throws IOException, InterruptedException {
        return required(request(
                FunctionsEndpoints.LIST_VERSIONS,
                List.of(Objects.requireNonNull(functionId, "functionId")),
                Objects.requireNonNull(query, "query"),
                null,
                FunctionVersionListResponse.class));
    }

    /** Lists the first page of versions for a function. */
    public FunctionVersionListResponse list(String functionId) throws IOException, InterruptedException {
        return list(functionId, QueryParams.empty());
    }

    /** Retrieves a specific function version. */
    public FunctionVersion get(String functionId, int version) throws IOException, InterruptedException {
        return required(request(
                FunctionsEndpoints.GET_VERSION,
                List.of(Objects.requireNonNull(functionId, "functionId"), Integer.toString(version)),
                FunctionVersion.class));
    }

    /** Publishes a specific function version. */
    public FunctionVersion publish(String functionId, int version) throws IOException, InterruptedException {
        return required(request(
                FunctionsEndpoints.PUBLISH_VERSION,
                List.of(Objects.requireNonNull(functionId, "functionId"), Integer.toString(version)),
                QueryParams.empty(),
                client().objectMapper().createObjectNode(),
                FunctionVersion.class));
    }

    private static <T> T required(@Nullable T value) {
        return Objects.requireNonNull(value, "Functions API returned an empty response body");
    }
}
