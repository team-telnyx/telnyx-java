// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallConversationInsightsGeneratedWebhookEventTest {

    @Test
    fun create() {
        val callConversationInsightsGeneratedWebhookEvent =
            CallConversationInsightsGeneratedWebhookEvent.builder()
                .data(
                    CallConversationInsightsGeneratedWebhookEvent.Data.builder()
                        .id("898e96ef-be63-45aa-9e7d-01332bff9a97")
                        .eventType(
                            CallConversationInsightsGeneratedWebhookEvent.Data.EventType
                                .CALL_CONVERSATION_INSIGHTS_GENERATED
                        )
                        .occurredAt(OffsetDateTime.parse("2025-02-19T17:02:49.371454Z"))
                        .payload(
                            CallConversationInsightsGeneratedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callingPartyType(
                                    CallConversationInsightsGeneratedWebhookEvent.Data.Payload
                                        .CallingPartyType
                                        .PSTN
                                )
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .insightGroupId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .addResult(
                                    CallConversationInsightsGeneratedWebhookEvent.Data.Payload
                                        .Result
                                        .builder()
                                        .insightId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                        .result(
                                            JsonValue.from(
                                                "The user inquired about the menu at Ember & Oak. The menu offers various options, including vegetarian, vegan, and gluten-free dishes, as well as a children's menu. The restaurant also has a daily happy hour from 4 PM to 6 PM and offers takeaway and delivery services. The user found the information helpful but had to leave without making any further decisions or requests. No specific preferences or goals were expressed beyond inquiring about the menu."
                                            )
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .recordType(
                            CallConversationInsightsGeneratedWebhookEvent.Data.RecordType.EVENT
                        )
                        .build()
                )
                .build()

        assertThat(callConversationInsightsGeneratedWebhookEvent.data())
            .contains(
                CallConversationInsightsGeneratedWebhookEvent.Data.builder()
                    .id("898e96ef-be63-45aa-9e7d-01332bff9a97")
                    .eventType(
                        CallConversationInsightsGeneratedWebhookEvent.Data.EventType
                            .CALL_CONVERSATION_INSIGHTS_GENERATED
                    )
                    .occurredAt(OffsetDateTime.parse("2025-02-19T17:02:49.371454Z"))
                    .payload(
                        CallConversationInsightsGeneratedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callingPartyType(
                                CallConversationInsightsGeneratedWebhookEvent.Data.Payload
                                    .CallingPartyType
                                    .PSTN
                            )
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .insightGroupId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                            .addResult(
                                CallConversationInsightsGeneratedWebhookEvent.Data.Payload.Result
                                    .builder()
                                    .insightId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                    .result(
                                        JsonValue.from(
                                            "The user inquired about the menu at Ember & Oak. The menu offers various options, including vegetarian, vegan, and gluten-free dishes, as well as a children's menu. The restaurant also has a daily happy hour from 4 PM to 6 PM and offers takeaway and delivery services. The user found the information helpful but had to leave without making any further decisions or requests. No specific preferences or goals were expressed beyond inquiring about the menu."
                                        )
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .recordType(CallConversationInsightsGeneratedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callConversationInsightsGeneratedWebhookEvent =
            CallConversationInsightsGeneratedWebhookEvent.builder()
                .data(
                    CallConversationInsightsGeneratedWebhookEvent.Data.builder()
                        .id("898e96ef-be63-45aa-9e7d-01332bff9a97")
                        .eventType(
                            CallConversationInsightsGeneratedWebhookEvent.Data.EventType
                                .CALL_CONVERSATION_INSIGHTS_GENERATED
                        )
                        .occurredAt(OffsetDateTime.parse("2025-02-19T17:02:49.371454Z"))
                        .payload(
                            CallConversationInsightsGeneratedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callingPartyType(
                                    CallConversationInsightsGeneratedWebhookEvent.Data.Payload
                                        .CallingPartyType
                                        .PSTN
                                )
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .insightGroupId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .addResult(
                                    CallConversationInsightsGeneratedWebhookEvent.Data.Payload
                                        .Result
                                        .builder()
                                        .insightId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                        .result(
                                            JsonValue.from(
                                                "The user inquired about the menu at Ember & Oak. The menu offers various options, including vegetarian, vegan, and gluten-free dishes, as well as a children's menu. The restaurant also has a daily happy hour from 4 PM to 6 PM and offers takeaway and delivery services. The user found the information helpful but had to leave without making any further decisions or requests. No specific preferences or goals were expressed beyond inquiring about the menu."
                                            )
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .recordType(
                            CallConversationInsightsGeneratedWebhookEvent.Data.RecordType.EVENT
                        )
                        .build()
                )
                .build()

        val roundtrippedCallConversationInsightsGeneratedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callConversationInsightsGeneratedWebhookEvent),
                jacksonTypeRef<CallConversationInsightsGeneratedWebhookEvent>(),
            )

        assertThat(roundtrippedCallConversationInsightsGeneratedWebhookEvent)
            .isEqualTo(callConversationInsightsGeneratedWebhookEvent)
    }
}
