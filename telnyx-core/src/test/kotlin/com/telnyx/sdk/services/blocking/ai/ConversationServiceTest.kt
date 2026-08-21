// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.conversations.ConversationAddMessageParams
import com.telnyx.sdk.models.ai.conversations.ConversationCreateParams
import com.telnyx.sdk.models.ai.conversations.ConversationListParams
import com.telnyx.sdk.models.ai.conversations.ConversationUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConversationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conversationService = client.ai().conversations()

        val conversation =
            conversationService.create(
                ConversationCreateParams.builder()
                    .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .metadata(
                        ConversationCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("string")
                    .build()
            )

        conversation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conversationService = client.ai().conversations()

        val conversation = conversationService.retrieve("conversation_id")

        conversation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conversationService = client.ai().conversations()

        val conversation =
            conversationService.update(
                ConversationUpdateParams.builder()
                    .conversationId("conversation_id")
                    .metadata(
                        ConversationUpdateParams.Metadata.builder()
                            .putAdditionalProperty("ai_disabled", JsonValue.from("true"))
                            .build()
                    )
                    .build()
            )

        conversation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conversationService = client.ai().conversations()

        val conversations =
            conversationService.list(
                ConversationListParams.builder()
                    .id("id")
                    .createdAt("created_at")
                    .lastMessageAt("last_message_at")
                    .limit(1L)
                    .metadataAssistantId("metadata->assistant_id")
                    .metadataCallControlId("metadata->call_control_id")
                    .metadataTelnyxAgentTarget("metadata->telnyx_agent_target")
                    .metadataTelnyxConversationChannel("metadata->telnyx_conversation_channel")
                    .metadataTelnyxEndUserTarget("metadata->telnyx_end_user_target")
                    .name("name")
                    .or("or")
                    .order("order")
                    .build()
            )

        conversations.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conversationService = client.ai().conversations()

        conversationService.delete("conversation_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addMessage() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conversationService = client.ai().conversations()

        conversationService.addMessage(
            ConversationAddMessageParams.builder()
                .conversationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .role("Role")
                .content("")
                .metadata(
                    ConversationAddMessageParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("Name")
                .sentAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                .toolCallId("Tool Call Id")
                .addToolCall(
                    ConversationAddMessageParams.ToolCall.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .toolChoice("string")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveConversationsInsights() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conversationService = client.ai().conversations()

        val response = conversationService.retrieveConversationsInsights("conversation_id")

        response.validate()
    }
}
