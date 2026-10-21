#!/usr/bin/env python3
"""Static contracts for DOT-2061 Java phase 2."""
import unittest
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]


class JavaReleasePRGateTests(unittest.TestCase):
    def test_codeql_compiles_kotlin_with_pinned_jdk_without_caches(self):
        path = ROOT / ".github/workflows/codeql.yml"
        self.assertTrue(path.is_file(), "Production needs an explicit CodeQL workflow")
        workflow = path.read_text(encoding="utf-8")
        for contract in (
            "name: Analyze (${{ matrix.language }})",
            "language: actions", "language: java-kotlin", "build-mode: manual",
            "java-version: '21'", "distribution: temurin",
            "./gradlew clean classes", "--no-build-cache", "--no-configuration-cache",
            "--rerun-tasks", "--no-parallel", "--max-workers=1",
            "-Pkotlin.compiler.execution.strategy=in-process",
            "-Pkotlin.incremental=false", "persist-credentials: false",
            "security-events: write", "branches: [master, next]",
        ):
            with self.subTest(contract=contract):
                self.assertIn(contract, workflow)
        self.assertNotIn("autobuild", workflow)
        self.assertNotIn("cache: gradle", workflow)
        self.assertNotIn("pull_request_target", workflow)

    def test_codeql_uses_established_hosted_compiler_memory_budget(self):
        workflow = (ROOT / ".github/workflows/codeql.yml").read_text(encoding="utf-8")
        ci = (ROOT / ".github/workflows/ci.yml").read_text(encoding="utf-8")
        # The same source tree compiles in CI at 12GiB; 8GiB exhausts the
        # Kotlin psi2ir heap even without CodeQL tracing.
        budget = '-Dorg.gradle.jvmargs="-Xmx12g -XX:MaxMetaspaceSize=1g -Dfile.encoding=UTF-8"'
        self.assertIn(budget, ci)
        self.assertIn(budget, workflow)
        self.assertIn("runs-on: ubuntu-latest", workflow)
        self.assertIn("-Pkotlin.compiler.execution.strategy=in-process", workflow)
        self.assertIn("--max-workers=1", workflow)
        self.assertNotIn("-Xmx8g", workflow)

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
