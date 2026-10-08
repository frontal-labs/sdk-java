@AGENTS.md

# Java SDK repository instructions

Read `AGENTS.md` first for repository layout, project conventions, and contract rules. Read `README.md` and the relevant design docs before changing public SDK behavior.

## Contract and compatibility

Target Java 17 and preserve the single dev.frontal.sdk package. Follow Gradle Kotlin DSL, OkHttp/Jackson, Spotless, Error Prone/NullAway, JUnit 5, and MockWebServer conventions. Keep endpoint shapes grounded in contracts.

Do not add public endpoints, wire fields, or behavior unsupported by the committed contracts. Keep credentials, tokens, and customer data out of source, logs, fixtures, and examples. Make the smallest compatible change and update documentation/examples when public behavior changes.

## Skills

Use the matching skill in `.claude/skills/` when its topic applies. Skills are also linked from `.agents/skills/`; source files live in `skills/` and selected upstream sources are recorded in `skills/SOURCES.md`.

## Verification commands

Run only the commands relevant to the change; do not claim verification unless it was run.

```sh
./gradlew spotlessCheck
./gradlew assemble
./gradlew lint
./gradlew test
./gradlew examplesTest docsTest checkContracts
```
