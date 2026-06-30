// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifications.byphonenumber.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionVerifyParamsTest {

    @Test
    fun create() {
        ActionVerifyParams.builder()
            .phoneNumber("+13035551234")
            .code("17686")
            .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionVerifyParams.builder()
                .phoneNumber("+13035551234")
                .code("17686")
                .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("+13035551234")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionVerifyParams.builder()
                .phoneNumber("+13035551234")
                .code("17686")
                .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("17686")
        assertThat(body.verifyProfileId()).isEqualTo("12ade33a-21c0-473b-b055-b3c836e1c292")
    }
}
