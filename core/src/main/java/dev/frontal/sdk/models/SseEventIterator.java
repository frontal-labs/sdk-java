package dev.frontal.sdk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

/** Blocking iterator over the {@code data:} payloads in a server-sent event stream. */
public final class SseEventIterator implements Iterator<String>, AutoCloseable {
    private final ApiStream stream;
    private final BufferedReader reader;
    private @Nullable String next;
    private boolean ready;
    private boolean closed;

    public SseEventIterator(ApiStream stream) {
        this.stream = stream;
        this.reader = new BufferedReader(new InputStreamReader(stream.body(), StandardCharsets.UTF_8));
    }

    @Override
    public boolean hasNext() {
        if (ready) {
            return true;
        }
        if (closed) {
            return false;
        }
        StringBuilder data = new StringBuilder();
        try {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    close();
                    if (data.isEmpty()) {
                        return false;
                    }
                    next = data.toString();
                    ready = true;
                    return true;
                }
                if (line.isEmpty()) {
                    if (!data.isEmpty()) {
                        next = data.toString();
                        ready = true;
                        return true;
                    }
                    continue;
                }
                if (line.startsWith(":")) {
                    continue;
                }
                int colon = line.indexOf(':');
                String field = colon < 0 ? line : line.substring(0, colon);
                if (field.equals("data")) {
                    String value = colon < 0 ? "" : line.substring(colon + 1);
                    if (value.startsWith(" ")) {
                        value = value.substring(1);
                    }
                    if (!data.isEmpty()) {
                        data.append('\n');
                    }
                    data.append(value);
                }
            }
        } catch (IOException exception) {
            closeQuietly();
            throw new UncheckedIOException(exception);
        }
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String value = Objects.requireNonNull(next);
        next = null;
        ready = false;
        return value;
    }

    @Override
    public void close() throws IOException {
        if (!closed) {
            closed = true;
            stream.close();
        }
    }

    private void closeQuietly() {
        try {
            close();
        } catch (IOException ignored) {
            // Preserve the original stream read failure.
        }
    }
}
