// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallSpeakEndedTest {

    @Test
    fun create() {
        val callSpeakEnded =
            CallSpeakEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallSpeakEnded.EventType.CALL_SPEAK_ENDED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallSpeakEnded.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .status(CallSpeakEnded.Payload.Status.COMPLETED)
                        .build()
                )
                .recordType(CallSpeakEnded.RecordType.EVENT)
                .build()

        assertThat(callSpeakEnded.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callSpeakEnded.eventType()).contains(CallSpeakEnded.EventType.CALL_SPEAK_ENDED)
        assertThat(callSpeakEnded.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callSpeakEnded.payload())
            .contains(
                CallSpeakEnded.Payload.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .status(CallSpeakEnded.Payload.Status.COMPLETED)
                    .build()
            )
        assertThat(callSpeakEnded.recordType()).contains(CallSpeakEnded.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callSpeakEnded =
            CallSpeakEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallSpeakEnded.EventType.CALL_SPEAK_ENDED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallSpeakEnded.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .status(CallSpeakEnded.Payload.Status.COMPLETED)
                        .build()
                )
                .recordType(CallSpeakEnded.RecordType.EVENT)
                .build()

        val roundtrippedCallSpeakEnded =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callSpeakEnded),
                jacksonTypeRef<CallSpeakEnded>(),
            )

        assertThat(roundtrippedCallSpeakEnded).isEqualTo(callSpeakEnded)
    }
}
