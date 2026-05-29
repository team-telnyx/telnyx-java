// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationRelayInterruptionSettingsTest {

    @Test
    fun create() {
        val conversationRelayInterruptionSettings =
            ConversationRelayInterruptionSettings.builder()
                .enable(true)
                .interruptible(ConversationRelayInterruptionSettings.Interruptible.SPEECH)
                .interruptibleGreeting(
                    ConversationRelayInterruptionSettings.InterruptibleGreeting.SPEECH
                )
                .welcomeGreetingInterruptible(
                    ConversationRelayInterruptionSettings.WelcomeGreetingInterruptible.SPEECH
                )
                .build()

        assertThat(conversationRelayInterruptionSettings.enable()).contains(true)
        assertThat(conversationRelayInterruptionSettings.interruptible())
            .contains(ConversationRelayInterruptionSettings.Interruptible.SPEECH)
        assertThat(conversationRelayInterruptionSettings.interruptibleGreeting())
            .contains(ConversationRelayInterruptionSettings.InterruptibleGreeting.SPEECH)
        assertThat(conversationRelayInterruptionSettings.welcomeGreetingInterruptible())
            .contains(ConversationRelayInterruptionSettings.WelcomeGreetingInterruptible.SPEECH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationRelayInterruptionSettings =
            ConversationRelayInterruptionSettings.builder()
                .enable(true)
                .interruptible(ConversationRelayInterruptionSettings.Interruptible.SPEECH)
                .interruptibleGreeting(
                    ConversationRelayInterruptionSettings.InterruptibleGreeting.SPEECH
                )
                .welcomeGreetingInterruptible(
                    ConversationRelayInterruptionSettings.WelcomeGreetingInterruptible.SPEECH
                )
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
