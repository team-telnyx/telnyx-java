// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.meetingsessions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.meetingsessions.actions.ActionSendChatParams
import com.telnyx.sdk.models.meetingsessions.actions.ActionSpeakParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendChat() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.meetingSessions().actions()

        val actionAcceptedResponse =
            actionService.sendChat(
                ActionSendChatParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .text("I will send the summary after this call.")
                    .build()
            )

        actionAcceptedResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun speak() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.meetingSessions().actions()

        val actionAcceptedResponse =
            actionService.speak(
                ActionSpeakParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .text("Here are the three decisions from this call.")
                    .interrupt(false)
                    .voice("x")
                    .build()
            )

        actionAcceptedResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stopSpeaking() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.meetingSessions().actions()

        val actionAcceptedResponse =
            actionService.stopSpeaking("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")

        actionAcceptedResponse.validate()
    }
}
