// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopConversationRelayResponseTest {

    @Test
    fun create() {
        val actionStopConversationRelayResponse =
            ActionStopConversationRelayResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStopConversationRelayResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStopConversationRelayResponse =
            ActionStopConversationRelayResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStopConversationRelayResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStopConversationRelayResponse),
                jacksonTypeRef<ActionStopConversationRelayResponse>(),
            )

        assertThat(roundtrippedActionStopConversationRelayResponse)
            .isEqualTo(actionStopConversationRelayResponse)
    }
}
