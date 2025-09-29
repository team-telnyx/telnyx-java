// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberblockorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberBlockOrderRetrieveParamsTest {

    @Test
    fun create() {
        NumberBlockOrderRetrieveParams.builder().numberBlockOrderId("number_block_order_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            NumberBlockOrderRetrieveParams.builder()
                .numberBlockOrderId("number_block_order_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("number_block_order_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
