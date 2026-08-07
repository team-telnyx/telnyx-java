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
            .description("Description")
            .executionMode(ExecutionMode.EXTERNAL)
            .instructions("Instructions")
            .metadata(
                MissionUpdateMissionParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .model("Model")
            .name("Name")
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
                .description("Description")
                .executionMode(ExecutionMode.EXTERNAL)
                .instructions("Instructions")
                .metadata(
                    MissionUpdateMissionParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .model("Model")
                .name("Name")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("Description")
        assertThat(body.executionMode()).contains(ExecutionMode.EXTERNAL)
        assertThat(body.instructions()).contains("Instructions")
        assertThat(body.metadata())
            .contains(
                MissionUpdateMissionParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.model()).contains("Model")
        assertThat(body.name()).contains("Name")
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
