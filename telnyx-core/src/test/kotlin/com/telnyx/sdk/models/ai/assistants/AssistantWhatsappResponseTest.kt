// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantWhatsappResponseTest {

    @Test
    fun create() {
        val assistantWhatsappResponse =
            AssistantWhatsappResponse.builder()
                .conversationId("conversation_id")
                .messageId("message_id")
                .build()

        assertThat(assistantWhatsappResponse.conversationId()).isEqualTo("conversation_id")
        assertThat(assistantWhatsappResponse.messageId()).isEqualTo("message_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantWhatsappResponse =
            AssistantWhatsappResponse.builder()
                .conversationId("conversation_id")
                .messageId("message_id")
                .build()

        val roundtrippedAssistantWhatsappResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantWhatsappResponse),
                jacksonTypeRef<AssistantWhatsappResponse>(),
            )

        assertThat(roundtrippedAssistantWhatsappResponse).isEqualTo(assistantWhatsappResponse)
    }
}
