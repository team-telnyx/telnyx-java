// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunListResponseTest {

    @Test
    fun create() {
        val runListResponse =
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

        assertThat(runListResponse.missionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runListResponse.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runListResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runListResponse.status()).isEqualTo(RunListResponse.Status.PENDING)
        assertThat(runListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runListResponse.error()).contains("error")
        assertThat(runListResponse.finishedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runListResponse.input())
            .contains(
                RunListResponse.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runListResponse.metadata())
            .contains(
                RunListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runListResponse.resultPayload())
            .contains(
                RunListResponse.ResultPayload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runListResponse.resultSummary()).contains("result_summary")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runListResponse =
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

        val roundtrippedRunListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runListResponse),
                jacksonTypeRef<RunListResponse>(),
            )

        assertThat(roundtrippedRunListResponse).isEqualTo(runListResponse)
    }
}
