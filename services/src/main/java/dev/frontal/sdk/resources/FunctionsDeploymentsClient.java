package dev.frontal.sdk;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/** Operations for deploying function versions. */
public final class FunctionsDeploymentsClient extends ServiceClient {
    FunctionsDeploymentsClient(ApiClient client) {
        super(ApiService.FUNCTIONS, client);
    }

    /** Deploys a function version. */
    public void deploy(String functionId, int version) throws IOException, InterruptedException {
        execute(
                FunctionsEndpoints.DEPLOY_VERSION,
                List.of(Objects.requireNonNull(functionId, "functionId"), Integer.toString(version)),
                QueryParams.empty(),
                client().objectMapper().createObjectNode());
    }

    /** Reads deployment status and any server-provided details. */
    public FunctionDeploymentStatus status(String functionId, int version) throws IOException, InterruptedException {
        return Objects.requireNonNull(
                request(
                        FunctionsEndpoints.DEPLOYMENT_STATUS,
                        List.of(Objects.requireNonNull(functionId, "functionId"), Integer.toString(version)),
                        FunctionDeploymentStatus.class),
                "Functions API returned an empty response body");
    }
}
