// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferenceEmbeddingWebhookToolParamsTest {

    @Test
    fun create() {
        val inferenceEmbeddingWebhookToolParams =
            InferenceEmbeddingWebhookToolParams.builder()
                .type(InferenceEmbeddingWebhookToolParams.Type.WEBHOOK)
                .webhook(
                    InferenceEmbeddingWebhookToolParams.Webhook.builder()
                        .description("description")
                        .name("name")
                        .url("https://example.com/api/v1/function")
                        .async(true)
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
                        .timeoutMs(500L)
                        .build()
                )
                .build()

        assertThat(inferenceEmbeddingWebhookToolParams.type())
            .isEqualTo(InferenceEmbeddingWebhookToolParams.Type.WEBHOOK)
        assertThat(inferenceEmbeddingWebhookToolParams.webhook())
            .isEqualTo(
                InferenceEmbeddingWebhookToolParams.Webhook.builder()
                    .description("description")
                    .name("name")
                    .url("https://example.com/api/v1/function")
                    .async(true)
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
                    .timeoutMs(500L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inferenceEmbeddingWebhookToolParams =
            InferenceEmbeddingWebhookToolParams.builder()
                .type(InferenceEmbeddingWebhookToolParams.Type.WEBHOOK)
                .webhook(
                    InferenceEmbeddingWebhookToolParams.Webhook.builder()
                        .description("description")
                        .name("name")
                        .url("https://example.com/api/v1/function")
                        .async(true)
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
                        .timeoutMs(500L)
                        .build()
                )
                .build()

        val roundtrippedInferenceEmbeddingWebhookToolParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inferenceEmbeddingWebhookToolParams),
                jacksonTypeRef<InferenceEmbeddingWebhookToolParams>(),
            )

        assertThat(roundtrippedInferenceEmbeddingWebhookToolParams)
            .isEqualTo(inferenceEmbeddingWebhookToolParams)
    }
}
