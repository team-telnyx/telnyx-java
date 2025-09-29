// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.legacy.reporting

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.legacy.reporting.usagereports.UsageReportRetrieveSpeechToTextParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSpeechToText() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
