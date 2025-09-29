// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.embeddings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingSimilaritySearchParamsTest {

    @Test
    fun create() {
        EmbeddingSimilaritySearchParams.builder()
            .bucketName("bucket_name")
            .query("query")
            .numOfDocs(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            EmbeddingSimilaritySearchParams.builder()
                .bucketName("bucket_name")
                .query("query")
                .numOfDocs(0L)
                .build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("bucket_name")
        assertThat(body.query()).isEqualTo("query")
        assertThat(body.numOfDocs()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmbeddingSimilaritySearchParams.builder()
                .bucketName("bucket_name")
                .query("query")
                .build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("bucket_name")
        assertThat(body.query()).isEqualTo("query")
    }
}
