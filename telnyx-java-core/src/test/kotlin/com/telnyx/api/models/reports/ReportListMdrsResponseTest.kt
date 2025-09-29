// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.reports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListMdrsResponseTest {

    @Test
    fun create() {
        val reportListMdrsResponse =
            ReportListMdrsResponse.builder()
                .addData(
                    ReportListMdrsResponse.Data.builder()
                        .id("99b637f3-07fd-45ac-b9ca-b87208c24650")
                        .cld("+1555123456")
                        .cli("+1555123456")
                        .cost("0.1")
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .currency(ReportListMdrsResponse.Data.Currency.USD)
                        .direction("outbound")
                        .messageType(ReportListMdrsResponse.Data.MessageType.SMS)
                        .parts(2.0)
                        .profileName("configured-profile-name")
                        .rate("0.05")
                        .recordType("mdr_report")
                        .status(ReportListMdrsResponse.Data.Status.DELIVERED)
                        .build()
                )
                .meta(
                    ReportListMdrsResponse.Meta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        assertThat(reportListMdrsResponse.data().getOrNull())
            .containsExactly(
                ReportListMdrsResponse.Data.builder()
                    .id("99b637f3-07fd-45ac-b9ca-b87208c24650")
                    .cld("+1555123456")
                    .cli("+1555123456")
                    .cost("0.1")
                    .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .currency(ReportListMdrsResponse.Data.Currency.USD)
                    .direction("outbound")
                    .messageType(ReportListMdrsResponse.Data.MessageType.SMS)
                    .parts(2.0)
                    .profileName("configured-profile-name")
                    .rate("0.05")
                    .recordType("mdr_report")
                    .status(ReportListMdrsResponse.Data.Status.DELIVERED)
                    .build()
            )
        assertThat(reportListMdrsResponse.meta())
            .contains(
                ReportListMdrsResponse.Meta.builder()
                    .pageNumber(2)
                    .pageSize(25)
                    .totalPages(3)
                    .totalResults(55)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportListMdrsResponse =
            ReportListMdrsResponse.builder()
                .addData(
                    ReportListMdrsResponse.Data.builder()
                        .id("99b637f3-07fd-45ac-b9ca-b87208c24650")
                        .cld("+1555123456")
                        .cli("+1555123456")
                        .cost("0.1")
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .currency(ReportListMdrsResponse.Data.Currency.USD)
                        .direction("outbound")
                        .messageType(ReportListMdrsResponse.Data.MessageType.SMS)
                        .parts(2.0)
                        .profileName("configured-profile-name")
                        .rate("0.05")
                        .recordType("mdr_report")
                        .status(ReportListMdrsResponse.Data.Status.DELIVERED)
                        .build()
                )
                .meta(
                    ReportListMdrsResponse.Meta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        val roundtrippedReportListMdrsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportListMdrsResponse),
                jacksonTypeRef<ReportListMdrsResponse>(),
            )

        assertThat(roundtrippedReportListMdrsResponse).isEqualTo(reportListMdrsResponse)
    }
}
