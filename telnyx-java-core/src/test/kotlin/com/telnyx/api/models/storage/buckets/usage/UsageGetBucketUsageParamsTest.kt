// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.buckets.usage

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageGetBucketUsageParamsTest {

    @Test
    fun create() {
        UsageGetBucketUsageParams.builder().bucketName("").build()
    }

    @Test
    fun pathParams() {
        val params = UsageGetBucketUsageParams.builder().bucketName("").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
