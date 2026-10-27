// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayConnectorDeleteParamsTest {

    @Test
    fun create() {
        PayConnectorDeleteParams.builder().name("my-payment-connector").build()
    }

    @Test
    fun pathParams() {
        val params = PayConnectorDeleteParams.builder().name("my-payment-connector").build()

        assertThat(params._pathParam(0)).isEqualTo("my-payment-connector")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
