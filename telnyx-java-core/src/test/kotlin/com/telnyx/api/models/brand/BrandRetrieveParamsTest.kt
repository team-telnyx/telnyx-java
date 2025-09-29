// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveParamsTest {

    @Test
    fun create() {
        BrandRetrieveParams.builder().brandId("brandId").build()
    }

    @Test
    fun pathParams() {
        val params = BrandRetrieveParams.builder().brandId("brandId").build()

        assertThat(params._pathParam(0)).isEqualTo("brandId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
