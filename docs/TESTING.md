# Java testing strategy

Use the Java ecosystem's standard test runner and mock HTTP at the shared transport boundary. Cover request encoding, response decoding, API errors, retry safety, timeout behavior, pagination, and streaming. Keep unit tests independent of live keys; live API checks must be explicitly opt-in.

Use JUnit for unit and integration tests and mock HTTP at the transport boundary. Keep tests deterministic, avoid live keys, and place tests under `src/test/java`. Cover request encoding, response decoding, API errors, retry safety, timeout behavior, multipart requests, and streaming responses as the client evolves.
