// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai.embeddings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingListEmbeddingModelsResponseTest {

    @Test
    fun create() {
        val embeddingListEmbeddingModelsResponse =
            EmbeddingListEmbeddingModelsResponse.builder()
                .addData(
                    EmbeddingListEmbeddingModelsResponse.Data.builder()
                        .id("thenlper/gte-large")
                        .created(0L)
                        .object_("object")
                        .ownedBy("telnyx")
                        .build()
                )
                .object_("object")
                .build()

        assertThat(embeddingListEmbeddingModelsResponse.data())
            .containsExactly(
                EmbeddingListEmbeddingModelsResponse.Data.builder()
                    .id("thenlper/gte-large")
                    .created(0L)
                    .object_("object")
                    .ownedBy("telnyx")
                    .build()
            )
        assertThat(embeddingListEmbeddingModelsResponse.object_()).isEqualTo("object")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddingListEmbeddingModelsResponse =
            EmbeddingListEmbeddingModelsResponse.builder()
                .addData(
                    EmbeddingListEmbeddingModelsResponse.Data.builder()
                        .id("thenlper/gte-large")
                        .created(0L)
                        .object_("object")
                        .ownedBy("telnyx")
                        .build()
                )
                .object_("object")
                .build()

        val roundtrippedEmbeddingListEmbeddingModelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddingListEmbeddingModelsResponse),
                jacksonTypeRef<EmbeddingListEmbeddingModelsResponse>(),
            )

        assertThat(roundtrippedEmbeddingListEmbeddingModelsResponse)
            .isEqualTo(embeddingListEmbeddingModelsResponse)
    }
}
