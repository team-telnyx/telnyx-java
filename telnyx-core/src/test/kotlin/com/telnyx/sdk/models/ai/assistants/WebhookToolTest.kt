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
                    InferenceEmbeddingWebhookToolParams.builder()
                        .description("description")
                        .name("name")
                        .url("https://example.com/api/v1/function")
                        .async(true)
                        .bodyParameters(
                            InferenceEmbeddingWebhookToolParams.BodyParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.BodyParameters.Properties
                                        .builder()
                                        .putAdditionalProperty("age", JsonValue.from("bar"))
                                        .putAdditionalProperty("location", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("age")
                                .addRequired("location")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.BodyParameters.Type.OBJECT
                                )
                                .build()
                        )
                        .addHeader(
                            InferenceEmbeddingWebhookToolParams.Header.builder()
                                .name("name")
                                .value("value")
                                .build()
                        )
                        .method(InferenceEmbeddingWebhookToolParams.Method.GET)
                        .pathParameters(
                            InferenceEmbeddingWebhookToolParams.PathParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.PathParameters.Properties
                                        .builder()
                                        .putAdditionalProperty("id", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("id")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.PathParameters.Type.OBJECT
                                )
                                .build()
                        )
                        .queryParameters(
                            InferenceEmbeddingWebhookToolParams.QueryParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.QueryParameters.Properties
                                        .builder()
                                        .putAdditionalProperty("page", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("page")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.QueryParameters.Type.OBJECT
                                )
                                .build()
                        )
                        .timeoutMs(500L)
                        .build()
                )
                .build()

        assertThat(webhookTool.type()).isEqualTo(WebhookTool.Type.WEBHOOK)
        assertThat(webhookTool.webhook())
            .isEqualTo(
                InferenceEmbeddingWebhookToolParams.builder()
                    .description("description")
                    .name("name")
                    .url("https://example.com/api/v1/function")
                    .async(true)
                    .bodyParameters(
                        InferenceEmbeddingWebhookToolParams.BodyParameters.builder()
                            .properties(
                                InferenceEmbeddingWebhookToolParams.BodyParameters.Properties
                                    .builder()
                                    .putAdditionalProperty("age", JsonValue.from("bar"))
                                    .putAdditionalProperty("location", JsonValue.from("bar"))
                                    .build()
                            )
                            .addRequired("age")
                            .addRequired("location")
                            .type(InferenceEmbeddingWebhookToolParams.BodyParameters.Type.OBJECT)
                            .build()
                    )
                    .addHeader(
                        InferenceEmbeddingWebhookToolParams.Header.builder()
                            .name("name")
                            .value("value")
                            .build()
                    )
                    .method(InferenceEmbeddingWebhookToolParams.Method.GET)
                    .pathParameters(
                        InferenceEmbeddingWebhookToolParams.PathParameters.builder()
                            .properties(
                                InferenceEmbeddingWebhookToolParams.PathParameters.Properties
                                    .builder()
                                    .putAdditionalProperty("id", JsonValue.from("bar"))
                                    .build()
                            )
                            .addRequired("id")
                            .type(InferenceEmbeddingWebhookToolParams.PathParameters.Type.OBJECT)
                            .build()
                    )
                    .queryParameters(
                        InferenceEmbeddingWebhookToolParams.QueryParameters.builder()
                            .properties(
                                InferenceEmbeddingWebhookToolParams.QueryParameters.Properties
                                    .builder()
                                    .putAdditionalProperty("page", JsonValue.from("bar"))
                                    .build()
                            )
                            .addRequired("page")
                            .type(InferenceEmbeddingWebhookToolParams.QueryParameters.Type.OBJECT)
                            .build()
                    )
                    .timeoutMs(500L)
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
                    InferenceEmbeddingWebhookToolParams.builder()
                        .description("description")
                        .name("name")
                        .url("https://example.com/api/v1/function")
                        .async(true)
                        .bodyParameters(
                            InferenceEmbeddingWebhookToolParams.BodyParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.BodyParameters.Properties
                                        .builder()
                                        .putAdditionalProperty("age", JsonValue.from("bar"))
                                        .putAdditionalProperty("location", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("age")
                                .addRequired("location")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.BodyParameters.Type.OBJECT
                                )
                                .build()
                        )
                        .addHeader(
                            InferenceEmbeddingWebhookToolParams.Header.builder()
                                .name("name")
                                .value("value")
                                .build()
                        )
                        .method(InferenceEmbeddingWebhookToolParams.Method.GET)
                        .pathParameters(
                            InferenceEmbeddingWebhookToolParams.PathParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.PathParameters.Properties
                                        .builder()
                                        .putAdditionalProperty("id", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("id")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.PathParameters.Type.OBJECT
                                )
                                .build()
                        )
                        .queryParameters(
                            InferenceEmbeddingWebhookToolParams.QueryParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.QueryParameters.Properties
                                        .builder()
                                        .putAdditionalProperty("page", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("page")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.QueryParameters.Type.OBJECT
                                )
                                .build()
                        )
                        .timeoutMs(500L)
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
