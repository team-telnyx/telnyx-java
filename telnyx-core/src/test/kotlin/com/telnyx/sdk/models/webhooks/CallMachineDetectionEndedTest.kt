// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallMachineDetectionEndedTest {

    @Test
    fun create() {
        val callMachineDetectionEnded =
            CallMachineDetectionEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallMachineDetectionEnded.EventType.CALL_MACHINE_DETECTION_ENDED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallMachineDetectionEnded.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .from("+35319605860")
                        .result(CallMachineDetectionEnded.Payload.Result.HUMAN)
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallMachineDetectionEnded.RecordType.EVENT)
                .build()

        assertThat(callMachineDetectionEnded.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callMachineDetectionEnded.eventType())
            .contains(CallMachineDetectionEnded.EventType.CALL_MACHINE_DETECTION_ENDED)
        assertThat(callMachineDetectionEnded.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callMachineDetectionEnded.payload())
            .contains(
                CallMachineDetectionEnded.Payload.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .from("+35319605860")
                    .result(CallMachineDetectionEnded.Payload.Result.HUMAN)
                    .to("+35319605860")
                    .build()
            )
        assertThat(callMachineDetectionEnded.recordType())
            .contains(CallMachineDetectionEnded.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callMachineDetectionEnded =
            CallMachineDetectionEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallMachineDetectionEnded.EventType.CALL_MACHINE_DETECTION_ENDED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallMachineDetectionEnded.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .from("+35319605860")
                        .result(CallMachineDetectionEnded.Payload.Result.HUMAN)
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallMachineDetectionEnded.RecordType.EVENT)
                .build()

        val roundtrippedCallMachineDetectionEnded =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callMachineDetectionEnded),
                jacksonTypeRef<CallMachineDetectionEnded>(),
            )

        assertThat(roundtrippedCallMachineDetectionEnded).isEqualTo(callMachineDetectionEnded)
    }
}
