// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunRetrieveResponseTest {

    @Test
    fun create() {
        val runRetrieveResponse =
            RunRetrieveResponse.builder()
                .data(
                    MissionRunData.builder()
                        .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(MissionRunData.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .input(
                            MissionRunData.Input.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .metadata(
                            MissionRunData.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultPayload(
                            MissionRunData.ResultPayload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultSummary("result_summary")
                        .build()
                )
                .build()

        assertThat(runRetrieveResponse.data())
            .isEqualTo(
                MissionRunData.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(MissionRunData.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error("error")
                    .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .input(
                        MissionRunData.Input.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .metadata(
                        MissionRunData.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .resultPayload(
                        MissionRunData.ResultPayload.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .resultSummary("result_summary")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runRetrieveResponse =
            RunRetrieveResponse.builder()
                .data(
                    MissionRunData.builder()
                        .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(MissionRunData.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .input(
                            MissionRunData.Input.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .metadata(
                            MissionRunData.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultPayload(
                            MissionRunData.ResultPayload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultSummary("result_summary")
                        .build()
                )
                .build()

        val roundtrippedRunRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runRetrieveResponse),
                jacksonTypeRef<RunRetrieveResponse>(),
            )

        assertThat(roundtrippedRunRetrieveResponse).isEqualTo(runRetrieveResponse)
    }
}
