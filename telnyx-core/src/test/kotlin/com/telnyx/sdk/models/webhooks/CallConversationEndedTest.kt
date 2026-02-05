// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallConversationEndedTest {

    @Test
    fun create() {
        val callConversationEnded =
            CallConversationEnded.builder()
                .id("eb8775a6-634f-48b0-b177-d5465a8a8e9f")
                .createdAt(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
                .eventType(CallConversationEnded.EventType.CALL_CONVERSATION_ENDED)
                .occurredAt(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
                .payload(
                    CallConversationEnded.Payload.builder()
                        .assistantId("assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d")
                        .callControlId("v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ")
                        .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                        .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                        .callingPartyType(CallConversationEnded.Payload.CallingPartyType.SIP)
                        .clientState(
                            "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                        )
                        .connectionId("2694492062593582591")
                        .conversationId("0424805b-adc1-4ff8-9f95-e1de6883ecbe")
                        .durationSec(3L)
                        .from("+13124287921")
                        .llmModel("openai/gpt-4o")
                        .sttModel("distil-whisper/distil-large-v2")
                        .to("jamesw@assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d.sip.telnyx.com")
                        .ttsModelId("Natural")
                        .ttsProvider("telnyx")
                        .ttsVoiceId("Marissa")
                        .build()
                )
                .recordType(CallConversationEnded.RecordType.EVENT)
                .build()

        assertThat(callConversationEnded.id()).contains("eb8775a6-634f-48b0-b177-d5465a8a8e9f")
        assertThat(callConversationEnded.createdAt())
            .contains(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
        assertThat(callConversationEnded.eventType())
            .contains(CallConversationEnded.EventType.CALL_CONVERSATION_ENDED)
        assertThat(callConversationEnded.occurredAt())
            .contains(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
        assertThat(callConversationEnded.payload())
            .contains(
                CallConversationEnded.Payload.builder()
                    .assistantId("assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d")
                    .callControlId("v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ")
                    .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                    .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                    .callingPartyType(CallConversationEnded.Payload.CallingPartyType.SIP)
                    .clientState(
                        "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                    )
                    .connectionId("2694492062593582591")
                    .conversationId("0424805b-adc1-4ff8-9f95-e1de6883ecbe")
                    .durationSec(3L)
                    .from("+13124287921")
                    .llmModel("openai/gpt-4o")
                    .sttModel("distil-whisper/distil-large-v2")
                    .to("jamesw@assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d.sip.telnyx.com")
                    .ttsModelId("Natural")
                    .ttsProvider("telnyx")
                    .ttsVoiceId("Marissa")
                    .build()
            )
        assertThat(callConversationEnded.recordType())
            .contains(CallConversationEnded.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callConversationEnded =
            CallConversationEnded.builder()
                .id("eb8775a6-634f-48b0-b177-d5465a8a8e9f")
                .createdAt(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
                .eventType(CallConversationEnded.EventType.CALL_CONVERSATION_ENDED)
                .occurredAt(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
                .payload(
                    CallConversationEnded.Payload.builder()
                        .assistantId("assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d")
                        .callControlId("v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ")
                        .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                        .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                        .callingPartyType(CallConversationEnded.Payload.CallingPartyType.SIP)
                        .clientState(
                            "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                        )
                        .connectionId("2694492062593582591")
                        .conversationId("0424805b-adc1-4ff8-9f95-e1de6883ecbe")
                        .durationSec(3L)
                        .from("+13124287921")
                        .llmModel("openai/gpt-4o")
                        .sttModel("distil-whisper/distil-large-v2")
                        .to("jamesw@assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d.sip.telnyx.com")
                        .ttsModelId("Natural")
                        .ttsProvider("telnyx")
                        .ttsVoiceId("Marissa")
                        .build()
                )
                .recordType(CallConversationEnded.RecordType.EVENT)
                .build()

        val roundtrippedCallConversationEnded =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callConversationEnded),
                jacksonTypeRef<CallConversationEnded>(),
            )

        assertThat(roundtrippedCallConversationEnded).isEqualTo(callConversationEnded)
    }
}
