// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pricing.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PricingTierTest {

    @Test
    fun create() {
        val pricingTier = PricingTier.builder().max(0L).min(0L).rate(0.0).build()

        assertThat(pricingTier.max()).contains(0L)
        assertThat(pricingTier.min()).isEqualTo(0L)
        assertThat(pricingTier.rate()).isEqualTo(PricingTier.Rate.ofNumber(0.0))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pricingTier = PricingTier.builder().max(0L).min(0L).rate(0.0).build()

        val roundtrippedPricingTier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pricingTier),
                jacksonTypeRef<PricingTier>(),
            )

        assertThat(roundtrippedPricingTier).isEqualTo(pricingTier)
    }
}
