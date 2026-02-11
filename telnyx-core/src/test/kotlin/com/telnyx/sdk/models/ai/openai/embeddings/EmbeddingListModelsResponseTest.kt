// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai.embeddings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingListModelsResponseTest {

    @Test
    fun create() {
        val embeddingListModelsResponse =
            EmbeddingListModelsResponse.builder()
                .addData(
                    EmbeddingListModelsResponse.Data.builder()
                        .id("thenlper/gte-large")
                        .created(0L)
                        .object_("object")
                        .ownedBy("telnyx")
                        .build()
                )
                .object_("object")
                .build()

        assertThat(embeddingListModelsResponse.data())
            .containsExactly(
                EmbeddingListModelsResponse.Data.builder()
                    .id("thenlper/gte-large")
                    .created(0L)
                    .object_("object")
                    .ownedBy("telnyx")
                    .build()
            )
        assertThat(embeddingListModelsResponse.object_()).isEqualTo("object")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddingListModelsResponse =
            EmbeddingListModelsResponse.builder()
                .addData(
                    EmbeddingListModelsResponse.Data.builder()
                        .id("thenlper/gte-large")
                        .created(0L)
                        .object_("object")
                        .ownedBy("telnyx")
                        .build()
                )
                .object_("object")
                .build()

        val roundtrippedEmbeddingListModelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddingListModelsResponse),
                jacksonTypeRef<EmbeddingListModelsResponse>(),
            )

        assertThat(roundtrippedEmbeddingListModelsResponse).isEqualTo(embeddingListModelsResponse)
    }
}
