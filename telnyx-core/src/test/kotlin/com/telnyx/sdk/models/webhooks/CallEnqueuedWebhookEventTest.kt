// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallEnqueuedWebhookEventTest {

    @Test
    fun create() {
        val callEnqueuedWebhookEvent =
            CallEnqueuedWebhookEvent.builder()
                .data(
                    CallEnqueuedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallEnqueuedWebhookEvent.Data.EventType.CALL_ENQUEUED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallEnqueuedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .currentPosition(5L)
                                .queue("support")
                                .queueAvgWaitTimeSecs(60L)
                                .build()
                        )
                        .recordType(CallEnqueuedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callEnqueuedWebhookEvent.data())
            .contains(
                CallEnqueuedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallEnqueuedWebhookEvent.Data.EventType.CALL_ENQUEUED)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallEnqueuedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .currentPosition(5L)
                            .queue("support")
                            .queueAvgWaitTimeSecs(60L)
                            .build()
                    )
                    .recordType(CallEnqueuedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callEnqueuedWebhookEvent =
            CallEnqueuedWebhookEvent.builder()
                .data(
                    CallEnqueuedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallEnqueuedWebhookEvent.Data.EventType.CALL_ENQUEUED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallEnqueuedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .currentPosition(5L)
                                .queue("support")
                                .queueAvgWaitTimeSecs(60L)
                                .build()
                        )
                        .recordType(CallEnqueuedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallEnqueuedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callEnqueuedWebhookEvent),
                jacksonTypeRef<CallEnqueuedWebhookEvent>(),
            )

        assertThat(roundtrippedCallEnqueuedWebhookEvent).isEqualTo(callEnqueuedWebhookEvent)
    }
}
