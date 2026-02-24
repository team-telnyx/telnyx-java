// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.reports

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportCreateParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportFetchSyncParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MdrUsageReportServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mdrUsageReportService = client.reports().mdrUsageReports()

        val mdrUsageReport = mdrUsageReportService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        mdrUsageReport.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mdrUsageReportService = client.reports().mdrUsageReports()

        val page = mdrUsageReportService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mdrUsageReportService = client.reports().mdrUsageReports()

        val mdrUsageReport = mdrUsageReportService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        mdrUsageReport.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun fetchSync() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mdrUsageReportService = client.reports().mdrUsageReports()

        val response =
            mdrUsageReportService.fetchSync(
                MdrUsageReportFetchSyncParams.builder()
                    .aggregationType(MdrUsageReportFetchSyncParams.AggregationType.PROFILE)
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .addProfile("My profile")
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )

        response.validate()
    }
}
