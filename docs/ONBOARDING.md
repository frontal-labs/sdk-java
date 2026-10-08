# Java onboarding

1. Install JDK 17 or 21.
2. Clone the repository and use the checked-in Gradle wrapper.
3. Run `./gradlew spotlessCheck assemble lint test examplesTest docsTest checkContracts`.
4. Review `AGENTS.md`, `docs/ARCHITECTURE.md`, and `contracts/README.md`.
5. Select a route from `Endpoints` and compare it with `contracts/sdk-endpoints.json` and the applicable OpenAPI snapshot.
6. Build a client with `Frontal.builder().apiKey(...).build()` and use the matching service accessor.

Export `FRONTAL_API_KEY` and optional settings into the process environment. Java does not load `.env` files automatically. Tests use MockWebServer and do not need live credentials.
