#!/usr/bin/env python3
"""Overlay release versions onto next's Gradle state or (--readme) README prose."""

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


# Only these three README values belong to release policy. Never copy prose,
# even prose inside a release-please marker block.
README_PATTERNS = (
    re.compile(
        r"https://central\.sonatype\.com/artifact/com\.telnyx\.sdk/telnyx/(?P<version>[^)]*)\)"
    ),
    re.compile(r'implementation\("com\.telnyx\.sdk:telnyx:(?P<version>[^"]*)"\)'),
    re.compile(
        r"<groupId>com\.telnyx\.sdk</groupId>\s*<artifactId>telnyx</artifactId>\s*<version>(?P<version>[^<]*)</version>"
    ),
)


def readme_slots(text: str, label: str) -> list[re.Match[str]]:
    start = "<!-- x-release-please-start-version -->"
    end = "<!-- x-release-please-end -->"
    regions = list(
        re.finditer(re.escape(start) + r"(.*?)" + re.escape(end), text, re.S)
    )
    if text.count(start) != 2 or text.count(end) != 2 or len(regions) != 2:
        fail("%s must contain exactly two balanced release-version regions" % label)
    slots = []
    for pattern in README_PATTERNS:
        matches = list(pattern.finditer(text))
        if len(matches) != 1:
            fail(
                "%s must contain exactly one of each recognized README version slot"
                % label
            )
        match = matches[0]
        if not VERSION_RE.fullmatch(match.group("version")):
            fail("%s contains a malformed README release version" % label)
        if not any(
            region.start(1) <= match.start() and match.end() <= region.end(1)
            for region in regions
        ):
            fail("%s contains an unmarked README version slot" % label)
        slots.append(match)
    if len({match.group("version") for match in slots}) != 1:
        fail("%s contains inconsistent README release versions" % label)
    return slots


def copy_readme(release_path: Path, target_path: Path) -> int:
    # Decode bytes directly so all non-version bytes (including CRLF) survive.
    release_text = release_path.read_bytes().decode("utf-8")
    target_text = target_path.read_bytes().decode("utf-8")
    version = readme_slots(release_text, "release README")[0].group("version")
    slots = readme_slots(target_text, "target README")
    updated = target_text
    for match in sorted(slots, key=lambda match: match.start("version"), reverse=True):
        updated = (
            updated[: match.start("version")]
            + version
            + updated[match.end("version") :]
        )
    readme_slots(updated, "updated README")
    target_path.write_bytes(updated.encode("utf-8"))
    return 0


def main() -> int:
    if len(sys.argv) == 4 and sys.argv[1] == "--readme":
        return copy_readme(Path(sys.argv[2]), Path(sys.argv[3]))
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
