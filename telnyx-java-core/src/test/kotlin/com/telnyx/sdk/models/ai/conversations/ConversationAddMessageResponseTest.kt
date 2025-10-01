// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationAddMessageResponseTest {

    @Test
    fun create() {
        val conversationAddMessageResponse = ConversationAddMessageResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationAddMessageResponse = ConversationAddMessageResponse.builder().build()

        val roundtrippedConversationAddMessageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationAddMessageResponse),
                jacksonTypeRef<ConversationAddMessageResponse>(),
            )

        assertThat(roundtrippedConversationAddMessageResponse)
            .isEqualTo(conversationAddMessageResponse)
    }
}
