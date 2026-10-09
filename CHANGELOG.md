# Changelog

## Unreleased

- Add the typed Functions API client, execution and deployment operations, and examples.

## [3.0.0](https://github.com/frontal-labs/sdk-java/compare/v2.0.0...v3.0.0) (2026-10-09)


### ⚠ BREAKING CHANGES

* **sandbox:** remove Frontal.sandbox() and the SandboxClient and SandboxLanguagesClient APIs.
* **sandbox:** remove Frontal.sandbox() and the SandboxClient and SandboxLanguagesClient APIs.

### Features

* **core:** add new service enum constants and per-service retry config ([8f3285b](https://github.com/frontal-labs/sdk-java/commit/8f3285b1de7db3e04cfaeb913fc3cca837201960))
* **models:** add Functions API model classes ([cf54364](https://github.com/frontal-labs/sdk-java/commit/cf54364c354c7d317a8cc3e8c318c48fe27410b9))
* **resources:** add resource clients for Functions, Invocations, Providers, WebhookEndpoints services ([f25a86d](https://github.com/frontal-labs/sdk-java/commit/f25a86d11bf2f908f3a4cea5b6fd4c2b81d1b076))
* **sandbox:** remove sandbox service endpoints ([991c21c](https://github.com/frontal-labs/sdk-java/commit/991c21c7e3086254eb0f053cd1f6753405af4cd1))
* **sandbox:** remove sandbox service endpoints ([#14](https://github.com/frontal-labs/sdk-java/issues/14)) ([98d186e](https://github.com/frontal-labs/sdk-java/commit/98d186ebe050d31f13faf98df51df588dbd82d6a))
* **sdk:** add FUNCTIONS, INVOCATIONS, PROVIDERS, WEBHOOK_ENDPOINTS service accessors ([733442a](https://github.com/frontal-labs/sdk-java/commit/733442a87bdd4ff0a33b682ec16d601d9542c38f))
* **sdk:** add initial Java SDK and project resources ([8dd3555](https://github.com/frontal-labs/sdk-java/commit/8dd355518855935c4f49fddd9899757dc4ffae90))
* **sdk:** add typed service clients for v2 ([d902627](https://github.com/frontal-labs/sdk-java/commit/d9026271a2b3534f1245bfc40d9a8859187ba453))
* **sdk:** migrate Java client to modular Gradle build ([113f655](https://github.com/frontal-labs/sdk-java/commit/113f6551f79f7cc4f213305c57ca334e73d46060))
* **templates:** add runnable Java operations examples ([4d86307](https://github.com/frontal-labs/sdk-java/commit/4d86307d854c046a03e94bc65137198cda33b590))
* **tests:** add Functions API unit and integration tests ([31beea2](https://github.com/frontal-labs/sdk-java/commit/31beea2524d7673adb155d994992aa623fcbd720))

## 2.0.0

- Establish the initial SDK release with the multi-module build, shared transport, typed failures, pagination, polling, and SSE support.
- Add named service clients and operation methods for all catalogued routes.
- Retry safe streamed GET downloads and bound retained error diagnostics.
- Add immutable typed query parameters and JSON tree request bodies for routes without contract schemas; isolate custom Jackson configuration.
- Narrow polling exceptions, complete finite SSE publishers at exact demand boundaries, and publish generated service references.

All notable changes to this SDK are recorded here.
