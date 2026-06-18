// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelcoDataUsageReportResponseTest {

    @Test
    fun create() {
        val telcoDataUsageReportResponse =
            TelcoDataUsageReportResponse.builder()
                .id("9783f4d7-0bfc-427a-9d6b-bc659ad16e5b")
                .aggregationType("ALL")
                .createdAt(OffsetDateTime.parse("2025-12-02T20:20:57.196925Z"))
                .endDate(LocalDate.parse("2025-12-01"))
                .addManagedAccount("string")
                .recordType("TelcoDataUsageReport")
                .reportUrl(
                    "https://portal-cdrs-usage.s3.amazonaws.com/telco_data_usage_report_2025-12-02.csv"
                )
                .addResult(
                    TelcoDataUsageRecord.builder()
                        .addAggregation(
                            TelcoDataAggregation.builder()
                                .currency("USD")
                                .totalCost(0.009)
                                .totalDips(3L)
                                .type("CNAM")
                                .build()
                        )
                        .recordType("TelcoDataUsageRecord")
                        .userId("d37bdd47-f301-42ec-b2ad-5a0465bfb632")
                        .build()
                )
                .startDate(LocalDate.parse("2025-11-01"))
                .status("COMPLETE")
                .updatedAt(OffsetDateTime.parse("2025-12-02T20:21:08.237091Z"))
                .build()

        assertThat(telcoDataUsageReportResponse.id())
            .contains("9783f4d7-0bfc-427a-9d6b-bc659ad16e5b")
        assertThat(telcoDataUsageReportResponse.aggregationType()).contains("ALL")
        assertThat(telcoDataUsageReportResponse.createdAt())
            .contains(OffsetDateTime.parse("2025-12-02T20:20:57.196925Z"))
        assertThat(telcoDataUsageReportResponse.endDate()).contains(LocalDate.parse("2025-12-01"))
        assertThat(telcoDataUsageReportResponse.managedAccounts().getOrNull())
            .containsExactly("string")
        assertThat(telcoDataUsageReportResponse.recordType()).contains("TelcoDataUsageReport")
        assertThat(telcoDataUsageReportResponse.reportUrl())
            .contains(
                "https://portal-cdrs-usage.s3.amazonaws.com/telco_data_usage_report_2025-12-02.csv"
            )
        assertThat(telcoDataUsageReportResponse.result().getOrNull())
            .containsExactly(
                TelcoDataUsageRecord.builder()
                    .addAggregation(
                        TelcoDataAggregation.builder()
                            .currency("USD")
                            .totalCost(0.009)
                            .totalDips(3L)
                            .type("CNAM")
                            .build()
                    )
                    .recordType("TelcoDataUsageRecord")
                    .userId("d37bdd47-f301-42ec-b2ad-5a0465bfb632")
                    .build()
            )
        assertThat(telcoDataUsageReportResponse.startDate()).contains(LocalDate.parse("2025-11-01"))
        assertThat(telcoDataUsageReportResponse.status()).contains("COMPLETE")
        assertThat(telcoDataUsageReportResponse.updatedAt())
            .contains(OffsetDateTime.parse("2025-12-02T20:21:08.237091Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telcoDataUsageReportResponse =
            TelcoDataUsageReportResponse.builder()
                .id("9783f4d7-0bfc-427a-9d6b-bc659ad16e5b")
                .aggregationType("ALL")
                .createdAt(OffsetDateTime.parse("2025-12-02T20:20:57.196925Z"))
                .endDate(LocalDate.parse("2025-12-01"))
                .addManagedAccount("string")
                .recordType("TelcoDataUsageReport")
                .reportUrl(
                    "https://portal-cdrs-usage.s3.amazonaws.com/telco_data_usage_report_2025-12-02.csv"
                )
                .addResult(
                    TelcoDataUsageRecord.builder()
                        .addAggregation(
                            TelcoDataAggregation.builder()
                                .currency("USD")
                                .totalCost(0.009)
                                .totalDips(3L)
                                .type("CNAM")
                                .build()
                        )
                        .recordType("TelcoDataUsageRecord")
                        .userId("d37bdd47-f301-42ec-b2ad-5a0465bfb632")
                        .build()
                )
                .startDate(LocalDate.parse("2025-11-01"))
                .status("COMPLETE")
                .updatedAt(OffsetDateTime.parse("2025-12-02T20:21:08.237091Z"))
                .build()

        val roundtrippedTelcoDataUsageReportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telcoDataUsageReportResponse),
                jacksonTypeRef<TelcoDataUsageReportResponse>(),
            )

        assertThat(roundtrippedTelcoDataUsageReportResponse).isEqualTo(telcoDataUsageReportResponse)
    }
}
