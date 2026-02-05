// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallLeftQueueTest {

    @Test
    fun create() {
        val callLeftQueue =
            CallLeftQueue.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallLeftQueue.EventType.CALL_DEQUEUED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallLeftQueue.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .queue("support")
                        .queuePosition(3L)
                        .reason(CallLeftQueue.Payload.Reason.LEAVE)
                        .waitTimeSecs(60L)
                        .build()
                )
                .recordType(CallLeftQueue.RecordType.EVENT)
                .build()

        assertThat(callLeftQueue.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callLeftQueue.eventType()).contains(CallLeftQueue.EventType.CALL_DEQUEUED)
        assertThat(callLeftQueue.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callLeftQueue.payload())
            .contains(
                CallLeftQueue.Payload.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .queue("support")
                    .queuePosition(3L)
                    .reason(CallLeftQueue.Payload.Reason.LEAVE)
                    .waitTimeSecs(60L)
                    .build()
            )
        assertThat(callLeftQueue.recordType()).contains(CallLeftQueue.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callLeftQueue =
            CallLeftQueue.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallLeftQueue.EventType.CALL_DEQUEUED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallLeftQueue.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .queue("support")
                        .queuePosition(3L)
                        .reason(CallLeftQueue.Payload.Reason.LEAVE)
                        .waitTimeSecs(60L)
                        .build()
                )
                .recordType(CallLeftQueue.RecordType.EVENT)
                .build()

        val roundtrippedCallLeftQueue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callLeftQueue),
                jacksonTypeRef<CallLeftQueue>(),
            )

        assertThat(roundtrippedCallLeftQueue).isEqualTo(callLeftQueue)
    }
}
