// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage.buckets

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetApiUsageParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getApiUsage() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.storage().buckets().usage()

        val response =
            usageService.getApiUsage(
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBucketUsage() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.storage().buckets().usage()

        val response = usageService.getBucketUsage("")

        response.validate()
    }
}
