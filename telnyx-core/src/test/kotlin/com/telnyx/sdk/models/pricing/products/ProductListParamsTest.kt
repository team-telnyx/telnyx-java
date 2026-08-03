// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pricing.products

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListParamsTest {

    @Test
    fun create() {
        ProductListParams.builder().pageNumber(1L).pageSize(1L).build()
    }

    @Test
    fun queryParams() {
        val params = ProductListParams.builder().pageNumber(1L).pageSize(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page_number", "1").put("page_size", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProductListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
