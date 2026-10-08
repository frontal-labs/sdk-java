# Releasing the Frontal Java SDK

Publish signed artifacts to Maven Central through the Central Portal using `.github/workflows/release.yml`. The current project version is `1.0.0`.

Before dispatching the release, update `CHANGELOG.md`, verify Java 17 and 21 CI, check the generated contract matrix, and configure the Central Portal and GPG secrets documented in [`docs/PUBLISHING.md`](./docs/PUBLISHING.md). The workflow stages and releases all signed modules; it does not run automatically on a tag.
