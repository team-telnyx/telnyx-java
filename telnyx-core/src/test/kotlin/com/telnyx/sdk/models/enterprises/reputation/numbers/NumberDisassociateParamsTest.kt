// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberDisassociateParamsTest {

    @Test
    fun create() {
        NumberDisassociateParams.builder()
            .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .phoneNumber("+16035551234")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NumberDisassociateParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .phoneNumber("+16035551234")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(params._pathParam(1)).isEqualTo("+16035551234")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
