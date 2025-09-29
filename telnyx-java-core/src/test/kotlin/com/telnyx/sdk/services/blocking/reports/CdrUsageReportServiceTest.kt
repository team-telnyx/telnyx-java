// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.reports

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.reports.cdrusagereports.CdrUsageReportFetchSyncParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CdrUsageReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun fetchSync() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cdrUsageReportService = client.reports().cdrUsageReports()

        val response =
            cdrUsageReportService.fetchSync(
                CdrUsageReportFetchSyncParams.builder()
                    .aggregationType(CdrUsageReportFetchSyncParams.AggregationType.NO_AGGREGATION)
                    .productBreakdown(CdrUsageReportFetchSyncParams.ProductBreakdown.NO_BREAKDOWN)
                    .addConnection(1234567890123.0)
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )

        response.validate()
    }
}
