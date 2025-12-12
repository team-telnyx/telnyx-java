// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand.externalvetting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingListParamsTest {

    @Test
    fun create() {
        ExternalVettingListParams.builder().brandId("brandId").build()
    }

    @Test
    fun pathParams() {
        val params = ExternalVettingListParams.builder().brandId("brandId").build()

        assertThat(params._pathParam(0)).isEqualTo("brandId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
