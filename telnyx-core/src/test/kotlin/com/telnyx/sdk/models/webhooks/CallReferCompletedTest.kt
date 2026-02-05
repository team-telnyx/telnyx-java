// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallReferCompletedTest {

    @Test
    fun create() {
        val callReferCompleted =
            CallReferCompleted.builder()
                .id("4ce4366d-8d87-44be-a00b-942154e9c5f5")
                .eventType(CallReferCompleted.EventType.CALL_REFER_COMPLETED)
                .occurredAt(OffsetDateTime.parse("2020-03-30T13:29:44.650000Z"))
                .payload(
                    CallReferCompleted.Payload.builder()
                        .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                        .callLegId("817f7de8-728a-11ea-9ce6-02420a0f8969")
                        .callSessionId("817f8c2a-728a-11ea-9cbe-02420a0f8969")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("1289082222292239760")
                        .from("+35319605860")
                        .sipNotifyResponse(200L)
                        .to("+13129457420")
                        .build()
                )
                .recordType(CallReferCompleted.RecordType.EVENT)
                .build()

        assertThat(callReferCompleted.id()).contains("4ce4366d-8d87-44be-a00b-942154e9c5f5")
        assertThat(callReferCompleted.eventType())
            .contains(CallReferCompleted.EventType.CALL_REFER_COMPLETED)
        assertThat(callReferCompleted.occurredAt())
            .contains(OffsetDateTime.parse("2020-03-30T13:29:44.650000Z"))
        assertThat(callReferCompleted.payload())
            .contains(
                CallReferCompleted.Payload.builder()
                    .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                    .callLegId("817f7de8-728a-11ea-9ce6-02420a0f8969")
                    .callSessionId("817f8c2a-728a-11ea-9cbe-02420a0f8969")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("1289082222292239760")
                    .from("+35319605860")
                    .sipNotifyResponse(200L)
                    .to("+13129457420")
                    .build()
            )
        assertThat(callReferCompleted.recordType()).contains(CallReferCompleted.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callReferCompleted =
            CallReferCompleted.builder()
                .id("4ce4366d-8d87-44be-a00b-942154e9c5f5")
                .eventType(CallReferCompleted.EventType.CALL_REFER_COMPLETED)
                .occurredAt(OffsetDateTime.parse("2020-03-30T13:29:44.650000Z"))
                .payload(
                    CallReferCompleted.Payload.builder()
                        .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                        .callLegId("817f7de8-728a-11ea-9ce6-02420a0f8969")
                        .callSessionId("817f8c2a-728a-11ea-9cbe-02420a0f8969")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("1289082222292239760")
                        .from("+35319605860")
                        .sipNotifyResponse(200L)
                        .to("+13129457420")
                        .build()
                )
                .recordType(CallReferCompleted.RecordType.EVENT)
                .build()

        val roundtrippedCallReferCompleted =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callReferCompleted),
                jacksonTypeRef<CallReferCompleted>(),
            )

        assertThat(roundtrippedCallReferCompleted).isEqualTo(callReferCompleted)
    }
}
