// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portouts

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portouts.reports.ExportPortoutsCsvReport
import com.telnyx.sdk.models.portouts.reports.ReportCreateParams
import com.telnyx.sdk.models.portouts.reports.ReportListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportService = client.portouts().reports()

        val report =
            reportService.create(
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

        report.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportService = client.portouts().reports()

        val report = reportService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        report.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportService = client.portouts().reports()

        val reports =
            reportService.list(
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

        reports.validate()
    }
}
