// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallForkStoppedWebhookEventTest {

    @Test
    fun create() {
        val callForkStoppedWebhookEvent =
            CallForkStoppedWebhookEvent.builder()
                .data(
                    CallForkStoppedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallForkStoppedWebhookEvent.Data.EventType.CALL_FORK_STOPPED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallForkStoppedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .streamType(
                                    CallForkStoppedWebhookEvent.Data.Payload.StreamType.DECRYPTED
                                )
                                .build()
                        )
                        .recordType(CallForkStoppedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callForkStoppedWebhookEvent.data())
            .contains(
                CallForkStoppedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallForkStoppedWebhookEvent.Data.EventType.CALL_FORK_STOPPED)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallForkStoppedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .streamType(
                                CallForkStoppedWebhookEvent.Data.Payload.StreamType.DECRYPTED
                            )
                            .build()
                    )
                    .recordType(CallForkStoppedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callForkStoppedWebhookEvent =
            CallForkStoppedWebhookEvent.builder()
                .data(
                    CallForkStoppedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallForkStoppedWebhookEvent.Data.EventType.CALL_FORK_STOPPED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallForkStoppedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .streamType(
                                    CallForkStoppedWebhookEvent.Data.Payload.StreamType.DECRYPTED
                                )
                                .build()
                        )
                        .recordType(CallForkStoppedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallForkStoppedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callForkStoppedWebhookEvent),
                jacksonTypeRef<CallForkStoppedWebhookEvent>(),
            )

        assertThat(roundtrippedCallForkStoppedWebhookEvent).isEqualTo(callForkStoppedWebhookEvent)
    }
}
