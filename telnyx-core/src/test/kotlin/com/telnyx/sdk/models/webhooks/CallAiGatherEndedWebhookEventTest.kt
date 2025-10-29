// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallAiGatherEndedWebhookEventTest {

    @Test
    fun create() {
        val callAiGatherEndedWebhookEvent =
            CallAiGatherEndedWebhookEvent.builder()
                .data(
                    CallAiGatherEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallAiGatherEndedWebhookEvent.Data.EventType.CALL_AI_GATHER_ENDED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallAiGatherEndedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .from("+35319605860")
                                .addMessageHistory(
                                    CallAiGatherEndedWebhookEvent.Data.Payload.MessageHistory
                                        .builder()
                                        .content(
                                            "Hello, can you tell me your age and where you live?"
                                        )
                                        .role(
                                            CallAiGatherEndedWebhookEvent.Data.Payload
                                                .MessageHistory
                                                .Role
                                                .ASSISTANT
                                        )
                                        .build()
                                )
                                .addMessageHistory(
                                    CallAiGatherEndedWebhookEvent.Data.Payload.MessageHistory
                                        .builder()
                                        .content("Hello, I am 29 and I live in Paris?")
                                        .role(
                                            CallAiGatherEndedWebhookEvent.Data.Payload
                                                .MessageHistory
                                                .Role
                                                .USER
                                        )
                                        .build()
                                )
                                .result(JsonValue.from(mapOf("age" to 29, "city" to "Paris")))
                                .status(CallAiGatherEndedWebhookEvent.Data.Payload.Status.VALID)
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallAiGatherEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callAiGatherEndedWebhookEvent.data())
            .contains(
                CallAiGatherEndedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallAiGatherEndedWebhookEvent.Data.EventType.CALL_AI_GATHER_ENDED)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallAiGatherEndedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .from("+35319605860")
                            .addMessageHistory(
                                CallAiGatherEndedWebhookEvent.Data.Payload.MessageHistory.builder()
                                    .content("Hello, can you tell me your age and where you live?")
                                    .role(
                                        CallAiGatherEndedWebhookEvent.Data.Payload.MessageHistory
                                            .Role
                                            .ASSISTANT
                                    )
                                    .build()
                            )
                            .addMessageHistory(
                                CallAiGatherEndedWebhookEvent.Data.Payload.MessageHistory.builder()
                                    .content("Hello, I am 29 and I live in Paris?")
                                    .role(
                                        CallAiGatherEndedWebhookEvent.Data.Payload.MessageHistory
                                            .Role
                                            .USER
                                    )
                                    .build()
                            )
                            .result(JsonValue.from(mapOf("age" to 29, "city" to "Paris")))
                            .status(CallAiGatherEndedWebhookEvent.Data.Payload.Status.VALID)
                            .to("+35319605860")
                            .build()
                    )
                    .recordType(CallAiGatherEndedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callAiGatherEndedWebhookEvent =
            CallAiGatherEndedWebhookEvent.builder()
                .data(
                    CallAiGatherEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallAiGatherEndedWebhookEvent.Data.EventType.CALL_AI_GATHER_ENDED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallAiGatherEndedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .from("+35319605860")
                                .addMessageHistory(
                                    CallAiGatherEndedWebhookEvent.Data.Payload.MessageHistory
                                        .builder()
                                        .content(
                                            "Hello, can you tell me your age and where you live?"
                                        )
                                        .role(
                                            CallAiGatherEndedWebhookEvent.Data.Payload
                                                .MessageHistory
                                                .Role
                                                .ASSISTANT
                                        )
                                        .build()
                                )
                                .addMessageHistory(
                                    CallAiGatherEndedWebhookEvent.Data.Payload.MessageHistory
                                        .builder()
                                        .content("Hello, I am 29 and I live in Paris?")
                                        .role(
                                            CallAiGatherEndedWebhookEvent.Data.Payload
                                                .MessageHistory
                                                .Role
                                                .USER
                                        )
                                        .build()
                                )
                                .result(JsonValue.from(mapOf("age" to 29, "city" to "Paris")))
                                .status(CallAiGatherEndedWebhookEvent.Data.Payload.Status.VALID)
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallAiGatherEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallAiGatherEndedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callAiGatherEndedWebhookEvent),
                jacksonTypeRef<CallAiGatherEndedWebhookEvent>(),
            )

        assertThat(roundtrippedCallAiGatherEndedWebhookEvent)
            .isEqualTo(callAiGatherEndedWebhookEvent)
    }
}
