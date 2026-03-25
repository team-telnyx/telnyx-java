// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reputation.numbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberDeleteParamsTest {

    @Test
    fun create() {
        NumberDeleteParams.builder().phoneNumber("+16035551234").build()
    }

    @Test
    fun pathParams() {
        val params = NumberDeleteParams.builder().phoneNumber("+16035551234").build()

        assertThat(params._pathParam(0)).isEqualTo("+16035551234")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
