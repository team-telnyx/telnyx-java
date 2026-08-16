#!/usr/bin/env python3
"""Fail-closed Maven Central publication state guard for Telnyx Java releases."""

from __future__ import annotations

import argparse
import dataclasses
import json
import re
import sys
import time
import urllib.error
import urllib.request
from typing import Callable, Optional, Sequence, Tuple

MAVEN_BASE = "https://repo1.maven.org/maven2/com/telnyx/sdk"
MODULES = (
    "telnyx",
    "telnyx-client-okhttp",
    "telnyx-core",
    "telnyx-lib",
)
PRIMARY_SUFFIXES = (
    ".jar",
    "-sources.jar",
    "-javadoc.jar",
    ".module",
    ".pom",
)
VERSION_RE = re.compile(r"^[0-9]+\.[0-9]+\.[0-9]+$")


class GuardError(RuntimeError):
    """A deterministic fail-closed publication guard failure."""


class ProbeError(GuardError):
    """Maven Central could not be inspected authoritatively."""


@dataclasses.dataclass(frozen=True)
class CoordinateState:
    version: str
    present: Tuple[str, ...]
    missing: Tuple[str, ...]

    @property
    def classification(self) -> str:
        if not self.present:
            return "absent"
        if not self.missing:
            return "complete"
        return "partial"


def expected_urls(version: str) -> Tuple[str, ...]:
    if not VERSION_RE.fullmatch(version):
        raise GuardError("invalid release version: %s" % version)
    urls = []
    for module in MODULES:
        prefix = "%s/%s/%s/%s-%s" % (MAVEN_BASE, module, version, module, version)
        for suffix in PRIMARY_SUFFIXES:
            artifact = prefix + suffix
            urls.extend((artifact, artifact + ".asc", artifact + ".sigstore.json"))
    return tuple(urls)


def http_probe(url: str, timeout_seconds: int = 20) -> bool:
    request = urllib.request.Request(
        url,
        method="HEAD",
        headers={"User-Agent": "telnyx-java-maven-publication-guard/1"},
    )
    try:
        with urllib.request.urlopen(request, timeout=timeout_seconds) as response:
            return 200 <= response.status < 300
    except urllib.error.HTTPError as error:
        if error.code == 404:
            return False
        raise ProbeError("Maven Central probe failed for %s: HTTP %s" % (url, error.code)) from error
    except urllib.error.URLError as error:
        raise ProbeError("Maven Central probe failed for %s: %s" % (url, error.reason)) from error


def inspect_version(version: str, probe: Callable[[str], bool] = http_probe) -> CoordinateState:
    present = []
    missing = []
    for url in expected_urls(version):
        if probe(url):
            present.append(url)
        else:
            missing.append(url)
    return CoordinateState(version, tuple(present), tuple(missing))


def _inventory_message(state: CoordinateState) -> str:
    return (
        "Maven Central version %s is partially published; refusing an immutable-coordinate retry.\n"
        "Present (%d):\n%s\nMissing (%d):\n%s"
        % (
            state.version,
            len(state.present),
            "\n".join(state.present),
            len(state.missing),
            "\n".join(state.missing),
        )
    )


def require_publishable(state: CoordinateState) -> None:
    if state.classification == "partial":
        raise GuardError(_inventory_message(state))


def wait_for_complete(
    version: str,
    probe: Callable[[str], bool] = http_probe,
    attempts: int = 20,
    interval_seconds: int = 30,
    sleep: Callable[[float], None] = time.sleep,
) -> CoordinateState:
    if attempts < 1:
        raise GuardError("attempts must be at least 1")
    state: Optional[CoordinateState] = None
    for attempt in range(attempts):
        state = inspect_version(version, probe)
        if state.classification == "complete":
            return state
        if state.classification == "partial" and attempt + 1 == attempts:
            raise GuardError(_inventory_message(state))
        if attempt + 1 < attempts:
            sleep(interval_seconds)
    assert state is not None
    raise GuardError(
        "Maven Central version %s is absent after %d authoritative checks; "
        "no expected coordinates were published" % (version, attempts)
    )


def _write_github_output(path: Optional[str], key: str, value: str) -> None:
    if not path:
        return
    with open(path, "a", encoding="utf-8") as output:
        output.write("%s=%s\n" % (key, value))


def _build_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser()
    subparsers = parser.add_subparsers(dest="command", required=True)

    preflight = subparsers.add_parser("preflight")
    preflight.add_argument("version")
    preflight.add_argument("--github-output")

    postflight = subparsers.add_parser("postflight")
    postflight.add_argument("version")
    postflight.add_argument("--attempts", type=int, default=20)
    postflight.add_argument("--interval-seconds", type=int, default=30)
    return parser


def main(argv: Optional[Sequence[str]] = None) -> int:
    args = _build_parser().parse_args(argv)
    if args.command == "preflight":
        state = inspect_version(args.version)
        require_publishable(state)
        needs_publish = state.classification == "absent"
        _write_github_output(args.github_output, "needs_publish", str(needs_publish).lower())
        print(json.dumps({"version": args.version, "state": state.classification, "needs_publish": needs_publish}))
        return 0

    state = wait_for_complete(
        args.version,
        attempts=args.attempts,
        interval_seconds=args.interval_seconds,
    )
    print(json.dumps({"version": args.version, "state": state.classification, "artifacts": len(state.present)}))
    return 0


if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except GuardError as error:
        print("publication guard: %s" % error, file=sys.stderr)
        raise SystemExit(1)
