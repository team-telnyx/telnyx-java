// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallAiGatherPartialResultsTest {

    @Test
    fun create() {
        val callAiGatherPartialResults =
            CallAiGatherPartialResults.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallAiGatherPartialResults.EventType.CALL_AI_GATHER_PARTIAL_RESULTS)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallAiGatherPartialResults.Payload.builder()
                        .callControlId("v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .from("+35319605860")
                        .addMessageHistory(
                            CallAiGatherPartialResults.Payload.MessageHistory.builder()
                                .content("Hello, can you tell me your age and where you live?")
                                .role(
                                    CallAiGatherPartialResults.Payload.MessageHistory.Role.ASSISTANT
                                )
                                .build()
                        )
                        .addMessageHistory(
                            CallAiGatherPartialResults.Payload.MessageHistory.builder()
                                .content("Hello, I'm 29 and I live in Paris?")
                                .role(CallAiGatherPartialResults.Payload.MessageHistory.Role.USER)
                                .build()
                        )
                        .partialResults(
                            CallAiGatherPartialResults.Payload.PartialResults.builder()
                                .putAdditionalProperty("age", JsonValue.from("bar"))
                                .putAdditionalProperty("city", JsonValue.from("bar"))
                                .build()
                        )
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallAiGatherPartialResults.RecordType.EVENT)
                .build()

        assertThat(callAiGatherPartialResults.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callAiGatherPartialResults.eventType())
            .contains(CallAiGatherPartialResults.EventType.CALL_AI_GATHER_PARTIAL_RESULTS)
        assertThat(callAiGatherPartialResults.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callAiGatherPartialResults.payload())
            .contains(
                CallAiGatherPartialResults.Payload.builder()
                    .callControlId("v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .from("+35319605860")
                    .addMessageHistory(
                        CallAiGatherPartialResults.Payload.MessageHistory.builder()
                            .content("Hello, can you tell me your age and where you live?")
                            .role(CallAiGatherPartialResults.Payload.MessageHistory.Role.ASSISTANT)
                            .build()
                    )
                    .addMessageHistory(
                        CallAiGatherPartialResults.Payload.MessageHistory.builder()
                            .content("Hello, I'm 29 and I live in Paris?")
                            .role(CallAiGatherPartialResults.Payload.MessageHistory.Role.USER)
                            .build()
                    )
                    .partialResults(
                        CallAiGatherPartialResults.Payload.PartialResults.builder()
                            .putAdditionalProperty("age", JsonValue.from("bar"))
                            .putAdditionalProperty("city", JsonValue.from("bar"))
                            .build()
                    )
                    .to("+35319605860")
                    .build()
            )
        assertThat(callAiGatherPartialResults.recordType())
            .contains(CallAiGatherPartialResults.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callAiGatherPartialResults =
            CallAiGatherPartialResults.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallAiGatherPartialResults.EventType.CALL_AI_GATHER_PARTIAL_RESULTS)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallAiGatherPartialResults.Payload.builder()
                        .callControlId("v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .from("+35319605860")
                        .addMessageHistory(
                            CallAiGatherPartialResults.Payload.MessageHistory.builder()
                                .content("Hello, can you tell me your age and where you live?")
                                .role(
                                    CallAiGatherPartialResults.Payload.MessageHistory.Role.ASSISTANT
                                )
                                .build()
                        )
                        .addMessageHistory(
                            CallAiGatherPartialResults.Payload.MessageHistory.builder()
                                .content("Hello, I'm 29 and I live in Paris?")
                                .role(CallAiGatherPartialResults.Payload.MessageHistory.Role.USER)
                                .build()
                        )
                        .partialResults(
                            CallAiGatherPartialResults.Payload.PartialResults.builder()
                                .putAdditionalProperty("age", JsonValue.from("bar"))
                                .putAdditionalProperty("city", JsonValue.from("bar"))
                                .build()
                        )
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallAiGatherPartialResults.RecordType.EVENT)
                .build()

        val roundtrippedCallAiGatherPartialResults =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callAiGatherPartialResults),
                jacksonTypeRef<CallAiGatherPartialResults>(),
            )

        assertThat(roundtrippedCallAiGatherPartialResults).isEqualTo(callAiGatherPartialResults)
    }
}
