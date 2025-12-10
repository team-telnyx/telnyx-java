// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Number10dlcRetrieveParamsTest {

    @Test
    fun create() {
        Number10dlcRetrieveParams.builder().endpoint(Number10dlcRetrieveParams.Endpoint.MNO).build()
    }

    @Test
    fun pathParams() {
        val params =
            Number10dlcRetrieveParams.builder()
                .endpoint(Number10dlcRetrieveParams.Endpoint.MNO)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mno")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
