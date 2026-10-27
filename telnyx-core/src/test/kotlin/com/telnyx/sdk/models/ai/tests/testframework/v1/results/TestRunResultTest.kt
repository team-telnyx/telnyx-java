// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.results

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestRunResultTest {

    @Test
    fun create() {
        val testRunResult =
            TestRunResult.builder()
                .id(10119L)
                .agent(1259L)
                .createdAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                .name("Refund escalation flow - run")
                .status("completed")
                .updatedAt(OffsetDateTime.parse("2026-10-13T18:34:05.123456Z"))
                .agentInbound(false)
                .agentName("Support Bot Under Test")
                .completedRunsCount(5L)
                .failedRunsCount(1L)
                .isCronjob(false)
                .metExpectedOutcomeCount(4L)
                .runAsText(false)
                .runType("scheduled")
                .runs(
                    TestRunResult.Runs.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "id" to 0,
                                    "duration" to "duration",
                                    "error_message" to "error_message",
                                    "evaluation_status" to "evaluation_status",
                                    "executed_at" to "executed_at",
                                    "personality_name" to "personality_name",
                                    "scenario" to
                                        mapOf(
                                            "id" to 0,
                                            "expected_outcome_prompt" to "expected_outcome_prompt",
                                            "name" to "name",
                                            "personality_name" to "personality_name",
                                        ),
                                    "scenario_name" to "scenario_name",
                                    "status" to "status",
                                    "success" to true,
                                    "test_profile_name" to "test_profile_name",
                                    "timestamp" to "timestamp",
                                )
                            ),
                        )
                        .build()
                )
                .addScenario(
                    TestRunResult.Scenario.builder()
                        .id(9512L)
                        .name("Refund escalation flow")
                        .build()
                )
                .successRate(0.8)
                .successRunsCount(4L)
                .totalExpectedOutcomeCount(5L)
                .totalRunsCount(5L)
                .build()

        assertThat(testRunResult.id()).isEqualTo(10119L)
        assertThat(testRunResult.agent()).isEqualTo(1259L)
        assertThat(testRunResult.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
        assertThat(testRunResult.name()).isEqualTo("Refund escalation flow - run")
        assertThat(testRunResult.status()).isEqualTo("completed")
        assertThat(testRunResult.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-10-13T18:34:05.123456Z"))
        assertThat(testRunResult.agentInbound()).contains(false)
        assertThat(testRunResult.agentName()).contains("Support Bot Under Test")
        assertThat(testRunResult.completedRunsCount())
            .contains(TestRunResult.CompletedRunsCount.ofInteger(5L))
        assertThat(testRunResult.failedRunsCount())
            .contains(TestRunResult.FailedRunsCount.ofInteger(1L))
        assertThat(testRunResult.isCronjob()).contains(false)
        assertThat(testRunResult.metExpectedOutcomeCount())
            .contains(TestRunResult.MetExpectedOutcomeCount.ofInteger(4L))
        assertThat(testRunResult.runAsText()).contains(false)
        assertThat(testRunResult.runType()).contains("scheduled")
        assertThat(testRunResult.runs())
            .contains(
                TestRunResult.Runs.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "id" to 0,
                                "duration" to "duration",
                                "error_message" to "error_message",
                                "evaluation_status" to "evaluation_status",
                                "executed_at" to "executed_at",
                                "personality_name" to "personality_name",
                                "scenario" to
                                    mapOf(
                                        "id" to 0,
                                        "expected_outcome_prompt" to "expected_outcome_prompt",
                                        "name" to "name",
                                        "personality_name" to "personality_name",
                                    ),
                                "scenario_name" to "scenario_name",
                                "status" to "status",
                                "success" to true,
                                "test_profile_name" to "test_profile_name",
                                "timestamp" to "timestamp",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(testRunResult.scenarios().getOrNull())
            .containsExactly(
                TestRunResult.Scenario.builder().id(9512L).name("Refund escalation flow").build()
            )
        assertThat(testRunResult.successRate()).contains(TestRunResult.SuccessRate.ofNumber(0.8))
        assertThat(testRunResult.successRunsCount())
            .contains(TestRunResult.SuccessRunsCount.ofInteger(4L))
        assertThat(testRunResult.totalExpectedOutcomeCount())
            .contains(TestRunResult.TotalExpectedOutcomeCount.ofInteger(5L))
        assertThat(testRunResult.totalRunsCount())
            .contains(TestRunResult.TotalRunsCount.ofInteger(5L))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testRunResult =
            TestRunResult.builder()
                .id(10119L)
                .agent(1259L)
                .createdAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                .name("Refund escalation flow - run")
                .status("completed")
                .updatedAt(OffsetDateTime.parse("2026-10-13T18:34:05.123456Z"))
                .agentInbound(false)
                .agentName("Support Bot Under Test")
                .completedRunsCount(5L)
                .failedRunsCount(1L)
                .isCronjob(false)
                .metExpectedOutcomeCount(4L)
                .runAsText(false)
                .runType("scheduled")
                .runs(
                    TestRunResult.Runs.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "id" to 0,
                                    "duration" to "duration",
                                    "error_message" to "error_message",
                                    "evaluation_status" to "evaluation_status",
                                    "executed_at" to "executed_at",
                                    "personality_name" to "personality_name",
                                    "scenario" to
                                        mapOf(
                                            "id" to 0,
                                            "expected_outcome_prompt" to "expected_outcome_prompt",
                                            "name" to "name",
                                            "personality_name" to "personality_name",
                                        ),
                                    "scenario_name" to "scenario_name",
                                    "status" to "status",
                                    "success" to true,
                                    "test_profile_name" to "test_profile_name",
                                    "timestamp" to "timestamp",
                                )
                            ),
                        )
                        .build()
                )
                .addScenario(
                    TestRunResult.Scenario.builder()
                        .id(9512L)
                        .name("Refund escalation flow")
                        .build()
                )
                .successRate(0.8)
                .successRunsCount(4L)
                .totalExpectedOutcomeCount(5L)
                .totalRunsCount(5L)
                .build()

        val roundtrippedTestRunResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testRunResult),
                jacksonTypeRef<TestRunResult>(),
            )

        assertThat(roundtrippedTestRunResult).isEqualTo(testRunResult)
    }
}
