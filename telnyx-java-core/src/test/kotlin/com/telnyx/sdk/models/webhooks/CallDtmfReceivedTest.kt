// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallDtmfReceivedTest {

    @Test
    fun create() {
        val callDtmfReceived =
            CallDtmfReceived.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallDtmfReceived.EventType.CALL_DTMF_RECEIVED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallDtmfReceived.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .digit("#")
                        .from("+35319605860")
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallDtmfReceived.RecordType.EVENT)
                .build()

        assertThat(callDtmfReceived.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callDtmfReceived.eventType())
            .contains(CallDtmfReceived.EventType.CALL_DTMF_RECEIVED)
        assertThat(callDtmfReceived.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callDtmfReceived.payload())
            .contains(
                CallDtmfReceived.Payload.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .digit("#")
                    .from("+35319605860")
                    .to("+35319605860")
                    .build()
            )
        assertThat(callDtmfReceived.recordType()).contains(CallDtmfReceived.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callDtmfReceived =
            CallDtmfReceived.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallDtmfReceived.EventType.CALL_DTMF_RECEIVED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallDtmfReceived.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .digit("#")
                        .from("+35319605860")
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallDtmfReceived.RecordType.EVENT)
                .build()

        val roundtrippedCallDtmfReceived =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callDtmfReceived),
                jacksonTypeRef<CallDtmfReceived>(),
            )

        assertThat(roundtrippedCallDtmfReceived).isEqualTo(callDtmfReceived)
    }
}
