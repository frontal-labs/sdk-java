# Billing API

Service accessor: `frontal.billing()` (`BillingClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `getBillingAddonsParamEntitlements(...)` | `GET` | `/billing/addons/{param}/entitlements` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getBillingAddonsParamEntitlements(...)` | `GET` | `/billing/addons/{param}/entitlements` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBillingCustomersPortalParam(...)` | `GET` | `/billing/customers/portal/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getBillingCustomersPortalParam(...)` | `GET` | `/billing/customers/portal/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBillingCustomersParamEntitlements(...)` | `GET` | `/billing/customers/{param}/entitlements` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getBillingCustomersParamEntitlements(...)` | `GET` | `/billing/customers/{param}/entitlements` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBillingCustomersParamInvoicesSummary(...)` | `GET` | `/billing/customers/{param}/invoices/summary` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getBillingCustomersParamInvoicesSummary(...)` | `GET` | `/billing/customers/{param}/invoices/summary` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBillingCustomersParamUsage(...)` | `GET` | `/billing/customers/{param}/usage` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getBillingCustomersParamUsage(...)` | `GET` | `/billing/customers/{param}/usage` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBillingCustomersParamWallets(...)` | `GET` | `/billing/customers/{param}/wallets` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getBillingCustomersParamWallets(...)` | `GET` | `/billing/customers/{param}/wallets` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBillingPlansParamEntitlements(...)` | `GET` | `/billing/plans/{param}/entitlements` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getBillingPlansParamEntitlements(...)` | `GET` | `/billing/plans/{param}/entitlements` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBillingPricesLookupParam(...)` | `GET` | `/billing/prices/lookup/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getBillingPricesLookupParam(...)` | `GET` | `/billing/prices/lookup/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBillingSubscriptionsParamEntitlements(...)` | `GET` | `/billing/subscriptions/{param}/entitlements` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getBillingSubscriptionsParamEntitlements(...)` | `GET` | `/billing/subscriptions/{param}/entitlements` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBillingWalletsParamBalanceRealTime(...)` | `GET` | `/billing/wallets/{param}/balance/real-time` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getBillingWalletsParamBalanceRealTime(...)` | `GET` | `/billing/wallets/{param}/balance/real-time` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBillingWalletsParamTransactions(...)` | `GET` | `/billing/wallets/{param}/transactions` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getBillingWalletsParamTransactions(...)` | `GET` | `/billing/wallets/{param}/transactions` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getrawBillingInvoicesParamPdf(...)` | `GETRAW` | `/billing/invoices/{param}/pdf` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getrawBillingInvoicesParamPdf(...)` | `GETRAW` | `/billing/invoices/{param}/pdf` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `postBillingInvoicesPreview(...)` | `POST` | `/billing/invoices/preview` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postBillingInvoicesPreview(...)` | `POST` | `/billing/invoices/preview` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBillingInvoicesParamFinalize(...)` | `POST` | `/billing/invoices/{param}/finalize` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postBillingInvoicesParamFinalize(...)` | `POST` | `/billing/invoices/{param}/finalize` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBillingInvoicesParamVoid(...)` | `POST` | `/billing/invoices/{param}/void` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postBillingInvoicesParamVoid(...)` | `POST` | `/billing/invoices/{param}/void` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBillingMetersParamDisable(...)` | `POST` | `/billing/meters/{param}/disable` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postBillingMetersParamDisable(...)` | `POST` | `/billing/meters/{param}/disable` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBillingPlansParamClone(...)` | `POST` | `/billing/plans/{param}/clone` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postBillingPlansParamClone(...)` | `POST` | `/billing/plans/{param}/clone` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBillingSubscriptionsParamActivate(...)` | `POST` | `/billing/subscriptions/{param}/activate` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postBillingSubscriptionsParamActivate(...)` | `POST` | `/billing/subscriptions/{param}/activate` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBillingSubscriptionsParamCancel(...)` | `POST` | `/billing/subscriptions/{param}/cancel` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postBillingSubscriptionsParamCancel(...)` | `POST` | `/billing/subscriptions/{param}/cancel` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBillingSubscriptionsParamPause(...)` | `POST` | `/billing/subscriptions/{param}/pause` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postBillingSubscriptionsParamPause(...)` | `POST` | `/billing/subscriptions/{param}/pause` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBillingSubscriptionsParamResume(...)` | `POST` | `/billing/subscriptions/{param}/resume` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postBillingSubscriptionsParamResume(...)` | `POST` | `/billing/subscriptions/{param}/resume` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBillingWalletsParamTerminate(...)` | `POST` | `/billing/wallets/{param}/terminate` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postBillingWalletsParamTerminate(...)` | `POST` | `/billing/wallets/{param}/terminate` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBillingWalletsParamTopUp(...)` | `POST` | `/billing/wallets/{param}/top-up` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postBillingWalletsParamTopUp(...)` | `POST` | `/billing/wallets/{param}/top-up` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
