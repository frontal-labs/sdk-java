package dev.frontal.examples.agentapproval;

import com.fasterxml.jackson.databind.JsonNode;
import dev.frontal.sdk.Endpoints;
import dev.frontal.sdk.Frontal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/** Lists pending workflow approvals and submits only an operator-confirmed approval. */
public final class Main {
  private static final System.Logger LOGGER = System.getLogger(Main.class.getName());

  private Main() {}

  public static void main(String[] args) {
    try {
      run();
    } catch (InterruptedException exception) {
      Thread.currentThread().interrupt();
      LOGGER.log(System.Logger.Level.WARNING, "Approval operation interrupted", exception);
      System.exit(130);
    } catch (IOException | IllegalStateException exception) {
      LOGGER.log(System.Logger.Level.ERROR, "Approval operation failed", exception);
      System.exit(1);
    }
  }

  private static void run() throws IOException, InterruptedException {
    Frontal client = Frontal.fromEnvironment();
    JsonNode approvals =
        client.workflows().request(Endpoints.Workflows.GET_WORKFLOWS_APPROVALS, JsonNode.class);
    System.out.println(
        client
            .apiClient()
            .objectMapper()
            .writerWithDefaultPrettyPrinter()
            .writeValueAsString(approvals));

    try (BufferedReader input =
        new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
      System.out.print("Approval ID to approve (Enter to exit): ");
      String approvalId = input.readLine();
      if (approvalId == null || approvalId.isBlank()) {
        return;
      }

      System.out.print("Type 'approve " + approvalId + "' to confirm: ");
      String confirmation = input.readLine();
      if (!("approve " + approvalId).equals(confirmation)) {
        System.out.println("Approval cancelled.");
        return;
      }

      JsonNode result =
          client
              .workflows()
              .request(
                  Endpoints.Workflows.POST_WORKFLOWS_APPROVALS_PARAM_APPROVE,
                  List.of(approvalId),
                  Map.of(),
                  null,
                  JsonNode.class);
      LOGGER.log(System.Logger.Level.INFO, "Workflow approval submitted");
      System.out.println(
          client
              .apiClient()
              .objectMapper()
              .writerWithDefaultPrettyPrinter()
              .writeValueAsString(result));
    }
  }
}
