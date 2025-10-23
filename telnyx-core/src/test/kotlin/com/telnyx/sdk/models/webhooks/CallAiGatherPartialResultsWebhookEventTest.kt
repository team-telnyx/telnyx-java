// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallAiGatherPartialResultsWebhookEventTest {

    @Test
    fun create() {
        val callAiGatherPartialResultsWebhookEvent =
            CallAiGatherPartialResultsWebhookEvent.builder()
                .data(
                    CallAiGatherPartialResultsWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallAiGatherPartialResultsWebhookEvent.Data.EventType
                                .CALL_AI_GATHER_PARTIAL_RESULTS
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallAiGatherPartialResultsWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .from("+35319605860")
                                .addMessageHistory(
                                    CallAiGatherPartialResultsWebhookEvent.Data.Payload
                                        .MessageHistory
                                        .builder()
                                        .content(
                                            "Hello, can you tell me your age and where you live?"
                                        )
                                        .role(
                                            CallAiGatherPartialResultsWebhookEvent.Data.Payload
                                                .MessageHistory
                                                .Role
                                                .ASSISTANT
                                        )
                                        .build()
                                )
                                .addMessageHistory(
                                    CallAiGatherPartialResultsWebhookEvent.Data.Payload
                                        .MessageHistory
                                        .builder()
                                        .content("Hello, I'm 29 and I live in Paris?")
                                        .role(
                                            CallAiGatherPartialResultsWebhookEvent.Data.Payload
                                                .MessageHistory
                                                .Role
                                                .USER
                                        )
                                        .build()
                                )
                                .partialResults(
                                    JsonValue.from(mapOf("age" to 29, "city" to "Paris"))
                                )
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallAiGatherPartialResultsWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callAiGatherPartialResultsWebhookEvent.data())
            .contains(
                CallAiGatherPartialResultsWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(
                        CallAiGatherPartialResultsWebhookEvent.Data.EventType
                            .CALL_AI_GATHER_PARTIAL_RESULTS
                    )
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallAiGatherPartialResultsWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .from("+35319605860")
                            .addMessageHistory(
                                CallAiGatherPartialResultsWebhookEvent.Data.Payload.MessageHistory
                                    .builder()
                                    .content("Hello, can you tell me your age and where you live?")
                                    .role(
                                        CallAiGatherPartialResultsWebhookEvent.Data.Payload
                                            .MessageHistory
                                            .Role
                                            .ASSISTANT
                                    )
                                    .build()
                            )
                            .addMessageHistory(
                                CallAiGatherPartialResultsWebhookEvent.Data.Payload.MessageHistory
                                    .builder()
                                    .content("Hello, I'm 29 and I live in Paris?")
                                    .role(
                                        CallAiGatherPartialResultsWebhookEvent.Data.Payload
                                            .MessageHistory
                                            .Role
                                            .USER
                                    )
                                    .build()
                            )
                            .partialResults(JsonValue.from(mapOf("age" to 29, "city" to "Paris")))
                            .to("+35319605860")
                            .build()
                    )
                    .recordType(CallAiGatherPartialResultsWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callAiGatherPartialResultsWebhookEvent =
            CallAiGatherPartialResultsWebhookEvent.builder()
                .data(
                    CallAiGatherPartialResultsWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallAiGatherPartialResultsWebhookEvent.Data.EventType
                                .CALL_AI_GATHER_PARTIAL_RESULTS
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallAiGatherPartialResultsWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .from("+35319605860")
                                .addMessageHistory(
                                    CallAiGatherPartialResultsWebhookEvent.Data.Payload
                                        .MessageHistory
                                        .builder()
                                        .content(
                                            "Hello, can you tell me your age and where you live?"
                                        )
                                        .role(
                                            CallAiGatherPartialResultsWebhookEvent.Data.Payload
                                                .MessageHistory
                                                .Role
                                                .ASSISTANT
                                        )
                                        .build()
                                )
                                .addMessageHistory(
                                    CallAiGatherPartialResultsWebhookEvent.Data.Payload
                                        .MessageHistory
                                        .builder()
                                        .content("Hello, I'm 29 and I live in Paris?")
                                        .role(
                                            CallAiGatherPartialResultsWebhookEvent.Data.Payload
                                                .MessageHistory
                                                .Role
                                                .USER
                                        )
                                        .build()
                                )
                                .partialResults(
                                    JsonValue.from(mapOf("age" to 29, "city" to "Paris"))
                                )
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(CallAiGatherPartialResultsWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallAiGatherPartialResultsWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callAiGatherPartialResultsWebhookEvent),
                jacksonTypeRef<CallAiGatherPartialResultsWebhookEvent>(),
            )

        assertThat(roundtrippedCallAiGatherPartialResultsWebhookEvent)
            .isEqualTo(callAiGatherPartialResultsWebhookEvent)
    }
}
