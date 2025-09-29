// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.reports

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportCreateParams
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportFetchSyncParams
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MdrUsageReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdrUsageReportService = client.reports().mdrUsageReports()

        val mdrUsageReport =
            mdrUsageReportService.create(
                MdrUsageReportCreateParams.builder()
                    .aggregationType(MdrUsageReportCreateParams.AggregationType.NO_AGGREGATION)
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .profiles("My profile")
                    .build()
            )

        mdrUsageReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdrUsageReportService = client.reports().mdrUsageReports()

        val mdrUsageReport = mdrUsageReportService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        mdrUsageReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdrUsageReportService = client.reports().mdrUsageReports()

        val mdrUsageReports =
            mdrUsageReportService.list(
                MdrUsageReportListParams.builder()
                    .page(MdrUsageReportListParams.Page.builder().number(0).size(0).build())
                    .build()
            )

        mdrUsageReports.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdrUsageReportService = client.reports().mdrUsageReports()

        val mdrUsageReport = mdrUsageReportService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        mdrUsageReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun fetchSync() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdrUsageReportService = client.reports().mdrUsageReports()

        val response =
            mdrUsageReportService.fetchSync(
                MdrUsageReportFetchSyncParams.builder()
                    .aggregationType(MdrUsageReportFetchSyncParams.AggregationType.NO_AGGREGATION)
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .addProfile("My profile")
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )

        response.validate()
    }
}
