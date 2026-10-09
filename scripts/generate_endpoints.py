#!/usr/bin/env python3
"""Generate Java endpoint constants from the shared SDK route inventory."""

from __future__ import annotations

import json
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
CONTRACT = ROOT / "contracts/sdk-endpoints.json"
OUTPUT = ROOT / "services/src/main/java/dev/frontal/sdk/resources/Endpoints.java"
CONFORMANCE = ROOT / "contracts/reports/conformance.json"
MIGRATION_MATRIX = ROOT / "contracts/reports/migration-matrix.md"
SERVICES = {
    "agents": "AGENTS",
    "ai": "AI",
    "audit": "AUDIT",
    "auth": "AUTH",
    "billing": "BILLING",
    "blob": "BLOB",
    "connectors": "CONNECTORS",
    "connection-tests": "CONNECTION_TESTS",
    "data": "DATA",
    "events": "EVENTS",
    "governance": "GOVERNANCE",
    "invocations": "INVOCATIONS",
    "lineage": "LINEAGE",
    "observability": "OBSERVABILITY",
    "ontology": "ONTOLOGY",
    "pipelines": "PIPELINES",
    "providers": "PROVIDERS",
    "react": "REACT",
    "sandbox": "SANDBOX",
    "schedules": "SCHEDULES",
    "webhooks": "WEBHOOKS",
    "webhook-endpoints": "WEBHOOK_ENDPOINTS",
    "workflows": "WORKFLOWS",
}
CUSTOM_CLIENTS = {"agents", "ai", "workflows"}
SERVICE_ALIASES = {"action-runs": "agents"}


def routes_for_sdk_service(routes: dict, service: str) -> list[dict]:
    extra_routes = [
        route
        for source, target in SERVICE_ALIASES.items()
        if target == service
        for route in routes[source]
    ]
    return [*routes[service], *extra_routes]


def service_type(service: str) -> str:
    return "".join(part.title() for part in service.split("-"))


def normalize_path(path: str) -> str:
    if path.startswith("/v1/"):
        path = path[3:]
    elif path == "/v1":
        path = "/"
    return re.sub(r"\{[^{}]+\}", "{param}", path)


def java_identifier(value: str, fallback: str) -> str:
    value = re.sub(r"^(get|post|put|patch|delete|head|options)V1(?=[A-Z0-9])", r"\1", value)
    if value.upper() == value:
        value = value.lower()
    else:
        value = re.sub(r"([a-z0-9])([A-Z])", r"\1 \2", value)
    value = value.replace("_", " ")
    words = re.findall(r"[A-Za-z0-9]+", value)
    if not words:
        return fallback
    result = words[0][:1].lower() + words[0][1:]
    result += "".join(word[:1].upper() + word[1:] for word in words[1:])
    if result[0].isdigit() or result in JAVA_KEYWORDS:
        result = fallback + result[:1].upper() + result[1:]
    return result


JAVA_KEYWORDS = {
    "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
    "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
    "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
    "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
    "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
    "_", "record", "sealed", "permits", "var", "yield"
}


def operation_metadata() -> dict[tuple[str, str, str], tuple[str, list[str]]]:
    result: dict[tuple[str, str, str], tuple[str, list[str]]] = {}
    for spec_path in (ROOT / "contracts/openapi/api.openapi.json", ROOT / "contracts/openapi/ai.openapi.generated.json"):
        if spec_path.exists():
            spec = json.loads(spec_path.read_text(encoding="utf-8"))
            for path, path_item in spec.get("paths", {}).items():
                for method, operation in path_item.items():
                    method = method.upper()
                    if method in {"GET", "POST", "PUT", "PATCH", "DELETE", "HEAD", "OPTIONS"}:
                        tags = operation.get("tags", [])
                        if len(tags) == 1:
                            params = [parameter.get("name", "") for parameter in operation.get("parameters", [])
                                     if parameter.get("in") == "path"]
                            key = (tags[0], method, normalize_path(path))
                            result[key] = (operation.get("operationId", ""), params)
    return result


def append_javadoc(
    lines: list[str], description: str, parameters: list[str], *, typed: bool = False,
    returns: str | None = None, throws: list[str] | None = None
) -> None:
    lines.extend(["    /**", f"     * {description}"])
    if typed:
        lines.append("     * @param <T> decoded response type")
    for parameter in parameters:
        lines.append(f"     * @param {parameter} {parameter} supplied to the operation")
    if returns is not None:
        lines.append(f"     * @return {returns}")
    for exception in throws or []:
        lines.append(f"     * @throws {exception} if the operation fails")
    lines.append("     */")


