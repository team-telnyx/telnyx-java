// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CostInformationTest {

    @Test
    fun create() {
        val costInformation =
            CostInformation.builder()
                .currency("USD")
                .monthlyCost("6.54")
                .upfrontCost("3.21")
                .build()

        assertThat(costInformation.currency()).contains("USD")
        assertThat(costInformation.monthlyCost()).contains("6.54")
        assertThat(costInformation.upfrontCost()).contains("3.21")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val costInformation =
            CostInformation.builder()
                .currency("USD")
                .monthlyCost("6.54")
                .upfrontCost("3.21")
                .build()

        val roundtrippedCostInformation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(costInformation),
                jacksonTypeRef<CostInformation>(),
            )

        assertThat(roundtrippedCostInformation).isEqualTo(costInformation)
    }
}
