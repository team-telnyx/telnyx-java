// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingRoutingListParamsTest {

    @Test
    fun create() {
        CallingRoutingListParams.builder().id("+13125550100").build()
    }

    @Test
    fun pathParams() {
        val params = CallingRoutingListParams.builder().id("+13125550100").build()

        assertThat(params._pathParam(0)).isEqualTo("+13125550100")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