def render_operation_clients(routes: dict, endpoint_names: dict, operations: dict) -> None:
    docs_dir = ROOT / "docs/api"
    docs_dir.mkdir(parents=True, exist_ok=True)
    index_rows = []
    for service, enum_value in SERVICES.items():
        service_routes = routes[service]
        base = service_type(service)
        class_name = f"{base}ServiceClient" if service in CUSTOM_CLIENTS else f"{base}Client"
        final = "" if service in CUSTOM_CLIENTS else "final "
        imports = [
            "import com.fasterxml.jackson.core.type.TypeReference;",
            "import com.fasterxml.jackson.databind.JsonNode;",
            "import java.io.IOException;",
            "import java.util.List;",
            "import org.jspecify.annotations.Nullable;",
        ]
        if any(route["method"] == "POSTFORMDATA" for route in service_routes):
            imports.extend(["import java.nio.file.Path;", "import java.util.Map;"])
        if any(route["method"] == "STREAM" for route in service_routes):
            imports.append("import java.util.concurrent.Flow;")
        lines = [
            "package dev.frontal.sdk;", "", *imports, "",
            f"/** Named contract operations for the {service} service. Generated by scripts/generate_endpoints.py. */",
            f"public {final}class {class_name} extends ServiceClient {{",
            f"    {class_name}(ApiClient client) {{", f"        super(ApiService.{enum_value}, client);", "    }", ""
        ]
        used_methods: dict[str, int] = {}
        documentation_rows = []
        for route in sorted(service_routes, key=lambda item: (item["method"], item["path"])):
            route_service = service
            constant = endpoint_names[(route_service, route["method"], route["path"])]
            metadata = operations.get((route_service, route["method"], normalize_path(route["path"])), ("", []))
            proposed = java_identifier(metadata[0], "operation") if metadata[0] else java_identifier(constant, "operation")
            duplicate = used_methods.get(proposed, 0)
            used_methods[proposed] = duplicate + 1
            method_name = proposed if duplicate == 0 else f"{proposed}{duplicate + 1}"
            path_names = metadata[1]
            path_count = route["path"].count("{param}")
            if len(path_names) != path_count:
                path_names = [f"pathParam{index + 1}" for index in range(path_count)]
            params = [java_identifier(name, f"pathParam{index + 1}") for index, name in enumerate(path_names)]
            path_args = [f"String {name}" for name in params]
            path_values = f"List.of({', '.join(params)})" if params else "List.of()"
            # Group names use the enum value, e.g. WEBHOOK_ENDPOINTS -> WebhookEndpoints.
            group = "".join(part.title() for part in enum_value.lower().split("_"))
            endpoint = f"Endpoints.{group}.{constant}"
            method = route["method"]
            annotation_value = f'{route_service}|{method}|{route["path"]}'
            query_arg = "QueryParams query"
            if method == "STREAM":
                signature = ", ".join(path_args + [query_arg])
                documentation_rows.append(
                    (method_name, method, route["path"], ", ".join(params + ["query"]), "Flow.Publisher<String>")
                )
                documentation_rows.append(
                    (f"{method_name}Blocking", method, route["path"], ", ".join(params + ["query"]), "SseEventIterator")
                )
                append_javadoc(
                    lines,
                    f"Opens the event stream for {{@code {method} {route['path']}}}.",
                    params + ["query"],
                    returns="a publisher that emits event data",
                )
                lines.extend([
                    f'    @SdkOperation("{annotation_value}")',
                    f"    public Flow.Publisher<String> {method_name}({signature}) {{",
                    f"        return streamPublisher({endpoint}, {path_values}, query);", "    }", ""
                ])
                append_javadoc(
                    lines,
                    f"Opens a blocking event stream for {{@code {method} {route['path']}}}.",
                    params + ["query"],
                    returns="an iterator that must be closed",
                    throws=["IOException", "InterruptedException"],
                )
                lines.extend([
                    f"    public SseEventIterator {method_name}Blocking({signature}) throws IOException, InterruptedException {{",
                    f"        return streamEvents({endpoint}, {path_values}, query);", "    }", ""
                ])
            if method != "STREAM":
                if method == "POSTFORMDATA":
                    tail = [query_arg, "Map<String, String> fields", "Map<String, Path> files"]
                    documentation_args = params + ["query", "fields", "files"]
                    call = f"requestForm({endpoint}, {path_values}, query, fields, files, responseType)"
                else:
                    tail = [query_arg]
                    documentation_args = params + ["query"]
                    if method not in {"GET", "GETRAW", "DELETE", "HEAD", "OPTIONS"}:
                        body_type = "byte[]" if method == "POSTRAW" else "@Nullable JsonNode"
                        tail.append(f"{body_type} body")
                        documentation_args.append("body")
                    call = f"requestRaw({endpoint}, {path_values}, query, " if method == "POSTRAW" else f"request({endpoint}, {path_values}, query, "
                    call += "body, " if method not in {"GET", "GETRAW", "DELETE", "HEAD", "OPTIONS"} else "null, "
                    call += "responseType)"
                common = path_args + tail
                signature = ", ".join(common + ["Class<T> responseType"])
                type_signature = f"public <T> @Nullable T {method_name}({signature})"
                method_parameters = params + ["query"]
                if method == "POSTFORMDATA":
                    method_parameters += ["fields", "files"]
                elif method not in {"GET", "GETRAW", "DELETE", "HEAD", "OPTIONS"}:
                    method_parameters.append("body")
                method_parameters.append("responseType")
                documentation_rows.append(
                    (method_name, method, route["path"], ", ".join(documentation_args + ["Class<T> responseType"]), "@Nullable T")
                )
                append_javadoc(
                    lines,
                    f"Calls the contract route {{@code {method} {route['path']}}}.",
                    method_parameters,
                    typed=True,
                    returns="the decoded response, or null when the response body is empty",
                    throws=["IOException", "InterruptedException"],
                )
                lines.extend([
                    f'    @SdkOperation("{annotation_value}")',
                    f"    {type_signature} throws IOException, InterruptedException {{",
                    f"        return {call};", "    }", ""
                ])
                type_ref_signature = ", ".join(common + ["TypeReference<T> responseType"])
                documentation_rows.append(
                    (method_name, method, route["path"], ", ".join(documentation_args + ["TypeReference<T> responseType"]), "@Nullable T")
                )
                type_ref_call = call.removesuffix("responseType)") + "responseType)"
                append_javadoc(
                    lines,
                    f"Calls the contract route {{@code {method} {route['path']}}}.",
                    method_parameters,
                    typed=True,
                    returns="the decoded response, or null when the response body is empty",
                    throws=["IOException", "InterruptedException"],
                )
                lines.extend([
                    f"    public <T> @Nullable T {method_name}({type_ref_signature}) throws IOException, InterruptedException {{",
                    f"        return {type_ref_call};", "    }", ""
                ])
        lines.append("}")
        output = ROOT / "services/src/main/java/dev/frontal/sdk/resources" / f"{class_name}.java"
        output.write_text("\n".join(lines) + "\n", encoding="utf-8")
        accessor = java_identifier(service, "service")
        index_rows.append((service, len(service_routes) + (len(routes["action-runs"]) if service == "agents" else 0)))
        doc_lines = [
            f"# {base} API", "", f"Service accessor: `frontal.{accessor}()` (`{class_name}`).", "",
            "Named methods are generated from the committed route catalog. Build query values with "
            "`QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; "
            "select `JsonNode` or a caller-provided model for unmodeled responses.", "",
            "| Method | HTTP | Route | Parameters | Response |", "| --- | --- | --- | --- | --- |"
        ]
        if documentation_rows:
            for method_name, method, path, parameters, response in documentation_rows:
                doc_lines.append(
                    f"| `{method_name}(...)` | `{method}` | `{path}` | `{parameters}` | `{response}` |"
                )
        if service == "agents":
            doc_lines.append(
                "| `getActionRun(...)` | `GET` | `/action-runs/{param}` | "
                "`actionRunId, query, Class<T> or TypeReference<T> responseType` | `@Nullable T` |"
            )
        else:
            doc_lines.append("| No catalogued operations | — | — | — | — |")
        doc_lines.extend(["", "The generic `request(...)` methods and `Endpoints` constants remain available."])
        (docs_dir / f"{service}.md").write_text("\n".join(doc_lines) + "\n", encoding="utf-8")

    index_lines = [
        "# Service API reference",
        "",
        "Generated from the committed route catalog for SDK service clients.",
        "",
        "Call-shaped listing of every method: [methods as code](./methods-as-code.md).",
        "",
        "| Service | Routes | Reference |",
        "| --- | ---: | --- |",
    ]
    for service, route_count in sorted(index_rows):
        index_lines.append(f"| {service} | {route_count} | [{service}](./{service}.md) |")
    (docs_dir / "README.md").write_text("\n".join(index_lines) + "\n", encoding="utf-8")

    annotation = ROOT / "services/src/main/java/dev/frontal/sdk/resources/SdkOperation.java"
    annotation.write_text("""package dev.frontal.sdk;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface SdkOperation {
    String value();
}
""", encoding="utf-8")


