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
ACTION_SEGMENTS = {
    "acknowledge", "acquire", "activate", "analyze", "analytics", "archive", "approve", "assign", "batch", "benchmark-v1", "benchmark-v2", "bulk",
    "cancel", "check", "clone", "compare", "complete", "conversation", "copy", "disable",
    "enable", "execute", "export", "extend", "finalize", "generate", "health", "infer",
    "ingest", "instantiate", "login", "logout", "move", "parse", "pause", "preview", "publish", "reprocess", "reprocess-all", "reprocess-pending",
    "query", "refresh", "reject", "replay", "resolve", "restore", "resume", "retry", "rollback",
    "rotate-secret", "search", "setup", "share", "status", "stream", "submit", "summary", "timeline",
    "toggle", "top-up", "trigger", "trust", "validate", "verify", "void", "usage", "usage-meter", "rerank", "federated",
}


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


def path_parts(path: str, service: str) -> list[str]:
    parts = [part for part in path.strip("/").split("/") if part]
    service_root = service
    if service == "ai" and parts and parts[0] == "ai":
        return parts[1:]
    if parts and parts[0] == service_root:
        return parts[1:]
    return parts


def resource_word(segment: str) -> str:
    words = re.findall(r"[A-Za-z0-9]+", segment)
    return java_identifier(" ".join(words), "resource")


def singularize(word: str) -> str:
    if word.endswith("ies") and len(word) > 3:
        return word[:-3] + "y"
    if word.endswith("sses"):
        return word[:-2]
    if word.endswith("s") and not word.endswith(("ss", "us", "is")):
        return word[:-1]
    return word


def parameter_names(service: str, path: str, operation_params: list[str]) -> list[str]:
    count = path.count("{param}")
    if len(operation_params) == count and all(operation_params):
        return [java_identifier(name, f"id{index + 1}") for index, name in enumerate(operation_params)]
    parts = path_parts(path, service)
    names = []
    service_noun = singularize(resource_word(service))
    for index, part in enumerate(parts):
        if part.startswith("{"):
            previous = next(
                (candidate for candidate in reversed(parts[:index]) if not candidate.startswith("{")),
                service_noun,
            )
            noun = singularize(resource_word(previous))
            names.append((noun or "resource") + "Id")
    seen: dict[str, int] = {}
    result = []
    for name in names:
        seen[name] = seen.get(name, 0) + 1
        result.append(name if seen[name] == 1 else f"{name}{seen[name]}")
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
                            key = (SERVICE_ALIASES.get(tags[0], tags[0]), method, normalize_path(path))
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


def is_collection_segment(segment: str) -> bool:
    lower = segment.lower()
    return lower.endswith("s") and not lower.endswith(("ss", "us", "is"))


def resource_binding(service: str, route: dict) -> tuple[tuple[str, ...], str]:
    parts = path_parts(route["path"], service)
    static_parts = [part for part in parts if not part.startswith("{")]
    last = parts[-1] if parts else ""
    last_static = static_parts[-1] if static_parts else ""
    lower = last_static.lower()
    method = route["method"]

    if not parts:
        operation = {"GET": "list", "POST": "create", "PUT": "update", "PATCH": "update", "DELETE": "delete"}.get(method, "request")
        return (), operation
    if service == "agents" and route["path"].startswith("/action-runs/"):
        return ("runs",), "getByActionRunId"
    if service == "ai" and route["path"].endswith("/internal/models/defaults"):
        return ("internal", "models"), "defaults"
    if service == "ai" and route["path"].endswith("/ai/chat/completions"):
        return ("chat", "completions"), "create"
    if service == "ai" and route["path"].endswith("/internal/embeddings"):
        return ("internal",), "embed"
    if service == "ai" and route["path"].endswith("/internal/predictions"):
        suffix = {"POST": "predict", "POSTFORMDATA": "predictForm", "POSTRAW": "predictRaw"}.get(method)
        return ("internal",), suffix or "predict"

    if last.startswith("{"):
        node = tuple(static_parts)
        operation = {"GET": "get", "DELETE": "delete", "PUT": "update", "PATCH": "update"}.get(method, "get")
        return node, operation

    if lower in ACTION_SEGMENTS:
        return tuple(static_parts[:-1]), resource_word(last_static)

    if is_collection_segment(last_static):
        operation = {"GET": "list", "POST": "create", "PUT": "update", "PATCH": "update", "DELETE": "delete"}.get(method, "get")
        return tuple(static_parts), operation

    node = tuple(static_parts[:-1])
    resource = singularize(resource_word(last_static))
    operation = {"GET": "get", "POST": "create", "PUT": "update", "PATCH": "update", "DELETE": "delete"}.get(method, "get")
    return node, operation + resource[:1].upper() + resource[1:]


