// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListWdrsResponseTest {

    @Test
    fun create() {
        val reportListWdrsResponse =
            ReportListWdrsResponse.builder()
                .addData(
                    ReportListWdrsResponse.Data.builder()
                        .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                        .cost(
                            ReportListWdrsResponse.Data.Cost.builder()
                                .amount("0.1")
                                .currency(ReportListWdrsResponse.Data.Cost.Currency.USD)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .downlinkData(
                            ReportListWdrsResponse.Data.DownlinkData.builder()
                                .amount(1.0)
                                .unit(ReportListWdrsResponse.Data.DownlinkData.Unit.B)
                                .build()
                        )
                        .durationSeconds(1.0)
                        .imsi("123")
                        .mcc("204")
                        .mnc("01")
                        .phoneNumber("+12345678910")
                        .rate(
                            ReportListWdrsResponse.Data.Rate.builder()
                                .amount("0.1")
                                .currency(ReportListWdrsResponse.Data.Rate.Currency.USD)
                                .build()
                        )
                        .recordType("wdr")
                        .simCardId("877f80a6-e5b2-4687-9a04-88076265720f")
                        .simGroupId("f05a189f-7c46-4531-ac56-1460dc465a42")
                        .simGroupName("sim name")
                        .uplinkData(
                            ReportListWdrsResponse.Data.UplinkData.builder()
                                .amount(1.0)
                                .unit(ReportListWdrsResponse.Data.UplinkData.Unit.B)
                                .build()
                        )
                        .build()
                )
                .meta(
                    ReportListWdrsResponse.Meta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        assertThat(reportListWdrsResponse.data().getOrNull())
            .containsExactly(
                ReportListWdrsResponse.Data.builder()
                    .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .cost(
                        ReportListWdrsResponse.Data.Cost.builder()
                            .amount("0.1")
                            .currency(ReportListWdrsResponse.Data.Cost.Currency.USD)
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .downlinkData(
                        ReportListWdrsResponse.Data.DownlinkData.builder()
                            .amount(1.0)
                            .unit(ReportListWdrsResponse.Data.DownlinkData.Unit.B)
                            .build()
                    )
                    .durationSeconds(1.0)
                    .imsi("123")
                    .mcc("204")
                    .mnc("01")
                    .phoneNumber("+12345678910")
                    .rate(
                        ReportListWdrsResponse.Data.Rate.builder()
                            .amount("0.1")
                            .currency(ReportListWdrsResponse.Data.Rate.Currency.USD)
                            .build()
                    )
                    .recordType("wdr")
                    .simCardId("877f80a6-e5b2-4687-9a04-88076265720f")
                    .simGroupId("f05a189f-7c46-4531-ac56-1460dc465a42")
                    .simGroupName("sim name")
                    .uplinkData(
                        ReportListWdrsResponse.Data.UplinkData.builder()
                            .amount(1.0)
                            .unit(ReportListWdrsResponse.Data.UplinkData.Unit.B)
                            .build()
                    )
                    .build()
            )
        assertThat(reportListWdrsResponse.meta())
            .contains(
                ReportListWdrsResponse.Meta.builder()
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
        val reportListWdrsResponse =
            ReportListWdrsResponse.builder()
                .addData(
                    ReportListWdrsResponse.Data.builder()
                        .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                        .cost(
                            ReportListWdrsResponse.Data.Cost.builder()
                                .amount("0.1")
                                .currency(ReportListWdrsResponse.Data.Cost.Currency.USD)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .downlinkData(
                            ReportListWdrsResponse.Data.DownlinkData.builder()
                                .amount(1.0)
                                .unit(ReportListWdrsResponse.Data.DownlinkData.Unit.B)
                                .build()
                        )
                        .durationSeconds(1.0)
                        .imsi("123")
                        .mcc("204")
                        .mnc("01")
                        .phoneNumber("+12345678910")
                        .rate(
                            ReportListWdrsResponse.Data.Rate.builder()
                                .amount("0.1")
                                .currency(ReportListWdrsResponse.Data.Rate.Currency.USD)
                                .build()
                        )
                        .recordType("wdr")
                        .simCardId("877f80a6-e5b2-4687-9a04-88076265720f")
                        .simGroupId("f05a189f-7c46-4531-ac56-1460dc465a42")
                        .simGroupName("sim name")
                        .uplinkData(
                            ReportListWdrsResponse.Data.UplinkData.builder()
                                .amount(1.0)
                                .unit(ReportListWdrsResponse.Data.UplinkData.Unit.B)
                                .build()
                        )
                        .build()
                )
                .meta(
                    ReportListWdrsResponse.Meta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        val roundtrippedReportListWdrsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportListWdrsResponse),
                jacksonTypeRef<ReportListWdrsResponse>(),
            )

        assertThat(roundtrippedReportListWdrsResponse).isEqualTo(reportListWdrsResponse)
    }
}
