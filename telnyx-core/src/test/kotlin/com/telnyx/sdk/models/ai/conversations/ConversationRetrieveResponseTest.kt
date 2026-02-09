// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationRetrieveResponseTest {

    @Test
    fun create() {
        val conversationRetrieveResponse =
            ConversationRetrieveResponse.builder()
                .data(
                    Conversation.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .createdAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                        .lastMessageAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                        .metadata(
                            Conversation.Metadata.builder()
                                .putAdditionalProperty(
                                    "telnyx_conversation_channel",
                                    JsonValue.from("sms"),
                                )
                                .putAdditionalProperty(
                                    "telnyx_agent_target",
                                    JsonValue.from("+13128675309"),
                                )
                                .putAdditionalProperty(
                                    "telnyx_end_user_target",
                                    JsonValue.from("+13128675309"),
                                )
                                .putAdditionalProperty(
                                    "assistant_id",
                                    JsonValue.from("assistant-123"),
                                )
                                .build()
                        )
                        .name("")
                        .build()
                )
                .build()

        assertThat(conversationRetrieveResponse.data())
            .contains(
                Conversation.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .createdAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                    .lastMessageAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                    .metadata(
                        Conversation.Metadata.builder()
                            .putAdditionalProperty(
                                "telnyx_conversation_channel",
                                JsonValue.from("sms"),
                            )
                            .putAdditionalProperty(
                                "telnyx_agent_target",
                                JsonValue.from("+13128675309"),
                            )
                            .putAdditionalProperty(
                                "telnyx_end_user_target",
                                JsonValue.from("+13128675309"),
                            )
                            .putAdditionalProperty("assistant_id", JsonValue.from("assistant-123"))
                            .build()
                    )
                    .name("")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationRetrieveResponse =
            ConversationRetrieveResponse.builder()
                .data(
                    Conversation.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .createdAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                        .lastMessageAt(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                        .metadata(
                            Conversation.Metadata.builder()
                                .putAdditionalProperty(
                                    "telnyx_conversation_channel",
                                    JsonValue.from("sms"),
                                )
                                .putAdditionalProperty(
                                    "telnyx_agent_target",
                                    JsonValue.from("+13128675309"),
                                )
                                .putAdditionalProperty(
                                    "telnyx_end_user_target",
                                    JsonValue.from("+13128675309"),
                                )
                                .putAdditionalProperty(
                                    "assistant_id",
                                    JsonValue.from("assistant-123"),
                                )
                                .build()
                        )
                        .name("")
                        .build()
                )
                .build()

        val roundtrippedConversationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationRetrieveResponse),
                jacksonTypeRef<ConversationRetrieveResponse>(),
            )

        assertThat(roundtrippedConversationRetrieveResponse).isEqualTo(conversationRetrieveResponse)
    }
}
