# Security policy

Report vulnerabilities privately to **security@frontal.dev**. Include the affected SDK version, Java version, relevant module, reproduction steps, impact, and a proof of concept when possible. Do not open a public issue or include API keys or customer data.

We aim to acknowledge reports within five business days and will coordinate a fix and disclosure timeline with the reporter. Please use the GitHub **Report a vulnerability** link on the Security tab if you cannot email us.

## Supported versions

Security fixes are provided for the latest stable release line (currently `1.x`). Upgrade to the latest patch release before reporting an issue. Unsupported versions may receive a fix only when a vulnerability warrants it and a maintainer can provide one.

Never commit populated `.env` files, credentials, or captured production payloads.
