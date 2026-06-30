// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallAiGatherMessageHistoryUpdatedTest {

    @Test
    fun create() {
        val callAiGatherMessageHistoryUpdated =
            CallAiGatherMessageHistoryUpdated.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(
                    CallAiGatherMessageHistoryUpdated.EventType
                        .CALL_AI_GATHER_MESSAGE_HISTORY_UPDATED
                )
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallAiGatherMessageHistoryUpdated.Payload.builder()
                        .callControlId("v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .from("+35319605860")
                        .addMessageHistory(
                            CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.builder()
                                .content("Hello, can you tell me your age and where you live?")
                                .role(
                                    CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.Role
                                        .ASSISTANT
                                )
                                .build()
                        )
                        .addMessageHistory(
                            CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.builder()
                                .content("Hello, I'm 29 and I live in Paris?")
                                .role(
                                    CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.Role
                                        .USER
                                )
                                .build()
                        )
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallAiGatherMessageHistoryUpdated.RecordType.EVENT)
                .build()

        assertThat(callAiGatherMessageHistoryUpdated.id())
            .contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callAiGatherMessageHistoryUpdated.eventType())
            .contains(
                CallAiGatherMessageHistoryUpdated.EventType.CALL_AI_GATHER_MESSAGE_HISTORY_UPDATED
            )
        assertThat(callAiGatherMessageHistoryUpdated.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callAiGatherMessageHistoryUpdated.payload())
            .contains(
                CallAiGatherMessageHistoryUpdated.Payload.builder()
                    .callControlId("v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .from("+35319605860")
                    .addMessageHistory(
                        CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.builder()
                            .content("Hello, can you tell me your age and where you live?")
                            .role(
                                CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.Role
                                    .ASSISTANT
                            )
                            .build()
                    )
                    .addMessageHistory(
                        CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.builder()
                            .content("Hello, I'm 29 and I live in Paris?")
                            .role(
                                CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.Role.USER
                            )
                            .build()
                    )
                    .to("+35319605860")
                    .build()
            )
        assertThat(callAiGatherMessageHistoryUpdated.recordType())
            .contains(CallAiGatherMessageHistoryUpdated.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callAiGatherMessageHistoryUpdated =
            CallAiGatherMessageHistoryUpdated.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(
                    CallAiGatherMessageHistoryUpdated.EventType
                        .CALL_AI_GATHER_MESSAGE_HISTORY_UPDATED
                )
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallAiGatherMessageHistoryUpdated.Payload.builder()
                        .callControlId("v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .from("+35319605860")
                        .addMessageHistory(
                            CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.builder()
                                .content("Hello, can you tell me your age and where you live?")
                                .role(
                                    CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.Role
                                        .ASSISTANT
                                )
                                .build()
                        )
                        .addMessageHistory(
                            CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.builder()
                                .content("Hello, I'm 29 and I live in Paris?")
                                .role(
                                    CallAiGatherMessageHistoryUpdated.Payload.MessageHistory.Role
                                        .USER
                                )
                                .build()
                        )
                        .to("+35319605860")
                        .build()
                )
                .recordType(CallAiGatherMessageHistoryUpdated.RecordType.EVENT)
                .build()

        val roundtrippedCallAiGatherMessageHistoryUpdated =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callAiGatherMessageHistoryUpdated),
                jacksonTypeRef<CallAiGatherMessageHistoryUpdated>(),
            )

        assertThat(roundtrippedCallAiGatherMessageHistoryUpdated)
            .isEqualTo(callAiGatherMessageHistoryUpdated)
    }
}
