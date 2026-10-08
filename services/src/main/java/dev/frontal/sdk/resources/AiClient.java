package dev.frontal.sdk;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/** Frontal AI gateway operations backed by the AI OpenAPI snapshot. */
public final class AiClient extends ServiceClient {
    AiClient(ApiClient client) {
        super(ApiService.AI, client);
    }

    public <T> @Nullable T health(Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.GET_HEALTH, List.of(), Map.of(), null, responseType);
    }

    public <T> @Nullable T listModels(Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.GET_INTERNAL_MODELS, List.of(), Map.of(), null, responseType);
    }

    public <T> @Nullable T modelDefaults(Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.GET_INTERNAL_MODELS_DEFAULTS, List.of(), Map.of(), null, responseType);
    }

    public <T> @Nullable T chatCompletion(Object input, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(Endpoints.Ai.POST_AI_CHAT_COMPLETIONS, List.of(), Map.of(), input, responseType);
    }

    public <T> @Nullable T generateText(String model, String prompt, Class<T> responseType)
            throws IOException, InterruptedException {
        Map<String, Object> message = Map.of("role", "user", "content", prompt);
        Map<String, Object> body = Map.of("model", model, "messages", List.of(message));
        return chatCompletion(body, responseType);
    }

    public <T> @Nullable T embeddings(Object input, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.POST_INTERNAL_EMBEDDINGS, List.of(), Map.of(), input, responseType);
    }

    public <T> @Nullable T predict(Object input, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.POST_INTERNAL_PREDICTIONS, List.of(), Map.of(), input, responseType);
    }

    public <T> @Nullable T rerank(Object input, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Ai.POST_INTERNAL_RERANK, List.of(), Map.of(), input, responseType);
    }

    public <T> @Nullable T predictForm(Map<String, String> fields, Map<String, Path> files, Class<T> responseType)
            throws IOException, InterruptedException {
        return requestForm(
                Endpoints.Ai.POSTFORMDATA_INTERNAL_PREDICTIONS, List.of(), Map.of(), fields, files, responseType);
    }

    public byte[] predictRaw(byte[] input) throws IOException, InterruptedException {
        return requestBytes(Endpoints.Ai.POSTRAW_INTERNAL_PREDICTIONS, List.of(), Map.of(), input);
    }
}
