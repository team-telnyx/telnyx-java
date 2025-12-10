// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveSmsOtpStatusParamsTest {

    @Test
    fun create() {
        BrandRetrieveSmsOtpStatusParams.builder()
            .referenceId("OTP4B2001")
            .brandId("B123ABC")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BrandRetrieveSmsOtpStatusParams.builder().referenceId("OTP4B2001").build()

        assertThat(params._pathParam(0)).isEqualTo("OTP4B2001")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BrandRetrieveSmsOtpStatusParams.builder()
                .referenceId("OTP4B2001")
                .brandId("B123ABC")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("brandId", "B123ABC").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandRetrieveSmsOtpStatusParams.builder().referenceId("OTP4B2001").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
