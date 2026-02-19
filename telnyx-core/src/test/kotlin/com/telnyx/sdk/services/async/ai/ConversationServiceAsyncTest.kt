// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.conversations.ConversationAddMessageParams
import com.telnyx.sdk.models.ai.conversations.ConversationCreateParams
import com.telnyx.sdk.models.ai.conversations.ConversationListParams
import com.telnyx.sdk.models.ai.conversations.ConversationUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConversationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationServiceAsync = client.ai().conversations()

        val conversationFuture =
            conversationServiceAsync.create(
                ConversationCreateParams.builder()
                    .metadata(
                        ConversationCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val conversation = conversationFuture.get()
        conversation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationServiceAsync = client.ai().conversations()

        val conversationFuture = conversationServiceAsync.retrieve("conversation_id")

        val conversation = conversationFuture.get()
        conversation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationServiceAsync = client.ai().conversations()

        val conversationFuture =
            conversationServiceAsync.update(
                ConversationUpdateParams.builder()
                    .conversationId("conversation_id")
                    .metadata(
                        ConversationUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val conversation = conversationFuture.get()
        conversation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationServiceAsync = client.ai().conversations()

        val conversationsFuture =
            conversationServiceAsync.list(
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

        val conversations = conversationsFuture.get()
        conversations.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationServiceAsync = client.ai().conversations()

        val future = conversationServiceAsync.delete("conversation_id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addMessage() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationServiceAsync = client.ai().conversations()

        val future =
            conversationServiceAsync.addMessage(
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

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveConversationsInsights() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationServiceAsync = client.ai().conversations()

        val responseFuture =
            conversationServiceAsync.retrieveConversationsInsights("conversation_id")

        val response = responseFuture.get()
        response.validate()
    }
}
