// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListResponseTest {

    @Test
    fun create() {
        val messageListResponse =
            MessageListResponse.builder()
                .role(MessageListResponse.Role.USER)
                .text("text")
                .createdAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                .sentAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                .addToolCall(
                    MessageListResponse.ToolCall.builder()
                        .id("id")
                        .function(
                            MessageListResponse.ToolCall.Function.builder()
                                .arguments("arguments")
                                .name("name")
                                .build()
                        )
                        .type(MessageListResponse.ToolCall.Type.FUNCTION)
                        .build()
                )
                .build()

        assertThat(messageListResponse.role()).isEqualTo(MessageListResponse.Role.USER)
        assertThat(messageListResponse.text()).isEqualTo("text")
        assertThat(messageListResponse.createdAt())
            .contains(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
        assertThat(messageListResponse.sentAt())
            .contains(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
        assertThat(messageListResponse.toolCalls().getOrNull())
            .containsExactly(
                MessageListResponse.ToolCall.builder()
                    .id("id")
                    .function(
                        MessageListResponse.ToolCall.Function.builder()
                            .arguments("arguments")
                            .name("name")
                            .build()
                    )
                    .type(MessageListResponse.ToolCall.Type.FUNCTION)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageListResponse =
            MessageListResponse.builder()
                .role(MessageListResponse.Role.USER)
                .text("text")
                .createdAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                .sentAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                .addToolCall(
                    MessageListResponse.ToolCall.builder()
                        .id("id")
                        .function(
                            MessageListResponse.ToolCall.Function.builder()
                                .arguments("arguments")
                                .name("name")
                                .build()
                        )
                        .type(MessageListResponse.ToolCall.Type.FUNCTION)
                        .build()
                )
                .build()

        val roundtrippedMessageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageListResponse),
                jacksonTypeRef<MessageListResponse>(),
            )

        assertThat(roundtrippedMessageListResponse).isEqualTo(messageListResponse)
    }
}
