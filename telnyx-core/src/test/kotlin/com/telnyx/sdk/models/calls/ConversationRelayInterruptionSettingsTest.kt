// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.calls.actions.ConversationRelayInterruptible
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationRelayInterruptionSettingsTest {

    @Test
    fun create() {
        val conversationRelayInterruptionSettings =
            ConversationRelayInterruptionSettings.builder()
                .enable(true)
                .interruptible(ConversationRelayInterruptible.SPEECH)
                .interruptibleGreeting(ConversationRelayInterruptible.SPEECH)
                .welcomeGreetingInterruptible(ConversationRelayInterruptible.SPEECH)
                .build()

        assertThat(conversationRelayInterruptionSettings.enable()).contains(true)
        assertThat(conversationRelayInterruptionSettings.interruptible())
            .contains(ConversationRelayInterruptible.SPEECH)
        assertThat(conversationRelayInterruptionSettings.interruptibleGreeting())
            .contains(ConversationRelayInterruptible.SPEECH)
        assertThat(conversationRelayInterruptionSettings.welcomeGreetingInterruptible())
            .contains(ConversationRelayInterruptible.SPEECH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationRelayInterruptionSettings =
            ConversationRelayInterruptionSettings.builder()
                .enable(true)
                .interruptible(ConversationRelayInterruptible.SPEECH)
                .interruptibleGreeting(ConversationRelayInterruptible.SPEECH)
                .welcomeGreetingInterruptible(ConversationRelayInterruptible.SPEECH)
                .build()

        val roundtrippedConversationRelayInterruptionSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationRelayInterruptionSettings),
                jacksonTypeRef<ConversationRelayInterruptionSettings>(),
            )

        assertThat(roundtrippedConversationRelayInterruptionSettings)
            .isEqualTo(conversationRelayInterruptionSettings)
    }
}
