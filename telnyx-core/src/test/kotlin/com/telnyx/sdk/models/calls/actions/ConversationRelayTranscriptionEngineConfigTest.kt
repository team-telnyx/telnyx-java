// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationRelayTranscriptionEngineConfigTest {

    @Test
    fun create() {
        val conversationRelayTranscriptionEngineConfig =
            ConversationRelayTranscriptionEngineConfig.builder()
                .eagerEotThreshold(0.5)
                .eotThreshold(0.5)
                .interimResults(true)
                .build()

        assertThat(conversationRelayTranscriptionEngineConfig.eagerEotThreshold()).contains(0.5)
        assertThat(conversationRelayTranscriptionEngineConfig.eotThreshold()).contains(0.5)
        assertThat(conversationRelayTranscriptionEngineConfig.interimResults()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationRelayTranscriptionEngineConfig =
            ConversationRelayTranscriptionEngineConfig.builder()
                .eagerEotThreshold(0.5)
                .eotThreshold(0.5)
                .interimResults(true)
                .build()

        val roundtrippedConversationRelayTranscriptionEngineConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationRelayTranscriptionEngineConfig),
                jacksonTypeRef<ConversationRelayTranscriptionEngineConfig>(),
            )

        assertThat(roundtrippedConversationRelayTranscriptionEngineConfig)
            .isEqualTo(conversationRelayTranscriptionEngineConfig)
    }
}