def append_regular_operation(
    lines: list[str],
    documentation_rows: list[tuple[str, str, str, str, str]],
    call_lines: list[str],
    *,
    method_name: str,
    method: str,
    path: str,
    annotation_value: str,
    endpoint: str,
    path_args: list[str],
    params: list[str],
    path_values: str,
    client_chain: str,
) -> None:
    is_form = method == "POSTFORMDATA"
    has_body = method not in {"GET", "GETRAW", "DELETE", "HEAD", "OPTIONS"}
    body_type = "byte[]" if method == "POSTRAW" else "@Nullable JsonNode"
    tail = ["QueryParams query"]
    if is_form:
        tail.extend(["Map<String, String> fields", "Map<String, Path> files"])
    elif has_body:
        tail.append(f"{body_type} body")
    if is_form:
        call = f"requestForm({endpoint}, {path_values}, query, fields, files, responseType)"
    elif method == "POSTRAW":
        call = f"requestRaw({endpoint}, {path_values}, query, body, responseType)"
    else:
        call = f"request({endpoint}, {path_values}, query, {'body' if has_body else 'null'}, responseType)"
    signature = ", ".join([*path_args, *tail, "Class<T> responseType"])
    method_parameters = [*params, "query"]
    if is_form:
        method_parameters.extend(["fields", "files"])
    elif has_body:
        method_parameters.append("body")
    method_parameters.append("responseType")
    append_javadoc(
        lines,
        f"Calls the contract route {{@code {method} {path}}}.",
        method_parameters,
        typed=True,
        returns="the decoded response, or null when the response body is empty",
        throws=["IOException", "InterruptedException"],
    )
    lines.extend([
        f'    @SdkOperation("{annotation_value}")',
        f"    public <T> @Nullable T {method_name}({signature}) throws IOException, InterruptedException {{",
        f"        return {call};", "    }",
    ])
    typed_tail = [*tail, "TypeReference<T> responseType"]
    typed_call = call.removesuffix("responseType)") + "responseType)"
    append_javadoc(
        lines,
        f"Calls the contract route {{@code {method} {path}}} using a generic response type.",
        method_parameters,
        typed=True,
        returns="the decoded response, or null when the response body is empty",
        throws=["IOException", "InterruptedException"],
    )
    lines.extend([
        f"    public <T> @Nullable T {method_name}({', '.join([*path_args, *typed_tail])}) throws IOException, InterruptedException {{",
        f"        return {typed_call};", "    }",
    ])
    queryless_params = [*path_args]
    queryless_values = [*params, "QueryParams.empty()"]
    if is_form:
        queryless_params.extend(["Map<String, String> fields", "Map<String, Path> files"])
        queryless_values.extend(["fields", "files"])
    elif has_body:
        queryless_params.append(f"{body_type} body")
        queryless_values.append("body")
    queryless_method_parameters = [*params]
    if is_form:
        queryless_method_parameters.extend(["fields", "files"])
    elif has_body:
        queryless_method_parameters.append("body")
    queryless_method_parameters.append("responseType")
    append_javadoc(
        lines,
        f"Calls the contract route {{@code {method} {path}}} without query parameters.",
        queryless_method_parameters,
        typed=True,
        returns="the decoded response, or null when the response body is empty",
        throws=["IOException", "InterruptedException"],
    )
    lines.extend([
        f"    public <T> @Nullable T {method_name}({', '.join([*queryless_params, 'Class<T> responseType'])}) throws IOException, InterruptedException {{",
        f"        return {method_name}({', '.join(queryless_values)}, responseType);", "    }",
    ])
    append_javadoc(
        lines,
        f"Calls the contract route {{@code {method} {path}}} without query parameters using a generic response type.",
        queryless_method_parameters,
        typed=True,
        returns="the decoded response, or null when the response body is empty",
        throws=["IOException", "InterruptedException"],
    )
    lines.extend([
        f"    public <T> @Nullable T {method_name}({', '.join([*queryless_params, 'TypeReference<T> responseType'])}) throws IOException, InterruptedException {{",
        f"        return {method_name}({', '.join(queryless_values)}, responseType);", "    }", ""
    ])
    query_parameters = [*path_args, *tail]
    queryless_parameters = queryless_params
    documentation_rows.extend([
        (f"{client_chain}.{method_name}", method, path, ", ".join([*query_parameters, "Class<T> responseType"]), "@Nullable T"),
        (f"{client_chain}.{method_name}", method, path, ", ".join([*query_parameters, "TypeReference<T> responseType"]), "@Nullable T"),
        (f"{client_chain}.{method_name}", method, path, ", ".join([*queryless_parameters, "Class<T> responseType"]), "@Nullable T"),
        (f"{client_chain}.{method_name}", method, path, ", ".join([*queryless_parameters, "TypeReference<T> responseType"]), "@Nullable T"),
    ])
    call_args = [*params]
    if is_form:
        call_args.extend(["fields", "files"])
    elif has_body:
        call_args.append("body")
    call_args.append("responseType")
    call_lines.append(f"client.{client_chain}.{method_name}({', '.join(call_args)});")


