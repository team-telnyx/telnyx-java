// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallSpeakEndedWebhookEventTest {

    @Test
    fun create() {
        val callSpeakEndedWebhookEvent =
            CallSpeakEndedWebhookEvent.builder()
                .data(
                    CallSpeakEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallSpeakEndedWebhookEvent.Data.EventType.CALL_SPEAK_ENDED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallSpeakEndedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .status(CallSpeakEndedWebhookEvent.Data.Payload.Status.COMPLETED)
                                .build()
                        )
                        .recordType(CallSpeakEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callSpeakEndedWebhookEvent.data())
            .contains(
                CallSpeakEndedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallSpeakEndedWebhookEvent.Data.EventType.CALL_SPEAK_ENDED)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallSpeakEndedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .status(CallSpeakEndedWebhookEvent.Data.Payload.Status.COMPLETED)
                            .build()
                    )
                    .recordType(CallSpeakEndedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callSpeakEndedWebhookEvent =
            CallSpeakEndedWebhookEvent.builder()
                .data(
                    CallSpeakEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallSpeakEndedWebhookEvent.Data.EventType.CALL_SPEAK_ENDED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallSpeakEndedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .status(CallSpeakEndedWebhookEvent.Data.Payload.Status.COMPLETED)
                                .build()
                        )
                        .recordType(CallSpeakEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallSpeakEndedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callSpeakEndedWebhookEvent),
                jacksonTypeRef<CallSpeakEndedWebhookEvent>(),
            )

        assertThat(roundtrippedCallSpeakEndedWebhookEvent).isEqualTo(callSpeakEndedWebhookEvent)
    }
}
