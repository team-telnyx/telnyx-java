// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations

import com.telnyx.sdk.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationAddMessageParamsTest {

    @Test
    fun create() {
        ConversationAddMessageParams.builder()
            .conversationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .role("Role")
            .content("")
            .metadata(
                ConversationAddMessageParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("Name")
            .sentAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
            .toolCallId("Tool Call Id")
            .addToolCall(
                ConversationAddMessageParams.ToolCall.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .toolChoice("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConversationAddMessageParams.builder()
                .conversationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .role("Role")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ConversationAddMessageParams.builder()
                .conversationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .role("Role")
                .content("")
                .metadata(
                    ConversationAddMessageParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("Name")
                .sentAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                .toolCallId("Tool Call Id")
                .addToolCall(
                    ConversationAddMessageParams.ToolCall.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .toolChoice("string")
                .build()

        val body = params._body()

        assertThat(body.role()).isEqualTo("Role")
        assertThat(body.content()).contains("")
        assertThat(body.metadata())
            .contains(
                ConversationAddMessageParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("Name")
        assertThat(body.sentAt()).contains(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
        assertThat(body.toolCallId()).contains("Tool Call Id")
        assertThat(body.toolCalls().getOrNull())
            .containsExactly(
                ConversationAddMessageParams.ToolCall.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.toolChoice())
            .contains(ConversationAddMessageParams.ToolChoice.ofString("string"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConversationAddMessageParams.builder()
                .conversationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .role("Role")
                .build()

        val body = params._body()

        assertThat(body.role()).isEqualTo("Role")
    }
}
