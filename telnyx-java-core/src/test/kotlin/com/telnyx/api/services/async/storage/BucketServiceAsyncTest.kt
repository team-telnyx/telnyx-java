// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.storage

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.storage.buckets.BucketCreatePresignedUrlParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BucketServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createPresignedUrl() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bucketServiceAsync = client.storage().buckets()

        val responseFuture =
            bucketServiceAsync.createPresignedUrl(
                BucketCreatePresignedUrlParams.builder()
                    .bucketName("")
                    .objectName("")
                    .ttl(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
