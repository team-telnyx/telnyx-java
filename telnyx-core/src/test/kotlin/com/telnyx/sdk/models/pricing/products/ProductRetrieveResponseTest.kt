// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pricing.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductRetrieveResponseTest {

    @Test
    fun create() {
        val productRetrieveResponse =
            ProductRetrieveResponse.builder()
                .cachedInputRate("cached_input_rate")
                .addCachedInputTier(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
                .countryIso("country_iso")
                .currency("currency")
                .direction("direction")
                .inputRate("input_rate")
                .addInputTier(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
                .model("model")
                .name("name")
                .note("note")
                .outputRate("output_rate")
                .addOutputTier(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
                .pricingType("pricing_type")
                .rate(0.0)
                .addTier(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
                .type("type")
                .unit("unit")
                .build()

        assertThat(productRetrieveResponse.cachedInputRate()).contains("cached_input_rate")
        assertThat(productRetrieveResponse.cachedInputTiers().getOrNull())
            .containsExactly(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
        assertThat(productRetrieveResponse.countryIso()).contains("country_iso")
        assertThat(productRetrieveResponse.currency()).contains("currency")
        assertThat(productRetrieveResponse.direction()).contains("direction")
        assertThat(productRetrieveResponse.inputRate()).contains("input_rate")
        assertThat(productRetrieveResponse.inputTiers().getOrNull())
            .containsExactly(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
        assertThat(productRetrieveResponse.model()).contains("model")
        assertThat(productRetrieveResponse.name()).contains("name")
        assertThat(productRetrieveResponse.note()).contains("note")
        assertThat(productRetrieveResponse.outputRate()).contains("output_rate")
        assertThat(productRetrieveResponse.outputTiers().getOrNull())
            .containsExactly(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
        assertThat(productRetrieveResponse.pricingType()).contains("pricing_type")
        assertThat(productRetrieveResponse.rate())
            .contains(ProductRetrieveResponse.Rate.ofNumber(0.0))
        assertThat(productRetrieveResponse.tiers().getOrNull())
            .containsExactly(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
        assertThat(productRetrieveResponse.type()).contains("type")
        assertThat(productRetrieveResponse.unit()).contains("unit")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productRetrieveResponse =
            ProductRetrieveResponse.builder()
                .cachedInputRate("cached_input_rate")
                .addCachedInputTier(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
                .countryIso("country_iso")
                .currency("currency")
                .direction("direction")
                .inputRate("input_rate")
                .addInputTier(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
                .model("model")
                .name("name")
                .note("note")
                .outputRate("output_rate")
                .addOutputTier(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
                .pricingType("pricing_type")
                .rate(0.0)
                .addTier(PricingTier.builder().max(0L).min(0L).rate(0.0).build())
                .type("type")
                .unit("unit")
                .build()

        val roundtrippedProductRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productRetrieveResponse),
                jacksonTypeRef<ProductRetrieveResponse>(),
            )

        assertThat(roundtrippedProductRetrieveResponse).isEqualTo(productRetrieveResponse)
    }
}
