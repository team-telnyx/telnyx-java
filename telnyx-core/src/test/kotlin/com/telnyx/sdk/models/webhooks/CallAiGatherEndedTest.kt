// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallAiGatherEndedTest {

    @Test
    fun create() {
        val callAiGatherEnded =
            CallAiGatherEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallAiGatherEnded.EventType.CALL_AI_GATHER_ENDED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallAiGatherEnded.Payload.builder()
                        .callControlId("v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .from("+35319605860")
                        .addMessageHistory(
                            CallAiGatherEnded.Payload.MessageHistory.builder()
                                .content("Hello, can you tell me your age and where you live?")
                                .role(CallAiGatherEnded.Payload.MessageHistory.Role.ASSISTANT)
                                .build()
                        )
                        .addMessageHistory(
                            CallAiGatherEnded.Payload.MessageHistory.builder()
                                .content("Hello, I'm 29 and I live in Paris?")
                                .role(CallAiGatherEnded.Payload.MessageHistory.Role.USER)
                                .build()
                        )
                        .result(
                            CallAiGatherEnded.Payload.Result.builder()
                                .putAdditionalProperty("age", JsonValue.from("bar"))
                                .putAdditionalProperty("city", JsonValue.from("bar"))
                                .build()
                        )
                        .status(CallAiGatherEnded.Payload.Status.VALID)
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallAiGatherEnded.RecordType.EVENT)
                .build()

        assertThat(callAiGatherEnded.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callAiGatherEnded.eventType())
            .contains(CallAiGatherEnded.EventType.CALL_AI_GATHER_ENDED)
        assertThat(callAiGatherEnded.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callAiGatherEnded.payload())
            .contains(
                CallAiGatherEnded.Payload.builder()
                    .callControlId("v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .from("+35319605860")
                    .addMessageHistory(
                        CallAiGatherEnded.Payload.MessageHistory.builder()
                            .content("Hello, can you tell me your age and where you live?")
                            .role(CallAiGatherEnded.Payload.MessageHistory.Role.ASSISTANT)
                            .build()
                    )
                    .addMessageHistory(
                        CallAiGatherEnded.Payload.MessageHistory.builder()
                            .content("Hello, I'm 29 and I live in Paris?")
                            .role(CallAiGatherEnded.Payload.MessageHistory.Role.USER)
                            .build()
                    )
                    .result(
                        CallAiGatherEnded.Payload.Result.builder()
                            .putAdditionalProperty("age", JsonValue.from("bar"))
                            .putAdditionalProperty("city", JsonValue.from("bar"))
                            .build()
                    )
                    .status(CallAiGatherEnded.Payload.Status.VALID)
                    .to("+35319605860")
                    .build()
            )
        assertThat(callAiGatherEnded.recordType()).contains(CallAiGatherEnded.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callAiGatherEnded =
            CallAiGatherEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallAiGatherEnded.EventType.CALL_AI_GATHER_ENDED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallAiGatherEnded.Payload.builder()
                        .callControlId("v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .from("+35319605860")
                        .addMessageHistory(
                            CallAiGatherEnded.Payload.MessageHistory.builder()
                                .content("Hello, can you tell me your age and where you live?")
                                .role(CallAiGatherEnded.Payload.MessageHistory.Role.ASSISTANT)
                                .build()
                        )
                        .addMessageHistory(
                            CallAiGatherEnded.Payload.MessageHistory.builder()
                                .content("Hello, I'm 29 and I live in Paris?")
                                .role(CallAiGatherEnded.Payload.MessageHistory.Role.USER)
                                .build()
                        )
                        .result(
                            CallAiGatherEnded.Payload.Result.builder()
                                .putAdditionalProperty("age", JsonValue.from("bar"))
                                .putAdditionalProperty("city", JsonValue.from("bar"))
                                .build()
                        )
                        .status(CallAiGatherEnded.Payload.Status.VALID)
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallAiGatherEnded.RecordType.EVENT)
                .build()

        val roundtrippedCallAiGatherEnded =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callAiGatherEnded),
                jacksonTypeRef<CallAiGatherEnded>(),
            )

        assertThat(roundtrippedCallAiGatherEnded).isEqualTo(callAiGatherEnded)
    }
}
