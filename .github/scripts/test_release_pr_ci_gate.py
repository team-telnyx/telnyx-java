#!/usr/bin/env python3
"""Static contracts for DOT-2061 Java phase 2."""
import unittest
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]


class JavaReleasePRGateTests(unittest.TestCase):
    def test_classifier_owns_every_full_ci_job(self):
        ci = (ROOT / ".github/workflows/ci.yml").read_text(encoding="utf-8")
        self.assertIn("name: classify production CI", ci)
        self.assertIn("classify_production_ci.py --event-path", ci)
        self.assertNotIn('>> "$GITHUB_OUTPUT"', ci)
        self.assertEqual(ci.count("needs: classify-production-ci"), 3)
        self.assertEqual(ci.count("needs: [classify-production-ci, test-shard]"), 1)
        self.assertEqual(
            ci.count("needs.classify-production-ci.outputs.run_full == 'true'"), 4
        )
        for test in (
            "test_release_pr_auto_merge.py",
            "test_release_pr_ci_gate.py",
            "test_classify_production_ci.py",
            "test_validate_next_provenance.py",
            "test_maven_publication_guard.py",
        ):
            self.assertIn(test, ci)
        self.assertIn("-Dorg.gradle.jvmargs=\"-Xmx12g", ci)
        self.assertIn("-Pkotlin.compiler.execution.strategy=in-process", ci)
        self.assertNotIn("-Dorg.gradle.jvmargs=\"-Xmx8g", ci)

    def test_next_readiness_is_lightweight_and_fail_closed(self):
        workflow = (ROOT / ".github/workflows/next-readiness.yml").read_text(encoding="utf-8")
        self.assertIn("branches: [next]", workflow)
        self.assertIn("name: next-readiness", workflow)
        self.assertIn("validate_next_provenance.py", workflow)
        self.assertIn("--expected-next", workflow)
        self.assertIn("MERGE_TOKEN: ${{ secrets.SDK_WRITE_TOKEN }}", workflow)
        self.assertIn("persist-credentials: false", workflow)
        self.assertNotIn("./scripts/build", workflow)
        self.assertNotIn("./gradlew", workflow)

    def test_publication_workflow_verifies_exact_maven_inventory(self):
        workflow = (ROOT / ".github/workflows/publish-sonatype.yml").read_text(encoding="utf-8")
        guard = (ROOT / ".github/scripts/maven_publication_guard.py").read_text(encoding="utf-8")
        self.assertIn("maven_publication_guard.py preflight", workflow)
        self.assertIn("maven_publication_guard.py postflight", workflow)
        self.assertIn("Verify complete Maven Central publication", workflow)
        self.assertIn('MAVEN_BASE = "https://repo1.maven.org/maven2/com/telnyx/sdk"', guard)
        for module in ("telnyx", "telnyx-client-okhttp", "telnyx-core", "telnyx-lib", "telnyx-websocket"):
            self.assertIn(f'"{module}"', guard)

    def test_readiness_remains_trusted_dry_run(self):
        workflow = (ROOT / ".github/workflows/release-pr-readiness.yml").read_text(encoding="utf-8")
        self.assertIn("pull_request_target:", workflow)
        self.assertIn("default_branch || 'master'", workflow)
        self.assertIn("persist-credentials: false", workflow)
        self.assertIn("--expected-head", workflow)
        self.assertIn("--dry-run", workflow)
        self.assertNotIn("--merge", workflow)

    def test_release_please_does_not_dispatch_disabled_auto_merge(self):
        workflow = (ROOT / ".github/workflows/release-please.yml").read_text(encoding="utf-8")
        self.assertNotIn("release-pr-auto-merge.yml", workflow)
        self.assertNotIn("Dispatch exact-head release PR gate", workflow)


if __name__ == "__main__":
    unittest.main()
