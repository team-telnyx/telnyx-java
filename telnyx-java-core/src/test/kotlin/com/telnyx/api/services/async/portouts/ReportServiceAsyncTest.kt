// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portouts

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.portouts.reports.ExportPortoutsCsvReport
import com.telnyx.api.models.portouts.reports.ReportCreateParams
import com.telnyx.api.models.portouts.reports.ReportListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportServiceAsync = client.portouts().reports()

        val reportFuture =
            reportServiceAsync.create(
                ReportCreateParams.builder()
                    .params(
                        ExportPortoutsCsvReport.builder()
                            .filters(
                                ExportPortoutsCsvReport.Filters.builder()
                                    .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .addCustomerReferenceIn("my-customer-reference")
                                    .endUserName("McPortersen")
                                    .addPhoneNumbersOverlap("+1234567890")
                                    .addStatusIn(ExportPortoutsCsvReport.Filters.StatusIn.PENDING)
                                    .build()
                            )
                            .build()
                    )
                    .reportType(ReportCreateParams.ReportType.EXPORT_PORTOUTS_CSV)
                    .build()
            )

        val report = reportFuture.get()
        report.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportServiceAsync = client.portouts().reports()

        val reportFuture = reportServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val report = reportFuture.get()
        report.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportServiceAsync = client.portouts().reports()

        val reportsFuture =
            reportServiceAsync.list(
                ReportListParams.builder()
                    .filter(
                        ReportListParams.Filter.builder()
                            .reportType(ReportListParams.Filter.ReportType.EXPORT_PORTOUTS_CSV)
                            .status(ReportListParams.Filter.Status.COMPLETED)
                            .build()
                    )
                    .page(ReportListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val reports = reportsFuture.get()
        reports.validate()
    }
}
