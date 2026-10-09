package dev.frontal.examples.cronexport;

import com.fasterxml.jackson.databind.JsonNode;
import dev.frontal.sdk.Frontal;
import java.io.IOException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

/** Exports the current agent collection as a timestamped JSON snapshot. */
public final class Main {
  private static final DateTimeFormatter FILE_TIMESTAMP =
      DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss.SSS'Z'").withZone(ZoneOffset.UTC);
  private static final System.Logger LOGGER = System.getLogger(Main.class.getName());

  private Main() {}

  public static void main(String[] args) {
    try {
      run(args);
    } catch (InterruptedException exception) {
      Thread.currentThread().interrupt();
      LOGGER.log(System.Logger.Level.WARNING, "Agent export interrupted", exception);
      System.exit(130);
    } catch (IOException | IllegalStateException | IllegalArgumentException exception) {
      LOGGER.log(System.Logger.Level.ERROR, "Agent export failed", exception);
      System.exit(1);
    }
  }

  private static void run(String[] args) throws IOException, InterruptedException {
    if (args.length > 1) {
      throw new IllegalArgumentException("Usage: Main [output-file]");
    }

    Path output =
        args.length == 1
            ? Path.of(args[0])
            : Path.of("agents-" + FILE_TIMESTAMP.format(Instant.now()) + ".json");
    if (output.toString().isBlank()) {
      throw new IllegalArgumentException("Output file must not be blank");
    }
    try (Frontal client = Frontal.fromEnvironment()) {
      List<JsonNode> agents = client.agents().list(QueryParams.empty(), JsonNode.class).all();

      Path absoluteOutput = output.toAbsolutePath().normalize();
      if (absoluteOutput.getFileName() == null) {
        throw new IllegalArgumentException("Output path must name a file");
      }
      Files.createDirectories(absoluteOutput.getParent());
      Path temporaryFile =
          Files.createTempFile(absoluteOutput.getParent(), ".frontal-export-", ".tmp");
      try {
        client
            .apiClient()
            .objectMapper()
            .writerWithDefaultPrettyPrinter()
            .writeValue(temporaryFile.toFile(), agents);
        try {
          Files.move(
              temporaryFile,
              absoluteOutput,
              StandardCopyOption.ATOMIC_MOVE,
              StandardCopyOption.REPLACE_EXISTING);
        } catch (AtomicMoveNotSupportedException exception) {
          Files.move(temporaryFile, absoluteOutput, StandardCopyOption.REPLACE_EXISTING);
        }
      } finally {
        Files.deleteIfExists(temporaryFile);
      }
      LOGGER.log(System.Logger.Level.INFO, "Wrote agent export to {0}", absoluteOutput);
    }
  }
}
