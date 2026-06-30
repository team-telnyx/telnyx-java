// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumberorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberOrderValidateCodesParamsTest {

    @Test
    fun create() {
        MessagingHostedNumberOrderValidateCodesParams.builder()
            .id("id")
            .addVerificationCode(
                MessagingHostedNumberOrderValidateCodesParams.VerificationCode.builder()
                    .code("code")
                    .phoneNumber("phone_number")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessagingHostedNumberOrderValidateCodesParams.builder()
                .id("id")
                .addVerificationCode(
                    MessagingHostedNumberOrderValidateCodesParams.VerificationCode.builder()
                        .code("code")
                        .phoneNumber("phone_number")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessagingHostedNumberOrderValidateCodesParams.builder()
                .id("id")
                .addVerificationCode(
                    MessagingHostedNumberOrderValidateCodesParams.VerificationCode.builder()
                        .code("code")
                        .phoneNumber("phone_number")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.verificationCodes())
            .containsExactly(
                MessagingHostedNumberOrderValidateCodesParams.VerificationCode.builder()
                    .code("code")
                    .phoneNumber("phone_number")
                    .build()
            )
    }
}
