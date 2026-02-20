// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai.embeddings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingCreateEmbeddingsResponseTest {

    @Test
    fun create() {
        val embeddingCreateEmbeddingsResponse =
            EmbeddingCreateEmbeddingsResponse.builder()
                .addData(
                    EmbeddingCreateEmbeddingsResponse.Data.builder()
                        .addEmbedding(0.0)
                        .index(0L)
                        .modelObject("object")
                        .build()
                )
                .model("model")
                .modelObject("object")
                .usage(
                    EmbeddingCreateEmbeddingsResponse.Usage.builder()
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        assertThat(embeddingCreateEmbeddingsResponse.data())
            .containsExactly(
                EmbeddingCreateEmbeddingsResponse.Data.builder()
                    .addEmbedding(0.0)
                    .index(0L)
                    .modelObject("object")
                    .build()
            )
        assertThat(embeddingCreateEmbeddingsResponse.model()).isEqualTo("model")
        assertThat(embeddingCreateEmbeddingsResponse.modelObject()).isEqualTo("object")
        assertThat(embeddingCreateEmbeddingsResponse.usage())
            .isEqualTo(
                EmbeddingCreateEmbeddingsResponse.Usage.builder()
                    .promptTokens(0L)
                    .totalTokens(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddingCreateEmbeddingsResponse =
            EmbeddingCreateEmbeddingsResponse.builder()
                .addData(
                    EmbeddingCreateEmbeddingsResponse.Data.builder()
                        .addEmbedding(0.0)
                        .index(0L)
                        .modelObject("object")
                        .build()
                )
                .model("model")
                .modelObject("object")
                .usage(
                    EmbeddingCreateEmbeddingsResponse.Usage.builder()
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        val roundtrippedEmbeddingCreateEmbeddingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddingCreateEmbeddingsResponse),
                jacksonTypeRef<EmbeddingCreateEmbeddingsResponse>(),
            )

        assertThat(roundtrippedEmbeddingCreateEmbeddingsResponse)
            .isEqualTo(embeddingCreateEmbeddingsResponse)
    }
}
