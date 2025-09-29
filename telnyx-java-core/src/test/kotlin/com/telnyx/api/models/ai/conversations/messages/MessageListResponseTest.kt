// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.conversations.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.ai.assistants.tests.testsuites.runs.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListResponseTest {

    @Test
    fun create() {
        val messageListResponse =
            MessageListResponse.builder()
                .addData(
                    MessageListResponse.Data.builder()
                        .role(MessageListResponse.Data.Role.USER)
                        .text("text")
                        .createdAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                        .sentAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                        .addToolCall(
                            MessageListResponse.Data.ToolCall.builder()
                                .id("id")
                                .function(
                                    MessageListResponse.Data.ToolCall.Function.builder()
                                        .arguments("arguments")
                                        .name("name")
                                        .build()
                                )
                                .type(MessageListResponse.Data.ToolCall.Type.FUNCTION)
                                .build()
                        )
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(messageListResponse.data())
            .containsExactly(
                MessageListResponse.Data.builder()
                    .role(MessageListResponse.Data.Role.USER)
                    .text("text")
                    .createdAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                    .sentAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                    .addToolCall(
                        MessageListResponse.Data.ToolCall.builder()
                            .id("id")
                            .function(
                                MessageListResponse.Data.ToolCall.Function.builder()
                                    .arguments("arguments")
                                    .name("name")
                                    .build()
                            )
                            .type(MessageListResponse.Data.ToolCall.Type.FUNCTION)
                            .build()
                    )
                    .build()
            )
        assertThat(messageListResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageListResponse =
            MessageListResponse.builder()
                .addData(
                    MessageListResponse.Data.builder()
                        .role(MessageListResponse.Data.Role.USER)
                        .text("text")
                        .createdAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                        .sentAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                        .addToolCall(
                            MessageListResponse.Data.ToolCall.builder()
                                .id("id")
                                .function(
                                    MessageListResponse.Data.ToolCall.Function.builder()
                                        .arguments("arguments")
                                        .name("name")
                                        .build()
                                )
                                .type(MessageListResponse.Data.ToolCall.Type.FUNCTION)
                                .build()
                        )
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
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
