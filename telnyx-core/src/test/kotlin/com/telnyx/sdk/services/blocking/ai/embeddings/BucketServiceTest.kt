// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.embeddings

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BucketServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val bucketService = client.ai().embeddings().buckets()

        val bucket = bucketService.retrieve("bucket_name")

        bucket.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val bucketService = client.ai().embeddings().buckets()

        val buckets = bucketService.list()

        buckets.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val bucketService = client.ai().embeddings().buckets()

        bucketService.delete("bucket_name")
    }
}
