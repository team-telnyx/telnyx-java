// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.embeddings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingCreateParamsTest {

    @Test
    fun create() {
        EmbeddingCreateParams.builder()
            .bucketName("bucket_name")
            .documentChunkOverlapSize(0L)
            .documentChunkSize(0L)
            .embeddingModel(EmbeddingCreateParams.EmbeddingModel.THENLPER_GTE_LARGE)
            .loader(EmbeddingCreateParams.Loader.DEFAULT)
            .build()
    }

    @Test
    fun body() {
        val params =
            EmbeddingCreateParams.builder()
                .bucketName("bucket_name")
                .documentChunkOverlapSize(0L)
                .documentChunkSize(0L)
                .embeddingModel(EmbeddingCreateParams.EmbeddingModel.THENLPER_GTE_LARGE)
                .loader(EmbeddingCreateParams.Loader.DEFAULT)
                .build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("bucket_name")
        assertThat(body.documentChunkOverlapSize()).contains(0L)
        assertThat(body.documentChunkSize()).contains(0L)
        assertThat(body.embeddingModel())
            .contains(EmbeddingCreateParams.EmbeddingModel.THENLPER_GTE_LARGE)
        assertThat(body.loader()).contains(EmbeddingCreateParams.Loader.DEFAULT)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmbeddingCreateParams.builder().bucketName("bucket_name").build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("bucket_name")
    }
}
