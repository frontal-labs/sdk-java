package dev.frontal.sdk;

/** Routes for the Functions API, which is not present in the checked-in OpenAPI snapshots. */
final class FunctionsEndpoints {
    static final Endpoint CREATE = endpoint(HttpMethod.POST, "/functions");
    static final Endpoint LIST = endpoint(HttpMethod.GET, "/functions");
    static final Endpoint GET = endpoint(HttpMethod.GET, "/functions/{param}");
    static final Endpoint UPDATE = endpoint(HttpMethod.PATCH, "/functions/{param}");
    static final Endpoint DELETE = endpoint(HttpMethod.DELETE, "/functions/{param}");
    static final Endpoint LIST_VERSIONS = endpoint(HttpMethod.GET, "/functions/{param}/versions");
    static final Endpoint GET_VERSION = endpoint(HttpMethod.GET, "/functions/{param}/versions/{param}");
    static final Endpoint PUBLISH_VERSION = endpoint(HttpMethod.POST, "/functions/{param}/versions/{param}/publish");
    static final Endpoint DEPLOY_VERSION = endpoint(HttpMethod.POST, "/functions/{param}/versions/{param}/deploy");
    static final Endpoint DEPLOYMENT_STATUS =
            endpoint(HttpMethod.GET, "/functions/{param}/versions/{param}/deployment/status");
    static final Endpoint INVOKE = endpoint(HttpMethod.POST, "/functions/invoke");
    static final Endpoint INVOKE_ASYNC = endpoint(HttpMethod.POST, "/functions/invoke-async");
    static final Endpoint GET_EXECUTION = endpoint(HttpMethod.GET, "/functions/executions/{param}");
    static final Endpoint GET_RESULT = endpoint(HttpMethod.GET, "/functions/executions/{param}/result");
    static final Endpoint LIST_EXECUTIONS = endpoint(HttpMethod.GET, "/functions/executions");
    static final Endpoint CANCEL_EXECUTION = endpoint(HttpMethod.POST, "/functions/executions/{param}/cancel");

    private FunctionsEndpoints() {}

    private static Endpoint endpoint(HttpMethod method, String path) {
        return new Endpoint(ApiService.FUNCTIONS, method, path);
    }
}
