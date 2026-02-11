// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai.embeddings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingCreateResponseTest {

    @Test
    fun create() {
        val embeddingCreateResponse =
            EmbeddingCreateResponse.builder()
                .addData(
                    EmbeddingCreateResponse.Data.builder()
                        .addEmbedding(0.0)
                        .index(0L)
                        .object_("object")
                        .build()
                )
                .model("model")
                .object_("object")
                .usage(
                    EmbeddingCreateResponse.Usage.builder().promptTokens(0L).totalTokens(0L).build()
                )
                .build()

        assertThat(embeddingCreateResponse.data())
            .containsExactly(
                EmbeddingCreateResponse.Data.builder()
                    .addEmbedding(0.0)
                    .index(0L)
                    .object_("object")
                    .build()
            )
        assertThat(embeddingCreateResponse.model()).isEqualTo("model")
        assertThat(embeddingCreateResponse.object_()).isEqualTo("object")
        assertThat(embeddingCreateResponse.usage())
            .isEqualTo(
                EmbeddingCreateResponse.Usage.builder().promptTokens(0L).totalTokens(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddingCreateResponse =
            EmbeddingCreateResponse.builder()
                .addData(
                    EmbeddingCreateResponse.Data.builder()
                        .addEmbedding(0.0)
                        .index(0L)
                        .object_("object")
                        .build()
                )
                .model("model")
                .object_("object")
                .usage(
                    EmbeddingCreateResponse.Usage.builder().promptTokens(0L).totalTokens(0L).build()
                )
                .build()

        val roundtrippedEmbeddingCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddingCreateResponse),
                jacksonTypeRef<EmbeddingCreateResponse>(),
            )

        assertThat(roundtrippedEmbeddingCreateResponse).isEqualTo(embeddingCreateResponse)
    }
}
