// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolListResponseTest {

    @Test
    fun create() {
        val toolListResponse =
            ToolListResponse.builder()
                .id("id")
                .toolDefinition(
                    ToolListResponse.ToolDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type("type")
                .createdAt("created_at")
                .displayName("display_name")
                .timeoutMs(0L)
                .build()

        assertThat(toolListResponse.id()).isEqualTo("id")
        assertThat(toolListResponse.toolDefinition())
            .isEqualTo(
                ToolListResponse.ToolDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(toolListResponse.type()).isEqualTo("type")
        assertThat(toolListResponse.createdAt()).contains("created_at")
        assertThat(toolListResponse.displayName()).contains("display_name")
        assertThat(toolListResponse.timeoutMs()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolListResponse =
            ToolListResponse.builder()
                .id("id")
                .toolDefinition(
                    ToolListResponse.ToolDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type("type")
                .createdAt("created_at")
                .displayName("display_name")
                .timeoutMs(0L)
                .build()

        val roundtrippedToolListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolListResponse),
                jacksonTypeRef<ToolListResponse>(),
            )

        assertThat(roundtrippedToolListResponse).isEqualTo(toolListResponse)
    }
}
