# VS Code workspace setup

This folder contains portable workspace settings, extension recommendations, and manually invoked tasks. Open the repository root as a folder in VS Code; no machine-specific paths are configured. Tasks do not run automatically.

Workspace tasks call the committed Gradle wrapper. Formatting on save is off because the repository enforces palantir-java-format through Spotless; run the Spotless task for formatting and checks.

The repository's `.editorconfig` remains authoritative for whitespace and line endings. See `AGENTS.md` for the full development workflow.
