// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.seti

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SetiRetrieveBlackBoxTestResultsParamsTest {

    @Test
    fun create() {
        SetiRetrieveBlackBoxTestResultsParams.builder()
            .filter(
                SetiRetrieveBlackBoxTestResultsParams.Filter.builder().product("product").build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SetiRetrieveBlackBoxTestResultsParams.builder()
                .filter(
                    SetiRetrieveBlackBoxTestResultsParams.Filter.builder()
                        .product("product")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("filter[product]", "product").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SetiRetrieveBlackBoxTestResultsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
