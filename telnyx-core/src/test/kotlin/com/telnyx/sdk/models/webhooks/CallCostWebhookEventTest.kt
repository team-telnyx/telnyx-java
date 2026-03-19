// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallCostWebhookEventTest {

    @Test
    fun create() {
        val callCostWebhookEvent =
            CallCostWebhookEvent.builder()
                .data(
                    CallCostWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallCostWebhookEvent.Data.EventType.CALL_COST)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallCostWebhookEvent.Data.Payload.builder()
                                .billedDurationSecs(120L)
                                .billingGroupId("f5586561-8ff0-4291-a0ac-84fe544797bd")
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .costParts(
                                    listOf(
                                        CallCostWebhookEvent.Data.Payload.CostPart.builder()
                                            .billedDurationSecs(60L)
                                            .callPart("sip-trunking")
                                            .cost("0.0050")
                                            .currency("USD")
                                            .rate("0.0050")
                                            .build(),
                                        CallCostWebhookEvent.Data.Payload.CostPart.builder()
                                            .billedDurationSecs(120L)
                                            .callPart("call-recording")
                                            .cost("0.0038")
                                            .currency("USD")
                                            .rate("0.00190")
                                            .build(),
                                        CallCostWebhookEvent.Data.Payload.CostPart.builder()
                                            .billedDurationSecs(60L)
                                            .callPart("call-control")
                                            .cost("0.0018")
                                            .currency("USD")
                                            .rate("0.00180")
                                            .build(),
                                    )
                                )
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                                .status(CallCostWebhookEvent.Data.Payload.Status.SUCCESS)
                                .totalCost("0.0106")
                                .build()
                        )
                        .recordType(CallCostWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callCostWebhookEvent.data())
            .contains(
                CallCostWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallCostWebhookEvent.Data.EventType.CALL_COST)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallCostWebhookEvent.Data.Payload.builder()
                            .billedDurationSecs(120L)
                            .billingGroupId("f5586561-8ff0-4291-a0ac-84fe544797bd")
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .costParts(
                                listOf(
                                    CallCostWebhookEvent.Data.Payload.CostPart.builder()
                                        .billedDurationSecs(60L)
                                        .callPart("sip-trunking")
                                        .cost("0.0050")
                                        .currency("USD")
                                        .rate("0.0050")
                                        .build(),
                                    CallCostWebhookEvent.Data.Payload.CostPart.builder()
                                        .billedDurationSecs(120L)
                                        .callPart("call-recording")
                                        .cost("0.0038")
                                        .currency("USD")
                                        .rate("0.00190")
                                        .build(),
                                    CallCostWebhookEvent.Data.Payload.CostPart.builder()
                                        .billedDurationSecs(60L)
                                        .callPart("call-control")
                                        .cost("0.0018")
                                        .currency("USD")
                                        .rate("0.00180")
                                        .build(),
                                )
                            )
                            .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                            .status(CallCostWebhookEvent.Data.Payload.Status.SUCCESS)
                            .totalCost("0.0106")
                            .build()
                    )
                    .recordType(CallCostWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callCostWebhookEvent =
            CallCostWebhookEvent.builder()
                .data(
                    CallCostWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallCostWebhookEvent.Data.EventType.CALL_COST)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallCostWebhookEvent.Data.Payload.builder()
                                .billedDurationSecs(120L)
                                .billingGroupId("f5586561-8ff0-4291-a0ac-84fe544797bd")
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .costParts(
                                    listOf(
                                        CallCostWebhookEvent.Data.Payload.CostPart.builder()
                                            .billedDurationSecs(60L)
                                            .callPart("sip-trunking")
                                            .cost("0.0050")
                                            .currency("USD")
                                            .rate("0.0050")
                                            .build(),
                                        CallCostWebhookEvent.Data.Payload.CostPart.builder()
                                            .billedDurationSecs(120L)
                                            .callPart("call-recording")
                                            .cost("0.0038")
                                            .currency("USD")
                                            .rate("0.00190")
                                            .build(),
                                        CallCostWebhookEvent.Data.Payload.CostPart.builder()
                                            .billedDurationSecs(60L)
                                            .callPart("call-control")
                                            .cost("0.0018")
                                            .currency("USD")
                                            .rate("0.00180")
                                            .build(),
                                    )
                                )
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                                .status(CallCostWebhookEvent.Data.Payload.Status.SUCCESS)
                                .totalCost("0.0106")
                                .build()
                        )
                        .recordType(CallCostWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallCostWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callCostWebhookEvent),
                jacksonTypeRef<CallCostWebhookEvent>(),
            )

        assertThat(roundtrippedCallCostWebhookEvent).isEqualTo(callCostWebhookEvent)
    }
}
