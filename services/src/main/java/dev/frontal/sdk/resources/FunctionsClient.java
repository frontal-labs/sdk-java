package dev.frontal.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

/** Client for creating and managing user-defined Functions. */
public final class FunctionsClient extends ServiceClient {
    FunctionsClient(ApiClient client) {
        super(ApiService.FUNCTIONS, client);
    }

    /** Creates a function and its initial version. */
    public FunctionResource create(FunctionDefinition definition) throws IOException, InterruptedException {
        JsonNode body = client().objectMapper().valueToTree(Objects.requireNonNull(definition, "definition"));
        return required(
                request(FunctionsEndpoints.CREATE, List.of(), QueryParams.empty(), body, FunctionResource.class));
    }

    /** Lists functions, optionally using {@code cursor} and {@code limit}. */
    public FunctionListResponse list(QueryParams query) throws IOException, InterruptedException {
        return required(request(
                FunctionsEndpoints.LIST,
                List.of(),
                Objects.requireNonNull(query, "query"),
                null,
                FunctionListResponse.class));
    }

    /** Lists the first page of functions. */
    public FunctionListResponse list() throws IOException, InterruptedException {
        return list(QueryParams.empty());
    }

    /** Retrieves a function by ID. */
    public FunctionResource get(String functionId) throws IOException, InterruptedException {
        return required(request(
                FunctionsEndpoints.GET,
                List.of(Objects.requireNonNull(functionId, "functionId")),
                FunctionResource.class));
    }

    /** Updates a function, creating a new version. */
    public FunctionResource update(String functionId, FunctionDefinition definition)
            throws IOException, InterruptedException {
        JsonNode body = client().objectMapper().valueToTree(Objects.requireNonNull(definition, "definition"));
        return required(request(
                FunctionsEndpoints.UPDATE,
                List.of(Objects.requireNonNull(functionId, "functionId")),
                QueryParams.empty(),
                body,
                FunctionResource.class));
    }

    /** Deletes a function. */
    public void delete(String functionId) throws IOException, InterruptedException {
        execute(
                FunctionsEndpoints.DELETE,
                List.of(Objects.requireNonNull(functionId, "functionId")),
                QueryParams.empty(),
                null);
    }

    /** Returns the function-version operations. */
    public FunctionsVersionsClient versions() {
        return new FunctionsVersionsClient(client());
    }

    /** Returns the deployment operations. */
    public FunctionsDeploymentsClient deployments() {
        return new FunctionsDeploymentsClient(client());
    }

    /** Returns function-execution operations. */
    public FunctionsExecutionsClient executions() {
        return new FunctionsExecutionsClient(client());
    }

    private static <T> T required(@Nullable T value) {
        return Objects.requireNonNull(value, "Functions API returned an empty response body");
    }
}
