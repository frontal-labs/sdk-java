package dev.frontal.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

/** Operations for invoking and tracking function executions. */
public final class FunctionsExecutionsClient extends ServiceClient {
    FunctionsExecutionsClient(ApiClient client) {
        super(ApiService.FUNCTIONS, client);
    }

    /** Invokes a function and waits for its result. */
    public FunctionInvocationResult invoke(FunctionInvocationInput input) throws IOException, InterruptedException {
        return required(request(
                FunctionsEndpoints.INVOKE,
                List.of(),
                QueryParams.empty(),
                body(input),
                FunctionInvocationResult.class));
    }

    /** Starts an asynchronous invocation and returns its execution ID. */
    public FunctionAsyncInvocation invokeAsync(FunctionInvocationInput input) throws IOException, InterruptedException {
        return required(request(
                FunctionsEndpoints.INVOKE_ASYNC,
                List.of(),
                QueryParams.empty(),
                body(input),
                FunctionAsyncInvocation.class));
    }

    /** Retrieves an execution's current status. */
    public FunctionExecution getExecution(String executionId) throws IOException, InterruptedException {
        return required(request(
                FunctionsEndpoints.GET_EXECUTION,
                List.of(Objects.requireNonNull(executionId, "executionId")),
                FunctionExecution.class));
    }

    /** Retrieves an execution result. */
    public FunctionInvocationResult getResult(String executionId) throws IOException, InterruptedException {
        return required(request(
                FunctionsEndpoints.GET_RESULT,
                List.of(Objects.requireNonNull(executionId, "executionId")),
                FunctionInvocationResult.class));
    }

    /** Lists executions and supports {@code cursor}, {@code limit}, {@code functionId}, and {@code status}. */
    public FunctionExecutionListResponse listExecutions(QueryParams query) throws IOException, InterruptedException {
        return required(request(
                FunctionsEndpoints.LIST_EXECUTIONS,
                List.of(),
                Objects.requireNonNull(query, "query"),
                null,
                FunctionExecutionListResponse.class));
    }

    /** Lists the first page of executions. */
    public FunctionExecutionListResponse listExecutions() throws IOException, InterruptedException {
        return listExecutions(QueryParams.empty());
    }

    /** Cancels an execution. */
    public void cancelExecution(String executionId) throws IOException, InterruptedException {
        execute(
                FunctionsEndpoints.CANCEL_EXECUTION,
                List.of(Objects.requireNonNull(executionId, "executionId")),
                QueryParams.empty(),
                client().objectMapper().createObjectNode());
    }

    private JsonNode body(Object value) {
        return client().objectMapper().valueToTree(Objects.requireNonNull(value, "input"));
    }

    private static <T> T required(@Nullable T value) {
        return Objects.requireNonNull(value, "Functions API returned an empty response body");
    }
}
