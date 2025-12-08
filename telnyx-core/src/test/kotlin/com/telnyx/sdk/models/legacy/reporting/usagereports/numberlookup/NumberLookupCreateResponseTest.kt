// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberLookupCreateResponseTest {

    @Test
    fun create() {
        val numberLookupCreateResponse =
            NumberLookupCreateResponse.builder()
                .data(
                    NumberLookupCreateResponse.Data.builder()
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
                            NumberLookupCreateResponse.Data.Result.builder()
                                .addAggregation(
                                    NumberLookupCreateResponse.Data.Result.Aggregation.builder()
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
                )
                .build()

        assertThat(numberLookupCreateResponse.data())
            .contains(
                NumberLookupCreateResponse.Data.builder()
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
                        NumberLookupCreateResponse.Data.Result.builder()
                            .addAggregation(
                                NumberLookupCreateResponse.Data.Result.Aggregation.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberLookupCreateResponse =
            NumberLookupCreateResponse.builder()
                .data(
                    NumberLookupCreateResponse.Data.builder()
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
                            NumberLookupCreateResponse.Data.Result.builder()
                                .addAggregation(
                                    NumberLookupCreateResponse.Data.Result.Aggregation.builder()
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
                )
                .build()

        val roundtrippedNumberLookupCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberLookupCreateResponse),
                jacksonTypeRef<NumberLookupCreateResponse>(),
            )

        assertThat(roundtrippedNumberLookupCreateResponse).isEqualTo(numberLookupCreateResponse)
    }
}
