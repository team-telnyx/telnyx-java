// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.calls.CustomSipHeader
import com.telnyx.sdk.models.calls.SipHeader
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallAnsweredWebhookEventTest {

    @Test
    fun create() {
        val callAnsweredWebhookEvent =
            CallAnsweredWebhookEvent.builder()
                .data(
                    CallAnswered.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallAnswered.EventType.CALL_ANSWERED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallAnswered.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
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
                                .state(CallAnswered.Payload.State.ANSWERED)
                                .addTag("tag-01")
                                .addTag("tag-02")
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallAnswered.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callAnsweredWebhookEvent.data())
            .contains(
                CallAnswered.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallAnswered.EventType.CALL_ANSWERED)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallAnswered.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
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
                            .state(CallAnswered.Payload.State.ANSWERED)
                            .addTag("tag-01")
                            .addTag("tag-02")
                            .to("+35319605860")
                            .build()
                    )
                    .recordType(CallAnswered.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callAnsweredWebhookEvent =
            CallAnsweredWebhookEvent.builder()
                .data(
                    CallAnswered.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallAnswered.EventType.CALL_ANSWERED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallAnswered.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
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
                                .state(CallAnswered.Payload.State.ANSWERED)
                                .addTag("tag-01")
                                .addTag("tag-02")
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallAnswered.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallAnsweredWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callAnsweredWebhookEvent),
                jacksonTypeRef<CallAnsweredWebhookEvent>(),
            )

        assertThat(roundtrippedCallAnsweredWebhookEvent).isEqualTo(callAnsweredWebhookEvent)
    }
}
