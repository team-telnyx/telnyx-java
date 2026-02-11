// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissionListResponseTest {

    @Test
    fun create() {
        val missionListResponse =
            MissionListResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .executionMode(MissionListResponse.ExecutionMode.EXTERNAL)
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .instructions("instructions")
                .metadata(
                    MissionListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .model("model")
                .build()

        assertThat(missionListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(missionListResponse.executionMode())
            .isEqualTo(MissionListResponse.ExecutionMode.EXTERNAL)
        assertThat(missionListResponse.missionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(missionListResponse.name()).isEqualTo("name")
        assertThat(missionListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(missionListResponse.description()).contains("description")
        assertThat(missionListResponse.instructions()).contains("instructions")
        assertThat(missionListResponse.metadata())
            .contains(
                MissionListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(missionListResponse.model()).contains("model")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val missionListResponse =
            MissionListResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .executionMode(MissionListResponse.ExecutionMode.EXTERNAL)
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .instructions("instructions")
                .metadata(
                    MissionListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .model("model")
                .build()

        val roundtrippedMissionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(missionListResponse),
                jacksonTypeRef<MissionListResponse>(),
            )

        assertThat(roundtrippedMissionListResponse).isEqualTo(missionListResponse)
    }
}
