// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand.externalvetting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingExternalVettingParamsTest {

    @Test
    fun create() {
        ExternalVettingExternalVettingParams.builder()
            .brandId("brandId")
            .evpId("evpId")
            .vettingClass("vettingClass")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalVettingExternalVettingParams.builder()
                .brandId("brandId")
                .evpId("evpId")
                .vettingClass("vettingClass")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("brandId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalVettingExternalVettingParams.builder()
                .brandId("brandId")
                .evpId("evpId")
                .vettingClass("vettingClass")
                .build()

        val body = params._body()

        assertThat(body.evpId()).isEqualTo("evpId")
        assertThat(body.vettingClass()).isEqualTo("vettingClass")
    }
}
