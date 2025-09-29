// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.subnumberorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderCancelParamsTest {

    @Test
    fun create() {
        SubNumberOrderCancelParams.builder().subNumberOrderId("sub_number_order_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            SubNumberOrderCancelParams.builder().subNumberOrderId("sub_number_order_id").build()

        assertThat(params._pathParam(0)).isEqualTo("sub_number_order_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
