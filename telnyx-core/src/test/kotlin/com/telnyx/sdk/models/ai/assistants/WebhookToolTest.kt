// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookToolTest {

    @Test
    fun create() {
        val webhookTool =
            WebhookTool.builder()
                .type(WebhookTool.Type.WEBHOOK)
                .webhook(
                    WebhookTool.Webhook.builder()
                        .description("description")
                        .name("name")
                        .url("https://example.com/api/v1/function")
                        .bodyParameters(
                            WebhookTool.Webhook.BodyParameters.builder()
                                .properties(
                                    JsonValue.from(
                                        mapOf(
                                            "age" to
                                                mapOf(
                                                    "description" to "The age of the customer.",
                                                    "type" to "integer",
                                                ),
                                            "location" to
                                                mapOf(
                                                    "description" to
                                                        "The location of the customer.",
                                                    "type" to "string",
                                                ),
                                        )
                                    )
                                )
                                .addRequired("age")
                                .addRequired("location")
                                .type(WebhookTool.Webhook.BodyParameters.Type.OBJECT)
                                .build()
                        )
                        .addHeader(
                            WebhookTool.Webhook.Header.builder().name("name").value("value").build()
                        )
                        .method(WebhookTool.Webhook.Method.GET)
                        .pathParameters(
                            WebhookTool.Webhook.PathParameters.builder()
                                .properties(
                                    JsonValue.from(
                                        mapOf(
                                            "id" to
                                                mapOf(
                                                    "description" to "The id of the customer.",
                                                    "type" to "string",
                                                )
                                        )
                                    )
                                )
                                .addRequired("id")
                                .type(WebhookTool.Webhook.PathParameters.Type.OBJECT)
                                .build()
                        )
                        .queryParameters(
                            WebhookTool.Webhook.QueryParameters.builder()
                                .properties(
                                    JsonValue.from(
                                        mapOf(
                                            "page" to
                                                mapOf(
                                                    "description" to "The page number.",
                                                    "type" to "integer",
                                                )
                                        )
                                    )
                                )
                                .addRequired("page")
                                .type(WebhookTool.Webhook.QueryParameters.Type.OBJECT)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(webhookTool.type()).isEqualTo(WebhookTool.Type.WEBHOOK)
        assertThat(webhookTool.webhook())
            .isEqualTo(
                WebhookTool.Webhook.builder()
                    .description("description")
                    .name("name")
                    .url("https://example.com/api/v1/function")
                    .bodyParameters(
                        WebhookTool.Webhook.BodyParameters.builder()
                            .properties(
                                JsonValue.from(
                                    mapOf(
                                        "age" to
                                            mapOf(
                                                "description" to "The age of the customer.",
                                                "type" to "integer",
                                            ),
                                        "location" to
                                            mapOf(
                                                "description" to "The location of the customer.",
                                                "type" to "string",
                                            ),
                                    )
                                )
                            )
                            .addRequired("age")
                            .addRequired("location")
                            .type(WebhookTool.Webhook.BodyParameters.Type.OBJECT)
                            .build()
                    )
                    .addHeader(
                        WebhookTool.Webhook.Header.builder().name("name").value("value").build()
                    )
                    .method(WebhookTool.Webhook.Method.GET)
                    .pathParameters(
                        WebhookTool.Webhook.PathParameters.builder()
                            .properties(
                                JsonValue.from(
                                    mapOf(
                                        "id" to
                                            mapOf(
                                                "description" to "The id of the customer.",
                                                "type" to "string",
                                            )
                                    )
                                )
                            )
                            .addRequired("id")
                            .type(WebhookTool.Webhook.PathParameters.Type.OBJECT)
                            .build()
                    )
                    .queryParameters(
                        WebhookTool.Webhook.QueryParameters.builder()
                            .properties(
                                JsonValue.from(
                                    mapOf(
                                        "page" to
                                            mapOf(
                                                "description" to "The page number.",
                                                "type" to "integer",
                                            )
                                    )
                                )
                            )
                            .addRequired("page")
                            .type(WebhookTool.Webhook.QueryParameters.Type.OBJECT)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookTool =
            WebhookTool.builder()
                .type(WebhookTool.Type.WEBHOOK)
                .webhook(
                    WebhookTool.Webhook.builder()
                        .description("description")
                        .name("name")
                        .url("https://example.com/api/v1/function")
                        .bodyParameters(
                            WebhookTool.Webhook.BodyParameters.builder()
                                .properties(
                                    JsonValue.from(
                                        mapOf(
                                            "age" to
                                                mapOf(
                                                    "description" to "The age of the customer.",
                                                    "type" to "integer",
                                                ),
                                            "location" to
                                                mapOf(
                                                    "description" to
                                                        "The location of the customer.",
                                                    "type" to "string",
                                                ),
                                        )
                                    )
                                )
                                .addRequired("age")
                                .addRequired("location")
                                .type(WebhookTool.Webhook.BodyParameters.Type.OBJECT)
                                .build()
                        )
                        .addHeader(
                            WebhookTool.Webhook.Header.builder().name("name").value("value").build()
                        )
                        .method(WebhookTool.Webhook.Method.GET)
                        .pathParameters(
                            WebhookTool.Webhook.PathParameters.builder()
                                .properties(
                                    JsonValue.from(
                                        mapOf(
                                            "id" to
                                                mapOf(
                                                    "description" to "The id of the customer.",
                                                    "type" to "string",
                                                )
                                        )
                                    )
                                )
                                .addRequired("id")
                                .type(WebhookTool.Webhook.PathParameters.Type.OBJECT)
                                .build()
                        )
                        .queryParameters(
                            WebhookTool.Webhook.QueryParameters.builder()
                                .properties(
                                    JsonValue.from(
                                        mapOf(
                                            "page" to
                                                mapOf(
                                                    "description" to "The page number.",
                                                    "type" to "integer",
                                                )
                                        )
                                    )
                                )
                                .addRequired("page")
                                .type(WebhookTool.Webhook.QueryParameters.Type.OBJECT)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedWebhookTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookTool),
                jacksonTypeRef<WebhookTool>(),
            )

        assertThat(roundtrippedWebhookTool).isEqualTo(webhookTool)
    }
}
