// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantSendSmsResponseTest {

    @Test
    fun create() {
        val assistantSendSmsResponse =
            AssistantSendSmsResponse.builder().conversationId("conversation_id").build()

        assertThat(assistantSendSmsResponse.conversationId()).contains("conversation_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantSendSmsResponse =
            AssistantSendSmsResponse.builder().conversationId("conversation_id").build()

        val roundtrippedAssistantSendSmsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantSendSmsResponse),
                jacksonTypeRef<AssistantSendSmsResponse>(),
            )

        assertThat(roundtrippedAssistantSendSmsResponse).isEqualTo(assistantSendSmsResponse)
    }
}
