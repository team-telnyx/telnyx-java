#!/usr/bin/env python3
from pathlib import Path
import subprocess
import tempfile
import unittest

SCRIPT = Path(__file__).with_name("copy_gradle_version.py")

class CopyGradleVersionTests(unittest.TestCase):
    def test_only_marked_root_version_is_copied(self):
        with tempfile.TemporaryDirectory() as directory:
            root=Path(directory); release=root/"release.gradle.kts"; target=root/"target.gradle.kts"
            release.write_text('version = "6.92.0" // x-release-please-version\ndependencies { implementation("stale:dep:1") }\n')
            target.write_text('version = "6.91.0" // x-release-please-version\ndependencies {}\n')
            subprocess.run(["python3",str(SCRIPT),str(release),str(target)],check=True)
            self.assertEqual(target.read_text(),'version = "6.92.0" // x-release-please-version\ndependencies {}\n')

    def test_ambiguous_or_malformed_version_fails_closed(self):
        with tempfile.TemporaryDirectory() as directory:
            root=Path(directory); release=root/"release.gradle.kts"; target=root/"target.gradle.kts"
            target.write_text('version = "6.91.0" // x-release-please-version\n')
            for payload in ('plugins {}\n','version = "v6.92" // x-release-please-version\n','version = "6.92.0" // x-release-please-version\nversion = "6.93.0" // x-release-please-version\n'):
                release.write_text(payload)
                with self.subTest(payload=payload):
                    self.assertNotEqual(subprocess.run(["python3",str(SCRIPT),str(release),str(target)]).returncode,0)

if __name__ == "__main__": unittest.main()
