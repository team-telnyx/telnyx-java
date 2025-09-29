// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.tests.testsuites.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.ai.assistants.tests.runs.TestRunResponse
import com.telnyx.api.models.ai.assistants.tests.runs.TestStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginatedTestRunListTest {

    @Test
    fun create() {
        val paginatedTestRunList =
            PaginatedTestRunList.builder()
                .addData(
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
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(paginatedTestRunList.data())
            .containsExactly(
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
            )
        assertThat(paginatedTestRunList.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paginatedTestRunList =
            PaginatedTestRunList.builder()
                .addData(
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
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedPaginatedTestRunList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paginatedTestRunList),
                jacksonTypeRef<PaginatedTestRunList>(),
            )

        assertThat(roundtrippedPaginatedTestRunList).isEqualTo(paginatedTestRunList)
    }
}
