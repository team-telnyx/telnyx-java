// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.porting

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.porting.reports.ExportPortingOrdersCsvReport
import com.telnyx.sdk.models.porting.reports.ReportCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val reportService = client.porting().reports()

        val report =
            reportService.create(
                ReportCreateParams.builder()
                    .params(
                        ExportPortingOrdersCsvReport.builder()
                            .filters(
                                ExportPortingOrdersCsvReport.Filters.builder()
                                    .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .addCustomerReferenceIn("my-customer-reference")
                                    .addStatusIn(
                                        ExportPortingOrdersCsvReport.Filters.StatusIn.DRAFT
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .reportType(ReportCreateParams.ReportType.EXPORT_PORTING_ORDERS_CSV)
                    .build()
            )

        report.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val reportService = client.porting().reports()

        val report = reportService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        report.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val reportService = client.porting().reports()

        val page = reportService.list()

        page.response().validate()
    }
}
