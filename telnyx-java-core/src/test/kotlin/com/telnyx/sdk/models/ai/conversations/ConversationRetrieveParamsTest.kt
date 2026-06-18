// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationRetrieveParamsTest {

    @Test
    fun create() {
        ConversationRetrieveParams.builder().conversationId("conversation_id").build()
    }

    @Test
    fun pathParams() {
        val params = ConversationRetrieveParams.builder().conversationId("conversation_id").build()

        assertThat(params._pathParam(0)).isEqualTo("conversation_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
