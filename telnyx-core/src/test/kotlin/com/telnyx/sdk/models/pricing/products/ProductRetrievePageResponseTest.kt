// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pricing.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductRetrievePageResponseTest {

    @Test
    fun create() {
        val productRetrievePageResponse =
            ProductRetrievePageResponse.builder()
                .addData(
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
                )
                .meta(
                    PricingPaginationMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(productRetrievePageResponse.data())
            .containsExactly(
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
            )
        assertThat(productRetrievePageResponse.meta())
            .isEqualTo(
                PricingPaginationMeta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productRetrievePageResponse =
            ProductRetrievePageResponse.builder()
                .addData(
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
                )
                .meta(
                    PricingPaginationMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedProductRetrievePageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productRetrievePageResponse),
                jacksonTypeRef<ProductRetrievePageResponse>(),
            )

        assertThat(roundtrippedProductRetrievePageResponse).isEqualTo(productRetrievePageResponse)
    }
}
