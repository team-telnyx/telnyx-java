// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.meetingsessions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.meetingsessions.actions.ActionSendChatParams
import com.telnyx.sdk.models.meetingsessions.actions.ActionSpeakParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendChat() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.meetingSessions().actions()

        val actionAcceptedResponseFuture =
            actionServiceAsync.sendChat(
                ActionSendChatParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .text("I will send the summary after this call.")
                    .build()
            )

        val actionAcceptedResponse = actionAcceptedResponseFuture.get()
        actionAcceptedResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun speak() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.meetingSessions().actions()

        val actionAcceptedResponseFuture =
            actionServiceAsync.speak(
                ActionSpeakParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .text("Here are the three decisions from this call.")
                    .interrupt(false)
                    .voice("x")
                    .build()
            )

        val actionAcceptedResponse = actionAcceptedResponseFuture.get()
        actionAcceptedResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stopSpeaking() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.meetingSessions().actions()

        val actionAcceptedResponseFuture =
            actionServiceAsync.stopSpeaking("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")

        val actionAcceptedResponse = actionAcceptedResponseFuture.get()
        actionAcceptedResponse.validate()
    }
}
