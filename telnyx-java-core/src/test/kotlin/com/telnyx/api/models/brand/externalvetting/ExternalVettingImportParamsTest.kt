// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.brand.externalvetting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingImportParamsTest {

    @Test
    fun create() {
        ExternalVettingImportParams.builder()
            .brandId("brandId")
            .evpId("evpId")
            .vettingId("vettingId")
            .vettingToken("vettingToken")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalVettingImportParams.builder()
                .brandId("brandId")
                .evpId("evpId")
                .vettingId("vettingId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("brandId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalVettingImportParams.builder()
                .brandId("brandId")
                .evpId("evpId")
                .vettingId("vettingId")
                .vettingToken("vettingToken")
                .build()

        val body = params._body()

        assertThat(body.evpId()).isEqualTo("evpId")
        assertThat(body.vettingId()).isEqualTo("vettingId")
        assertThat(body.vettingToken()).contains("vettingToken")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalVettingImportParams.builder()
                .brandId("brandId")
                .evpId("evpId")
                .vettingId("vettingId")
                .build()

        val body = params._body()

        assertThat(body.evpId()).isEqualTo("evpId")
        assertThat(body.vettingId()).isEqualTo("vettingId")
    }
}
