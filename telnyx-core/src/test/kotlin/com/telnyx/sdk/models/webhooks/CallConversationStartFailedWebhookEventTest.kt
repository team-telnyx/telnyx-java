// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallConversationStartFailedWebhookEventTest {

    @Test
    fun create() {
        val callConversationStartFailedWebhookEvent =
            CallConversationStartFailedWebhookEvent.builder()
                .data(
                    CallConversationStartFailedWebhookEvent.Data.builder()
                        .id("3f1c2a9e-8d4b-4c6e-9a7f-1b2c3d4e5f60")
                        .createdAt(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
                        .eventType(
                            CallConversationStartFailedWebhookEvent.Data.EventType
                                .CALL_CONVERSATION_START_FAILED
                        )
                        .occurredAt(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
                        .payload(
                            CallConversationStartFailedWebhookEvent.Data.Payload.builder()
                                .assistantId("assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d")
                                .callControlId(
                                    "v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ"
                                )
                                .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                                .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                                .callingPartyType(
                                    CallConversationStartFailedWebhookEvent.Data.Payload
                                        .CallingPartyType
                                        .SIP
                                )
                                .clientState(
                                    "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                                )
                                .connectionId("2694492062593582591")
                                .from("+13124287921")
                                .reason(
                                    CallConversationStartFailedWebhookEvent.Data.Payload.Reason
                                        .INVALID_REQUEST
                                )
                                .to("+13125550100")
                                .build()
                        )
                        .recordType(CallConversationStartFailedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callConversationStartFailedWebhookEvent.data())
            .contains(
                CallConversationStartFailedWebhookEvent.Data.builder()
                    .id("3f1c2a9e-8d4b-4c6e-9a7f-1b2c3d4e5f60")
                    .createdAt(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
                    .eventType(
                        CallConversationStartFailedWebhookEvent.Data.EventType
                            .CALL_CONVERSATION_START_FAILED
                    )
                    .occurredAt(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
                    .payload(
                        CallConversationStartFailedWebhookEvent.Data.Payload.builder()
                            .assistantId("assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d")
                            .callControlId(
                                "v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ"
                            )
                            .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                            .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                            .callingPartyType(
                                CallConversationStartFailedWebhookEvent.Data.Payload
                                    .CallingPartyType
                                    .SIP
                            )
                            .clientState(
                                "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                            )
                            .connectionId("2694492062593582591")
                            .from("+13124287921")
                            .reason(
                                CallConversationStartFailedWebhookEvent.Data.Payload.Reason
                                    .INVALID_REQUEST
                            )
                            .to("+13125550100")
                            .build()
                    )
                    .recordType(CallConversationStartFailedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callConversationStartFailedWebhookEvent =
            CallConversationStartFailedWebhookEvent.builder()
                .data(
                    CallConversationStartFailedWebhookEvent.Data.builder()
                        .id("3f1c2a9e-8d4b-4c6e-9a7f-1b2c3d4e5f60")
                        .createdAt(OffsetDateTime.parse("2025-05-29T13:35:38.927621Z"))
                        .eventType(
                            CallConversationStartFailedWebhookEvent.Data.EventType
                                .CALL_CONVERSATION_START_FAILED
                        )
                        .occurredAt(OffsetDateTime.parse("2025-05-29T13:35:38.817785Z"))
                        .payload(
                            CallConversationStartFailedWebhookEvent.Data.Payload.builder()
                                .assistantId("assistant-d9082b56-ba2d-4ad1-a50c-58661eb1463d")
                                .callControlId(
                                    "v3:HDR1vQHx697hpP9xZ0bhlbUOWPFPDtPcxw-nuSMuC6mGVpb0euoklQ"
                                )
                                .callLegId("cc29cce6-3c91-11f0-a8e5-02420aef3d20")
                                .callSessionId("cc29c8d6-3c91-11f0-aa7c-02420aef3d20")
                                .callingPartyType(
                                    CallConversationStartFailedWebhookEvent.Data.Payload
                                        .CallingPartyType
                                        .SIP
                                )
                                .clientState(
                                    "g3QAAAACbQAAAAtkYXRhX2NlbnRlcm0AAAADY2gxbQAAAApkZXBsb3ltZW50bQAAAARiYXNl"
                                )
                                .connectionId("2694492062593582591")
                                .from("+13124287921")
                                .reason(
                                    CallConversationStartFailedWebhookEvent.Data.Payload.Reason
                                        .INVALID_REQUEST
                                )
                                .to("+13125550100")
                                .build()
                        )
                        .recordType(CallConversationStartFailedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallConversationStartFailedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callConversationStartFailedWebhookEvent),
                jacksonTypeRef<CallConversationStartFailedWebhookEvent>(),
            )

        assertThat(roundtrippedCallConversationStartFailedWebhookEvent)
            .isEqualTo(callConversationStartFailedWebhookEvent)
    }
}
