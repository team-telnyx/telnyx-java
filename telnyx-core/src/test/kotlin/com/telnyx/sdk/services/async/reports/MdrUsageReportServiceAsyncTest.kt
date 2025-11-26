// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.reports

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportCreateParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportFetchSyncParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MdrUsageReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdrUsageReportServiceAsync = client.reports().mdrUsageReports()

        val mdrUsageReportFuture =
            mdrUsageReportServiceAsync.create(
                MdrUsageReportCreateParams.builder()
                    .aggregationType(MdrUsageReportCreateParams.AggregationType.NO_AGGREGATION)
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .profiles("My profile")
                    .build()
            )

        val mdrUsageReport = mdrUsageReportFuture.get()
        mdrUsageReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdrUsageReportServiceAsync = client.reports().mdrUsageReports()

        val mdrUsageReportFuture =
            mdrUsageReportServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val mdrUsageReport = mdrUsageReportFuture.get()
        mdrUsageReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdrUsageReportServiceAsync = client.reports().mdrUsageReports()

        val mdrUsageReportsFuture =
            mdrUsageReportServiceAsync.list(
                MdrUsageReportListParams.builder()
                    .page(MdrUsageReportListParams.Page.builder().number(0).size(0).build())
                    .build()
            )

        val mdrUsageReports = mdrUsageReportsFuture.get()
        mdrUsageReports.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdrUsageReportServiceAsync = client.reports().mdrUsageReports()

        val mdrUsageReportFuture =
            mdrUsageReportServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val mdrUsageReport = mdrUsageReportFuture.get()
        mdrUsageReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun fetchSync() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdrUsageReportServiceAsync = client.reports().mdrUsageReports()

        val responseFuture =
            mdrUsageReportServiceAsync.fetchSync(
                MdrUsageReportFetchSyncParams.builder()
                    .aggregationType(MdrUsageReportFetchSyncParams.AggregationType.PROFILE)
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .addProfile("My profile")
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
