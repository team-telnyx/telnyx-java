// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallMachinePremiumCallScreeningDetectedWebhookEventTest {

    @Test
    fun create() {
        val callMachinePremiumCallScreeningDetectedWebhookEvent =
            CallMachinePremiumCallScreeningDetectedWebhookEvent.builder()
                .data(
                    CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.EventType
                                .CALL_MACHINE_PREMIUM_CALL_SCREENING_DETECTED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.Payload
                                .builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .from("+35319605860")
                                .result(
                                    CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.Payload
                                        .Result
                                        .SCREENING
                                )
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(
                            CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.RecordType
                                .EVENT
                        )
                        .build()
                )
                .build()

        assertThat(callMachinePremiumCallScreeningDetectedWebhookEvent.data())
            .contains(
                CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(
                        CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.EventType
                            .CALL_MACHINE_PREMIUM_CALL_SCREENING_DETECTED
                    )
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .from("+35319605860")
                            .result(
                                CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.Payload
                                    .Result
                                    .SCREENING
                            )
                            .to("+35319605860")
                            .build()
                    )
                    .recordType(
                        CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.RecordType.EVENT
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callMachinePremiumCallScreeningDetectedWebhookEvent =
            CallMachinePremiumCallScreeningDetectedWebhookEvent.builder()
                .data(
                    CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.EventType
                                .CALL_MACHINE_PREMIUM_CALL_SCREENING_DETECTED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.Payload
                                .builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .from("+35319605860")
                                .result(
                                    CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.Payload
                                        .Result
                                        .SCREENING
                                )
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(
                            CallMachinePremiumCallScreeningDetectedWebhookEvent.Data.RecordType
                                .EVENT
                        )
                        .build()
                )
                .build()

        val roundtrippedCallMachinePremiumCallScreeningDetectedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callMachinePremiumCallScreeningDetectedWebhookEvent),
                jacksonTypeRef<CallMachinePremiumCallScreeningDetectedWebhookEvent>(),
            )

        assertThat(roundtrippedCallMachinePremiumCallScreeningDetectedWebhookEvent)
            .isEqualTo(callMachinePremiumCallScreeningDetectedWebhookEvent)
    }
}
