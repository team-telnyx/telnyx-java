// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting.reports

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportCreateParamsTest {

    @Test
    fun create() {
        ReportCreateParams.builder()
            .params(
                ExportPortingOrdersCsvReport.builder()
                    .filters(
                        ExportPortingOrdersCsvReport.Filters.builder()
                            .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addCustomerReferenceIn("my-customer-reference")
                            .addStatusIn(ExportPortingOrdersCsvReport.Filters.StatusIn.DRAFT)
                            .build()
                    )
                    .build()
            )
            .reportType(ReportCreateParams.ReportType.EXPORT_PORTING_ORDERS_CSV)
            .build()
    }

    @Test
    fun body() {
        val params =
            ReportCreateParams.builder()
                .params(
                    ExportPortingOrdersCsvReport.builder()
                        .filters(
                            ExportPortingOrdersCsvReport.Filters.builder()
                                .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addCustomerReferenceIn("my-customer-reference")
                                .addStatusIn(ExportPortingOrdersCsvReport.Filters.StatusIn.DRAFT)
                                .build()
                        )
                        .build()
                )
                .reportType(ReportCreateParams.ReportType.EXPORT_PORTING_ORDERS_CSV)
                .build()

        val body = params._body()

        assertThat(body.params())
            .isEqualTo(
                ExportPortingOrdersCsvReport.builder()
                    .filters(
                        ExportPortingOrdersCsvReport.Filters.builder()
                            .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addCustomerReferenceIn("my-customer-reference")
                            .addStatusIn(ExportPortingOrdersCsvReport.Filters.StatusIn.DRAFT)
                            .build()
                    )
                    .build()
            )
        assertThat(body.reportType())
            .isEqualTo(ReportCreateParams.ReportType.EXPORT_PORTING_ORDERS_CSV)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReportCreateParams.builder()
                .params(
                    ExportPortingOrdersCsvReport.builder()
                        .filters(ExportPortingOrdersCsvReport.Filters.builder().build())
                        .build()
                )
                .reportType(ReportCreateParams.ReportType.EXPORT_PORTING_ORDERS_CSV)
                .build()

        val body = params._body()

        assertThat(body.params())
            .isEqualTo(
                ExportPortingOrdersCsvReport.builder()
                    .filters(ExportPortingOrdersCsvReport.Filters.builder().build())
                    .build()
            )
        assertThat(body.reportType())
            .isEqualTo(ReportCreateParams.ReportType.EXPORT_PORTING_ORDERS_CSV)
    }
}
