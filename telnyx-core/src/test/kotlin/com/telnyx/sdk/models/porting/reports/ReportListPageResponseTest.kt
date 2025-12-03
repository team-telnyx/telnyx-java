// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.reports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListPageResponseTest {

    @Test
    fun create() {
        val reportListPageResponse =
            ReportListPageResponse.builder()
                .addData(
                    PortingReport.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .documentId("f1486bae-f067-460c-ad43-73a92848f902")
                        .params(
                            ExportPortingOrdersCsvReport.builder()
                                .filters(
                                    ExportPortingOrdersCsvReport.Filters.builder()
                                        .createdAtGt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .createdAtLt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .addCustomerReferenceIn("my-customer-reference")
                                        .addStatusIn(
                                            ExportPortingOrdersCsvReport.Filters.StatusIn.DRAFT
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .recordType("porting_report")
                        .reportType(PortingReport.ReportType.EXPORT_PORTING_ORDERS_CSV)
                        .status(PortingReport.Status.COMPLETED)
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(reportListPageResponse.data().getOrNull())
            .containsExactly(
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
                                    .addStatusIn(
                                        ExportPortingOrdersCsvReport.Filters.StatusIn.DRAFT
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .recordType("porting_report")
                    .reportType(PortingReport.ReportType.EXPORT_PORTING_ORDERS_CSV)
                    .status(PortingReport.Status.COMPLETED)
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .build()
            )
        assertThat(reportListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportListPageResponse =
            ReportListPageResponse.builder()
                .addData(
                    PortingReport.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .documentId("f1486bae-f067-460c-ad43-73a92848f902")
                        .params(
                            ExportPortingOrdersCsvReport.builder()
                                .filters(
                                    ExportPortingOrdersCsvReport.Filters.builder()
                                        .createdAtGt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .createdAtLt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .addCustomerReferenceIn("my-customer-reference")
                                        .addStatusIn(
                                            ExportPortingOrdersCsvReport.Filters.StatusIn.DRAFT
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .recordType("porting_report")
                        .reportType(PortingReport.ReportType.EXPORT_PORTING_ORDERS_CSV)
                        .status(PortingReport.Status.COMPLETED)
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedReportListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportListPageResponse),
                jacksonTypeRef<ReportListPageResponse>(),
            )

        assertThat(roundtrippedReportListPageResponse).isEqualTo(reportListPageResponse)
    }
}
