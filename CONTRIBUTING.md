# Contributing to the Frontal Java SDK

## Set up

Install JDK 17 or later with Maven 3.9+. Follow [`docs/ONBOARDING.md`](./docs/ONBOARDING.md) to prepare the Java toolchain and local environment.

## Make a change

- Keep the SDK in the single `dev.frontal.sdk` package and the existing Maven artifact. Use the `api/`, `auth/`, `config/`, `models/`, `resources/`, and `utils/` folders to organize source files by role; do not add Java subpackages or Maven modules.
- Use Maven, follow the four-space indentation in `.editorconfig`, and run Spotless and Checkstyle before opening a pull request.
- Keep service resources in `resources/` and derive route changes from the contract inventory.
- Keep contracts and generated reports synchronized when public endpoint coverage changes.
- Add API documentation and a runnable Java example for each public operation.
- Record user-visible changes in `CHANGELOG.md` and use `type(scope): summary` commit subjects.

## Before opening a pull request

Run the commands in the root README and report any contract or public API changes. Do not include live credentials in tests or examples.
