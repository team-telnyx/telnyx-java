// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolMessageTest {

    @Test
    fun create() {
        val toolMessage =
            ToolMessage.builder()
                .content("Hello, I'm John.")
                .role(ToolMessage.Role.TOOL)
                .toolCallId("call_123")
                .metadata(
                    ToolMessage.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(toolMessage.content()).isEqualTo("Hello, I'm John.")
        assertThat(toolMessage.role()).isEqualTo(ToolMessage.Role.TOOL)
        assertThat(toolMessage.toolCallId()).isEqualTo("call_123")
        assertThat(toolMessage.metadata())
            .contains(
                ToolMessage.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolMessage =
            ToolMessage.builder()
                .content("Hello, I'm John.")
                .role(ToolMessage.Role.TOOL)
                .toolCallId("call_123")
                .metadata(
                    ToolMessage.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedToolMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolMessage),
                jacksonTypeRef<ToolMessage>(),
            )

        assertThat(roundtrippedToolMessage).isEqualTo(toolMessage)
    }
}
