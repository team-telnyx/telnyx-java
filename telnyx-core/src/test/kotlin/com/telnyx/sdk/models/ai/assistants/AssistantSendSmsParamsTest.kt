// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantSendSmsParamsTest {

    @Test
    fun create() {
        AssistantSendSmsParams.builder()
            .assistantId("assistant_id")
            .from("From")
            .to("To")
            .conversationMetadata(
                AssistantSendSmsParams.ConversationMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .shouldCreateConversation(false)
            .text("Text")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssistantSendSmsParams.builder()
                .assistantId("assistant_id")
                .from("From")
                .to("To")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AssistantSendSmsParams.builder()
                .assistantId("assistant_id")
                .from("From")
                .to("To")
                .conversationMetadata(
                    AssistantSendSmsParams.ConversationMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .shouldCreateConversation(false)
                .text("Text")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("From")
        assertThat(body.to()).isEqualTo("To")
        assertThat(body.conversationMetadata())
            .contains(
                AssistantSendSmsParams.ConversationMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.shouldCreateConversation()).contains(false)
        assertThat(body.text()).contains("Text")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AssistantSendSmsParams.builder()
                .assistantId("assistant_id")
                .from("From")
                .to("To")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("From")
        assertThat(body.to()).isEqualTo("To")
    }
}
