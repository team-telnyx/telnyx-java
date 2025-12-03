// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListWdrsResponseTest {

    @Test
    fun create() {
        val reportListWdrsResponse =
            ReportListWdrsResponse.builder()
                .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .cost(
                    ReportListWdrsResponse.Cost.builder()
                        .amount("0.1")
                        .currency(ReportListWdrsResponse.Cost.Currency.USD)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .downlinkData(
                    ReportListWdrsResponse.DownlinkData.builder()
                        .amount(1.0)
                        .unit(ReportListWdrsResponse.DownlinkData.Unit.B)
                        .build()
                )
                .durationSeconds(1.0)
                .imsi("123")
                .mcc("204")
                .mnc("01")
                .phoneNumber("+12345678910")
                .rate(
                    ReportListWdrsResponse.Rate.builder()
                        .amount("0.1")
                        .currency(ReportListWdrsResponse.Rate.Currency.USD)
                        .build()
                )
                .recordType("wdr")
                .simCardId("877f80a6-e5b2-4687-9a04-88076265720f")
                .simGroupId("f05a189f-7c46-4531-ac56-1460dc465a42")
                .simGroupName("sim name")
                .uplinkData(
                    ReportListWdrsResponse.UplinkData.builder()
                        .amount(1.0)
                        .unit(ReportListWdrsResponse.UplinkData.Unit.B)
                        .build()
                )
                .build()

        assertThat(reportListWdrsResponse.id()).contains("3ca7bd3d-7d82-4e07-9df4-009123068320")
        assertThat(reportListWdrsResponse.cost())
            .contains(
                ReportListWdrsResponse.Cost.builder()
                    .amount("0.1")
                    .currency(ReportListWdrsResponse.Cost.Currency.USD)
                    .build()
            )
        assertThat(reportListWdrsResponse.createdAt())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(reportListWdrsResponse.downlinkData())
            .contains(
                ReportListWdrsResponse.DownlinkData.builder()
                    .amount(1.0)
                    .unit(ReportListWdrsResponse.DownlinkData.Unit.B)
                    .build()
            )
        assertThat(reportListWdrsResponse.durationSeconds()).contains(1.0)
        assertThat(reportListWdrsResponse.imsi()).contains("123")
        assertThat(reportListWdrsResponse.mcc()).contains("204")
        assertThat(reportListWdrsResponse.mnc()).contains("01")
        assertThat(reportListWdrsResponse.phoneNumber()).contains("+12345678910")
        assertThat(reportListWdrsResponse.rate())
            .contains(
                ReportListWdrsResponse.Rate.builder()
                    .amount("0.1")
                    .currency(ReportListWdrsResponse.Rate.Currency.USD)
                    .build()
            )
        assertThat(reportListWdrsResponse.recordType()).contains("wdr")
        assertThat(reportListWdrsResponse.simCardId())
            .contains("877f80a6-e5b2-4687-9a04-88076265720f")
        assertThat(reportListWdrsResponse.simGroupId())
            .contains("f05a189f-7c46-4531-ac56-1460dc465a42")
        assertThat(reportListWdrsResponse.simGroupName()).contains("sim name")
        assertThat(reportListWdrsResponse.uplinkData())
            .contains(
                ReportListWdrsResponse.UplinkData.builder()
                    .amount(1.0)
                    .unit(ReportListWdrsResponse.UplinkData.Unit.B)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportListWdrsResponse =
            ReportListWdrsResponse.builder()
                .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .cost(
                    ReportListWdrsResponse.Cost.builder()
                        .amount("0.1")
                        .currency(ReportListWdrsResponse.Cost.Currency.USD)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .downlinkData(
                    ReportListWdrsResponse.DownlinkData.builder()
                        .amount(1.0)
                        .unit(ReportListWdrsResponse.DownlinkData.Unit.B)
                        .build()
                )
                .durationSeconds(1.0)
                .imsi("123")
                .mcc("204")
                .mnc("01")
                .phoneNumber("+12345678910")
                .rate(
                    ReportListWdrsResponse.Rate.builder()
                        .amount("0.1")
                        .currency(ReportListWdrsResponse.Rate.Currency.USD)
                        .build()
                )
                .recordType("wdr")
                .simCardId("877f80a6-e5b2-4687-9a04-88076265720f")
                .simGroupId("f05a189f-7c46-4531-ac56-1460dc465a42")
                .simGroupName("sim name")
                .uplinkData(
                    ReportListWdrsResponse.UplinkData.builder()
                        .amount(1.0)
                        .unit(ReportListWdrsResponse.UplinkData.Unit.B)
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
