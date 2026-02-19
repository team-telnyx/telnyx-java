// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.storage.buckets.BucketCreatePresignedUrlParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BucketServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createPresignedUrl() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val bucketServiceAsync = client.storage().buckets()

        val responseFuture =
            bucketServiceAsync.createPresignedUrl(
                BucketCreatePresignedUrlParams.builder()
                    .bucketName("")
                    .objectName("")
                    .ttl(60L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
