// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.embeddings.buckets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BucketDeleteParamsTest {

    @Test
    fun create() {
        BucketDeleteParams.builder().bucketName("bucket_name").build()
    }

    @Test
    fun pathParams() {
        val params = BucketDeleteParams.builder().bucketName("bucket_name").build()

        assertThat(params._pathParam(0)).isEqualTo("bucket_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
