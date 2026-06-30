// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.embeddings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingSimilaritySearchResponseTest {

    @Test
    fun create() {
        val embeddingSimilaritySearchResponse =
            EmbeddingSimilaritySearchResponse.builder()
                .addData(
                    EmbeddingSimilaritySearchResponse.Data.builder()
                        .distance(0.0)
                        .documentChunk("document_chunk")
                        .metadata(
                            EmbeddingSimilaritySearchResponse.Data.Metadata.builder()
                                .checksum("checksum")
                                .embedding("embedding")
                                .filename("filename")
                                .source("source")
                                .certainty(0.0)
                                .loaderMetadata(
                                    EmbeddingSimilaritySearchResponse.Data.Metadata.LoaderMetadata
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(embeddingSimilaritySearchResponse.data())
            .containsExactly(
                EmbeddingSimilaritySearchResponse.Data.builder()
                    .distance(0.0)
                    .documentChunk("document_chunk")
                    .metadata(
                        EmbeddingSimilaritySearchResponse.Data.Metadata.builder()
                            .checksum("checksum")
                            .embedding("embedding")
                            .filename("filename")
                            .source("source")
                            .certainty(0.0)
                            .loaderMetadata(
                                EmbeddingSimilaritySearchResponse.Data.Metadata.LoaderMetadata
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddingSimilaritySearchResponse =
            EmbeddingSimilaritySearchResponse.builder()
                .addData(
                    EmbeddingSimilaritySearchResponse.Data.builder()
                        .distance(0.0)
                        .documentChunk("document_chunk")
                        .metadata(
                            EmbeddingSimilaritySearchResponse.Data.Metadata.builder()
                                .checksum("checksum")
                                .embedding("embedding")
                                .filename("filename")
                                .source("source")
                                .certainty(0.0)
                                .loaderMetadata(
                                    EmbeddingSimilaritySearchResponse.Data.Metadata.LoaderMetadata
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedEmbeddingSimilaritySearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddingSimilaritySearchResponse),
                jacksonTypeRef<EmbeddingSimilaritySearchResponse>(),
            )

        assertThat(roundtrippedEmbeddingSimilaritySearchResponse)
            .isEqualTo(embeddingSimilaritySearchResponse)
    }
}
