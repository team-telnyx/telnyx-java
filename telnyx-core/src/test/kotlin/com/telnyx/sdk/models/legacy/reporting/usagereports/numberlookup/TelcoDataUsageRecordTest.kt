// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelcoDataUsageRecordTest {

    @Test
    fun create() {
        val telcoDataUsageRecord =
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

        assertThat(telcoDataUsageRecord.aggregations().getOrNull())
            .containsExactly(
                TelcoDataAggregation.builder()
                    .currency("USD")
                    .totalCost(0.009)
                    .totalDips(3L)
                    .type("CNAM")
                    .build()
            )
        assertThat(telcoDataUsageRecord.recordType()).contains("TelcoDataUsageRecord")
        assertThat(telcoDataUsageRecord.userId()).contains("d37bdd47-f301-42ec-b2ad-5a0465bfb632")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telcoDataUsageRecord =
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

        val roundtrippedTelcoDataUsageRecord =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telcoDataUsageRecord),
                jacksonTypeRef<TelcoDataUsageRecord>(),
            )

        assertThat(roundtrippedTelcoDataUsageRecord).isEqualTo(telcoDataUsageRecord)
    }
}
