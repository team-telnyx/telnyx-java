// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferenceEmbeddingWebhookToolParamsTest {

    @Test
    fun create() {
        val inferenceEmbeddingWebhookToolParams =
            InferenceEmbeddingWebhookToolParams.builder()
                .description("description")
                .name("name")
                .url("https://example.com/api/v1/function")
                .bodyParameters(
                    InferenceEmbeddingWebhookToolParams.BodyParameters.builder()
                        .properties(
                            InferenceEmbeddingWebhookToolParams.BodyParameters.Properties.builder()
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
                            InferenceEmbeddingWebhookToolParams.PathParameters.Properties.builder()
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
                            InferenceEmbeddingWebhookToolParams.QueryParameters.Properties.builder()
                                .putAdditionalProperty("page", JsonValue.from("bar"))
                                .build()
                        )
                        .addRequired("page")
                        .type(InferenceEmbeddingWebhookToolParams.QueryParameters.Type.OBJECT)
                        .build()
                )
                .build()

        assertThat(inferenceEmbeddingWebhookToolParams.description()).isEqualTo("description")
        assertThat(inferenceEmbeddingWebhookToolParams.name()).isEqualTo("name")
        assertThat(inferenceEmbeddingWebhookToolParams.url())
            .isEqualTo("https://example.com/api/v1/function")
        assertThat(inferenceEmbeddingWebhookToolParams.bodyParameters())
            .contains(
                InferenceEmbeddingWebhookToolParams.BodyParameters.builder()
                    .properties(
                        InferenceEmbeddingWebhookToolParams.BodyParameters.Properties.builder()
                            .putAdditionalProperty("age", JsonValue.from("bar"))
                            .putAdditionalProperty("location", JsonValue.from("bar"))
                            .build()
                    )
                    .addRequired("age")
                    .addRequired("location")
                    .type(InferenceEmbeddingWebhookToolParams.BodyParameters.Type.OBJECT)
                    .build()
            )
        assertThat(inferenceEmbeddingWebhookToolParams.headers().getOrNull())
            .containsExactly(
                InferenceEmbeddingWebhookToolParams.Header.builder()
                    .name("name")
                    .value("value")
                    .build()
            )
        assertThat(inferenceEmbeddingWebhookToolParams.method())
            .contains(InferenceEmbeddingWebhookToolParams.Method.GET)
        assertThat(inferenceEmbeddingWebhookToolParams.pathParameters())
            .contains(
                InferenceEmbeddingWebhookToolParams.PathParameters.builder()
                    .properties(
                        InferenceEmbeddingWebhookToolParams.PathParameters.Properties.builder()
                            .putAdditionalProperty("id", JsonValue.from("bar"))
                            .build()
                    )
                    .addRequired("id")
                    .type(InferenceEmbeddingWebhookToolParams.PathParameters.Type.OBJECT)
                    .build()
            )
        assertThat(inferenceEmbeddingWebhookToolParams.queryParameters())
            .contains(
                InferenceEmbeddingWebhookToolParams.QueryParameters.builder()
                    .properties(
                        InferenceEmbeddingWebhookToolParams.QueryParameters.Properties.builder()
                            .putAdditionalProperty("page", JsonValue.from("bar"))
                            .build()
                    )
                    .addRequired("page")
                    .type(InferenceEmbeddingWebhookToolParams.QueryParameters.Type.OBJECT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inferenceEmbeddingWebhookToolParams =
            InferenceEmbeddingWebhookToolParams.builder()
                .description("description")
                .name("name")
                .url("https://example.com/api/v1/function")
                .bodyParameters(
                    InferenceEmbeddingWebhookToolParams.BodyParameters.builder()
                        .properties(
                            InferenceEmbeddingWebhookToolParams.BodyParameters.Properties.builder()
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
                            InferenceEmbeddingWebhookToolParams.PathParameters.Properties.builder()
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
                            InferenceEmbeddingWebhookToolParams.QueryParameters.Properties.builder()
                                .putAdditionalProperty("page", JsonValue.from("bar"))
                                .build()
                        )
                        .addRequired("page")
                        .type(InferenceEmbeddingWebhookToolParams.QueryParameters.Type.OBJECT)
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
