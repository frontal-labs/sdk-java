package dev.frontal.sdk;

import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import org.jspecify.annotations.Nullable;

/** AI gateway operations, with a convenience method for a basic text prompt. */
public final class AiClient extends AiServiceClient {
    AiClient(ApiClient client) {
        super(client);
    }

    /** Sends a user prompt to a chat completion model. */
    public <T> @Nullable T generateText(String model, String prompt, Class<T> responseType)
            throws IOException, InterruptedException {
        ObjectNode body = client().objectMapper().createObjectNode();
        body.put("model", model);
        body.putArray("messages").addObject().put("role", "user").put("content", prompt);
        return chat().completions().create(body, responseType);
    }
}
