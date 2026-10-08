package dev.frontal.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.time.Duration;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ApiClientTest {
  private HttpServer server;
  private Frontal client;

  @BeforeEach
  void startServer() throws IOException {
    server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    server.createContext("/v1/agents/item-1", exchange -> {
      assertEquals("Bearer test-key", exchange.getRequestHeaders().getFirst("Authorization"));
      assertEquals("GET", exchange.getRequestMethod());
      byte[] body = "{\"id\":\"item-1\",\"name\":\"agent\"}".getBytes();
      exchange.getResponseHeaders().add("Content-Type", "application/json");
      exchange.sendResponseHeaders(200, body.length);
      exchange.getResponseBody().write(body);
      exchange.close();
    });
    server.start();
    URI base = URI.create("http://127.0.0.1:" + server.getAddress().getPort() + "/v1");
    ClientConfig config = new ClientConfig("test-key", base, Duration.ofSeconds(2), 0, 4096, Map.of());
    client = new Frontal(new ApiClient(config, HttpClient.newHttpClient(), new com.fasterxml.jackson.databind.ObjectMapper()));
  }

  @AfterEach
  void stopServer() {
    if (server != null) {
      server.stop(0);
    }
  }

  @Test
  void sendsAuthenticatedRequestAndDecodesTypedResponse() throws Exception {
    Agent response = client.agents().request(
        Endpoints.Agents.GET_AGENTS_PARAM, java.util.List.of("item-1"), Map.of(), null, Agent.class);
    assertEquals("item-1", response.id());
    assertEquals("agent", response.name());
  }

  @Test
  void rejectsEndpointFromAnotherService() {
    assertThrows(IllegalArgumentException.class, () -> client.agents().request(
        Endpoints.Workflows.GET_WORKFLOWS, java.util.List.of(), Map.of(), null, Agent.class));
  }

  record Agent(String id, String name) {}
}
