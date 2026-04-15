// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListPageResponseTest {

    @Test
    fun create() {
        val messageListPageResponse =
            MessageListPageResponse.builder()
                .addData(
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

        assertThat(messageListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(messageListPageResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageListPageResponse =
            MessageListPageResponse.builder()
                .addData(
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

        val roundtrippedMessageListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageListPageResponse),
                jacksonTypeRef<MessageListPageResponse>(),
            )

        assertThat(roundtrippedMessageListPageResponse).isEqualTo(messageListPageResponse)
    }
}