def render_operation_clients(routes: dict, endpoint_names: dict, operations: dict) -> None:
    docs_dir = ROOT / "docs/api"
    docs_dir.mkdir(parents=True, exist_ok=True)
    index_rows = []
    method_listing: dict[str, list[str]] = {}
    for service, enum_value in SERVICES.items():
        service_routes = routes_for_sdk_service(routes, service)
        base = service_type(service)
        class_name = f"{base}ServiceClient" if service in CUSTOM_CLIENTS else f"{base}Client"
        bindings: dict[tuple[str, str], tuple[tuple[str, ...], str]] = {}
        node_routes: dict[tuple[str, ...], list[dict]] = {(): []}
        nodes: set[tuple[str, ...]] = {()}
        child_names: dict[tuple[str, ...], set[str]] = {}
        documentation_rows = []
        call_lines = []
        for route in sorted(service_routes, key=lambda item: (item["method"], item["path"])):
            binding = resource_binding(service, route)
            bindings[(route["method"], route["path"])] = binding
            node, _ = binding
            node_routes.setdefault(node, []).append(route)
            nodes.add(node)
            for depth in range(1, len(node) + 1):
                ancestor = node[:depth]
                nodes.add(ancestor)
                node_routes.setdefault(ancestor, [])
                child_names.setdefault(ancestor[:-1], set()).add(ancestor[-1])

        node_names: dict[tuple[str, ...], dict[tuple[str, str], str]] = {}
        for node, grouped_routes in node_routes.items():
            counts: dict[str, int] = {}
            names: dict[tuple[str, str], str] = {}
            for route in grouped_routes:
                name = bindings[(route["method"], route["path"])][1]
                count = counts.get(name, 0)
                counts[name] = count + 1
                if count:
                    name = f"{name}{count + 1}"
                names[(route["method"], route["path"])] = name
            node_names[node] = names

        def class_for(node: tuple[str, ...]) -> str:
            if not node:
                return class_name
            suffix = "".join("".join(part.title() for part in re.findall(r"[A-Za-z0-9]+", segment)) for segment in node)
            return f"{base}{suffix}Client"

        accessor = java_identifier(service, "service")
        for node in sorted(nodes, key=lambda value: (len(value), value)):
            current_class = class_for(node)
            current_routes = node_routes.get(node, [])
            imports = [
                "import com.fasterxml.jackson.core.type.TypeReference;",
                "import com.fasterxml.jackson.databind.JsonNode;",
                "import java.io.IOException;",
                "import java.util.List;",
                "import org.jspecify.annotations.Nullable;",
            ]
            if any(route["method"] == "POSTFORMDATA" for route in current_routes):
                imports.extend(["import java.nio.file.Path;", "import java.util.Map;"])
            if any(route["method"] == "STREAM" for route in current_routes):
                imports.append("import java.util.concurrent.Flow;")
            final = "" if not node and service in CUSTOM_CLIENTS else "final "
            lines = [
                "package dev.frontal.sdk;", "", *imports, "",
                f"/** Contract operations for {service}{('/' + '/'.join(node)) if node else ''}. Generated by scripts/generate_endpoints.py. */",
                f"public {final}class {current_class} extends ServiceClient {{",
                f"    {current_class}(ApiClient client) {{", f"        super(ApiService.{enum_value}, client);", "    }", ""
            ]
            for child in sorted(child_names.get(node, set())):
                child_node = (*node, child)
                method_name = java_identifier(child, "resource")
                if method_name in {"client", "service", "request", "execute", "stream"}:
                    method_name += "Resource"
                lines.extend([
                    "    /** Returns the client for the nested resource.",
                    f"     * @return the {child} resource client",
                    "     */",
                    f"    public {class_for(child_node)} {method_name}() {{",
                    f"        return new {class_for(child_node)}(client());", "    }", ""
                ])
            for route in sorted(current_routes, key=lambda item: (item["method"], item["path"])):
                method = route["method"]
                method_name = node_names[node][(method, route["path"])]
                route_service = service
                constant = endpoint_names[(route_service, method, route["path"])]
                metadata = operations.get((route_service, method, normalize_path(route["path"])), ("", []))
                path_names = parameter_names(service, route["path"], metadata[1])
                if len(path_names) != route["path"].count("{param}"):
                    path_names = [f"id{index + 1}" for index in range(route["path"].count("{param}"))]
                params = [java_identifier(name, f"id{index + 1}") for index, name in enumerate(path_names)]
                path_args = [f"String {name}" for name in params]
                path_values = f"List.of({', '.join(params)})" if params else "List.of()"
                endpoint_group = "".join(part.title() for part in enum_value.lower().split("_"))
                endpoint = f"Endpoints.{endpoint_group}.{constant}"
                annotation_value = f'{route_service}|{method}|{route["path"]}'
                query_arg = "QueryParams query"
                client_chain = ".".join([f"{accessor}()", *[f"{java_identifier(part, 'resource')}()" for part in node]])
                if method == "STREAM":
                    signature = ", ".join(path_args + [query_arg])
                    append_javadoc(
                        lines,
                        f"Opens the event stream for {{@code {method} {route['path']}}}.",
                        [*params, "query"],
                        returns="a publisher that emits event data",
                    )
                    lines.extend([
                        f'    @SdkOperation("{annotation_value}")',
                        f"    public Flow.Publisher<String> {method_name}({signature}) {{",
                        f"        return streamPublisher({endpoint}, {path_values}, query);", "    }",
                    ])
                    append_javadoc(
                        lines,
                        f"Opens a blocking event stream for {{@code {method} {route['path']}}}.",
                        [*params, "query"],
                        returns="an iterator that must be closed",
                        throws=["IOException", "InterruptedException"],
                    )
                    lines.extend([
                        f"    public SseEventIterator {method_name}Blocking({signature}) throws IOException, InterruptedException {{",
                        f"        return streamEvents({endpoint}, {path_values}, query);", "    }",
                    ])
                    append_javadoc(
                        lines,
                        f"Opens the event stream for {{@code {method} {route['path']}}} with no query parameters.",
                        params,
                        returns="a publisher that emits event data",
                    )
                    lines.extend([
                        f"    public Flow.Publisher<String> {method_name}({', '.join(path_args)}) {{",
                        f"        return {method_name}({', '.join(params + ['QueryParams.empty()'])});", "    }",
                    ])
                    append_javadoc(
                        lines,
                        f"Opens a blocking event stream for {{@code {method} {route['path']}}} with no query parameters.",
                        params,
                        returns="an iterator that must be closed",
                        throws=["IOException", "InterruptedException"],
                    )
                    lines.extend([
                        f"    public SseEventIterator {method_name}Blocking({', '.join(path_args)}) throws IOException, InterruptedException {{",
                        f"        return {method_name}Blocking({', '.join(params + ['QueryParams.empty()'])});", "    }", ""
                    ])
                    documentation_rows.extend([
                        (f"{client_chain}.{method_name}", method, route["path"], ", ".join([*path_args, "QueryParams query"]), "Flow.Publisher<String>"),
                        (f"{client_chain}.{method_name}", method, route["path"], ", ".join(path_args), "Flow.Publisher<String>"),
                        (f"{client_chain}.{method_name}Blocking", method, route["path"], ", ".join([*path_args, "QueryParams query"]), "SseEventIterator"),
                        (f"{client_chain}.{method_name}Blocking", method, route["path"], ", ".join(path_args), "SseEventIterator"),
                    ])
                    call_lines.extend([
                        f"client.{client_chain}.{method_name}({', '.join(params)});",
                        f"client.{client_chain}.{method_name}Blocking({', '.join(params)});",
                    ])
                else:
                    append_regular_operation(
                        lines, documentation_rows, call_lines, method_name=method_name, method=method,
                        path=route["path"], annotation_value=annotation_value, endpoint=endpoint,
                        path_args=path_args, params=params, path_values=path_values, client_chain=client_chain,
                    )

            lines.append("}")
            output = ROOT / "services/src/main/java/dev/frontal/sdk/resources" / f"{current_class}.java"
            output.write_text("\n".join(lines) + "\n", encoding="utf-8")

        index_rows.append((service, len(service_routes)))
        doc_lines = [
            f"# {base} API", "", f"Service accessor: `frontal.{accessor}()` (`{class_name}`).", "",
            "Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. "
            "Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.", "",
            "| Method | HTTP | Route | Parameters | Response |", "| --- | --- | --- | --- | --- |"
        ]
        for method_name, method, path, parameters, response in documentation_rows:
            doc_lines.append(f"| `{method_name}(...)` | `{method}` | `{path}` | `{parameters}` | `{response}` |")
        doc_lines.extend(["", "The generic `request(...)` methods and `Endpoints` constants remain available."])
        (docs_dir / f"{service}.md").write_text("\n".join(doc_lines) + "\n", encoding="utf-8")
        method_listing[service] = call_lines

    calls = [
        "# Canonical Java calls", "",
        "Generated from the contract route catalog. Query parameters are optional; use `QueryParams` when required by the endpoint.",
    ]
    for service in sorted(method_listing):
        calls.extend(["", f"## {service}", "", "```java", *method_listing[service], "```"])
    (docs_dir / "methods-as-code.md").write_text("\n".join(calls) + "\n", encoding="utf-8")

    index_lines = [
        "# Service API reference", "", "Generated from the committed route catalog for SDK service clients.", "",
        "Call-shaped listing of every operation: [methods as code](./methods-as-code.md).", "",
        "| Service | Routes | Reference |", "| --- | ---: | --- |",
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
