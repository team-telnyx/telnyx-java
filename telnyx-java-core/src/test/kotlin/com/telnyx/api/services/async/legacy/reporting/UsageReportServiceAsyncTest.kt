// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.legacy.reporting.usagereports.UsageReportRetrieveSpeechToTextParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSpeechToText() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageReportServiceAsync = client.legacy().reporting().usageReports()

        val responseFuture =
            usageReportServiceAsync.retrieveSpeechToText(
                UsageReportRetrieveSpeechToTextParams.builder()
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
