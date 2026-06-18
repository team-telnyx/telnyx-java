// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.calls.CustomSipHeader
import com.telnyx.sdk.models.calls.SipHeader
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallHangupWebhookEventTest {

    @Test
    fun create() {
        val callHangupWebhookEvent =
            CallHangupWebhookEvent.builder()
                .data(
                    CallHangup.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallHangup.EventType.CALL_HANGUP)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallHangup.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callQualityStats(
                                    CallHangup.Payload.CallQualityStats.builder()
                                        .inbound(
                                            CallHangup.Payload.CallQualityStats.Inbound.builder()
                                                .jitterMaxVariance("2.74")
                                                .jitterPacketCount("0")
                                                .mos("4.50")
                                                .packetCount("591")
                                                .skipPacketCount("9")
                                                .build()
                                        )
                                        .outbound(
                                            CallHangup.Payload.CallQualityStats.Outbound.builder()
                                                .packetCount("0")
                                                .skipPacketCount("0")
                                                .build()
                                        )
                                        .build()
                                )
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .addCustomHeader(
                                    CustomSipHeader.builder().name("head_1").value("val_1").build()
                                )
                                .addCustomHeader(
                                    CustomSipHeader.builder().name("head_2").value("val_2").build()
                                )
                                .from("+35319605860")
                                .hangupCause(CallHangup.Payload.HangupCause.CALL_REJECTED)
                                .hangupSource(CallHangup.Payload.HangupSource.CALLER)
                                .sipHangupCause("603")
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
                                .startTime(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                                .state(CallHangup.Payload.State.HANGUP)
                                .addTag("tag-01")
                                .addTag("tag-02")
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallHangup.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callHangupWebhookEvent.data())
            .contains(
                CallHangup.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallHangup.EventType.CALL_HANGUP)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallHangup.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callQualityStats(
                                CallHangup.Payload.CallQualityStats.builder()
                                    .inbound(
                                        CallHangup.Payload.CallQualityStats.Inbound.builder()
                                            .jitterMaxVariance("2.74")
                                            .jitterPacketCount("0")
                                            .mos("4.50")
                                            .packetCount("591")
                                            .skipPacketCount("9")
                                            .build()
                                    )
                                    .outbound(
                                        CallHangup.Payload.CallQualityStats.Outbound.builder()
                                            .packetCount("0")
                                            .skipPacketCount("0")
                                            .build()
                                    )
                                    .build()
                            )
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .addCustomHeader(
                                CustomSipHeader.builder().name("head_1").value("val_1").build()
                            )
                            .addCustomHeader(
                                CustomSipHeader.builder().name("head_2").value("val_2").build()
                            )
                            .from("+35319605860")
                            .hangupCause(CallHangup.Payload.HangupCause.CALL_REJECTED)
                            .hangupSource(CallHangup.Payload.HangupSource.CALLER)
                            .sipHangupCause("603")
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
                            .startTime(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                            .state(CallHangup.Payload.State.HANGUP)
                            .addTag("tag-01")
                            .addTag("tag-02")
                            .to("+35319605860")
                            .build()
                    )
                    .recordType(CallHangup.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callHangupWebhookEvent =
            CallHangupWebhookEvent.builder()
                .data(
                    CallHangup.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallHangup.EventType.CALL_HANGUP)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallHangup.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callQualityStats(
                                    CallHangup.Payload.CallQualityStats.builder()
                                        .inbound(
                                            CallHangup.Payload.CallQualityStats.Inbound.builder()
                                                .jitterMaxVariance("2.74")
                                                .jitterPacketCount("0")
                                                .mos("4.50")
                                                .packetCount("591")
                                                .skipPacketCount("9")
                                                .build()
                                        )
                                        .outbound(
                                            CallHangup.Payload.CallQualityStats.Outbound.builder()
                                                .packetCount("0")
                                                .skipPacketCount("0")
                                                .build()
                                        )
                                        .build()
                                )
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .addCustomHeader(
                                    CustomSipHeader.builder().name("head_1").value("val_1").build()
                                )
                                .addCustomHeader(
                                    CustomSipHeader.builder().name("head_2").value("val_2").build()
                                )
                                .from("+35319605860")
                                .hangupCause(CallHangup.Payload.HangupCause.CALL_REJECTED)
                                .hangupSource(CallHangup.Payload.HangupSource.CALLER)
                                .sipHangupCause("603")
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
                                .startTime(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                                .state(CallHangup.Payload.State.HANGUP)
                                .addTag("tag-01")
                                .addTag("tag-02")
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallHangup.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallHangupWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callHangupWebhookEvent),
                jacksonTypeRef<CallHangupWebhookEvent>(),
            )

        assertThat(roundtrippedCallHangupWebhookEvent).isEqualTo(callHangupWebhookEvent)
    }
}
