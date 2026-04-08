// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.texml.TexmlInitiateAiCallParams
import com.telnyx.sdk.models.texml.TexmlSecretsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TexmlServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun initiateAiCall() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val texmlService = client.texml()

        val response =
            texmlService.initiateAiCall(
                TexmlInitiateAiCallParams.builder()
                    .connectionId("connection_id")
                    .aiAssistantId("ai-assistant-id-123")
                    .from("+13120001234")
                    .to("+13121230000")
                    .aiAssistantDynamicVariables(
                        TexmlInitiateAiCallParams.AiAssistantDynamicVariables.builder()
                            .putAdditionalProperty("customer_name", JsonValue.from("John Doe"))
                            .putAdditionalProperty("account_id", JsonValue.from("12345"))
                            .build()
                    )
                    .aiAssistantVersion("AIAssistantVersion")
                    .asyncAmd(true)
                    .asyncAmdStatusCallback("https://www.example.com/callback")
                    .asyncAmdStatusCallbackMethod(
                        TexmlInitiateAiCallParams.AsyncAmdStatusCallbackMethod.GET
                    )
                    .callerId("Info")
                    .conversationCallback("https://www.example.com/conversation-callback")
                    .conversationCallbackMethod(
                        TexmlInitiateAiCallParams.ConversationCallbackMethod.GET
                    )
                    .addConversationCallback("https://www.example.com/conversation-callback1")
                    .addConversationCallback("https://www.example.com/conversation-callback2")
                    .addCustomHeader(
                        TexmlInitiateAiCallParams.CustomHeader.builder()
                            .name("X-Custom-Header")
                            .value("custom-value")
                            .build()
                    )
                    .detectionMode(TexmlInitiateAiCallParams.DetectionMode.PREMIUM)
                    .machineDetection(TexmlInitiateAiCallParams.MachineDetection.ENABLE)
                    .machineDetectionSilenceTimeout(2000L)
                    .machineDetectionSpeechEndThreshold(2000L)
                    .machineDetectionSpeechThreshold(2000L)
                    .machineDetectionTimeout(5000L)
                    .passports("Passports")
                    .preferredCodecs("PCMA,PCMU")
                    .record(false)
                    .recordingChannels(TexmlInitiateAiCallParams.RecordingChannels.DUAL)
                    .recordingStatusCallback("https://example.com/recording_status_callback")
                    .recordingStatusCallbackEvent("in-progress completed absent")
                    .recordingStatusCallbackMethod(
                        TexmlInitiateAiCallParams.RecordingStatusCallbackMethod.GET
                    )
                    .recordingTimeout(5L)
                    .recordingTrack(TexmlInitiateAiCallParams.RecordingTrack.INBOUND)
                    .sendRecordingUrl(false)
                    .sipAuthPassword("1234")
                    .sipAuthUsername("user")
                    .sipRegion(TexmlInitiateAiCallParams.SipRegion.CANADA)
                    .statusCallback("https://www.example.com/callback")
                    .statusCallbackEvent("initiated answered")
                    .statusCallbackMethod(TexmlInitiateAiCallParams.StatusCallbackMethod.GET)
                    .addStatusCallback("https://www.example.com/callback1")
                    .addStatusCallback("https://www.example.com/callback2")
                    .timeLimit(3600L)
                    .timeout(60L)
                    .trim(TexmlInitiateAiCallParams.Trim.TRIM_SILENCE)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun secrets() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val texmlService = client.texml()

        val response =
            texmlService.secrets(
                TexmlSecretsParams.builder().name("My Secret Name").value("My Secret Value").build()
            )

        response.validate()
    }
}
