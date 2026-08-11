// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand.externalvetting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingImportsParamsTest {

    @Test
    fun create() {
        ExternalVettingImportsParams.builder()
            .brandId("brandId")
            .evpId("Evpid")
            .vettingId("Vettingid")
            .vettingToken("Vettingtoken")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalVettingImportsParams.builder()
                .brandId("brandId")
                .evpId("Evpid")
                .vettingId("Vettingid")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("brandId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalVettingImportsParams.builder()
                .brandId("brandId")
                .evpId("Evpid")
                .vettingId("Vettingid")
                .vettingToken("Vettingtoken")
                .build()

        val body = params._body()

        assertThat(body.evpId()).isEqualTo("Evpid")
        assertThat(body.vettingId()).isEqualTo("Vettingid")
        assertThat(body.vettingToken()).contains("Vettingtoken")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalVettingImportsParams.builder()
                .brandId("brandId")
                .evpId("Evpid")
                .vettingId("Vettingid")
                .build()

        val body = params._body()

        assertThat(body.evpId()).isEqualTo("Evpid")
        assertThat(body.vettingId()).isEqualTo("Vettingid")
    }
}
