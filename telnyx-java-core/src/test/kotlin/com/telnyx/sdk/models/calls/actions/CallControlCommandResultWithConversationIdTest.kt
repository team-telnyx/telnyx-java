// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallControlCommandResultWithConversationIdTest {

    @Test
    fun create() {
        val callControlCommandResultWithConversationId =
            CallControlCommandResultWithConversationId.builder()
                .conversationId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                .result("ok")
                .build()

        assertThat(callControlCommandResultWithConversationId.conversationId())
            .contains("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
        assertThat(callControlCommandResultWithConversationId.result()).contains("ok")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callControlCommandResultWithConversationId =
            CallControlCommandResultWithConversationId.builder()
                .conversationId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                .result("ok")
                .build()

        val roundtrippedCallControlCommandResultWithConversationId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callControlCommandResultWithConversationId),
                jacksonTypeRef<CallControlCommandResultWithConversationId>(),
            )

        assertThat(roundtrippedCallControlCommandResultWithConversationId)
            .isEqualTo(callControlCommandResultWithConversationId)
    }
}
