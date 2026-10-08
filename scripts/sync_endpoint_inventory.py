#!/usr/bin/env python3
"""Add public OpenAPI operations to the shared SDK route inventory."""

import json
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
INVENTORY = ROOT / "contracts/sdk-endpoints.json"
PUBLIC_SPEC = ROOT / "contracts/openapi/api.openapi.json"
HTTP_METHODS = {"GET", "POST", "PUT", "PATCH", "DELETE", "HEAD", "OPTIONS"}


def normalize_path(path: str) -> str:
    if path.startswith("/v1/"):
        path = path[3:]
    elif path == "/v1":
        path = "/"
    return re.sub(r"\{[^{}]+\}", "{param}", path)


def main() -> None:
    inventory = json.loads(INVENTORY.read_text(encoding="utf-8"))
    spec = json.loads(PUBLIC_SPEC.read_text(encoding="utf-8"))
    additions = 0

    for path, path_item in spec.get("paths", {}).items():
        for method, operation in path_item.items():
            method = method.upper()
            if method not in HTTP_METHODS:
                continue
            tags = operation.get("tags", [])
            if len(tags) != 1:
                raise SystemExit(f"Expected one service tag for {method} {path}")
            service = tags[0]
            if service not in inventory:
                inventory[service] = []
            route = {"method": method, "path": normalize_path(path)}
            if route not in inventory[service]:
                inventory[service].append(route)
                additions += 1

    for routes in inventory.values():
        routes.sort(key=lambda route: (route["method"], route["path"]))
    INVENTORY.write_text(json.dumps(inventory, indent=2) + "\n", encoding="utf-8")
    print(f"added {additions} public OpenAPI operations to the SDK route inventory")


if __name__ == "__main__":
    main()
