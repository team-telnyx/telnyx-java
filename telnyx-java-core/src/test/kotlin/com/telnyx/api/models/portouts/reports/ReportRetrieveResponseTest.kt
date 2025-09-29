// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portouts.reports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportRetrieveResponseTest {

    @Test
    fun create() {
        val reportRetrieveResponse =
            ReportRetrieveResponse.builder()
                .data(
                    PortoutReport.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .documentId("f1486bae-f067-460c-ad43-73a92848f902")
                        .params(
                            ExportPortoutsCsvReport.builder()
                                .filters(
                                    ExportPortoutsCsvReport.Filters.builder()
                                        .createdAtGt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .createdAtLt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .addCustomerReferenceIn("my-customer-reference")
                                        .endUserName("McPortersen")
                                        .addPhoneNumbersOverlap("+1234567890")
                                        .addStatusIn(
                                            ExportPortoutsCsvReport.Filters.StatusIn.PENDING
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .recordType("portout_report")
                        .reportType(PortoutReport.ReportType.EXPORT_PORTOUTS_CSV)
                        .status(PortoutReport.Status.COMPLETED)
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .build()
                )
                .build()

        assertThat(reportRetrieveResponse.data())
            .contains(
                PortoutReport.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .documentId("f1486bae-f067-460c-ad43-73a92848f902")
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
                    .recordType("portout_report")
                    .reportType(PortoutReport.ReportType.EXPORT_PORTOUTS_CSV)
                    .status(PortoutReport.Status.COMPLETED)
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportRetrieveResponse =
            ReportRetrieveResponse.builder()
                .data(
                    PortoutReport.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .documentId("f1486bae-f067-460c-ad43-73a92848f902")
                        .params(
                            ExportPortoutsCsvReport.builder()
                                .filters(
                                    ExportPortoutsCsvReport.Filters.builder()
                                        .createdAtGt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .createdAtLt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .addCustomerReferenceIn("my-customer-reference")
                                        .endUserName("McPortersen")
                                        .addPhoneNumbersOverlap("+1234567890")
                                        .addStatusIn(
                                            ExportPortoutsCsvReport.Filters.StatusIn.PENDING
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .recordType("portout_report")
                        .reportType(PortoutReport.ReportType.EXPORT_PORTOUTS_CSV)
                        .status(PortoutReport.Status.COMPLETED)
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .build()
                )
                .build()

        val roundtrippedReportRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportRetrieveResponse),
                jacksonTypeRef<ReportRetrieveResponse>(),
            )

        assertThat(roundtrippedReportRetrieveResponse).isEqualTo(reportRetrieveResponse)
    }
}
