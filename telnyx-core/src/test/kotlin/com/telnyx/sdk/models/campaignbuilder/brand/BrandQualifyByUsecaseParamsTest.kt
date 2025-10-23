// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.campaignbuilder.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandQualifyByUsecaseParamsTest {

    @Test
    fun create() {
        BrandQualifyByUsecaseParams.builder().brandId("brandId").usecase("usecase").build()
    }

    @Test
    fun pathParams() {
        val params =
            BrandQualifyByUsecaseParams.builder().brandId("brandId").usecase("usecase").build()

        assertThat(params._pathParam(0)).isEqualTo("brandId")
        assertThat(params._pathParam(1)).isEqualTo("usecase")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
