// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.reports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingReportTest {

    @Test
    fun create() {
        val portingReport =
            PortingReport.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .documentId("f1486bae-f067-460c-ad43-73a92848f902")
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
                .recordType("porting_report")
                .reportType(PortingReport.ReportType.EXPORT_PORTING_ORDERS_CSV)
                .status(PortingReport.Status.COMPLETED)
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(portingReport.id()).contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(portingReport.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingReport.documentId()).contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingReport.params())
            .contains(
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
        assertThat(portingReport.recordType()).contains("porting_report")
        assertThat(portingReport.reportType())
            .contains(PortingReport.ReportType.EXPORT_PORTING_ORDERS_CSV)
        assertThat(portingReport.status()).contains(PortingReport.Status.COMPLETED)
        assertThat(portingReport.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingReport =
            PortingReport.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .documentId("f1486bae-f067-460c-ad43-73a92848f902")
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
                .recordType("porting_report")
                .reportType(PortingReport.ReportType.EXPORT_PORTING_ORDERS_CSV)
                .status(PortingReport.Status.COMPLETED)
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val roundtrippedPortingReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingReport),
                jacksonTypeRef<PortingReport>(),
            )

        assertThat(roundtrippedPortingReport).isEqualTo(portingReport)
    }
}
