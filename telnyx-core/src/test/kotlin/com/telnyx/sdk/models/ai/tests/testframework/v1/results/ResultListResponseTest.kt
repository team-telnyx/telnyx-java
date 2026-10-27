// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.results

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResultListResponseTest {

    @Test
    fun create() {
        val resultListResponse =
            ResultListResponse.builder()
                .next(null)
                .previous(null)
                .addResult(
                    ResultListResponse.Result.builder()
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
                        .addRun(
                            ResultListResponse.Result.Run.builder()
                                .id(0L)
                                .inboundNumber("inbound_number")
                                .number("number")
                                .scenario(0L)
                                .scenarioName("scenario_name")
                                .status("status")
                                .build()
                        )
                        .addScenario(
                            ResultListResponse.Result.Scenario.builder()
                                .id(9512L)
                                .name("Refund escalation flow")
                                .build()
                        )
                        .successRate(0.8)
                        .successRunsCount(4L)
                        .totalExpectedOutcomeCount(5L)
                        .totalRunsCount(5L)
                        .build()
                )
                .count(1L)
                .build()

        assertThat(resultListResponse.next()).isEmpty
        assertThat(resultListResponse.previous()).isEmpty
        assertThat(resultListResponse.results())
            .containsExactly(
                ResultListResponse.Result.builder()
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
                    .addRun(
                        ResultListResponse.Result.Run.builder()
                            .id(0L)
                            .inboundNumber("inbound_number")
                            .number("number")
                            .scenario(0L)
                            .scenarioName("scenario_name")
                            .status("status")
                            .build()
                    )
                    .addScenario(
                        ResultListResponse.Result.Scenario.builder()
                            .id(9512L)
                            .name("Refund escalation flow")
                            .build()
                    )
                    .successRate(0.8)
                    .successRunsCount(4L)
                    .totalExpectedOutcomeCount(5L)
                    .totalRunsCount(5L)
                    .build()
            )
        assertThat(resultListResponse.count()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resultListResponse =
            ResultListResponse.builder()
                .next(null)
                .previous(null)
                .addResult(
                    ResultListResponse.Result.builder()
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
                        .addRun(
                            ResultListResponse.Result.Run.builder()
                                .id(0L)
                                .inboundNumber("inbound_number")
                                .number("number")
                                .scenario(0L)
                                .scenarioName("scenario_name")
                                .status("status")
                                .build()
                        )
                        .addScenario(
                            ResultListResponse.Result.Scenario.builder()
                                .id(9512L)
                                .name("Refund escalation flow")
                                .build()
                        )
                        .successRate(0.8)
                        .successRunsCount(4L)
                        .totalExpectedOutcomeCount(5L)
                        .totalRunsCount(5L)
                        .build()
                )
                .count(1L)
                .build()

        val roundtrippedResultListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resultListResponse),
                jacksonTypeRef<ResultListResponse>(),
            )

        assertThat(roundtrippedResultListResponse).isEqualTo(resultListResponse)
    }
}
