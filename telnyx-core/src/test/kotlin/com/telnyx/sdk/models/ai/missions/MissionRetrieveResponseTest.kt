// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissionRetrieveResponseTest {

    @Test
    fun create() {
        val missionRetrieveResponse =
            MissionRetrieveResponse.builder()
                .data(
                    MissionRetrieveResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .executionMode(MissionRetrieveResponse.Data.ExecutionMode.EXTERNAL)
                        .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .instructions("instructions")
                        .metadata(
                            MissionRetrieveResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .model("model")
                        .build()
                )
                .build()

        assertThat(missionRetrieveResponse.data())
            .isEqualTo(
                MissionRetrieveResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .executionMode(MissionRetrieveResponse.Data.ExecutionMode.EXTERNAL)
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .instructions("instructions")
                    .metadata(
                        MissionRetrieveResponse.Data.Metadata.builder()
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
        val missionRetrieveResponse =
            MissionRetrieveResponse.builder()
                .data(
                    MissionRetrieveResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .executionMode(MissionRetrieveResponse.Data.ExecutionMode.EXTERNAL)
                        .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .instructions("instructions")
                        .metadata(
                            MissionRetrieveResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .model("model")
                        .build()
                )
                .build()

        val roundtrippedMissionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(missionRetrieveResponse),
                jacksonTypeRef<MissionRetrieveResponse>(),
            )

        assertThat(roundtrippedMissionRetrieveResponse).isEqualTo(missionRetrieveResponse)
    }
}
