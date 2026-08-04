// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pricing.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PricingPaginationMetaTest {

    @Test
    fun create() {
        val pricingPaginationMeta =
            PricingPaginationMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        assertThat(pricingPaginationMeta.pageNumber()).isEqualTo(0L)
        assertThat(pricingPaginationMeta.pageSize()).isEqualTo(0L)
        assertThat(pricingPaginationMeta.totalPages()).isEqualTo(0L)
        assertThat(pricingPaginationMeta.totalResults()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pricingPaginationMeta =
            PricingPaginationMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        val roundtrippedPricingPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pricingPaginationMeta),
                jacksonTypeRef<PricingPaginationMeta>(),
            )

        assertThat(roundtrippedPricingPaginationMeta).isEqualTo(pricingPaginationMeta)
    }
}
