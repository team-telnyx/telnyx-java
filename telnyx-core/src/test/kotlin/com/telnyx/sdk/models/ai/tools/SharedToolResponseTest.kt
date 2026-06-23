// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SharedToolResponseTest {

    @Test
    fun create() {
        val sharedToolResponse =
            SharedToolResponse.builder()
                .id("id")
                .toolDefinition(
                    SharedToolResponse.ToolDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type("type")
                .createdAt("created_at")
                .displayName("display_name")
                .timeoutMs(0L)
                .build()

        assertThat(sharedToolResponse.id()).isEqualTo("id")
        assertThat(sharedToolResponse.toolDefinition())
            .isEqualTo(
                SharedToolResponse.ToolDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(sharedToolResponse.type()).isEqualTo("type")
        assertThat(sharedToolResponse.createdAt()).contains("created_at")
        assertThat(sharedToolResponse.displayName()).contains("display_name")
        assertThat(sharedToolResponse.timeoutMs()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sharedToolResponse =
            SharedToolResponse.builder()
                .id("id")
                .toolDefinition(
                    SharedToolResponse.ToolDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type("type")
                .createdAt("created_at")
                .displayName("display_name")
                .timeoutMs(0L)
                .build()

        val roundtrippedSharedToolResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sharedToolResponse),
                jacksonTypeRef<SharedToolResponse>(),
            )

        assertThat(roundtrippedSharedToolResponse).isEqualTo(sharedToolResponse)
    }
}
