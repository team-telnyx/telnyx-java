// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.legacy.reporting.usagereports.UsageReportRetrieveSpeechToTextParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSpeechToText() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val usageReportService = client.legacy().reporting().usageReports()

        val response =
            usageReportService.retrieveSpeechToText(
                UsageReportRetrieveSpeechToTextParams.builder()
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )

        response.validate()
    }
}
