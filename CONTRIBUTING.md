# Contributing to the Frontal Java SDK

## Set up

Install JDK 17 or 21 and Node.js for repository hooks. Follow [`docs/ONBOARDING.md`](./docs/ONBOARDING.md) to prepare the toolchain.

## Make a change

- Keep the SDK in the single `dev.frontal.sdk` package and preserve the published `dev.frontal:frontal-sdk` facade. Use the Gradle `core`, `services`, `sdk`, and `examples` modules with the six role folders; do not add Java subpackages.
- Use Gradle, follow the four-space indentation in `.editorconfig`, and run Spotless, Error Prone, and NullAway before opening a pull request.
- Keep service resources in `resources/` and derive route changes from the contract inventory.
- Keep contracts and generated reports synchronized when public endpoint coverage changes.
- Add API documentation and a runnable Java example when introducing a new public service API.
- Record user-visible changes in `CHANGELOG.md` and use `type(scope): summary` commit subjects.

## Before opening a pull request

Run the commands in the root README and report any contract or public API changes. Mock HTTP with MockWebServer; do not include live credentials in tests or examples. Install the hooks with `npm install` and `npm run hooks:install`.
