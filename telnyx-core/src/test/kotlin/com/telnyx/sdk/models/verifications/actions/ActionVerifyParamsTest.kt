// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifications.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionVerifyParamsTest {

    @Test
    fun create() {
        ActionVerifyParams.builder()
            .verificationId("12ade33a-21c0-473b-b055-b3c836e1c292")
            .code("17686")
            .status(ActionVerifyParams.Status.ACCEPTED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionVerifyParams.builder()
                .verificationId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("12ade33a-21c0-473b-b055-b3c836e1c292")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionVerifyParams.builder()
                .verificationId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .code("17686")
                .status(ActionVerifyParams.Status.ACCEPTED)
                .build()

        val body = params._body()

        assertThat(body.code()).contains("17686")
        assertThat(body.status()).contains(ActionVerifyParams.Status.ACCEPTED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionVerifyParams.builder()
                .verificationId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .build()

        val body = params._body()
    }
}
