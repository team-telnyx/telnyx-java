// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandResend2faEmailParamsTest {

    @Test
    fun create() {
        BrandResend2faEmailParams.builder().brandId("brandId").build()
    }

    @Test
    fun pathParams() {
        val params = BrandResend2faEmailParams.builder().brandId("brandId").build()

        assertThat(params._pathParam(0)).isEqualTo("brandId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
