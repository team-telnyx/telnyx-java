// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantChatParamsTest {

    @Test
    fun create() {
        AssistantChatParams.builder()
            .assistantId("assistant_id")
            .content("Tell me a joke about cats")
            .conversationId("42b20469-1215-4a9a-8964-c36f66b406f4")
            .name("Charlie")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssistantChatParams.builder()
                .assistantId("assistant_id")
                .content("Tell me a joke about cats")
                .conversationId("42b20469-1215-4a9a-8964-c36f66b406f4")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AssistantChatParams.builder()
                .assistantId("assistant_id")
                .content("Tell me a joke about cats")
                .conversationId("42b20469-1215-4a9a-8964-c36f66b406f4")
                .name("Charlie")
                .build()

        val body = params._body()

        assertThat(body.content()).isEqualTo("Tell me a joke about cats")
        assertThat(body.conversationId()).isEqualTo("42b20469-1215-4a9a-8964-c36f66b406f4")
        assertThat(body.name()).contains("Charlie")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AssistantChatParams.builder()
                .assistantId("assistant_id")
                .content("Tell me a joke about cats")
                .conversationId("42b20469-1215-4a9a-8964-c36f66b406f4")
                .build()

        val body = params._body()

        assertThat(body.content()).isEqualTo("Tell me a joke about cats")
        assertThat(body.conversationId()).isEqualTo("42b20469-1215-4a9a-8964-c36f66b406f4")
    }
}
