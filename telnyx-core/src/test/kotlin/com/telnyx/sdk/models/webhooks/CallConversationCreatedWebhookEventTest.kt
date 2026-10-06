// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallConversationCreatedWebhookEventTest {

    @Test
    fun create() {
        val callConversationCreatedWebhookEvent =
            CallConversationCreatedWebhookEvent.builder()
                .data(
                    CallConversationCreatedWebhookEvent.Data.builder()
                        .id("eb8775a6-634f-48b0-b177-d5465a8a8e9f")
                        .createdAt(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
                        .eventType(
                            CallConversationCreatedWebhookEvent.Data.EventType
                                .CALL_CONVERSATION_CREATED
                        )
                        .occurredAt(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
                        .payload(
                            CallConversationCreatedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ"
                                )
                                .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                                .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                                .callingPartyType(
                                    CallConversationCreatedWebhookEvent.Data.Payload
                                        .CallingPartyType
                                        .SIP
                                )
                                .clientState(
                                    "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                                )
                                .connectionId("2694492062593582591")
                                .conversationId("0424805b-adc1-4ff8-9f95-e1de6883ecbe")
                                .from("+13124287921")
                                .to("+13125550100")
                                .build()
                        )
                        .recordType(CallConversationCreatedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callConversationCreatedWebhookEvent.data())
            .contains(
                CallConversationCreatedWebhookEvent.Data.builder()
                    .id("eb8775a6-634f-48b0-b177-d5465a8a8e9f")
                    .createdAt(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
                    .eventType(
                        CallConversationCreatedWebhookEvent.Data.EventType.CALL_CONVERSATION_CREATED
                    )
                    .occurredAt(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
                    .payload(
                        CallConversationCreatedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ"
                            )
                            .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                            .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                            .callingPartyType(
                                CallConversationCreatedWebhookEvent.Data.Payload.CallingPartyType
                                    .SIP
                            )
                            .clientState(
                                "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                            )
                            .connectionId("2694492062593582591")
                            .conversationId("0424805b-adc1-4ff8-9f95-e1de6883ecbe")
                            .from("+13124287921")
                            .to("+13125550100")
                            .build()
                    )
                    .recordType(CallConversationCreatedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callConversationCreatedWebhookEvent =
            CallConversationCreatedWebhookEvent.builder()
                .data(
                    CallConversationCreatedWebhookEvent.Data.builder()
                        .id("eb8775a6-634f-48b0-b177-d5465a8a8e9f")
                        .createdAt(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
                        .eventType(
                            CallConversationCreatedWebhookEvent.Data.EventType
                                .CALL_CONVERSATION_CREATED
                        )
                        .occurredAt(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
                        .payload(
                            CallConversationCreatedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ"
                                )
                                .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                                .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                                .callingPartyType(
                                    CallConversationCreatedWebhookEvent.Data.Payload
                                        .CallingPartyType
                                        .SIP
                                )
                                .clientState(
                                    "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                                )
                                .connectionId("2694492062593582591")
                                .conversationId("0424805b-adc1-4ff8-9f95-e1de6883ecbe")
                                .from("+13124287921")
                                .to("+13125550100")
                                .build()
                        )
                        .recordType(CallConversationCreatedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallConversationCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callConversationCreatedWebhookEvent),
                jacksonTypeRef<CallConversationCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedCallConversationCreatedWebhookEvent)
            .isEqualTo(callConversationCreatedWebhookEvent)
    }
}
