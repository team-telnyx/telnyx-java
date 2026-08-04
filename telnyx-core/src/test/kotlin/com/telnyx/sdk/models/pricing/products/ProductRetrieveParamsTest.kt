// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pricing.products

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductRetrieveParamsTest {

    @Test
    fun create() {
        ProductRetrieveParams.builder()
            .slug("slug")
            .filterCountryIso("SE")
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProductRetrieveParams.builder().slug("slug").build()

        assertThat(params._pathParam(0)).isEqualTo("slug")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ProductRetrieveParams.builder()
                .slug("slug")
                .filterCountryIso("SE")
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[country_iso]", "SE")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProductRetrieveParams.builder().slug("slug").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
