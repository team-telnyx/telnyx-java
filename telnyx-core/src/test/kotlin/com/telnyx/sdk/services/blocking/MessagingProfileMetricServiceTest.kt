// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messagingprofilemetrics.MessagingProfileMetricListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingProfileMetricServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingProfileMetricService = client.messagingProfileMetrics()

        val messagingProfileMetrics =
            messagingProfileMetricService.list(
                MessagingProfileMetricListParams.builder()
                    .timeFrame(MessagingProfileMetricListParams.TimeFrame._1H)
                    .build()
            )

        messagingProfileMetrics.validate()
    }
}
