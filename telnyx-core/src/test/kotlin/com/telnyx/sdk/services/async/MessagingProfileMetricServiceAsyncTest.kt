// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messagingprofilemetrics.MessagingProfileMetricListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingProfileMetricServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingProfileMetricServiceAsync = client.messagingProfileMetrics()

        val messagingProfileMetricsFuture =
            messagingProfileMetricServiceAsync.list(
                MessagingProfileMetricListParams.builder()
                    .timeFrame(MessagingProfileMetricListParams.TimeFrame._1H)
                    .build()
            )

        val messagingProfileMetrics = messagingProfileMetricsFuture.get()
        messagingProfileMetrics.validate()
    }
}
