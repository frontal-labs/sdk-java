package dev.frontal.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/** Frontal AI gateway operations backed by the AI OpenAPI snapshot. */
public final class AiClient extends AiServiceClient {
    AiClient(ApiClient client) {
        super(client);
    }

    public <T> @Nullable T health(Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.GET_HEALTH, List.of(), QueryParams.empty(), null, responseType);
    }

    public <T> @Nullable T listModels(Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.GET_INTERNAL_MODELS, List.of(), QueryParams.empty(), null, responseType);
    }

    public <T> @Nullable T modelDefaults(Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.GET_INTERNAL_MODELS_DEFAULTS, List.of(), QueryParams.empty(), null, responseType);
    }

    public <T> @Nullable T chatCompletion(JsonNode input, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(Endpoints.Ai.POST_AI_CHAT_COMPLETIONS, List.of(), QueryParams.empty(), input, responseType);
    }

    public <T> @Nullable T generateText(String model, String prompt, Class<T> responseType)
            throws IOException, InterruptedException {
        ObjectNode body = client().objectMapper().createObjectNode();
        body.put("model", model);
        body.putArray("messages").addObject().put("role", "user").put("content", prompt);
        return chatCompletion(body, responseType);
    }

    public <T> @Nullable T embeddings(JsonNode input, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.POST_INTERNAL_EMBEDDINGS, List.of(), QueryParams.empty(), input, responseType);
    }

    public <T> @Nullable T predict(JsonNode input, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.POST_INTERNAL_PREDICTIONS, List.of(), QueryParams.empty(), input, responseType);
    }

    public <T> @Nullable T rerank(JsonNode input, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.POST_INTERNAL_RERANK, List.of(), QueryParams.empty(), input, responseType);
    }

    public <T> @Nullable T predictForm(Map<String, String> fields, Map<String, Path> files, Class<T> responseType)
            throws IOException, InterruptedException {
        return requestForm(
                Endpoints.Ai.POSTFORMDATA_INTERNAL_PREDICTIONS,
                List.of(),
                QueryParams.empty(),
                fields,
                files,
                responseType);
    }

    public byte[] predictRaw(byte[] input) throws IOException, InterruptedException {
        return requestRawBytes(Endpoints.Ai.POSTRAW_INTERNAL_PREDICTIONS, List.of(), QueryParams.empty(), input);
    }
}
