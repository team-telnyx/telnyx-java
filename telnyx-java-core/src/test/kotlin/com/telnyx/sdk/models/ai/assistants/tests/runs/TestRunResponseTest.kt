// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestRunResponseTest {

    @Test
    fun create() {
        val testRunResponse =
            TestRunResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .runId("987fcdeb-51a2-43d1-b456-426614174000")
                .status(TestStatus.PENDING)
                .testId("123e4567-e89b-12d3-a456-426614174000")
                .triggeredBy("triggered_by")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .conversationId("conversation_id")
                .conversationInsightsId("conversation_insights_id")
                .addDetailStatus(
                    TestRunResponse.DetailStatus.builder()
                        .name("name")
                        .status(TestStatus.PENDING)
                        .build()
                )
                .logs("logs")
                .testSuiteRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(testRunResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(testRunResponse.runId()).isEqualTo("987fcdeb-51a2-43d1-b456-426614174000")
        assertThat(testRunResponse.status()).isEqualTo(TestStatus.PENDING)
        assertThat(testRunResponse.testId()).isEqualTo("123e4567-e89b-12d3-a456-426614174000")
        assertThat(testRunResponse.triggeredBy()).isEqualTo("triggered_by")
        assertThat(testRunResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(testRunResponse.conversationId()).contains("conversation_id")
        assertThat(testRunResponse.conversationInsightsId()).contains("conversation_insights_id")
        assertThat(testRunResponse.detailStatus().getOrNull())
            .containsExactly(
                TestRunResponse.DetailStatus.builder()
                    .name("name")
                    .status(TestStatus.PENDING)
                    .build()
            )
        assertThat(testRunResponse.logs()).contains("logs")
        assertThat(testRunResponse.testSuiteRunId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(testRunResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testRunResponse =
            TestRunResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .runId("987fcdeb-51a2-43d1-b456-426614174000")
                .status(TestStatus.PENDING)
                .testId("123e4567-e89b-12d3-a456-426614174000")
                .triggeredBy("triggered_by")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .conversationId("conversation_id")
                .conversationInsightsId("conversation_insights_id")
                .addDetailStatus(
                    TestRunResponse.DetailStatus.builder()
                        .name("name")
                        .status(TestStatus.PENDING)
                        .build()
                )
                .logs("logs")
                .testSuiteRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTestRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testRunResponse),
                jacksonTypeRef<TestRunResponse>(),
            )

        assertThat(roundtrippedTestRunResponse).isEqualTo(testRunResponse)
    }
}
