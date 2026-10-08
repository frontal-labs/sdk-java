# Publishing to Maven Central

The project publishes `dev.frontal:frontal-sdk` and its `core` and `services` implementation artifacts to Maven Central through the Central Portal. Gradle Nexus Publish manages upload and release; Gradle Signing signs each Maven publication. `gradle.properties` is the version source used by Gradle and release-please.

Configure the `maven-central` GitHub environment to allow deployments from `main` and `v*` release tags, require a reviewer, and store these environment secrets:

- `SONATYPE_USERNAME` and `SONATYPE_PASSWORD` for the Central Portal token.
- `SIGNING_KEY` and `SIGNING_PASSWORD` for the in-memory GPG key.

Conventional Commits on `main` drive release-please. It opens a release pull request that updates `CHANGELOG.md`, the Gradle version, and documented install coordinates. Merge it only after required CI and review checks pass. When release-please creates the GitHub Release and `v*` tag, the same workflow calls `.github/workflows/publish.yml`; a manually published `v*` GitHub Release also triggers that workflow. Publication waits for approval in `maven-central`, runs the full verification suite, publishes signed artifacts, attaches an SPDX SBOM, and records build provenance. Signing and publishing credentials must never be committed.

To install all modules in your local Maven repository, run `./gradlew :core:publishToMavenLocal :services:publishToMavenLocal :sdk:publishToMavenLocal`. The facade POM declares `core` and `services` transitively, so applications only need the `frontal-sdk` coordinate.
