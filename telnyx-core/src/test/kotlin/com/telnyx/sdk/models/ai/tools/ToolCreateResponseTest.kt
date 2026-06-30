// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolCreateResponseTest {

    @Test
    fun create() {
        val toolCreateResponse =
            ToolCreateResponse.builder()
                .id("id")
                .toolDefinition(
                    ToolCreateResponse.ToolDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type("type")
                .createdAt("created_at")
                .displayName("display_name")
                .timeoutMs(0L)
                .build()

        assertThat(toolCreateResponse.id()).isEqualTo("id")
        assertThat(toolCreateResponse.toolDefinition())
            .isEqualTo(
                ToolCreateResponse.ToolDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(toolCreateResponse.type()).isEqualTo("type")
        assertThat(toolCreateResponse.createdAt()).contains("created_at")
        assertThat(toolCreateResponse.displayName()).contains("display_name")
        assertThat(toolCreateResponse.timeoutMs()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolCreateResponse =
            ToolCreateResponse.builder()
                .id("id")
                .toolDefinition(
                    ToolCreateResponse.ToolDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type("type")
                .createdAt("created_at")
                .displayName("display_name")
                .timeoutMs(0L)
                .build()

        val roundtrippedToolCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolCreateResponse),
                jacksonTypeRef<ToolCreateResponse>(),
            )

        assertThat(roundtrippedToolCreateResponse).isEqualTo(toolCreateResponse)
    }
}
