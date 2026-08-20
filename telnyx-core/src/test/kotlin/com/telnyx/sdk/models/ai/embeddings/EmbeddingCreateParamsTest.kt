// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.embeddings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingCreateParamsTest {

    @Test
    fun create() {
        EmbeddingCreateParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .bucketName("Bucket Name")
            .documentChunkOverlapSize(512L)
            .documentChunkSize(1024L)
            .embeddingModel(EmbeddingCreateParams.EmbeddingModel.THENLPER_GTE_LARGE)
            .loader(EmbeddingCreateParams.Loader.DEFAULT)
            .build()
    }

    @Test
    fun headers() {
        val params =
            EmbeddingCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .bucketName("Bucket Name")
                .documentChunkOverlapSize(512L)
                .documentChunkSize(1024L)
                .embeddingModel(EmbeddingCreateParams.EmbeddingModel.THENLPER_GTE_LARGE)
                .loader(EmbeddingCreateParams.Loader.DEFAULT)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = EmbeddingCreateParams.builder().bucketName("Bucket Name").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EmbeddingCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .bucketName("Bucket Name")
                .documentChunkOverlapSize(512L)
                .documentChunkSize(1024L)
                .embeddingModel(EmbeddingCreateParams.EmbeddingModel.THENLPER_GTE_LARGE)
                .loader(EmbeddingCreateParams.Loader.DEFAULT)
                .build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("Bucket Name")
        assertThat(body.documentChunkOverlapSize()).contains(512L)
        assertThat(body.documentChunkSize()).contains(1024L)
        assertThat(body.embeddingModel())
            .contains(EmbeddingCreateParams.EmbeddingModel.THENLPER_GTE_LARGE)
        assertThat(body.loader()).contains(EmbeddingCreateParams.Loader.DEFAULT)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmbeddingCreateParams.builder().bucketName("Bucket Name").build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("Bucket Name")
    }
}
