// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.usagereports.UsageReportGetOptionsParams
import com.telnyx.sdk.models.usagereports.UsageReportListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageReportServiceAsync = client.usageReports()

        val usageReportsFuture =
            usageReportServiceAsync.list(
                UsageReportListParams.builder()
                    .addDimension("string")
                    .addMetric("string")
                    .product("product")
                    .dateRange("date_range")
                    .endDate("end_date")
                    .filter("filter")
                    .format(UsageReportListParams.Format.CSV)
                    .managedAccounts(true)
                    .page(UsageReportListParams.Page.builder().number(1L).size(5000L).build())
                    .addSort("string")
                    .startDate("start_date")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        val usageReports = usageReportsFuture.get()
        usageReports.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getOptions() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageReportServiceAsync = client.usageReports()

        val responseFuture =
            usageReportServiceAsync.getOptions(
                UsageReportGetOptionsParams.builder()
                    .product("product")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
