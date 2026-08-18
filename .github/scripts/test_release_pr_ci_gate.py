#!/usr/bin/env python3
import unittest
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]


class JavaGateTests(unittest.TestCase):
    def test_phase1_duplicate_full_suites_retained(self):
        workflow = (ROOT / ".github/workflows/ci.yml").read_text()
        for job in ("lint:", "build:", "test:"):
            with self.subTest(job=job):
                self.assertIn(job, workflow)
        self.assertNotIn("classify production CI", workflow)

    def test_readiness_is_trusted_and_dry_run(self):
        workflow = (ROOT / ".github/workflows/release-pr-readiness.yml").read_text()
        self.assertIn("pull_request_target:", workflow)
        self.assertIn("github.event.repository.default_branch || 'master'", workflow)
        self.assertIn("--dry-run", workflow)
        self.assertNotIn("--merge", workflow)
        self.assertIn("ref: ${{ github.event.repository.default_branch || 'master' }}", workflow)


if __name__ == "__main__":
    unittest.main()
