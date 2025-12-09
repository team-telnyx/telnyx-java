// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Number10dlcGetEnumParamsTest {

    @Test
    fun create() {
        Number10dlcGetEnumParams.builder().endpoint(Number10dlcGetEnumParams.Endpoint.MNO).build()
    }

    @Test
    fun pathParams() {
        val params =
            Number10dlcGetEnumParams.builder()
                .endpoint(Number10dlcGetEnumParams.Endpoint.MNO)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mno")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
