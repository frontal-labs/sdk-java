#!/usr/bin/env python3
"""Check committed OpenAPI snapshots and the SDK route-to-endpoint mapping."""

from collections import Counter
import json
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
CONTRACT_DIR = ROOT / "contracts"
ENDPOINTS = ROOT / "services/src/main/java/dev/frontal/sdk/resources/Endpoints.java"
SNAPSHOTS = [
    CONTRACT_DIR / "sdk-endpoints.json",
    CONTRACT_DIR / "coverage-floor.json",
    CONTRACT_DIR / "openapi/api.openapi.json",
    CONTRACT_DIR / "openapi/ai.openapi.generated.json",
    CONTRACT_DIR / "openapi/manifest.json",
]
HTTP_METHODS = {"GET", "POST", "PUT", "PATCH", "DELETE", "HEAD", "OPTIONS"}
ENDPOINT_PATTERN = re.compile(
    r'new Endpoint\(\s*ApiService\.([A-Z_]+),\s*HttpMethod\.([A-Z]+),\s*"([^"]+)"\s*\)',
    re.DOTALL,
)
PLACEHOLDER_PATTERN = re.compile(r"\{[^{}]+\}")


def load_json(path: Path):
    if not path.is_file():
        raise SystemExit(f"missing contract file: {path.relative_to(ROOT)}")
    try:
        with path.open(encoding="utf-8") as stream:
            return json.load(stream)
    except json.JSONDecodeError as error:
        raise SystemExit(f"invalid JSON in {path.relative_to(ROOT)}: {error}") from error


def verify_route_catalog(inventory: dict) -> int:
    source = ENDPOINTS.read_text(encoding="utf-8")
    source_routes = Counter(
        (service.lower().replace("_", "-"), method, path)
        for service, method, path in ENDPOINT_PATTERN.findall(source)
    )
    contract_routes = Counter(
        (service, route["method"], route["path"])
        for service, routes in inventory.items()
        for route in routes
    )
    if source_routes != contract_routes:
        missing = contract_routes - source_routes
        extra = source_routes - contract_routes
        raise SystemExit(f"Java endpoint drift; missing={dict(missing)}, extra={dict(extra)}")
    return sum(contract_routes.values())


def verify_ai_openapi(spec: dict, inventory: dict) -> int:
    ai_routes = {
        (route["method"], route["path"])
        for route in inventory.get("ai", [])
    }
    count = 0
    for path, path_item in spec.get("paths", {}).items():
        for method, operation in path_item.items():
            method = method.upper()
            if method not in HTTP_METHODS:
                continue
            count += 1
            if (method, path) not in ai_routes:
                raise SystemExit(
                    f"AI OpenAPI operation has no Java endpoint: {method} {path} "
                    f"({operation.get('operationId', 'missing operationId')})"
                )
    return count


def normalize_public_path(path: str) -> str:
    if path.startswith("/v1/"):
        path = path[3:]
    elif path == "/v1":
        path = "/"
    return PLACEHOLDER_PATTERN.sub("{param}", path)


def verify_public_api_snapshot(spec: dict, inventory: dict) -> int:
    count = 0
    operation_ids = set()
    routes = {
        (service, route["method"], route["path"])
        for service, service_routes in inventory.items()
        for route in service_routes
    }
    for path, path_item in spec.get("paths", {}).items():
        for method, operation in path_item.items():
            if method.upper() not in HTTP_METHODS:
                continue
            count += 1
            operation_id = operation.get("operationId")
            if not operation_id:
                raise SystemExit(f"OpenAPI operation is missing operationId: {method.upper()} {path}")
            if operation_id in operation_ids:
                raise SystemExit(f"duplicate OpenAPI operationId: {operation_id}")
            operation_ids.add(operation_id)
            tags = operation.get("tags", [])
            if len(tags) != 1:
                raise SystemExit(f"OpenAPI operation must have exactly one service tag: {method.upper()} {path}")
            route = (tags[0], method.upper(), normalize_public_path(path))
            if route not in routes:
                raise SystemExit(
                    f"OpenAPI operation has no Java endpoint: {method.upper()} {path} "
                    f"({operation_id})"
                )
    return count


def verify_coverage_floor(floor: dict, api_operations: int, ai_operations: int) -> None:
    if api_operations < floor.get("api", 0):
        raise SystemExit(
            f"public OpenAPI coverage fell below its floor: {api_operations} < {floor['api']}"
        )
    if ai_operations < floor.get("ai", 0):
        raise SystemExit(f"AI OpenAPI coverage fell below its floor: {ai_operations} < {floor['ai']}")


def main() -> None:
    snapshots = {path.name: load_json(path) for path in SNAPSHOTS}
    inventory = snapshots["sdk-endpoints.json"]
    expected_services = {
        "agents", "ai", "audit", "auth", "billing", "blob", "connectors", "data",
        "governance", "lineage", "observability", "ontology", "pipelines", "react",
        "sandbox", "schedules", "webhooks", "workflows", "action-runs", "connection-tests",
        "events", "integrations", "invocations", "providers", "webhook-endpoints",
    }
    if set(inventory) != expected_services:
        raise SystemExit("SDK endpoint inventory service list drifted")
    route_count = verify_route_catalog(inventory)
    ai_operation_count = verify_ai_openapi(
        snapshots["ai.openapi.generated.json"], inventory
    )
    public_operation_count = verify_public_api_snapshot(snapshots["api.openapi.json"], inventory)
    verify_coverage_floor(snapshots["coverage-floor.json"], public_operation_count, ai_operation_count)
    print(
        f"validated {route_count} SDK routes, {ai_operation_count} AI OpenAPI operations, "
        f"{public_operation_count} public OpenAPI operations, and {len(SNAPSHOTS)} snapshots"
    )


if __name__ == "__main__":
    main()
