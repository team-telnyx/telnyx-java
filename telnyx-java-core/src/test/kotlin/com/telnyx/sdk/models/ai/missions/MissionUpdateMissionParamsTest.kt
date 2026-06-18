// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissionUpdateMissionParamsTest {

    @Test
    fun create() {
        MissionUpdateMissionParams.builder()
            .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .executionMode(MissionUpdateMissionParams.ExecutionMode.EXTERNAL)
            .instructions("instructions")
            .metadata(
                MissionUpdateMissionParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .model("model")
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MissionUpdateMissionParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MissionUpdateMissionParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .executionMode(MissionUpdateMissionParams.ExecutionMode.EXTERNAL)
                .instructions("instructions")
                .metadata(
                    MissionUpdateMissionParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .model("model")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.executionMode()).contains(MissionUpdateMissionParams.ExecutionMode.EXTERNAL)
        assertThat(body.instructions()).contains("instructions")
        assertThat(body.metadata())
            .contains(
                MissionUpdateMissionParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.model()).contains("model")
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MissionUpdateMissionParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
