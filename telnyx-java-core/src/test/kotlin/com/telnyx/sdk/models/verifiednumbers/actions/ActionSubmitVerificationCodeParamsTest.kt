// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifiednumbers.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSubmitVerificationCodeParamsTest {

    @Test
    fun create() {
        ActionSubmitVerificationCodeParams.builder()
            .phoneNumber("+15551234567")
            .verificationCode("123456")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionSubmitVerificationCodeParams.builder()
                .phoneNumber("+15551234567")
                .verificationCode("123456")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("+15551234567")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionSubmitVerificationCodeParams.builder()
                .phoneNumber("+15551234567")
                .verificationCode("123456")
                .build()

        val body = params._body()

        assertThat(body.verificationCode()).isEqualTo("123456")
    }
}
