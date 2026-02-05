// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallMachinePremiumGreetingEndedTest {

    @Test
    fun create() {
        val callMachinePremiumGreetingEnded =
            CallMachinePremiumGreetingEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(
                    CallMachinePremiumGreetingEnded.EventType.CALL_MACHINE_PREMIUM_GREETING_ENDED
                )
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallMachinePremiumGreetingEnded.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .from("+35319605860")
                        .result(CallMachinePremiumGreetingEnded.Payload.Result.BEEP_DETECTED)
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallMachinePremiumGreetingEnded.RecordType.EVENT)
                .build()

        assertThat(callMachinePremiumGreetingEnded.id())
            .contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callMachinePremiumGreetingEnded.eventType())
            .contains(CallMachinePremiumGreetingEnded.EventType.CALL_MACHINE_PREMIUM_GREETING_ENDED)
        assertThat(callMachinePremiumGreetingEnded.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callMachinePremiumGreetingEnded.payload())
            .contains(
                CallMachinePremiumGreetingEnded.Payload.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .from("+35319605860")
                    .result(CallMachinePremiumGreetingEnded.Payload.Result.BEEP_DETECTED)
                    .to("+35319605860")
                    .build()
            )
        assertThat(callMachinePremiumGreetingEnded.recordType())
            .contains(CallMachinePremiumGreetingEnded.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callMachinePremiumGreetingEnded =
            CallMachinePremiumGreetingEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(
                    CallMachinePremiumGreetingEnded.EventType.CALL_MACHINE_PREMIUM_GREETING_ENDED
                )
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallMachinePremiumGreetingEnded.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .from("+35319605860")
                        .result(CallMachinePremiumGreetingEnded.Payload.Result.BEEP_DETECTED)
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallMachinePremiumGreetingEnded.RecordType.EVENT)
                .build()

        val roundtrippedCallMachinePremiumGreetingEnded =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callMachinePremiumGreetingEnded),
                jacksonTypeRef<CallMachinePremiumGreetingEnded>(),
            )

        assertThat(roundtrippedCallMachinePremiumGreetingEnded)
            .isEqualTo(callMachinePremiumGreetingEnded)
    }
}
