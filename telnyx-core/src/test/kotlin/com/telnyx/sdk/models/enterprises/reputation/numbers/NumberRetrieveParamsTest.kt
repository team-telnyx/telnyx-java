// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberRetrieveParamsTest {

    @Test
    fun create() {
        NumberRetrieveParams.builder()
            .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .phoneNumber("+16035551234")
            .fresh(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NumberRetrieveParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .phoneNumber("+16035551234")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(params._pathParam(1)).isEqualTo("+16035551234")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            NumberRetrieveParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .phoneNumber("+16035551234")
                .fresh(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("fresh", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            NumberRetrieveParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .phoneNumber("+16035551234")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
