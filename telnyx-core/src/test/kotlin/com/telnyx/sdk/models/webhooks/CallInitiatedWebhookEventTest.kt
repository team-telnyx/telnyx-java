// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.calls.CustomSipHeader
import com.telnyx.sdk.models.calls.SipHeader
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallInitiatedWebhookEventTest {

    @Test
    fun create() {
        val callInitiatedWebhookEvent =
            CallInitiatedWebhookEvent.builder()
                .data(
                    CallInitiatedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallInitiatedWebhookEvent.Data.EventType.CALL_INITIATED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallInitiatedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callScreeningResult("spam_likely")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callerIdName("+35319605860")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionCodecs("G722,PCMU,PCMA")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .addCustomHeader(
                                    CustomSipHeader.builder().name("head_1").value("val_1").build()
                                )
                                .addCustomHeader(
                                    CustomSipHeader.builder().name("head_2").value("val_2").build()
                                )
                                .direction(
                                    CallInitiatedWebhookEvent.Data.Payload.Direction.INCOMING
                                )
                                .from("+35319605860")
                                .offeredCodecs("G722,PCMU,PCMA")
                                .shakenStirAttestation("A")
                                .shakenStirValidated(true)
                                .addSipHeader(
                                    SipHeader.builder()
                                        .name(SipHeader.Name.USER_TO_USER)
                                        .value("1234")
                                        .build()
                                )
                                .addSipHeader(
                                    SipHeader.builder()
                                        .name(SipHeader.Name.USER_TO_USER)
                                        .value("<sip:111@192.168.1.1>")
                                        .build()
                                )
                                .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                                .state(CallInitiatedWebhookEvent.Data.Payload.State.PARKED)
                                .addTag("tag-01")
                                .addTag("tag-02")
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallInitiatedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callInitiatedWebhookEvent.data())
            .contains(
                CallInitiatedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallInitiatedWebhookEvent.Data.EventType.CALL_INITIATED)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallInitiatedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callScreeningResult("spam_likely")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callerIdName("+35319605860")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionCodecs("G722,PCMU,PCMA")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .addCustomHeader(
                                CustomSipHeader.builder().name("head_1").value("val_1").build()
                            )
                            .addCustomHeader(
                                CustomSipHeader.builder().name("head_2").value("val_2").build()
                            )
                            .direction(CallInitiatedWebhookEvent.Data.Payload.Direction.INCOMING)
                            .from("+35319605860")
                            .offeredCodecs("G722,PCMU,PCMA")
                            .shakenStirAttestation("A")
                            .shakenStirValidated(true)
                            .addSipHeader(
                                SipHeader.builder()
                                    .name(SipHeader.Name.USER_TO_USER)
                                    .value("1234")
                                    .build()
                            )
                            .addSipHeader(
                                SipHeader.builder()
                                    .name(SipHeader.Name.USER_TO_USER)
                                    .value("<sip:111@192.168.1.1>")
                                    .build()
                            )
                            .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                            .state(CallInitiatedWebhookEvent.Data.Payload.State.PARKED)
                            .addTag("tag-01")
                            .addTag("tag-02")
                            .to("+35319605860")
                            .build()
                    )
                    .recordType(CallInitiatedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callInitiatedWebhookEvent =
            CallInitiatedWebhookEvent.builder()
                .data(
                    CallInitiatedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallInitiatedWebhookEvent.Data.EventType.CALL_INITIATED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallInitiatedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callScreeningResult("spam_likely")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callerIdName("+35319605860")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionCodecs("G722,PCMU,PCMA")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .addCustomHeader(
                                    CustomSipHeader.builder().name("head_1").value("val_1").build()
                                )
                                .addCustomHeader(
                                    CustomSipHeader.builder().name("head_2").value("val_2").build()
                                )
                                .direction(
                                    CallInitiatedWebhookEvent.Data.Payload.Direction.INCOMING
                                )
                                .from("+35319605860")
                                .offeredCodecs("G722,PCMU,PCMA")
                                .shakenStirAttestation("A")
                                .shakenStirValidated(true)
                                .addSipHeader(
                                    SipHeader.builder()
                                        .name(SipHeader.Name.USER_TO_USER)
                                        .value("1234")
                                        .build()
                                )
                                .addSipHeader(
                                    SipHeader.builder()
                                        .name(SipHeader.Name.USER_TO_USER)
                                        .value("<sip:111@192.168.1.1>")
                                        .build()
                                )
                                .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                                .state(CallInitiatedWebhookEvent.Data.Payload.State.PARKED)
                                .addTag("tag-01")
                                .addTag("tag-02")
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallInitiatedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallInitiatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callInitiatedWebhookEvent),
                jacksonTypeRef<CallInitiatedWebhookEvent>(),
            )

        assertThat(roundtrippedCallInitiatedWebhookEvent).isEqualTo(callInitiatedWebhookEvent)
    }
}
