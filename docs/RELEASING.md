# Releasing the Frontal Java SDK

Use Conventional Commit subjects on `main`. Release-please opens a release pull request with the next version and generated changelog; merge only after required CI and review checks pass. The merge creates a `v*` GitHub Release and tag, then invokes the Maven Central publish workflow. Publication waits for approval through the `maven-central` GitHub environment.

Review the generated changelog, release version, route report, and facade POM before merging the release pull request. See [`PUBLISHING.md`](./PUBLISHING.md) for the required environment secrets and Gradle tasks.
