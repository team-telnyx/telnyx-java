#!/usr/bin/env python3
"""Copy only Release Please's marked root Gradle version onto generated state."""
from __future__ import annotations

from pathlib import Path
import re
import sys

VERSION_RE = re.compile(r"^[0-9]+\.[0-9]+\.[0-9]+$")
LINE_RE = re.compile(
    r'(?m)^(?P<prefix>\s*version\s*=\s*")(?P<version>[^"]+)'
    r'(?P<suffix>"\s*//\s*x-release-please-version\s*)$'
)


def fail(message: str) -> "None":
    raise SystemExit(message)


def extract(text: str, label: str) -> tuple[re.Match[str], str]:
    matches = list(LINE_RE.finditer(text))
    if len(matches) != 1:
        fail("%s must contain exactly one marked root version" % label)
    version = matches[0].group("version")
    if not VERSION_RE.fullmatch(version):
        fail("%s contains a malformed release version" % label)
    return matches[0], version


def main() -> int:
    if len(sys.argv) != 3:
        fail("usage: copy_gradle_version.py RELEASE_BUILD TARGET_BUILD")
    release_path, target_path = map(Path, sys.argv[1:])
    try:
        release_text = release_path.read_text(encoding="utf-8")
        target_text = target_path.read_text(encoding="utf-8")
    except (OSError, UnicodeError) as exc:
        fail("could not read Gradle build files: %s" % exc)
    _, release_version = extract(release_text, "release build")
    target_match, _ = extract(target_text, "target build")
    updated = (
        target_text[: target_match.start()]
        + target_match.group("prefix")
        + release_version
        + target_match.group("suffix")
        + target_text[target_match.end() :]
    )
    extract(updated, "updated target build")
    target_path.write_text(updated, encoding="utf-8")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
