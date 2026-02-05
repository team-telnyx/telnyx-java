// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallReferFailedTest {

    @Test
    fun create() {
        val callReferFailed =
            CallReferFailed.builder()
                .id("fbeb70e0-54eb-4e26-8d19-56b43e66f754")
                .eventType(CallReferFailed.EventType.CALL_REFER_FAILED)
                .occurredAt(OffsetDateTime.parse("2020-03-30T13:29:42.130013Z"))
                .payload(
                    CallReferFailed.Payload.builder()
                        .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                        .callLegId("817f7de8-728a-11ea-9ce6-02420a0f8969")
                        .callSessionId("817f8c2a-728a-11ea-9cbe-02420a0f8969")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("1289082222292239760")
                        .from("+35319605860")
                        .sipNotifyResponse(603L)
                        .to("+13129457420")
                        .build()
                )
                .recordType(CallReferFailed.RecordType.EVENT)
                .build()

        assertThat(callReferFailed.id()).contains("fbeb70e0-54eb-4e26-8d19-56b43e66f754")
        assertThat(callReferFailed.eventType())
            .contains(CallReferFailed.EventType.CALL_REFER_FAILED)
        assertThat(callReferFailed.occurredAt())
            .contains(OffsetDateTime.parse("2020-03-30T13:29:42.130013Z"))
        assertThat(callReferFailed.payload())
            .contains(
                CallReferFailed.Payload.builder()
                    .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                    .callLegId("817f7de8-728a-11ea-9ce6-02420a0f8969")
                    .callSessionId("817f8c2a-728a-11ea-9cbe-02420a0f8969")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("1289082222292239760")
                    .from("+35319605860")
                    .sipNotifyResponse(603L)
                    .to("+13129457420")
                    .build()
            )
        assertThat(callReferFailed.recordType()).contains(CallReferFailed.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callReferFailed =
            CallReferFailed.builder()
                .id("fbeb70e0-54eb-4e26-8d19-56b43e66f754")
                .eventType(CallReferFailed.EventType.CALL_REFER_FAILED)
                .occurredAt(OffsetDateTime.parse("2020-03-30T13:29:42.130013Z"))
                .payload(
                    CallReferFailed.Payload.builder()
                        .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                        .callLegId("817f7de8-728a-11ea-9ce6-02420a0f8969")
                        .callSessionId("817f8c2a-728a-11ea-9cbe-02420a0f8969")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("1289082222292239760")
                        .from("+35319605860")
                        .sipNotifyResponse(603L)
                        .to("+13129457420")
                        .build()
                )
                .recordType(CallReferFailed.RecordType.EVENT)
                .build()

        val roundtrippedCallReferFailed =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callReferFailed),
                jacksonTypeRef<CallReferFailed>(),
            )

        assertThat(roundtrippedCallReferFailed).isEqualTo(callReferFailed)
    }
}
