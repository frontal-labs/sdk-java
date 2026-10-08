# Contributing to the Frontal Java SDK

## Set up

Install JDK 17 or later with Maven 3.9+. Follow [`docs/ONBOARDING.md`](./docs/ONBOARDING.md) to prepare the Java toolchain and local environment.

## Make a change

- Put shared transport and error behavior in the core module.
- Put each service's models and operations in its corresponding module.
- Use Maven and the Checkstyle rules in `checkstyle.xml`; follow four-space indentation from `.editorconfig`.
- Keep contracts and generated reports synchronized when public endpoint coverage changes.
- Add API documentation and a runnable Java example for each public operation.
- Record user-visible changes in `CHANGELOG.md` and use `type(scope): summary` commit subjects.

## Before opening a pull request

Run the commands in the root README and report any contract or public API changes. Do not include live credentials in tests or examples.
