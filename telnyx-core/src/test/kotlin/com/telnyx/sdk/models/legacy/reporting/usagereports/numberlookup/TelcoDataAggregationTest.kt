// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelcoDataAggregationTest {

    @Test
    fun create() {
        val telcoDataAggregation =
            TelcoDataAggregation.builder()
                .currency("USD")
                .totalCost(0.009)
                .totalDips(3L)
                .type("CNAM")
                .build()

        assertThat(telcoDataAggregation.currency()).contains("USD")
        assertThat(telcoDataAggregation.totalCost()).contains(0.009)
        assertThat(telcoDataAggregation.totalDips()).contains(3L)
        assertThat(telcoDataAggregation.type()).contains("CNAM")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telcoDataAggregation =
            TelcoDataAggregation.builder()
                .currency("USD")
                .totalCost(0.009)
                .totalDips(3L)
                .type("CNAM")
                .build()

        val roundtrippedTelcoDataAggregation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telcoDataAggregation),
                jacksonTypeRef<TelcoDataAggregation>(),
            )

        assertThat(roundtrippedTelcoDataAggregation).isEqualTo(telcoDataAggregation)
    }
}
