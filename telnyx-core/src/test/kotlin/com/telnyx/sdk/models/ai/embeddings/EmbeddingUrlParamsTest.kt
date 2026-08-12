// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.embeddings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingUrlParamsTest {

    @Test
    fun create() {
        EmbeddingUrlParams.builder().bucketName("Bucket Name").url("URL").build()
    }

    @Test
    fun body() {
        val params = EmbeddingUrlParams.builder().bucketName("Bucket Name").url("URL").build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("Bucket Name")
        assertThat(body.url()).isEqualTo("URL")
    }
}
