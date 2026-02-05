// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallMachinePremiumGreetingEndedWebhookEventTest {

    @Test
    fun create() {
        val callMachinePremiumGreetingEndedWebhookEvent =
            CallMachinePremiumGreetingEndedWebhookEvent.builder()
                .data(
                    CallMachinePremiumGreetingEnded.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallMachinePremiumGreetingEnded.EventType
                                .CALL_MACHINE_PREMIUM_GREETING_ENDED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallMachinePremiumGreetingEnded.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .from("+35319605860")
                                .result(
                                    CallMachinePremiumGreetingEnded.Payload.Result.BEEP_DETECTED
                                )
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallMachinePremiumGreetingEnded.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callMachinePremiumGreetingEndedWebhookEvent.data())
            .contains(
                CallMachinePremiumGreetingEnded.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(
                        CallMachinePremiumGreetingEnded.EventType
                            .CALL_MACHINE_PREMIUM_GREETING_ENDED
                    )
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallMachinePremiumGreetingEnded.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callMachinePremiumGreetingEndedWebhookEvent =
            CallMachinePremiumGreetingEndedWebhookEvent.builder()
                .data(
                    CallMachinePremiumGreetingEnded.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallMachinePremiumGreetingEnded.EventType
                                .CALL_MACHINE_PREMIUM_GREETING_ENDED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallMachinePremiumGreetingEnded.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .from("+35319605860")
                                .result(
                                    CallMachinePremiumGreetingEnded.Payload.Result.BEEP_DETECTED
                                )
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallMachinePremiumGreetingEnded.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallMachinePremiumGreetingEndedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callMachinePremiumGreetingEndedWebhookEvent),
                jacksonTypeRef<CallMachinePremiumGreetingEndedWebhookEvent>(),
            )

        assertThat(roundtrippedCallMachinePremiumGreetingEndedWebhookEvent)
            .isEqualTo(callMachinePremiumGreetingEndedWebhookEvent)
    }
}
