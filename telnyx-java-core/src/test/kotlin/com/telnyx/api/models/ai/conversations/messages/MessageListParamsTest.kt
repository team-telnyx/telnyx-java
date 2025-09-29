// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.conversations.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListParamsTest {

    @Test
    fun create() {
        MessageListParams.builder().conversationId("conversation_id").build()
    }

    @Test
    fun pathParams() {
        val params = MessageListParams.builder().conversationId("conversation_id").build()

        assertThat(params._pathParam(0)).isEqualTo("conversation_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
