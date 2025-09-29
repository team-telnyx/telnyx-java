// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.reports

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.params())
            .isEqualTo(
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
        assertThat(body.reportType()).isEqualTo(ReportCreateParams.ReportType.EXPORT_PORTOUTS_CSV)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReportCreateParams.builder()
                .params(
                    ExportPortoutsCsvReport.builder()
                        .filters(ExportPortoutsCsvReport.Filters.builder().build())
                        .build()
                )
                .reportType(ReportCreateParams.ReportType.EXPORT_PORTOUTS_CSV)
                .build()

        val body = params._body()

        assertThat(body.params())
            .isEqualTo(
                ExportPortoutsCsvReport.builder()
                    .filters(ExportPortoutsCsvReport.Filters.builder().build())
                    .build()
            )
        assertThat(body.reportType()).isEqualTo(ReportCreateParams.ReportType.EXPORT_PORTOUTS_CSV)
    }
}
