// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissionCreateResponseTest {

    @Test
    fun create() {
        val missionCreateResponse =
            MissionCreateResponse.builder()
                .data(
                    MissionCreateResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .executionMode(MissionCreateResponse.Data.ExecutionMode.EXTERNAL)
                        .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .instructions("instructions")
                        .metadata(
                            MissionCreateResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .model("model")
                        .build()
                )
                .build()

        assertThat(missionCreateResponse.data())
            .isEqualTo(
                MissionCreateResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .executionMode(MissionCreateResponse.Data.ExecutionMode.EXTERNAL)
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .instructions("instructions")
                    .metadata(
                        MissionCreateResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .model("model")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val missionCreateResponse =
            MissionCreateResponse.builder()
                .data(
                    MissionCreateResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .executionMode(MissionCreateResponse.Data.ExecutionMode.EXTERNAL)
                        .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .instructions("instructions")
                        .metadata(
                            MissionCreateResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .model("model")
                        .build()
                )
                .build()

        val roundtrippedMissionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(missionCreateResponse),
                jacksonTypeRef<MissionCreateResponse>(),
            )

        assertThat(roundtrippedMissionCreateResponse).isEqualTo(missionCreateResponse)
    }
}