def constant_name(method: str, path: str) -> str:
    route = path.replace("{param}", "PARAM")
    parts = re.findall(r"[A-Za-z0-9]+", route)
    return "_".join([method, *parts]).upper()


def main() -> None:
    routes = json.loads(CONTRACT.read_text(encoding="utf-8"))
    missing = set(SERVICES) - routes.keys()
    if missing:
        raise SystemExit(f"Missing service contracts: {sorted(missing)}")
    lines = [
        "package dev.frontal.sdk;",
        "",
        "/** Contract-backed routes grouped by API service. Generated by scripts/generate_endpoints.py. */",
        "public final class Endpoints {",
        "  private Endpoints() {}",
    ]
    endpoint_names: dict[tuple[str, str, str], str] = {}
    for service, enum_value in SERVICES.items():
        group_name = "".join(part.title() for part in enum_value.split("_"))
        service_routes = routes_for_sdk_service(routes, service)
        lines.extend(
            [
                "",
                f"  public static final class {group_name} {{",
                f"    private {group_name}() {{}}",
            ]
        )
        if service_routes:
            lines.append("")
        used: dict[str, int] = {}
        for route in sorted(service_routes, key=lambda item: (item["method"], item["path"])):
            name = constant_name(route["method"], route["path"])
            count = used.get(name, 0)
            used[name] = count + 1
            if count:
                name = f"{name}_{count + 1}"
            endpoint_names[(service, route["method"], route["path"])] = name
            lines.append(f'    /** Endpoint for {{@code {route["method"]} {route["path"]}}}. */')
            declaration = (
                f'        new Endpoint(ApiService.{enum_value}, '
                f'HttpMethod.{route["method"]}, "{route["path"]}");'
            )
            lines.append(f"    public static final Endpoint {name} =")
            arguments = (
                f'ApiService.{enum_value}, HttpMethod.{route["method"]}, '
                f'"{route["path"]}"'
            )
            if len(declaration) <= 100:
                lines.append(declaration)
            elif len(arguments) + 14 <= 100:
                lines.extend(["        new Endpoint(", f"            {arguments});"])
            else:
                lines.extend(
                    [
                        "        new Endpoint(",
                        f"            ApiService.{enum_value},",
                        f"            HttpMethod.{route['method']},",
                        f'            "{route["path"]}");',
                    ]
                )
        lines.append("  }")
    lines.append("}")
    OUTPUT.write_text("\n".join(lines) + "\n", encoding="utf-8")
    render_operation_clients(routes, endpoint_names, operation_metadata())
    contract_endpoint_count = sum(len(service_routes) for service_routes in routes.values())
    endpoint_count = sum(
        len(routes_for_sdk_service(routes, service)) for service in SERVICES
    )
    named_operation_count = sum(len(routes_for_sdk_service(routes, service)) for service in SERVICES)
    report = {
        "repository": "sdk-java",
        "language": "Java",
        "status": "named-operations",
        "contractEndpointEntries": contract_endpoint_count,
        "generatedEndpointConstants": endpoint_count,
        "namedOperationMethods": named_operation_count,
        "supportedRouteCoverage": f"{named_operation_count}/{contract_endpoint_count}",
        "note": (
            "Endpoint constants and named operations cover SDK service routes. "
            "Payloads without usable schemas retain caller-provided JSON and response types."
        ),
    }
    CONFORMANCE.write_text(json.dumps(report, indent=2) + "\n", encoding="utf-8")
    MIGRATION_MATRIX.write_text(
        "# Java SDK route coverage\n\n"
        "_Status: generated route catalog and named operation surface complete. Typed models are "
        "provided only where committed schemas are usable._\n\n"
        "| Metric | Value |\n| --- | ---: |\n"
        f"| Contract endpoint entries | {contract_endpoint_count} |\n"
        f"| Generated endpoint constants | {endpoint_count} |\n"
        f"| Named operation methods for supported routes | {named_operation_count} |\n"
        f"| Contract routes omitted from the SDK surface | {contract_endpoint_count - endpoint_count} |\n"
        "| Operation-specific payload schemas usable | Limited by committed contract snapshots |\n\n"
        "`scripts/generate_endpoints.py` regenerates "
        "`services/src/main/java/dev/frontal/sdk/resources/Endpoints.java` from "
        "`contracts/sdk-endpoints.json`, grouping agent-run operations with agents. SDK routes "
        "use the shared Java transport; "
        "callers provide response types when decoding JSON.\n",
        encoding="utf-8",
    )
    print(
        f"Generated {endpoint_count} endpoint constants and {named_operation_count} "
        f"named operations across supported services."
    )


if __name__ == "__main__":
    main()
