// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.embeddings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingSimilaritySearchParamsTest {

    @Test
    fun create() {
        EmbeddingSimilaritySearchParams.builder()
            .bucketName("Bucket Name")
            .query("Query")
            .numOfDocs(3L)
            .build()
    }

    @Test
    fun body() {
        val params =
            EmbeddingSimilaritySearchParams.builder()
                .bucketName("Bucket Name")
                .query("Query")
                .numOfDocs(3L)
                .build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("Bucket Name")
        assertThat(body.query()).isEqualTo("Query")
        assertThat(body.numOfDocs()).contains(3L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmbeddingSimilaritySearchParams.builder()
                .bucketName("Bucket Name")
                .query("Query")
                .build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("Bucket Name")
        assertThat(body.query()).isEqualTo("Query")
    }
}
