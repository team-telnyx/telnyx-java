// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallConversationEndedWebhookEventTest {

    @Test
    fun create() {
        val callConversationEndedWebhookEvent =
            CallConversationEndedWebhookEvent.builder()
                .data(
                    CallConversationEndedWebhookEvent.Data.builder()
                        .id("eb8775a6-634f-48b0-b177-d5465a8a8e9f")
                        .createdAt(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
                        .eventType(
                            CallConversationEndedWebhookEvent.Data.EventType.CALL_CONVERSATION_ENDED
                        )
                        .occurredAt(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
                        .payload(
                            CallConversationEndedWebhookEvent.Data.Payload.builder()
                                .assistantId("assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d")
                                .callControlId(
                                    "v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ"
                                )
                                .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                                .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                                .callingPartyType(
                                    CallConversationEndedWebhookEvent.Data.Payload.CallingPartyType
                                        .SIP
                                )
                                .clientState(
                                    "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                                )
                                .connectionId("2694492062593582591")
                                .conversationId("0424805b-adc1-4ff8-9f95-e1de6883ecbe")
                                .durationSec(3L)
                                .from("+13124287921")
                                .llmModel("openai/gpt-4o")
                                .sttModel("distil-whisper/distil-large-v2")
                                .to(
                                    "jamesw@assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d.sip.telnyx.com"
                                )
                                .ttsModelId("Natural")
                                .ttsProvider("telnyx")
                                .ttsVoiceId("Marissa")
                                .build()
                        )
                        .recordType(CallConversationEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callConversationEndedWebhookEvent.data())
            .contains(
                CallConversationEndedWebhookEvent.Data.builder()
                    .id("eb8775a6-634f-48b0-b177-d5465a8a8e9f")
                    .createdAt(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
                    .eventType(
                        CallConversationEndedWebhookEvent.Data.EventType.CALL_CONVERSATION_ENDED
                    )
                    .occurredAt(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
                    .payload(
                        CallConversationEndedWebhookEvent.Data.Payload.builder()
                            .assistantId("assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d")
                            .callControlId(
                                "v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ"
                            )
                            .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                            .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                            .callingPartyType(
                                CallConversationEndedWebhookEvent.Data.Payload.CallingPartyType.SIP
                            )
                            .clientState(
                                "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                            )
                            .connectionId("2694492062593582591")
                            .conversationId("0424805b-adc1-4ff8-9f95-e1de6883ecbe")
                            .durationSec(3L)
                            .from("+13124287921")
                            .llmModel("openai/gpt-4o")
                            .sttModel("distil-whisper/distil-large-v2")
                            .to(
                                "jamesw@assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d.sip.telnyx.com"
                            )
                            .ttsModelId("Natural")
                            .ttsProvider("telnyx")
                            .ttsVoiceId("Marissa")
                            .build()
                    )
                    .recordType(CallConversationEndedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callConversationEndedWebhookEvent =
            CallConversationEndedWebhookEvent.builder()
                .data(
                    CallConversationEndedWebhookEvent.Data.builder()
                        .id("eb8775a6-634f-48b0-b177-d5465a8a8e9f")
                        .createdAt(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
                        .eventType(
                            CallConversationEndedWebhookEvent.Data.EventType.CALL_CONVERSATION_ENDED
                        )
                        .occurredAt(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
                        .payload(
                            CallConversationEndedWebhookEvent.Data.Payload.builder()
                                .assistantId("assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d")
                                .callControlId(
                                    "v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ"
                                )
                                .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                                .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                                .callingPartyType(
                                    CallConversationEndedWebhookEvent.Data.Payload.CallingPartyType
                                        .SIP
                                )
                                .clientState(
                                    "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                                )
                                .connectionId("2694492062593582591")
                                .conversationId("0424805b-adc1-4ff8-9f95-e1de6883ecbe")
                                .durationSec(3L)
                                .from("+13124287921")
                                .llmModel("openai/gpt-4o")
                                .sttModel("distil-whisper/distil-large-v2")
                                .to(
                                    "jamesw@assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d.sip.telnyx.com"
                                )
                                .ttsModelId("Natural")
                                .ttsProvider("telnyx")
                                .ttsVoiceId("Marissa")
                                .build()
                        )
                        .recordType(CallConversationEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallConversationEndedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callConversationEndedWebhookEvent),
                jacksonTypeRef<CallConversationEndedWebhookEvent>(),
            )

        assertThat(roundtrippedCallConversationEndedWebhookEvent)
            .isEqualTo(callConversationEndedWebhookEvent)
    }
}
