// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissionRunDataTest {

    @Test
    fun create() {
        val missionRunData =
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

        assertThat(missionRunData.missionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(missionRunData.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(missionRunData.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(missionRunData.status()).isEqualTo(MissionRunData.Status.PENDING)
        assertThat(missionRunData.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(missionRunData.error()).contains("error")
        assertThat(missionRunData.finishedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(missionRunData.input())
            .contains(
                MissionRunData.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(missionRunData.metadata())
            .contains(
                MissionRunData.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(missionRunData.resultPayload())
            .contains(
                MissionRunData.ResultPayload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(missionRunData.resultSummary()).contains("result_summary")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val missionRunData =
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

        val roundtrippedMissionRunData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(missionRunData),
                jacksonTypeRef<MissionRunData>(),
            )

        assertThat(roundtrippedMissionRunData).isEqualTo(missionRunData)
    }
}
