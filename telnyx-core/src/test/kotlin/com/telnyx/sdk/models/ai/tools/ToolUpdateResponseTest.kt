// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolUpdateResponseTest {

    @Test
    fun create() {
        val toolUpdateResponse =
            ToolUpdateResponse.builder()
                .id("id")
                .toolDefinition(
                    ToolUpdateResponse.ToolDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type("type")
                .createdAt("created_at")
                .displayName("display_name")
                .timeoutMs(0L)
                .build()

        assertThat(toolUpdateResponse.id()).isEqualTo("id")
        assertThat(toolUpdateResponse.toolDefinition())
            .isEqualTo(
                ToolUpdateResponse.ToolDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(toolUpdateResponse.type()).isEqualTo("type")
        assertThat(toolUpdateResponse.createdAt()).contains("created_at")
        assertThat(toolUpdateResponse.displayName()).contains("display_name")
        assertThat(toolUpdateResponse.timeoutMs()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolUpdateResponse =
            ToolUpdateResponse.builder()
                .id("id")
                .toolDefinition(
                    ToolUpdateResponse.ToolDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type("type")
                .createdAt("created_at")
                .displayName("display_name")
                .timeoutMs(0L)
                .build()

        val roundtrippedToolUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolUpdateResponse),
                jacksonTypeRef<ToolUpdateResponse>(),
            )

        assertThat(roundtrippedToolUpdateResponse).isEqualTo(toolUpdateResponse)
    }
}
