import sys
import unittest
from pathlib import Path

SCRIPT_DIR = Path(__file__).resolve().parent
REPOSITORY_ROOT = SCRIPT_DIR.parents[1]
PUBLISH_WORKFLOW = REPOSITORY_ROOT / ".github/workflows/publish-sonatype.yml"
sys.path.insert(0, str(SCRIPT_DIR))

import maven_publication_guard as guard


class MavenPublicationGuardTest(unittest.TestCase):
    def setUp(self):
        self.version = "6.86.0"
        self.urls = guard.expected_urls(self.version)

    def test_absent_version_may_publish(self):
        state = guard.inspect_version(self.version, lambda _url: False)
        self.assertEqual("absent", state.classification)
        self.assertEqual(0, len(state.present))
        self.assertEqual(len(self.urls), len(state.missing))

    def test_complete_version_is_idempotent_success(self):
        state = guard.inspect_version(self.version, lambda _url: True)
        self.assertEqual("complete", state.classification)
        self.assertEqual(len(self.urls), len(state.present))
        self.assertEqual(0, len(state.missing))

    def test_partial_version_fails_closed_with_exact_inventory(self):
        first = self.urls[0]
        state = guard.inspect_version(self.version, lambda url: url == first)
        self.assertEqual("partial", state.classification)
        self.assertEqual((first,), state.present)
        self.assertIn(self.urls[1], state.missing)
        with self.assertRaisesRegex(guard.GuardError, "partially published") as caught:
            guard.require_publishable(state)
        self.assertIn(first, str(caught.exception))
        self.assertIn(self.urls[1], str(caught.exception))

    def test_wait_for_complete_retries_absent_state(self):
        calls = {"count": 0}

        def probe(_url):
            return calls["count"] >= 1

        def sleep(_seconds):
            calls["count"] += 1

        state = guard.wait_for_complete(
            self.version,
            probe,
            attempts=2,
            interval_seconds=0,
            sleep=sleep,
        )
        self.assertEqual("complete", state.classification)
        self.assertEqual(1, calls["count"])

    def test_wait_for_complete_rejects_partial_terminal_state(self):
        first = self.urls[0]
        with self.assertRaisesRegex(guard.GuardError, "partially published"):
            guard.wait_for_complete(
                self.version,
                lambda url: url == first,
                attempts=1,
                interval_seconds=0,
                sleep=lambda _seconds: None,
            )

    def test_network_failure_is_not_treated_as_absence(self):
        def probe(_url):
            raise guard.ProbeError("HTTP 503")

        with self.assertRaisesRegex(guard.ProbeError, "HTTP 503"):
            guard.inspect_version(self.version, probe)

    def test_version_must_be_exact_semver(self):
        for invalid in ("v6.86.0", "6.86", "6.86.0-SNAPSHOT", "../6.86.0"):
            with self.subTest(invalid=invalid):
                with self.assertRaisesRegex(guard.GuardError, "invalid release version"):
                    guard.expected_urls(invalid)

    def test_inventory_has_all_published_java_modules(self):
        self.assertEqual(
            (
                "telnyx",
                "telnyx-client-okhttp",
                "telnyx-core",
                "telnyx-lib",
                "telnyx-websocket",
            ),
            guard.MODULES,
        )

    def test_each_module_requires_primary_artifacts_signatures_and_sigstore_bundles(self):
        for module in guard.MODULES:
            prefix = f"{guard.MAVEN_BASE}/{module}/{self.version}/{module}-{self.version}"
            for suffix in guard.PRIMARY_SUFFIXES:
                with self.subTest(module=module, suffix=suffix):
                    self.assertIn(prefix + suffix, self.urls)
                    self.assertIn(prefix + suffix + ".asc", self.urls)
                    self.assertIn(prefix + suffix + ".sigstore.json", self.urls)

    def test_publish_workflow_bounds_memory_and_runtime(self):
        workflow = PUBLISH_WORKFLOW.read_text(encoding="utf-8")
        self.assertIn("runs-on: ubuntu-latest", workflow)
        self.assertIn("timeout-minutes: 60", workflow)
        self.assertIn("-Xmx8g", workflow)
        self.assertIn("-Pkotlin.compiler.execution.strategy=in-process", workflow)
        self.assertIn("--no-daemon", workflow)

    def test_manual_recovery_uses_trusted_policy_and_attested_tag_source(self):
        workflow = PUBLISH_WORKFLOW.read_text(encoding="utf-8")
        self.assertIn('ref: master', workflow)
        self.assertIn('path: trusted-policy', workflow)
        self.assertIn('git merge-base --is-ancestor "${TAG_SHA}" origin/master', workflow)
        self.assertIn('ref: ${{ steps.source.outputs.sha }}', workflow)
        self.assertIn('working-directory: release-source', workflow)
        self.assertIn('GITHUB_EVENT_NAME', workflow)
        self.assertIn('refs/heads/master', workflow)

    def test_publish_workflow_preflights_and_postflights_immutable_coordinates(self):
        workflow = PUBLISH_WORKFLOW.read_text(encoding="utf-8")
        self.assertIn("maven_publication_guard.py preflight", workflow)
        self.assertIn("maven_publication_guard.py postflight", workflow)
        self.assertIn("needs_publish == 'true'", workflow)
        self.assertIn("All immutable coordinates already exist; retry is an idempotent no-op.", workflow)
        self.assertIn("POSTFLIGHT_OUTCOME", workflow)


if __name__ == "__main__":
    unittest.main()
