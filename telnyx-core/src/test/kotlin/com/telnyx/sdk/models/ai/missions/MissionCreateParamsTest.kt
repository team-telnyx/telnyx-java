// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissionCreateParamsTest {

    @Test
    fun create() {
        MissionCreateParams.builder()
            .name("name")
            .description("description")
            .executionMode(MissionCreateParams.ExecutionMode.EXTERNAL)
            .instructions("instructions")
            .metadata(
                MissionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .model("model")
            .build()
    }

    @Test
    fun body() {
        val params =
            MissionCreateParams.builder()
                .name("name")
                .description("description")
                .executionMode(MissionCreateParams.ExecutionMode.EXTERNAL)
                .instructions("instructions")
                .metadata(
                    MissionCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .model("model")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).contains("description")
        assertThat(body.executionMode()).contains(MissionCreateParams.ExecutionMode.EXTERNAL)
        assertThat(body.instructions()).contains("instructions")
        assertThat(body.metadata())
            .contains(
                MissionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.model()).contains("model")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MissionCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
