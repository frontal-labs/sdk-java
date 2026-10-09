# Functions API

The Java Functions client follows the operation and payload shapes in the [TypeScript Functions package](https://github.com/frontal-labs/sdk-typescript/blob/master/packages/functions/src/namespace.ts). These routes are not present in the checked-in OpenAPI snapshots or `contracts/sdk-endpoints.json` yet, so Functions uses the shared Java transport with a local route catalog.

## Client and configuration

Use `Frontal.functions()` to access this API. It shares the configured bearer API key, API base URL, timeout, retry behavior, environment header, and Jackson mapper with the rest of the SDK.

```java
try (Frontal frontal = Frontal.builder()
        .apiKey(System.getenv("FRONTAL_API_KEY"))
        .apiBaseUrl("https://api.frontal.dev/v1")
        .requestTimeout(Duration.ofSeconds(30))
        .maxRetries(3)
        .build()) {
    FunctionDefinition definition = FunctionDefinition.builder("hello")
            .runtime(FunctionRuntime.NODEJS22)
            .entrypoint("index.handler")
            .build();
    FunctionResource function = frontal.functions().create(definition);
    FunctionInvocationResult result = frontal.functions()
            .executions()
            .invoke(new FunctionInvocationInput(function.id()));
}
```

The default API URL is `https://api.frontal.dev/v1`, request timeout is 30 seconds, and Functions GET requests retry up to three times by default, matching the TypeScript package. Setting `maxRetries` on the builder explicitly overrides the retry count for Functions and other services. Other Java services retain the shared default of two retries.

## Operations

| Java call | HTTP operation |
| --- | --- |
| `functions.create(definition)` | `POST /functions` |
| `functions.list(query)` | `GET /functions?cursor=&limit=` |
| `functions.get(functionId)` | `GET /functions/{functionId}` |
| `functions.update(functionId, definition)` | `PATCH /functions/{functionId}` |
| `functions.delete(functionId)` | `DELETE /functions/{functionId}` |
| `functions.versions().list(functionId, query)` | `GET /functions/{functionId}/versions?cursor=&limit=` |
| `functions.versions().get(functionId, version)` | `GET /functions/{functionId}/versions/{version}` |
| `functions.versions().publish(functionId, version)` | `POST /functions/{functionId}/versions/{version}/publish` |
| `functions.deployments().deploy(functionId, version)` | `POST /functions/{functionId}/versions/{version}/deploy` |
| `functions.deployments().status(functionId, version)` | `GET /functions/{functionId}/versions/{version}/deployment/status` |
| `functions.executions().invoke(input)` | `POST /functions/invoke` |
| `functions.executions().invokeAsync(input)` | `POST /functions/invoke-async` |
| `functions.executions().getExecution(executionId)` | `GET /functions/executions/{executionId}` |
| `functions.executions().getResult(executionId)` | `GET /functions/executions/{executionId}/result` |
| `functions.executions().listExecutions(query)` | `GET /functions/executions?cursor=&limit=&functionId=&status=` |
| `functions.executions().cancelExecution(executionId)` | `POST /functions/executions/{executionId}/cancel` |

List query values are provided with `QueryParams.builder()`. IDs are encoded as individual URL path segments. Service calls are synchronous and report transport/API failures through the SDK's `IOException` hierarchy.

## Models and JSON values

`FunctionDefinition` requires `name`, `runtime`, and `entrypoint`. Its builder accepts optional `description`, `source`, `inputSchema`, `outputSchema`, `dependencies`, `envVars`, `secrets`, `memory` (MB), `timeout` (seconds), and `permissions` (`ontology` and `actions` string lists). Runtime values are `NODEJS20`, `NODEJS22`, and `PYTHON311`; their JSON forms are `nodejs20`, `nodejs22`, and `python311`.

Schemas and invocation inputs/results use Jackson `JsonNode`, so nested object keys and arbitrary JSON values remain under caller control. Resource statuses use `FunctionStatus` (`DRAFT`, `ACTIVE`, `DEPRECATED`, `FAILED`) with the corresponding lowercase wire values. List models expose their `functions`, `versions`, or `executions` collection and `FunctionPagination` metadata.

## Runnable example

See [`FunctionsQuickstartTest`](../../examples/src/test/java/dev/frontal/examples/FunctionsQuickstartTest.java) for an executable example that constructs a configured client, defines a function, and invokes it against MockWebServer.