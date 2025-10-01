// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallAiGatherMessageHistoryUpdatedWebhookEventTest {

    @Test
    fun create() {
        val callAiGatherMessageHistoryUpdatedWebhookEvent =
            CallAiGatherMessageHistoryUpdatedWebhookEvent.builder()
                .data(
                    CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.EventType
                                .CALL_AI_GATHER_MESSAGE_HISTORY_UPDATED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .from("+35319605860")
                                .addMessageHistory(
                                    CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.Payload
                                        .MessageHistory
                                        .builder()
                                        .content(
                                            "Hello, can you tell me your age and where you live?"
                                        )
                                        .role(
                                            CallAiGatherMessageHistoryUpdatedWebhookEvent.Data
                                                .Payload
                                                .MessageHistory
                                                .Role
                                                .ASSISTANT
                                        )
                                        .build()
                                )
                                .addMessageHistory(
                                    CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.Payload
                                        .MessageHistory
                                        .builder()
                                        .content("Hello, I'm 29 and I live in Paris?")
                                        .role(
                                            CallAiGatherMessageHistoryUpdatedWebhookEvent.Data
                                                .Payload
                                                .MessageHistory
                                                .Role
                                                .USER
                                        )
                                        .build()
                                )
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(
                            CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.RecordType.EVENT
                        )
                        .build()
                )
                .build()

        assertThat(callAiGatherMessageHistoryUpdatedWebhookEvent.data())
            .contains(
                CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(
                        CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.EventType
                            .CALL_AI_GATHER_MESSAGE_HISTORY_UPDATED
                    )
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .from("+35319605860")
                            .addMessageHistory(
                                CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.Payload
                                    .MessageHistory
                                    .builder()
                                    .content("Hello, can you tell me your age and where you live?")
                                    .role(
                                        CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.Payload
                                            .MessageHistory
                                            .Role
                                            .ASSISTANT
                                    )
                                    .build()
                            )
                            .addMessageHistory(
                                CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.Payload
                                    .MessageHistory
                                    .builder()
                                    .content("Hello, I'm 29 and I live in Paris?")
                                    .role(
                                        CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.Payload
                                            .MessageHistory
                                            .Role
                                            .USER
                                    )
                                    .build()
                            )
                            .to("+35319605860")
                            .build()
                    )
                    .recordType(CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callAiGatherMessageHistoryUpdatedWebhookEvent =
            CallAiGatherMessageHistoryUpdatedWebhookEvent.builder()
                .data(
                    CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.EventType
                                .CALL_AI_GATHER_MESSAGE_HISTORY_UPDATED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .from("+35319605860")
                                .addMessageHistory(
                                    CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.Payload
                                        .MessageHistory
                                        .builder()
                                        .content(
                                            "Hello, can you tell me your age and where you live?"
                                        )
                                        .role(
                                            CallAiGatherMessageHistoryUpdatedWebhookEvent.Data
                                                .Payload
                                                .MessageHistory
                                                .Role
                                                .ASSISTANT
                                        )
                                        .build()
                                )
                                .addMessageHistory(
                                    CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.Payload
                                        .MessageHistory
                                        .builder()
                                        .content("Hello, I'm 29 and I live in Paris?")
                                        .role(
                                            CallAiGatherMessageHistoryUpdatedWebhookEvent.Data
                                                .Payload
                                                .MessageHistory
                                                .Role
                                                .USER
                                        )
                                        .build()
                                )
                                .to("+35319605860")
                                .build()
                        )
                        .recordType(
                            CallAiGatherMessageHistoryUpdatedWebhookEvent.Data.RecordType.EVENT
                        )
                        .build()
                )
                .build()

        val roundtrippedCallAiGatherMessageHistoryUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callAiGatherMessageHistoryUpdatedWebhookEvent),
                jacksonTypeRef<CallAiGatherMessageHistoryUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedCallAiGatherMessageHistoryUpdatedWebhookEvent)
            .isEqualTo(callAiGatherMessageHistoryUpdatedWebhookEvent)
    }
}
