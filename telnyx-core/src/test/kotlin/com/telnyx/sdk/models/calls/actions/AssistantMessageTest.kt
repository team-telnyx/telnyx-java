// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantMessageTest {

    @Test
    fun create() {
        val assistantMessage =
            AssistantMessage.builder()
                .role(AssistantMessage.Role.ASSISTANT)
                .content("Hello, I'm John.")
                .metadata(
                    AssistantMessage.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addToolCall(
                    AssistantMessage.ToolCall.builder()
                        .id("call_123")
                        .function(
                            AssistantMessage.ToolCall.Function.builder().name("get_weather").build()
                        )
                        .type(AssistantMessage.ToolCall.Type.FUNCTION)
                        .build()
                )
                .build()

        assertThat(assistantMessage.role()).isEqualTo(AssistantMessage.Role.ASSISTANT)
        assertThat(assistantMessage.content()).contains("Hello, I'm John.")
        assertThat(assistantMessage.metadata())
            .contains(
                AssistantMessage.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(assistantMessage.toolCalls().getOrNull())
            .containsExactly(
                AssistantMessage.ToolCall.builder()
                    .id("call_123")
                    .function(
                        AssistantMessage.ToolCall.Function.builder().name("get_weather").build()
                    )
                    .type(AssistantMessage.ToolCall.Type.FUNCTION)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantMessage =
            AssistantMessage.builder()
                .role(AssistantMessage.Role.ASSISTANT)
                .content("Hello, I'm John.")
                .metadata(
                    AssistantMessage.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addToolCall(
                    AssistantMessage.ToolCall.builder()
                        .id("call_123")
                        .function(
                            AssistantMessage.ToolCall.Function.builder().name("get_weather").build()
                        )
                        .type(AssistantMessage.ToolCall.Type.FUNCTION)
                        .build()
                )
                .build()

        val roundtrippedAssistantMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantMessage),
                jacksonTypeRef<AssistantMessage>(),
            )

        assertThat(roundtrippedAssistantMessage).isEqualTo(assistantMessage)
    }
}
