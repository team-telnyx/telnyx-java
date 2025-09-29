// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.embeddings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingUrlParamsTest {

    @Test
    fun create() {
        EmbeddingUrlParams.builder().bucketName("bucket_name").url("url").build()
    }

    @Test
    fun body() {
        val params = EmbeddingUrlParams.builder().bucketName("bucket_name").url("url").build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("bucket_name")
        assertThat(body.url()).isEqualTo("url")
    }
}
