// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationDeleteDeleteParamsTest {

    @Test
    fun create() {
        ConversationDeleteDeleteParams.builder()
            .conversationId("conversation_id")
            .insightId("insight_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConversationDeleteDeleteParams.builder()
                .conversationId("conversation_id")
                .insightId("insight_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("conversation_id")
        assertThat(params._pathParam(1)).isEqualTo("insight_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
