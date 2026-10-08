# Publishing to Maven Central

The project is configured to publish `dev.frontal:frontal-sdk:1.0.0` and its `core` and `services` implementation artifacts to Maven Central through the Central Portal. Gradle Nexus Publish manages upload and release; Gradle Signing signs each Maven publication.

Configure the `maven-central` GitHub environment to allow deployments only from `main`, require a reviewer, and store these environment secrets:

- `SONATYPE_USERNAME` and `SONATYPE_PASSWORD` for the Central Portal token.
- `SIGNING_KEY` and `SIGNING_PASSWORD` for the in-memory GPG key.

Dispatch `.github/workflows/release.yml` from the protected `main` branch and enter `1.0.0` as the confirmation value. The workflow requires approval through the `maven-central` environment, runs `./gradlew spotlessCheck assemble lint test examplesTest docsTest checkContracts`, then runs `publishToSonatype closeAndReleaseSonatypeStagingRepository`. Signing and publishing credentials must never be committed.

To install all modules in your local Maven repository, run `./gradlew :core:publishToMavenLocal :services:publishToMavenLocal :sdk:publishToMavenLocal`. The facade POM declares `core` and `services` transitively, so applications only need the `frontal-sdk` coordinate.
