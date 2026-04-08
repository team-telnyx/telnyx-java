// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberAssociateParamsTest {

    @Test
    fun create() {
        NumberAssociateParams.builder()
            .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .addPhoneNumber("+16035551234")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NumberAssociateParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .addPhoneNumber("+16035551234")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NumberAssociateParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .addPhoneNumber("+16035551234")
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers()).containsExactly("+16035551234")
    }
}
