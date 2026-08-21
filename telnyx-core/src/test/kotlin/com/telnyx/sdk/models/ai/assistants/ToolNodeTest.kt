// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolNodeTest {

    @Test
    fun create() {
        val toolNode =
            ToolNode.builder()
                .id("id")
                .sharedToolId("shared_tool_id")
                .name("name")
                .position(NodePosition.builder().x(0.0).y(0.0).build())
                .addWebhookTool(
                    InferenceEmbeddingWebhookToolParams.Webhook.builder()
                        .description("description")
                        .name("name")
                        .url("https://example.com/api/v1/function")
                        .async(true)
                        .asyncTimeoutMs(1L)
                        .bodyParameters(
                            InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters
                                        .Properties
                                        .builder()
                                        .putAdditionalProperty("age", JsonValue.from("bar"))
                                        .putAdditionalProperty("location", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("age")
                                .addRequired("location")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters.Type
                                        .OBJECT
                                )
                                .build()
                        )
                        .addHeader(
                            InferenceEmbeddingWebhookToolParams.Webhook.Header.builder()
                                .name("name")
                                .value("value")
                                .build()
                        )
                        .addMessage(
                            InferenceEmbeddingWebhookToolParams.Webhook.Message
                                .WebhookToolRequestStartMessage
                                .builder()
                                .content("Let me look that up for you.")
                                .timingMs(100L)
                                .build()
                        )
                        .addMessage(
                            InferenceEmbeddingWebhookToolParams.Webhook.Message
                                .WebhookToolRequestResponseDelayedMessage
                                .builder()
                                .content("Still working on that.")
                                .timingMs(5000L)
                                .build()
                        )
                        .method(InferenceEmbeddingWebhookToolParams.Webhook.Method.GET)
                        .pathParameters(
                            InferenceEmbeddingWebhookToolParams.Webhook.PathParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.Webhook.PathParameters
                                        .Properties
                                        .builder()
                                        .putAdditionalProperty("id", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("id")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.Webhook.PathParameters.Type
                                        .OBJECT
                                )
                                .build()
                        )
                        .queryParameters(
                            InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                        .Properties
                                        .builder()
                                        .putAdditionalProperty("page", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("page")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters.Type
                                        .OBJECT
                                )
                                .build()
                        )
                        .addStoreFieldsAsVariable(
                            InferenceEmbeddingWebhookToolParams.Webhook.StoreFieldsAsVariable
                                .builder()
                                .name("x")
                                .valuePath("x")
                                .build()
                        )
                        .timeoutMs(500L)
                        .build()
                )
                .type(ToolNode.Type.TOOL)
                .build()

        assertThat(toolNode.id()).isEqualTo("id")
        assertThat(toolNode.sharedToolId()).isEqualTo("shared_tool_id")
        assertThat(toolNode.name()).contains("name")
        assertThat(toolNode.position()).contains(NodePosition.builder().x(0.0).y(0.0).build())
        assertThat(toolNode.tool().getOrNull())
            .containsExactly(
                AssistantTool.ofWebhook(
                    InferenceEmbeddingWebhookToolParams.builder()
                        .type(InferenceEmbeddingWebhookToolParams.Type.WEBHOOK)
                        .webhook(
                            InferenceEmbeddingWebhookToolParams.Webhook.builder()
                                .description("description")
                                .name("name")
                                .url("https://example.com/api/v1/function")
                                .async(true)
                                .asyncTimeoutMs(1L)
                                .bodyParameters(
                                    InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters
                                        .builder()
                                        .properties(
                                            InferenceEmbeddingWebhookToolParams.Webhook
                                                .BodyParameters
                                                .Properties
                                                .builder()
                                                .putAdditionalProperty("age", JsonValue.from("bar"))
                                                .putAdditionalProperty(
                                                    "location",
                                                    JsonValue.from("bar"),
                                                )
                                                .build()
                                        )
                                        .addRequired("age")
                                        .addRequired("location")
                                        .type(
                                            InferenceEmbeddingWebhookToolParams.Webhook
                                                .BodyParameters
                                                .Type
                                                .OBJECT
                                        )
                                        .build()
                                )
                                .addHeader(
                                    InferenceEmbeddingWebhookToolParams.Webhook.Header.builder()
                                        .name("name")
                                        .value("value")
                                        .build()
                                )
                                .addMessage(
                                    InferenceEmbeddingWebhookToolParams.Webhook.Message
                                        .WebhookToolRequestStartMessage
                                        .builder()
                                        .content("Let me look that up for you.")
                                        .timingMs(100L)
                                        .build()
                                )
                                .addMessage(
                                    InferenceEmbeddingWebhookToolParams.Webhook.Message
                                        .WebhookToolRequestResponseDelayedMessage
                                        .builder()
                                        .content("Still working on that.")
                                        .timingMs(5000L)
                                        .build()
                                )
                                .method(InferenceEmbeddingWebhookToolParams.Webhook.Method.GET)
                                .pathParameters(
                                    InferenceEmbeddingWebhookToolParams.Webhook.PathParameters
                                        .builder()
                                        .properties(
                                            InferenceEmbeddingWebhookToolParams.Webhook
                                                .PathParameters
                                                .Properties
                                                .builder()
                                                .putAdditionalProperty("id", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .addRequired("id")
                                        .type(
                                            InferenceEmbeddingWebhookToolParams.Webhook
                                                .PathParameters
                                                .Type
                                                .OBJECT
                                        )
                                        .build()
                                )
                                .queryParameters(
                                    InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                        .builder()
                                        .properties(
                                            InferenceEmbeddingWebhookToolParams.Webhook
                                                .QueryParameters
                                                .Properties
                                                .builder()
                                                .putAdditionalProperty(
                                                    "page",
                                                    JsonValue.from("bar"),
                                                )
                                                .build()
                                        )
                                        .addRequired("page")
                                        .type(
                                            InferenceEmbeddingWebhookToolParams.Webhook
                                                .QueryParameters
                                                .Type
                                                .OBJECT
                                        )
                                        .build()
                                )
                                .addStoreFieldsAsVariable(
                                    InferenceEmbeddingWebhookToolParams.Webhook
                                        .StoreFieldsAsVariable
                                        .builder()
                                        .name("x")
                                        .valuePath("x")
                                        .build()
                                )
                                .timeoutMs(500L)
                                .build()
                        )
                        .build()
                )
            )
        assertThat(toolNode.type()).contains(ToolNode.Type.TOOL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolNode =
            ToolNode.builder()
                .id("id")
                .sharedToolId("shared_tool_id")
                .name("name")
                .position(NodePosition.builder().x(0.0).y(0.0).build())
                .addWebhookTool(
                    InferenceEmbeddingWebhookToolParams.Webhook.builder()
                        .description("description")
                        .name("name")
                        .url("https://example.com/api/v1/function")
                        .async(true)
                        .asyncTimeoutMs(1L)
                        .bodyParameters(
                            InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters
                                        .Properties
                                        .builder()
                                        .putAdditionalProperty("age", JsonValue.from("bar"))
                                        .putAdditionalProperty("location", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("age")
                                .addRequired("location")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters.Type
                                        .OBJECT
                                )
                                .build()
                        )
                        .addHeader(
                            InferenceEmbeddingWebhookToolParams.Webhook.Header.builder()
                                .name("name")
                                .value("value")
                                .build()
                        )
                        .addMessage(
                            InferenceEmbeddingWebhookToolParams.Webhook.Message
                                .WebhookToolRequestStartMessage
                                .builder()
                                .content("Let me look that up for you.")
                                .timingMs(100L)
                                .build()
                        )
                        .addMessage(
                            InferenceEmbeddingWebhookToolParams.Webhook.Message
                                .WebhookToolRequestResponseDelayedMessage
                                .builder()
                                .content("Still working on that.")
                                .timingMs(5000L)
                                .build()
                        )
                        .method(InferenceEmbeddingWebhookToolParams.Webhook.Method.GET)
                        .pathParameters(
                            InferenceEmbeddingWebhookToolParams.Webhook.PathParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.Webhook.PathParameters
                                        .Properties
                                        .builder()
                                        .putAdditionalProperty("id", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("id")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.Webhook.PathParameters.Type
                                        .OBJECT
                                )
                                .build()
                        )
                        .queryParameters(
                            InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                        .Properties
                                        .builder()
                                        .putAdditionalProperty("page", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("page")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters.Type
                                        .OBJECT
                                )
                                .build()
                        )
                        .addStoreFieldsAsVariable(
                            InferenceEmbeddingWebhookToolParams.Webhook.StoreFieldsAsVariable
                                .builder()
                                .name("x")
                                .valuePath("x")
                                .build()
                        )
                        .timeoutMs(500L)
                        .build()
                )
                .type(ToolNode.Type.TOOL)
                .build()

        val roundtrippedToolNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolNode),
                jacksonTypeRef<ToolNode>(),
            )

        assertThat(roundtrippedToolNode).isEqualTo(toolNode)
    }
}
