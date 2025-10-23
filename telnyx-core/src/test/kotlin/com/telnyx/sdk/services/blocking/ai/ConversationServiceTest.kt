// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.conversations.ConversationAddMessageParams
import com.telnyx.sdk.models.ai.conversations.ConversationCreateParams
import com.telnyx.sdk.models.ai.conversations.ConversationListParams
import com.telnyx.sdk.models.ai.conversations.ConversationUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConversationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conversationService = client.ai().conversations()

        val conversation =
            conversationService.create(
                ConversationCreateParams.builder()
                    .metadata(
                        ConversationCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        conversation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conversationService = client.ai().conversations()

        val conversation = conversationService.retrieve("conversation_id")

        conversation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conversationService = client.ai().conversations()

        val conversation =
            conversationService.update(
                ConversationUpdateParams.builder()
                    .conversationId("conversation_id")
                    .metadata(
                        ConversationUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        conversation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conversationService = client.ai().conversations()

        conversationService.delete("conversation_id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addMessage() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conversationService = client.ai().conversations()

        val response =
            conversationService.addMessage(
                ConversationAddMessageParams.builder()
                    .conversationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .role("role")
                    .content("content")
                    .metadata(
                        ConversationAddMessageParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .toolCallId("tool_call_id")
                    .addToolCall(
                        ConversationAddMessageParams.ToolCall.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .toolChoice("string")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveConversationsInsights() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conversationService = client.ai().conversations()

        val response = conversationService.retrieveConversationsInsights("conversation_id")

        response.validate()
    }
}
