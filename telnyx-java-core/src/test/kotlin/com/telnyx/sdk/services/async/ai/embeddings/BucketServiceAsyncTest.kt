// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.embeddings

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BucketServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bucketServiceAsync = client.ai().embeddings().buckets()

        val bucketFuture = bucketServiceAsync.retrieve("bucket_name")

        val bucket = bucketFuture.get()
        bucket.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bucketServiceAsync = client.ai().embeddings().buckets()

        val bucketsFuture = bucketServiceAsync.list()

        val buckets = bucketsFuture.get()
        buckets.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bucketServiceAsync = client.ai().embeddings().buckets()

        val future = bucketServiceAsync.delete("bucket_name")

        val response = future.get()
    }
}
