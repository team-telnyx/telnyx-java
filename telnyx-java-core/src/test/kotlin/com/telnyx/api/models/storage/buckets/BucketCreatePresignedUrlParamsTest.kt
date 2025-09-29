// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.buckets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BucketCreatePresignedUrlParamsTest {

    @Test
    fun create() {
        BucketCreatePresignedUrlParams.builder().bucketName("").objectName("").ttl(1L).build()
    }

    @Test
    fun pathParams() {
        val params = BucketCreatePresignedUrlParams.builder().bucketName("").objectName("").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BucketCreatePresignedUrlParams.builder().bucketName("").objectName("").ttl(1L).build()

        val body = params._body()

        assertThat(body.ttl()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BucketCreatePresignedUrlParams.builder().bucketName("").objectName("").build()

        val body = params._body()
    }
}
