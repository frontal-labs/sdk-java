# Billing API

Service accessor: `frontal.billing()` (`BillingClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `billing().customers().usage(...)` | `GET` | `/billing/customers/{param}/usage` | `String customerId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().customers().usage(...)` | `GET` | `/billing/customers/{param}/usage` | `String customerId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().customers().usage(...)` | `GET` | `/billing/customers/{param}/usage` | `String customerId, Class<T> responseType` | `@Nullable T` |
| `billing().customers().usage(...)` | `GET` | `/billing/customers/{param}/usage` | `String customerId, TypeReference<T> responseType` | `@Nullable T` |
| `billing().invoices().getPdf(...)` | `GETRAW` | `/billing/invoices/{param}/pdf` | `String invoiceId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().invoices().getPdf(...)` | `GETRAW` | `/billing/invoices/{param}/pdf` | `String invoiceId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().invoices().getPdf(...)` | `GETRAW` | `/billing/invoices/{param}/pdf` | `String invoiceId, Class<T> responseType` | `@Nullable T` |
| `billing().invoices().getPdf(...)` | `GETRAW` | `/billing/invoices/{param}/pdf` | `String invoiceId, TypeReference<T> responseType` | `@Nullable T` |
| `billing().invoices().preview(...)` | `POST` | `/billing/invoices/preview` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().invoices().preview(...)` | `POST` | `/billing/invoices/preview` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().invoices().preview(...)` | `POST` | `/billing/invoices/preview` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().invoices().preview(...)` | `POST` | `/billing/invoices/preview` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().invoices().finalize(...)` | `POST` | `/billing/invoices/{param}/finalize` | `String invoiceId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().invoices().finalize(...)` | `POST` | `/billing/invoices/{param}/finalize` | `String invoiceId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().invoices().finalize(...)` | `POST` | `/billing/invoices/{param}/finalize` | `String invoiceId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().invoices().finalize(...)` | `POST` | `/billing/invoices/{param}/finalize` | `String invoiceId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().invoices().resourceVoid(...)` | `POST` | `/billing/invoices/{param}/void` | `String invoiceId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().invoices().resourceVoid(...)` | `POST` | `/billing/invoices/{param}/void` | `String invoiceId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().invoices().resourceVoid(...)` | `POST` | `/billing/invoices/{param}/void` | `String invoiceId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().invoices().resourceVoid(...)` | `POST` | `/billing/invoices/{param}/void` | `String invoiceId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().meters().disable(...)` | `POST` | `/billing/meters/{param}/disable` | `String meterId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().meters().disable(...)` | `POST` | `/billing/meters/{param}/disable` | `String meterId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().meters().disable(...)` | `POST` | `/billing/meters/{param}/disable` | `String meterId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().meters().disable(...)` | `POST` | `/billing/meters/{param}/disable` | `String meterId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().plans().clone(...)` | `POST` | `/billing/plans/{param}/clone` | `String planId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().plans().clone(...)` | `POST` | `/billing/plans/{param}/clone` | `String planId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().plans().clone(...)` | `POST` | `/billing/plans/{param}/clone` | `String planId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().plans().clone(...)` | `POST` | `/billing/plans/{param}/clone` | `String planId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().subscriptions().activate(...)` | `POST` | `/billing/subscriptions/{param}/activate` | `String subscriptionId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().subscriptions().activate(...)` | `POST` | `/billing/subscriptions/{param}/activate` | `String subscriptionId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().subscriptions().activate(...)` | `POST` | `/billing/subscriptions/{param}/activate` | `String subscriptionId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().subscriptions().activate(...)` | `POST` | `/billing/subscriptions/{param}/activate` | `String subscriptionId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().subscriptions().cancel(...)` | `POST` | `/billing/subscriptions/{param}/cancel` | `String subscriptionId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().subscriptions().cancel(...)` | `POST` | `/billing/subscriptions/{param}/cancel` | `String subscriptionId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().subscriptions().cancel(...)` | `POST` | `/billing/subscriptions/{param}/cancel` | `String subscriptionId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().subscriptions().cancel(...)` | `POST` | `/billing/subscriptions/{param}/cancel` | `String subscriptionId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().subscriptions().pause(...)` | `POST` | `/billing/subscriptions/{param}/pause` | `String subscriptionId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().subscriptions().pause(...)` | `POST` | `/billing/subscriptions/{param}/pause` | `String subscriptionId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().subscriptions().pause(...)` | `POST` | `/billing/subscriptions/{param}/pause` | `String subscriptionId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().subscriptions().pause(...)` | `POST` | `/billing/subscriptions/{param}/pause` | `String subscriptionId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().subscriptions().resume(...)` | `POST` | `/billing/subscriptions/{param}/resume` | `String subscriptionId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().subscriptions().resume(...)` | `POST` | `/billing/subscriptions/{param}/resume` | `String subscriptionId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().subscriptions().resume(...)` | `POST` | `/billing/subscriptions/{param}/resume` | `String subscriptionId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().subscriptions().resume(...)` | `POST` | `/billing/subscriptions/{param}/resume` | `String subscriptionId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().wallets().createTerminate(...)` | `POST` | `/billing/wallets/{param}/terminate` | `String walletId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().wallets().createTerminate(...)` | `POST` | `/billing/wallets/{param}/terminate` | `String walletId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().wallets().createTerminate(...)` | `POST` | `/billing/wallets/{param}/terminate` | `String walletId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().wallets().createTerminate(...)` | `POST` | `/billing/wallets/{param}/terminate` | `String walletId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().wallets().topUp(...)` | `POST` | `/billing/wallets/{param}/top-up` | `String walletId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().wallets().topUp(...)` | `POST` | `/billing/wallets/{param}/top-up` | `String walletId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().wallets().topUp(...)` | `POST` | `/billing/wallets/{param}/top-up` | `String walletId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `billing().wallets().topUp(...)` | `POST` | `/billing/wallets/{param}/top-up` | `String walletId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `billing().addons().entitlements().list(...)` | `GET` | `/billing/addons/{param}/entitlements` | `String addonId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().addons().entitlements().list(...)` | `GET` | `/billing/addons/{param}/entitlements` | `String addonId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().addons().entitlements().list(...)` | `GET` | `/billing/addons/{param}/entitlements` | `String addonId, Class<T> responseType` | `@Nullable T` |
| `billing().addons().entitlements().list(...)` | `GET` | `/billing/addons/{param}/entitlements` | `String addonId, TypeReference<T> responseType` | `@Nullable T` |
| `billing().customers().entitlements().list(...)` | `GET` | `/billing/customers/{param}/entitlements` | `String customerId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().customers().entitlements().list(...)` | `GET` | `/billing/customers/{param}/entitlements` | `String customerId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().customers().entitlements().list(...)` | `GET` | `/billing/customers/{param}/entitlements` | `String customerId, Class<T> responseType` | `@Nullable T` |
| `billing().customers().entitlements().list(...)` | `GET` | `/billing/customers/{param}/entitlements` | `String customerId, TypeReference<T> responseType` | `@Nullable T` |
| `billing().customers().invoices().summary(...)` | `GET` | `/billing/customers/{param}/invoices/summary` | `String customerId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().customers().invoices().summary(...)` | `GET` | `/billing/customers/{param}/invoices/summary` | `String customerId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().customers().invoices().summary(...)` | `GET` | `/billing/customers/{param}/invoices/summary` | `String customerId, Class<T> responseType` | `@Nullable T` |
| `billing().customers().invoices().summary(...)` | `GET` | `/billing/customers/{param}/invoices/summary` | `String customerId, TypeReference<T> responseType` | `@Nullable T` |
| `billing().customers().portal().get(...)` | `GET` | `/billing/customers/portal/{param}` | `String portalId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().customers().portal().get(...)` | `GET` | `/billing/customers/portal/{param}` | `String portalId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().customers().portal().get(...)` | `GET` | `/billing/customers/portal/{param}` | `String portalId, Class<T> responseType` | `@Nullable T` |
| `billing().customers().portal().get(...)` | `GET` | `/billing/customers/portal/{param}` | `String portalId, TypeReference<T> responseType` | `@Nullable T` |
| `billing().customers().wallets().list(...)` | `GET` | `/billing/customers/{param}/wallets` | `String customerId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().customers().wallets().list(...)` | `GET` | `/billing/customers/{param}/wallets` | `String customerId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().customers().wallets().list(...)` | `GET` | `/billing/customers/{param}/wallets` | `String customerId, Class<T> responseType` | `@Nullable T` |
| `billing().customers().wallets().list(...)` | `GET` | `/billing/customers/{param}/wallets` | `String customerId, TypeReference<T> responseType` | `@Nullable T` |
| `billing().plans().entitlements().list(...)` | `GET` | `/billing/plans/{param}/entitlements` | `String planId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().plans().entitlements().list(...)` | `GET` | `/billing/plans/{param}/entitlements` | `String planId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().plans().entitlements().list(...)` | `GET` | `/billing/plans/{param}/entitlements` | `String planId, Class<T> responseType` | `@Nullable T` |
| `billing().plans().entitlements().list(...)` | `GET` | `/billing/plans/{param}/entitlements` | `String planId, TypeReference<T> responseType` | `@Nullable T` |
| `billing().prices().lookup().get(...)` | `GET` | `/billing/prices/lookup/{param}` | `String lookupId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().prices().lookup().get(...)` | `GET` | `/billing/prices/lookup/{param}` | `String lookupId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().prices().lookup().get(...)` | `GET` | `/billing/prices/lookup/{param}` | `String lookupId, Class<T> responseType` | `@Nullable T` |
| `billing().prices().lookup().get(...)` | `GET` | `/billing/prices/lookup/{param}` | `String lookupId, TypeReference<T> responseType` | `@Nullable T` |
| `billing().subscriptions().entitlements().list(...)` | `GET` | `/billing/subscriptions/{param}/entitlements` | `String subscriptionId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().subscriptions().entitlements().list(...)` | `GET` | `/billing/subscriptions/{param}/entitlements` | `String subscriptionId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().subscriptions().entitlements().list(...)` | `GET` | `/billing/subscriptions/{param}/entitlements` | `String subscriptionId, Class<T> responseType` | `@Nullable T` |
| `billing().subscriptions().entitlements().list(...)` | `GET` | `/billing/subscriptions/{param}/entitlements` | `String subscriptionId, TypeReference<T> responseType` | `@Nullable T` |
| `billing().wallets().balance().getRealTime(...)` | `GET` | `/billing/wallets/{param}/balance/real-time` | `String walletId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().wallets().balance().getRealTime(...)` | `GET` | `/billing/wallets/{param}/balance/real-time` | `String walletId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().wallets().balance().getRealTime(...)` | `GET` | `/billing/wallets/{param}/balance/real-time` | `String walletId, Class<T> responseType` | `@Nullable T` |
| `billing().wallets().balance().getRealTime(...)` | `GET` | `/billing/wallets/{param}/balance/real-time` | `String walletId, TypeReference<T> responseType` | `@Nullable T` |
| `billing().wallets().transactions().list(...)` | `GET` | `/billing/wallets/{param}/transactions` | `String walletId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `billing().wallets().transactions().list(...)` | `GET` | `/billing/wallets/{param}/transactions` | `String walletId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `billing().wallets().transactions().list(...)` | `GET` | `/billing/wallets/{param}/transactions` | `String walletId, Class<T> responseType` | `@Nullable T` |
| `billing().wallets().transactions().list(...)` | `GET` | `/billing/wallets/{param}/transactions` | `String walletId, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
