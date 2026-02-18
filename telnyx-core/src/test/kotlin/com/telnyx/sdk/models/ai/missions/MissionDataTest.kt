// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissionDataTest {

    @Test
    fun create() {
        val missionData =
            MissionData.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .executionMode(MissionData.ExecutionMode.EXTERNAL)
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .instructions("instructions")
                .metadata(
                    MissionData.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .model("model")
                .build()

        assertThat(missionData.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(missionData.executionMode()).isEqualTo(MissionData.ExecutionMode.EXTERNAL)
        assertThat(missionData.missionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(missionData.name()).isEqualTo("name")
        assertThat(missionData.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(missionData.description()).contains("description")
        assertThat(missionData.instructions()).contains("instructions")
        assertThat(missionData.metadata())
            .contains(
                MissionData.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(missionData.model()).contains("model")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val missionData =
            MissionData.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .executionMode(MissionData.ExecutionMode.EXTERNAL)
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .instructions("instructions")
                .metadata(
                    MissionData.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .model("model")
                .build()

        val roundtrippedMissionData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(missionData),
                jacksonTypeRef<MissionData>(),
            )

        assertThat(roundtrippedMissionData).isEqualTo(missionData)
    }
}
