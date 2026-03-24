// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolRetrieveResponseTest {

    @Test
    fun create() {
        val toolRetrieveResponse =
            ToolRetrieveResponse.builder()
                .id("id")
                .toolDefinition(
                    ToolRetrieveResponse.ToolDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type("type")
                .createdAt("created_at")
                .displayName("display_name")
                .timeoutMs(0L)
                .build()

        assertThat(toolRetrieveResponse.id()).isEqualTo("id")
        assertThat(toolRetrieveResponse.toolDefinition())
            .isEqualTo(
                ToolRetrieveResponse.ToolDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(toolRetrieveResponse.type()).isEqualTo("type")
        assertThat(toolRetrieveResponse.createdAt()).contains("created_at")
        assertThat(toolRetrieveResponse.displayName()).contains("display_name")
        assertThat(toolRetrieveResponse.timeoutMs()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolRetrieveResponse =
            ToolRetrieveResponse.builder()
                .id("id")
                .toolDefinition(
                    ToolRetrieveResponse.ToolDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type("type")
                .createdAt("created_at")
                .displayName("display_name")
                .timeoutMs(0L)
                .build()

        val roundtrippedToolRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolRetrieveResponse),
                jacksonTypeRef<ToolRetrieveResponse>(),
            )

        assertThat(roundtrippedToolRetrieveResponse).isEqualTo(toolRetrieveResponse)
    }
}
