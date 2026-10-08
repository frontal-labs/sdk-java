# Releasing the Frontal Java SDK

Release-please manages versions, changelog entries, GitHub Releases, and `v*` tags from Conventional Commits on `main`. The publishing workflow verifies the release, generates an SPDX SBOM and provenance attestations, then publishes signed artifacts to Maven Central through the Central Portal.

Merge a release-please pull request only after required CI and review checks pass. Configure the `maven-central` environment and Central Portal and GPG secrets documented in [`docs/PUBLISHING.md`](./docs/PUBLISHING.md). The version lives in `gradle.properties`; the documentation index generator reads it from there.
