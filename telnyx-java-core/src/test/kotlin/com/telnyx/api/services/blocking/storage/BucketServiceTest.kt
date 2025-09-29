// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.storage

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.storage.buckets.BucketCreatePresignedUrlParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BucketServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createPresignedUrl() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bucketService = client.storage().buckets()

        val response =
            bucketService.createPresignedUrl(
                BucketCreatePresignedUrlParams.builder()
                    .bucketName("")
                    .objectName("")
                    .ttl(1L)
                    .build()
            )

        response.validate()
    }
}
