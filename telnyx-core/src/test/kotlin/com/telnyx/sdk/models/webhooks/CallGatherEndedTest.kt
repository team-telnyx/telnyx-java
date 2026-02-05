// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallGatherEndedTest {

    @Test
    fun create() {
        val callGatherEnded =
            CallGatherEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallGatherEnded.EventType.CALL_GATHER_ENDED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallGatherEnded.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .digits("123")
                        .from("+35319605860")
                        .status(CallGatherEnded.Payload.Status.VALID)
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallGatherEnded.RecordType.EVENT)
                .build()

        assertThat(callGatherEnded.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callGatherEnded.eventType())
            .contains(CallGatherEnded.EventType.CALL_GATHER_ENDED)
        assertThat(callGatherEnded.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callGatherEnded.payload())
            .contains(
                CallGatherEnded.Payload.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .digits("123")
                    .from("+35319605860")
                    .status(CallGatherEnded.Payload.Status.VALID)
                    .to("+35319605860")
                    .build()
            )
        assertThat(callGatherEnded.recordType()).contains(CallGatherEnded.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callGatherEnded =
            CallGatherEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallGatherEnded.EventType.CALL_GATHER_ENDED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallGatherEnded.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .digits("123")
                        .from("+35319605860")
                        .status(CallGatherEnded.Payload.Status.VALID)
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallGatherEnded.RecordType.EVENT)
                .build()

        val roundtrippedCallGatherEnded =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callGatherEnded),
                jacksonTypeRef<CallGatherEnded>(),
            )

        assertThat(roundtrippedCallGatherEnded).isEqualTo(callGatherEnded)
    }
}
