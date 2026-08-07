// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissionCreateParamsTest {

    @Test
    fun create() {
        MissionCreateParams.builder()
            .name("Name")
            .description("Description")
            .executionMode(ExecutionMode.EXTERNAL)
            .instructions("Instructions")
            .metadata(
                MissionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .model("Model")
            .build()
    }

    @Test
    fun body() {
        val params =
            MissionCreateParams.builder()
                .name("Name")
                .description("Description")
                .executionMode(ExecutionMode.EXTERNAL)
                .instructions("Instructions")
                .metadata(
                    MissionCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .model("Model")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Name")
        assertThat(body.description()).contains("Description")
        assertThat(body.executionMode()).contains(ExecutionMode.EXTERNAL)
        assertThat(body.instructions()).contains("Instructions")
        assertThat(body.metadata())
            .contains(
                MissionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.model()).contains("Model")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MissionCreateParams.builder().name("Name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Name")
    }
}
