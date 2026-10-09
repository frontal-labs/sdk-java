package dev.frontal.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.JsonNode;
import dev.frontal.sdk.Frontal;
import java.time.Duration;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Test;

class QuickstartTest {
    @Test
    void consumerCanMakeAFirstCallWithoutAFrontalBackend() throws Exception {
        try (MockWebServer mock = new MockWebServer()) {
            mock.start();
            mock.enqueue(new MockResponse().setBody("{\"id\":\"agt_123\",\"name\":\"triage\"}"));
            try (Frontal frontal = Frontal.builder()
                    .apiKey("frt_test_key")
                    .apiBaseUrl(mock.url("/v1").toString())
                    .requestTimeout(Duration.ofSeconds(2))
                    .build()) {
                JsonNode agent = frontal.agents().get("agt_123", JsonNode.class);
                assertEquals("triage", agent.path("name").asText());
            }
        }
    }
}
