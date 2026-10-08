---
paths:
  - "**/*.java"
---

# Java changes

Target Java 17 and preserve the single dev.frontal.sdk package. Follow Gradle Kotlin DSL, OkHttp/Jackson, Spotless, Error Prone/NullAway, JUnit 5, and MockWebServer conventions. Keep endpoint shapes grounded in contracts.

Follow the repository's `AGENTS.md` and `CLAUDE.md`. Use the relevant installed language skill under `.claude/skills/`. Add deterministic, offline tests for behavior changes, and run the repository's relevant format, lint, type/build, and contract checks.
