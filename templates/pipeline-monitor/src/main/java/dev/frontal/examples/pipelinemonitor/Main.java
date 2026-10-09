package dev.frontal.examples.pipelinemonitor;

import dev.frontal.sdk.Endpoints;
import dev.frontal.sdk.Frontal;
import dev.frontal.sdk.FrontalException;
import dev.frontal.sdk.RateLimitException;
import dev.frontal.sdk.SseEventIterator;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.time.Duration;
import java.util.List;

/** Prints events from a Frontal pipeline run stream until the server closes it. */
public final class Main {
  private static final System.Logger LOGGER = System.getLogger(Main.class.getName());

  private Main() {}

  public static void main(String[] args) {
    try {
      run(args);
    } catch (IllegalArgumentException exception) {
      LOGGER.log(System.Logger.Level.ERROR, exception.getMessage());
      System.exit(2);
    } catch (InterruptedException exception) {
      Thread.currentThread().interrupt();
      LOGGER.log(System.Logger.Level.WARNING, "Pipeline monitoring interrupted", exception);
      System.exit(130);
    } catch (IOException | IllegalStateException exception) {
      LOGGER.log(System.Logger.Level.ERROR, "Pipeline monitoring failed", exception);
      System.exit(1);
    }
  }

  private static void run(String[] args) throws IOException, InterruptedException {
    if (args.length != 1 || args[0].isBlank()) {
      throw new IllegalArgumentException("Usage: Main <pipeline-run-id>");
    }

    String runId = args[0];
    int maxRetries = maxRetriesFromEnvironment();
    try (Frontal client = Frontal.fromEnvironment()) {
      for (int attempt = 0; ; attempt++) {
        try {
          readEvents(client, runId);
          LOGGER.log(System.Logger.Level.INFO, "Pipeline event stream closed");
          return;
        } catch (IOException exception) {
          if ((exception instanceof FrontalException frontal && !frontal.retryable())
              || attempt >= maxRetries) {
            throw exception;
          }
          long delayMillis = retryDelayMillis(attempt, exception);
          LOGGER.log(
              System.Logger.Level.WARNING,
              "Pipeline stream disconnected; retry {0} of {1} in {2} ms",
              attempt + 1,
              maxRetries,
              delayMillis);
          Thread.sleep(delayMillis);
        }
      }
    }
  }

  private static void readEvents(Frontal client, String runId)
      throws IOException, InterruptedException {
    try (SseEventIterator events =
        client
            .pipelines()
            .streamEvents(
                Endpoints.Pipelines.STREAM_DATA_PIPELINES_PIPELINE_RUNS_PARAM,
                List.of(runId),
                QueryParams.empty())) {
      LOGGER.log(System.Logger.Level.INFO, "Connected to pipeline event stream");
      try {
        while (events.hasNext()) {
          System.out.println(events.next());
        }
      } catch (UncheckedIOException exception) {
        throw exception.getCause();
      }
    }
  }

  private static long retryDelayMillis(int attempt, IOException exception) {
    if (exception instanceof RateLimitException rateLimit) {
      Duration retryAfter = rateLimit.retryAfter();
      if (retryAfter.compareTo(Duration.ZERO) > 0) {
        Duration maximum = Duration.ofSeconds(30);
        return retryAfter.compareTo(maximum) >= 0 ? 30_000L : retryAfter.toMillis();
      }
    }
    return Math.min(30_000L, 1_000L << Math.min(attempt, 5));
  }

  private static int maxRetriesFromEnvironment() {
    String value = System.getenv("FRONTAL_STREAM_MAX_RETRIES");
    if (value == null || value.isBlank()) {
      return 3;
    }
    try {
      int retries = Integer.parseInt(value);
      if (retries < 0 || retries > 10) {
        throw new IllegalArgumentException("FRONTAL_STREAM_MAX_RETRIES must be between 0 and 10");
      }
      return retries;
    } catch (NumberFormatException exception) {
      throw new IllegalArgumentException(
          "FRONTAL_STREAM_MAX_RETRIES must be an integer between 0 and 10", exception);
    }
  }
}
