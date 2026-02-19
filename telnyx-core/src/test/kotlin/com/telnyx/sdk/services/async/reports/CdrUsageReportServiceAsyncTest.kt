// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.reports

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.reports.cdrusagereports.CdrUsageReportFetchSyncParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CdrUsageReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun fetchSync() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cdrUsageReportServiceAsync = client.reports().cdrUsageReports()

        val responseFuture =
            cdrUsageReportServiceAsync.fetchSync(
                CdrUsageReportFetchSyncParams.builder()
                    .aggregationType(CdrUsageReportFetchSyncParams.AggregationType.NO_AGGREGATION)
                    .productBreakdown(CdrUsageReportFetchSyncParams.ProductBreakdown.NO_BREAKDOWN)
                    .addConnection(1234567890123.0)
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
