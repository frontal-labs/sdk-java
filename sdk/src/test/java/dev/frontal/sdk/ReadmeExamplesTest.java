package dev.frontal.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import org.junit.jupiter.api.Test;

class ReadmeExamplesTest {
    private static final Pattern JAVA_BLOCK = Pattern.compile("```java\\R(.*?)\\R```", Pattern.DOTALL);
    private static final Path REPOSITORY_ROOT = Path.of("..").toAbsolutePath().normalize();

    @Test
    void compilesAndRunsEveryReadmeJavaBlockAgainstMocks() throws Exception {
        List<JavaSnippet> examples = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(REPOSITORY_ROOT)) {
            for (Path readme : paths.filter(Files::isRegularFile)
                    .filter(path -> path.getFileName().toString().equals("README.md"))
                    .filter(path -> !isBuildOutput(path))
                    .sorted()
                    .toList()) {
                Matcher matcher = JAVA_BLOCK.matcher(Files.readString(readme, StandardCharsets.UTF_8));
                int block = 0;
                while (matcher.find()) {
                    examples.add(new JavaSnippet(readme, ++block, matcher.group(1)));
                }
            }
        }
        assertFalse(examples.isEmpty(), "Add at least one Java example to a README");
        for (JavaSnippet example : examples) {
            runExample(example.source(), example.label());
        }
    }

    private boolean isBuildOutput(Path path) {
        for (Path component : REPOSITORY_ROOT.relativize(path)) {
            if (List.of(".git", ".gradle", "build", "target").contains(component.toString())) {
                return true;
            }
        }
        return false;
    }

    private void runExample(String snippet, String label) throws Exception {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        assertNotNull(compiler, "README examples require a JDK compiler");
        Path directory = Files.createTempDirectory("frontal-readme-example");
        Path source = directory.resolve("ReadmeQuickstart.java");
        Path classes = Files.createDirectory(directory.resolve("classes"));
        Files.writeString(source, wrap(snippet), StandardCharsets.UTF_8);
        int result = compiler.run(
                null,
                null,
                null,
                "--release",
                "17",
                "-classpath",
                System.getProperty("java.class.path"),
                "-d",
                classes.toString(),
                source.toString());
        assertEquals(0, result, "README Java snippet did not compile: " + label);

        try (URLClassLoader loader = new URLClassLoader(
                new URL[] {classes.toUri().toURL()}, getClass().getClassLoader())) {
            loader.loadClass("ReadmeQuickstart").getMethod("run").invoke(null);
        } finally {
            deleteTree(directory);
        }
    }

    private String wrap(String snippet) {
        return """
        import dev.frontal.sdk.ApiService;
        import dev.frontal.sdk.ApiStream;
        import dev.frontal.sdk.Endpoint;
        import dev.frontal.sdk.FrontalException;
        import com.fasterxml.jackson.databind.JsonNode;
        import dev.frontal.sdk.HttpMethod;
        import dev.frontal.sdk.Frontal;
        import dev.frontal.sdk.PageResult;
        import dev.frontal.sdk.QueryParams;
        import dev.frontal.sdk.RateLimitException;
        import java.io.ByteArrayOutputStream;
        import java.io.OutputStream;
        import java.util.List;
        import java.util.Map;
        public class ReadmeQuickstart {
          public static void run() throws Exception {
            okhttp3.mockwebserver.MockWebServer mock = new okhttp3.mockwebserver.MockWebServer();
            mock.start();
            mock.enqueue(new okhttp3.mockwebserver.MockResponse().setBody(\"{\\\"id\\\":\\\"agt_123\\\",\\\"name\\\":\\\"triage\\\",\\\"data\\\":[{\\\"id\\\":\\\"agt_123\\\",\\\"name\\\":\\\"triage\\\"}]}\"));
            Frontal f = Frontal.builder().apiKey(\"frt_test_key\").apiBaseUrl(mock.url(\"/v1\").toString()).build();
            OutputStream outputStream = new ByteArrayOutputStream();
            try {
              %s
            } finally {
              f.close();
              mock.shutdown();
            }
          }
        }
        """.formatted(snippet);
    }

    private record JavaSnippet(Path readme, int block, String source) {
        private String label() {
            return REPOSITORY_ROOT.relativize(readme) + " Java block " + block;
        }
    }

    private void deleteTree(Path root) throws IOException {
        try (var paths = Files.walk(root)) {
            paths.sorted(java.util.Comparator.reverseOrder()).forEach(path -> {
                try {
                    Files.deleteIfExists(path);
                } catch (IOException exception) {
                    throw new java.io.UncheckedIOException(exception);
                }
            });
        }
    }
}
