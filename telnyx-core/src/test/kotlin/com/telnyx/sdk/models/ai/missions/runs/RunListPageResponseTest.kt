// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunListPageResponseTest {

    @Test
    fun create() {
        val runListPageResponse =
            RunListPageResponse.builder()
                .addData(
                    RunListResponse.builder()
                        .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(RunListResponse.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .input(
                            RunListResponse.Input.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .metadata(
                            RunListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultPayload(
                            RunListResponse.ResultPayload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultSummary("result_summary")
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

        assertThat(runListPageResponse.data())
            .containsExactly(
                RunListResponse.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(RunListResponse.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error("error")
                    .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .input(
                        RunListResponse.Input.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .metadata(
                        RunListResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .resultPayload(
                        RunListResponse.ResultPayload.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .resultSummary("result_summary")
                    .build()
            )
        assertThat(runListPageResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runListPageResponse =
            RunListPageResponse.builder()
                .addData(
                    RunListResponse.builder()
                        .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(RunListResponse.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .input(
                            RunListResponse.Input.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .metadata(
                            RunListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultPayload(
                            RunListResponse.ResultPayload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultSummary("result_summary")
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

        val roundtrippedRunListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runListPageResponse),
                jacksonTypeRef<RunListPageResponse>(),
            )

        assertThat(roundtrippedRunListPageResponse).isEqualTo(runListPageResponse)
    }
}
