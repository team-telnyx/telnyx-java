// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlInitiateAiCallParamsTest {

    @Test
    fun create() {
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
            .conversationCallbackMethod(TexmlInitiateAiCallParams.ConversationCallbackMethod.GET)
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
    }

    @Test
    fun pathParams() {
        val params =
            TexmlInitiateAiCallParams.builder()
                .connectionId("connection_id")
                .aiAssistantId("ai-assistant-id-123")
                .from("+13120001234")
                .to("+13121230000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("connection_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.aiAssistantId()).isEqualTo("ai-assistant-id-123")
        assertThat(body.from()).isEqualTo("+13120001234")
        assertThat(body.to()).isEqualTo("+13121230000")
        assertThat(body.aiAssistantDynamicVariables())
            .contains(
                TexmlInitiateAiCallParams.AiAssistantDynamicVariables.builder()
                    .putAdditionalProperty("customer_name", JsonValue.from("John Doe"))
                    .putAdditionalProperty("account_id", JsonValue.from("12345"))
                    .build()
            )
        assertThat(body.aiAssistantVersion()).contains("AIAssistantVersion")
        assertThat(body.asyncAmd()).contains(true)
        assertThat(body.asyncAmdStatusCallback()).contains("https://www.example.com/callback")
        assertThat(body.asyncAmdStatusCallbackMethod())
            .contains(TexmlInitiateAiCallParams.AsyncAmdStatusCallbackMethod.GET)
        assertThat(body.callerId()).contains("Info")
        assertThat(body.conversationCallback())
            .contains("https://www.example.com/conversation-callback")
        assertThat(body.conversationCallbackMethod())
            .contains(TexmlInitiateAiCallParams.ConversationCallbackMethod.GET)
        assertThat(body.conversationCallbacks().getOrNull())
            .containsExactly(
                "https://www.example.com/conversation-callback1",
                "https://www.example.com/conversation-callback2",
            )
        assertThat(body.customHeaders().getOrNull())
            .containsExactly(
                TexmlInitiateAiCallParams.CustomHeader.builder()
                    .name("X-Custom-Header")
                    .value("custom-value")
                    .build()
            )
        assertThat(body.detectionMode()).contains(TexmlInitiateAiCallParams.DetectionMode.PREMIUM)
        assertThat(body.machineDetection())
            .contains(TexmlInitiateAiCallParams.MachineDetection.ENABLE)
        assertThat(body.machineDetectionSilenceTimeout()).contains(2000L)
        assertThat(body.machineDetectionSpeechEndThreshold()).contains(2000L)
        assertThat(body.machineDetectionSpeechThreshold()).contains(2000L)
        assertThat(body.machineDetectionTimeout()).contains(5000L)
        assertThat(body.passports()).contains("Passports")
        assertThat(body.preferredCodecs()).contains("PCMA,PCMU")
        assertThat(body.record()).contains(false)
        assertThat(body.recordingChannels())
            .contains(TexmlInitiateAiCallParams.RecordingChannels.DUAL)
        assertThat(body.recordingStatusCallback())
            .contains("https://example.com/recording_status_callback")
        assertThat(body.recordingStatusCallbackEvent()).contains("in-progress completed absent")
        assertThat(body.recordingStatusCallbackMethod())
            .contains(TexmlInitiateAiCallParams.RecordingStatusCallbackMethod.GET)
        assertThat(body.recordingTimeout()).contains(5L)
        assertThat(body.recordingTrack()).contains(TexmlInitiateAiCallParams.RecordingTrack.INBOUND)
        assertThat(body.sendRecordingUrl()).contains(false)
        assertThat(body.sipAuthPassword()).contains("1234")
        assertThat(body.sipAuthUsername()).contains("user")
        assertThat(body.sipRegion()).contains(TexmlInitiateAiCallParams.SipRegion.CANADA)
        assertThat(body.statusCallback()).contains("https://www.example.com/callback")
        assertThat(body.statusCallbackEvent()).contains("initiated answered")
        assertThat(body.statusCallbackMethod())
            .contains(TexmlInitiateAiCallParams.StatusCallbackMethod.GET)
        assertThat(body.statusCallbacks().getOrNull())
            .containsExactly(
                "https://www.example.com/callback1",
                "https://www.example.com/callback2",
            )
        assertThat(body.timeLimit()).contains(3600L)
        assertThat(body.timeout()).contains(60L)
        assertThat(body.trim()).contains(TexmlInitiateAiCallParams.Trim.TRIM_SILENCE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TexmlInitiateAiCallParams.builder()
                .connectionId("connection_id")
                .aiAssistantId("ai-assistant-id-123")
                .from("+13120001234")
                .to("+13121230000")
                .build()

        val body = params._body()

        assertThat(body.aiAssistantId()).isEqualTo("ai-assistant-id-123")
        assertThat(body.from()).isEqualTo("+13120001234")
        assertThat(body.to()).isEqualTo("+13121230000")
    }
}
