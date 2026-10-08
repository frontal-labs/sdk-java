# Releasing the Frontal Java SDK

The configured facade version is `1.0.0`. Release by dispatching `.github/workflows/release.yml` from protected `main` after Java 17/21 CI passes. The workflow gates publication on approval through the `maven-central` GitHub environment and uses its Central Portal and GPG secrets.

Before publishing, update the changelog, review the generated route report, and verify the facade POM carries `core` and `services` transitively. See [`PUBLISHING.md`](./PUBLISHING.md) for the required secrets and Gradle tasks.
