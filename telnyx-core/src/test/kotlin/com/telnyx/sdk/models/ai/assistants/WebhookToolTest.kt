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
                                    WebhookTool.Webhook.BodyParameters.Properties.builder()
                                        .putAdditionalProperty("age", JsonValue.from("bar"))
                                        .putAdditionalProperty("location", JsonValue.from("bar"))
                                        .build()
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
                                    WebhookTool.Webhook.PathParameters.Properties.builder()
                                        .putAdditionalProperty("id", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("id")
                                .type(WebhookTool.Webhook.PathParameters.Type.OBJECT)
                                .build()
                        )
                        .queryParameters(
                            WebhookTool.Webhook.QueryParameters.builder()
                                .properties(
                                    WebhookTool.Webhook.QueryParameters.Properties.builder()
                                        .putAdditionalProperty("page", JsonValue.from("bar"))
                                        .build()
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
                                WebhookTool.Webhook.BodyParameters.Properties.builder()
                                    .putAdditionalProperty("age", JsonValue.from("bar"))
                                    .putAdditionalProperty("location", JsonValue.from("bar"))
                                    .build()
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
                                WebhookTool.Webhook.PathParameters.Properties.builder()
                                    .putAdditionalProperty("id", JsonValue.from("bar"))
                                    .build()
                            )
                            .addRequired("id")
                            .type(WebhookTool.Webhook.PathParameters.Type.OBJECT)
                            .build()
                    )
                    .queryParameters(
                        WebhookTool.Webhook.QueryParameters.builder()
                            .properties(
                                WebhookTool.Webhook.QueryParameters.Properties.builder()
                                    .putAdditionalProperty("page", JsonValue.from("bar"))
                                    .build()
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
                                    WebhookTool.Webhook.BodyParameters.Properties.builder()
                                        .putAdditionalProperty("age", JsonValue.from("bar"))
                                        .putAdditionalProperty("location", JsonValue.from("bar"))
                                        .build()
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
                                    WebhookTool.Webhook.PathParameters.Properties.builder()
                                        .putAdditionalProperty("id", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("id")
                                .type(WebhookTool.Webhook.PathParameters.Type.OBJECT)
                                .build()
                        )
                        .queryParameters(
                            WebhookTool.Webhook.QueryParameters.builder()
                                .properties(
                                    WebhookTool.Webhook.QueryParameters.Properties.builder()
                                        .putAdditionalProperty("page", JsonValue.from("bar"))
                                        .build()
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
