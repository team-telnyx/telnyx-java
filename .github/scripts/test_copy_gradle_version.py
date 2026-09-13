#!/usr/bin/env python3
from pathlib import Path
import subprocess
import tempfile
import unittest
import re

SCRIPT = Path(__file__).with_name("copy_gradle_version.py")


def readme_fixture():
    text = (SCRIPT.resolve().parents[2] / "README.md").read_text()
    match = re.search(r"<version>([0-9]+\.[0-9]+\.[0-9]+)</version>", text)
    assert match is not None
    version = match.group(1)
    # Keep the test fixture stable as the repository's release version changes.
    return text.replace(version, "6.92.0")


class CopyGradleVersionTests(unittest.TestCase):
    def test_only_marked_root_version_is_copied(self):
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            release = root / "release.gradle.kts"
            target = root / "target.gradle.kts"
            release.write_text(
                'version = "6.92.0" // x-release-please-version\ndependencies { implementation("stale:dep:1") }\n'
            )
            target.write_text(
                'version = "6.91.0" // x-release-please-version\ndependencies {}\n'
            )
            subprocess.run(
                ["python3", str(SCRIPT), str(release), str(target)], check=True
            )
            self.assertEqual(
                target.read_text(),
                'version = "6.92.0" // x-release-please-version\ndependencies {}\n',
            )

    def test_ambiguous_or_malformed_version_fails_closed(self):
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            release = root / "release.gradle.kts"
            target = root / "target.gradle.kts"
            target.write_text('version = "6.91.0" // x-release-please-version\n')
            for payload in (
                "plugins {}\n",
                'version = "v6.92" // x-release-please-version\n',
                'version = "6.92.0" // x-release-please-version\nversion = "6.93.0" // x-release-please-version\n',
            ):
                release.write_text(payload)
                with self.subTest(payload=payload):
                    self.assertNotEqual(
                        subprocess.run(
                            ["python3", str(SCRIPT), str(release), str(target)]
                        ).returncode,
                        0,
                    )


class ReadmeVersionTests(unittest.TestCase):
    def test_readme_invalid_shapes_leave_target_unchanged(self):
        baseline = readme_fixture().encode()
        malformed = (
            baseline.replace(
                b"<artifactId>telnyx</artifactId>", b"<artifactId>unknown</artifactId>"
            ),
            baseline.replace(
                b"<!-- x-release-please-start-version -->", b"<!-- unknown -->", 1
            ),
            baseline + b'\nimplementation("com.telnyx.sdk:telnyx:1.2.3")\n',
            baseline.replace(b"<version>", b"<version>bad-", 1),
            baseline.replace(
                b"<version>6.92.0</version>", b"<version>1.2.3</version>", 1
            ),
        )
        with tempfile.TemporaryDirectory() as directory:
            release = Path(directory) / "release.md"
            target = Path(directory) / "target.md"
            for payload in malformed:
                for invalid_side in ("source", "target"):
                    with self.subTest(payload=payload[:50], invalid_side=invalid_side):
                        release.write_bytes(
                            payload if invalid_side == "source" else baseline
                        )
                        original = baseline if invalid_side == "source" else payload
                        target.write_bytes(original)
                        result = subprocess.run(
                            [
                                "python3",
                                str(SCRIPT),
                                "--readme",
                                str(release),
                                str(target),
                            ],
                            capture_output=True,
                        )
                        self.assertNotEqual(result.returncode, 0)
                        self.assertEqual(target.read_bytes(), original)

    def test_readme_overlay_preserves_bytes_even_inside_markers(self):
        baseline = readme_fixture().encode()
        prose = b"Extra docs: dependency 1.2.3; Unicode \xe2\x9c\x93\n"
        target_bytes = (
            baseline.replace(b"6.92.0", b"6.80.0")
            .replace(b"### Maven\n", b"### Maven\n" + prose)
            .replace(b"\n", b"\r\n")
            + prose
        )
        expected = (
            baseline.replace(b"### Maven\n", b"### Maven\n" + prose).replace(
                b"\n", b"\r\n"
            )
            + prose
        )
        with tempfile.TemporaryDirectory() as directory:
            release = Path(directory) / "release.md"
            target = Path(directory) / "target.md"
            release.write_bytes(baseline)
            target.write_bytes(target_bytes)
            subprocess.run(
                ["python3", str(SCRIPT), "--readme", str(release), str(target)],
                check=True,
            )
            self.assertEqual(target.read_bytes(), expected)

    def test_scan_preserves_next_prose(self):
        import shutil
        import textwrap

        repo = SCRIPT.resolve().parents[2]
        baseline = (repo / "README.md").read_text()
        next_readme = (
            baseline.replace("6.92.0", "6.80.0")
            + "\n## MCP Server\nArbitrary new prose, version 1.2.3.\n"
        )
        workflow = (repo / ".github/workflows/release-please.yml").read_text()
        scan = workflow.split("          RELEASE_FILES=", 1)[1].split(
            "          SCAN_TREE=", 1
        )[0]
        scan = textwrap.dedent("          RELEASE_FILES=" + scan)
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)

            def git(*args):
                subprocess.run(
                    ["git", *args], cwd=root, check=True, capture_output=True
                )

            git("init", "-q")
            git("config", "user.email", "test@example.com")
            git("config", "user.name", "Test")
            for name in (
                "README.md",
                "build.gradle.kts",
                "CHANGELOG.md",
                ".release-please-manifest.json",
            ):
                shutil.copy(repo / name, root / name)
            git("add", ".")
            git("commit", "-qm", "base")
            git("update-ref", "refs/remotes/origin/release-base", "HEAD")
            (root / "README.md").write_text(next_readme)
            git("add", "README.md")
            (root / ".github/scripts").mkdir(parents=True)
            shutil.copy(SCRIPT, root / ".github/scripts" / SCRIPT.name)
            subprocess.run(["bash", "-e", "-c", scan], cwd=root, check=True)
            expected = (
                baseline + "\n## MCP Server\nArbitrary new prose, version 1.2.3.\n"
            )
            self.assertEqual((root / "README.md").read_text(), expected)
            self.assertEqual(
                subprocess.check_output(
                    ["git", "show", ":README.md"], cwd=root
                ).decode(),
                expected,
            )

            # Execute the final metadata restoration too: its source README has
            # stale prose, while the freshly tree-replaced target belongs to next.
            stash = root / "release-files"
            stash.mkdir()
            for name in (
                "README.md",
                "build.gradle.kts",
                "CHANGELOG.md",
                ".release-please-manifest.json",
            ):
                shutil.copy(repo / name, stash / name)
            (root / "README.md").write_text(next_readme)
            final = workflow.split(
                "          # Restore release metadata from Release Please.", 1
            )[1].split('          rm -rf "$STASH_DIR"', 1)[0]
            final = textwrap.dedent(
                "          # Restore release metadata from Release Please." + final
            )
            import os

            subprocess.run(
                ["bash", "-e", "-c", final],
                cwd=root,
                env={**os.environ, "STASH_DIR": str(stash)},
                check=True,
            )
            self.assertEqual((root / "README.md").read_text(), expected)
            self.assertEqual(
                subprocess.check_output(
                    ["git", "show", ":README.md"], cwd=root
                ).decode(),
                expected,
            )


if __name__ == "__main__":
    unittest.main()
