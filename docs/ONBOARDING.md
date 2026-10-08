# Java onboarding

1. Install JDK 17 or later with Maven 3.9+.
2. Clone this repository and install or resolve its dependencies using the Java-native toolchain.
3. Run the format, lint, build, and test commands in the root README.
4. Review `AGENTS.md`, `docs/ARCHITECTURE.md`, and `contracts/README.md`.
5. Select a route from `resources/Endpoints.java` and compare its method and path with `contracts/sdk-endpoints.json`.
6. Use `Frontal` and the matching service client to send typed JSON, raw bytes, multipart data, or a stream request.

Install JDK 17+ and Maven 3.9+. From the repository root, run `mvn --batch-mode --no-transfer-progress verify`. Export `FRONTAL_API_KEY` and optional settings into the process environment; Java does not load `.env` files automatically.
