# Java SDK enterprise readiness

This page summarizes the controls in the Java SDK and the work required before a production release.

## Current controls

- Java 17 baseline with CI on JDK 17 and 21 using Gradle.
- Shared OkHttp transport with bounded responses, request IDs, safe-read retries, and typed errors.
- MockWebServer coverage for request handling, retries, pagination, error mapping, and SSE streams.
- Contract checks that map all public and AI OpenAPI operations to Java endpoints.
- Generated named operation methods and per-service references for supported routes. Agent run lookup is grouped under agents.
- Central Portal release workflow with GPG signing required for publication.

## Remaining release work

- Configure Central Portal and GPG credentials as protected GitHub secrets.
- Complete a security review of transport, credential handling, and logging.
- Add operation-specific request and response models as upstream contracts provide complete schemas.
- Configure dependency scanning and release provenance for the repository.
