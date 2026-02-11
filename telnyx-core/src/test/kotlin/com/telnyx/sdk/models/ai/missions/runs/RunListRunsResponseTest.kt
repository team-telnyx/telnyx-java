// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunListRunsResponseTest {

    @Test
    fun create() {
        val runListRunsResponse =
            RunListRunsResponse.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(RunListRunsResponse.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("error")
                .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .input(
                    RunListRunsResponse.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    RunListRunsResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .resultPayload(
                    RunListRunsResponse.ResultPayload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .resultSummary("result_summary")
                .build()

        assertThat(runListRunsResponse.missionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runListRunsResponse.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runListRunsResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runListRunsResponse.status()).isEqualTo(RunListRunsResponse.Status.PENDING)
        assertThat(runListRunsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runListRunsResponse.error()).contains("error")
        assertThat(runListRunsResponse.finishedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runListRunsResponse.input())
            .contains(
                RunListRunsResponse.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runListRunsResponse.metadata())
            .contains(
                RunListRunsResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runListRunsResponse.resultPayload())
            .contains(
                RunListRunsResponse.ResultPayload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runListRunsResponse.resultSummary()).contains("result_summary")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runListRunsResponse =
            RunListRunsResponse.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(RunListRunsResponse.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("error")
                .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .input(
                    RunListRunsResponse.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    RunListRunsResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .resultPayload(
                    RunListRunsResponse.ResultPayload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .resultSummary("result_summary")
                .build()

        val roundtrippedRunListRunsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runListRunsResponse),
                jacksonTypeRef<RunListRunsResponse>(),
            )

        assertThat(roundtrippedRunListRunsResponse).isEqualTo(runListRunsResponse)
    }
}
