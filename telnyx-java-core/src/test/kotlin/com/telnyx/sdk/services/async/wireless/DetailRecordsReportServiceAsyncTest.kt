// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.wireless

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportCreateParams
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DetailRecordsReportServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val detailRecordsReportServiceAsync = client.wireless().detailRecordsReports()

        val detailRecordsReportFuture =
            detailRecordsReportServiceAsync.create(
                DetailRecordsReportCreateParams.builder()
                    .endTime("2018-02-02T22:25:27.521Z")
                    .startTime("2018-02-02T22:25:27.521Z")
                    .build()
            )

        val detailRecordsReport = detailRecordsReportFuture.get()
        detailRecordsReport.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val detailRecordsReportServiceAsync = client.wireless().detailRecordsReports()

        val detailRecordsReportFuture =
            detailRecordsReportServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val detailRecordsReport = detailRecordsReportFuture.get()
        detailRecordsReport.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val detailRecordsReportServiceAsync = client.wireless().detailRecordsReports()

        val detailRecordsReportsFuture =
            detailRecordsReportServiceAsync.list(
                DetailRecordsReportListParams.builder().pageNumber(1L).pageSize(1L).build()
            )

        val detailRecordsReports = detailRecordsReportsFuture.get()
        detailRecordsReports.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val detailRecordsReportServiceAsync = client.wireless().detailRecordsReports()

        val detailRecordsReportFuture =
            detailRecordsReportServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val detailRecordsReport = detailRecordsReportFuture.get()
        detailRecordsReport.validate()
    }
}
