// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.wireless

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportCreateParams
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DetailRecordsReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val detailRecordsReportService = client.wireless().detailRecordsReports()

        val detailRecordsReport =
            detailRecordsReportService.create(
                DetailRecordsReportCreateParams.builder()
                    .endTime("2018-02-02T22:25:27.521Z")
                    .startTime("2018-02-02T22:25:27.521Z")
                    .build()
            )

        detailRecordsReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val detailRecordsReportService = client.wireless().detailRecordsReports()

        val detailRecordsReport =
            detailRecordsReportService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        detailRecordsReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val detailRecordsReportService = client.wireless().detailRecordsReports()

        val detailRecordsReports =
            detailRecordsReportService.list(
                DetailRecordsReportListParams.builder().pageNumber(1L).pageSize(1L).build()
            )

        detailRecordsReports.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val detailRecordsReportService = client.wireless().detailRecordsReports()

        val detailRecordsReport =
            detailRecordsReportService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        detailRecordsReport.validate()
    }
}
