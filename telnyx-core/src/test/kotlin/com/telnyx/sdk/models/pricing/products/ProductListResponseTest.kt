// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pricing.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListResponseTest {

    @Test
    fun create() {
        val productListResponse =
            ProductListResponse.builder()
                .description("description")
                .name("name")
                .slug("slug")
                .build()

        assertThat(productListResponse.description()).isEqualTo("description")
        assertThat(productListResponse.name()).isEqualTo("name")
        assertThat(productListResponse.slug()).isEqualTo("slug")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productListResponse =
            ProductListResponse.builder()
                .description("description")
                .name("name")
                .slug("slug")
                .build()

        val roundtrippedProductListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productListResponse),
                jacksonTypeRef<ProductListResponse>(),
            )

        assertThat(roundtrippedProductListResponse).isEqualTo(productListResponse)
    }
}
