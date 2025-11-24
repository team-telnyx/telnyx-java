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
            .from("from")
            .text("text")
            .to("to")
            .conversationMetadata(
                AssistantSendSmsParams.ConversationMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .shouldCreateConversation(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssistantSendSmsParams.builder()
                .assistantId("assistant_id")
                .from("from")
                .text("text")
                .to("to")
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
                .from("from")
                .text("text")
                .to("to")
                .conversationMetadata(
                    AssistantSendSmsParams.ConversationMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .shouldCreateConversation(true)
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("from")
        assertThat(body.text()).isEqualTo("text")
        assertThat(body.to()).isEqualTo("to")
        assertThat(body.conversationMetadata())
            .contains(
                AssistantSendSmsParams.ConversationMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.shouldCreateConversation()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AssistantSendSmsParams.builder()
                .assistantId("assistant_id")
                .from("from")
                .text("text")
                .to("to")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("from")
        assertThat(body.text()).isEqualTo("text")
        assertThat(body.to()).isEqualTo("to")
    }
}
