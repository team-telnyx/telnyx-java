// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pricing.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListPageResponseTest {

    @Test
    fun create() {
        val productListPageResponse =
            ProductListPageResponse.builder()
                .addData(
                    ProductListResponse.builder()
                        .description("description")
                        .name("name")
                        .slug("slug")
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

        assertThat(productListPageResponse.data())
            .containsExactly(
                ProductListResponse.builder()
                    .description("description")
                    .name("name")
                    .slug("slug")
                    .build()
            )
        assertThat(productListPageResponse.meta())
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
        val productListPageResponse =
            ProductListPageResponse.builder()
                .addData(
                    ProductListResponse.builder()
                        .description("description")
                        .name("name")
                        .slug("slug")
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

        val roundtrippedProductListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productListPageResponse),
                jacksonTypeRef<ProductListPageResponse>(),
            )

        assertThat(roundtrippedProductListPageResponse).isEqualTo(productListPageResponse)
    }
}
