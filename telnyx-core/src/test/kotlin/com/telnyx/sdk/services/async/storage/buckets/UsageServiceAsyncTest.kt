// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.buckets

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetApiUsageParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getApiUsage() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageServiceAsync = client.storage().buckets().usage()

        val responseFuture =
            usageServiceAsync.getApiUsage(
                UsageGetApiUsageParams.builder()
                    .bucketName("")
                    .filter(
                        UsageGetApiUsageParams.Filter.builder()
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBucketUsage() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageServiceAsync = client.storage().buckets().usage()

        val responseFuture = usageServiceAsync.getBucketUsage("")

        val response = responseFuture.get()
        response.validate()
    }
}
