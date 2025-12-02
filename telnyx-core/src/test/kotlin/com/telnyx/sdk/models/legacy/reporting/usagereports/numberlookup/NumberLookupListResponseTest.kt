// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.StandardPaginationMeta
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberLookupListResponseTest {

    @Test
    fun create() {
        val numberLookupListResponse =
            NumberLookupListResponse.builder()
                .addData(
                    NumberLookupListResponse.Data.builder()
                        .id("9783f4d7-0bfc-427a-9d6b-bc659ad16e5b")
                        .aggregationType("ALL")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(LocalDate.parse("2025-12-01"))
                        .addManagedAccount("string")
                        .recordType("TelcoDataUsageReport")
                        .reportUrl(
                            "https://portal-cdrs-usage.s3.amazonaws.com/telco_data_usage_report_2025-12-02.csv"
                        )
                        .addResult(
                            NumberLookupListResponse.Data.Result.builder()
                                .addAggregation(
                                    NumberLookupListResponse.Data.Result.Aggregation.builder()
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
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    StandardPaginationMeta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        assertThat(numberLookupListResponse.data().getOrNull())
            .containsExactly(
                NumberLookupListResponse.Data.builder()
                    .id("9783f4d7-0bfc-427a-9d6b-bc659ad16e5b")
                    .aggregationType("ALL")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(LocalDate.parse("2025-12-01"))
                    .addManagedAccount("string")
                    .recordType("TelcoDataUsageReport")
                    .reportUrl(
                        "https://portal-cdrs-usage.s3.amazonaws.com/telco_data_usage_report_2025-12-02.csv"
                    )
                    .addResult(
                        NumberLookupListResponse.Data.Result.builder()
                            .addAggregation(
                                NumberLookupListResponse.Data.Result.Aggregation.builder()
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
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(numberLookupListResponse.meta())
            .contains(
                StandardPaginationMeta.builder()
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
        val numberLookupListResponse =
            NumberLookupListResponse.builder()
                .addData(
                    NumberLookupListResponse.Data.builder()
                        .id("9783f4d7-0bfc-427a-9d6b-bc659ad16e5b")
                        .aggregationType("ALL")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(LocalDate.parse("2025-12-01"))
                        .addManagedAccount("string")
                        .recordType("TelcoDataUsageReport")
                        .reportUrl(
                            "https://portal-cdrs-usage.s3.amazonaws.com/telco_data_usage_report_2025-12-02.csv"
                        )
                        .addResult(
                            NumberLookupListResponse.Data.Result.builder()
                                .addAggregation(
                                    NumberLookupListResponse.Data.Result.Aggregation.builder()
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
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    StandardPaginationMeta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        val roundtrippedNumberLookupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberLookupListResponse),
                jacksonTypeRef<NumberLookupListResponse>(),
            )

        assertThat(roundtrippedNumberLookupListResponse).isEqualTo(numberLookupListResponse)
    }
}
