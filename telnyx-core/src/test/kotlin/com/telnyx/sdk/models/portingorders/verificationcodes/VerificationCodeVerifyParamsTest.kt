// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.verificationcodes

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationCodeVerifyParamsTest {

    @Test
    fun create() {
        VerificationCodeVerifyParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addVerificationCode(
                VerificationCodeVerifyParams.VerificationCode.builder()
                    .code("12345")
                    .phoneNumber("+61424000001")
                    .build()
            )
            .addVerificationCode(
                VerificationCodeVerifyParams.VerificationCode.builder()
                    .code("54321")
                    .phoneNumber("+61424000002")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VerificationCodeVerifyParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VerificationCodeVerifyParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addVerificationCode(
                    VerificationCodeVerifyParams.VerificationCode.builder()
                        .code("12345")
                        .phoneNumber("+61424000001")
                        .build()
                )
                .addVerificationCode(
                    VerificationCodeVerifyParams.VerificationCode.builder()
                        .code("54321")
                        .phoneNumber("+61424000002")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.verificationCodes().getOrNull())
            .containsExactly(
                VerificationCodeVerifyParams.VerificationCode.builder()
                    .code("12345")
                    .phoneNumber("+61424000001")
                    .build(),
                VerificationCodeVerifyParams.VerificationCode.builder()
                    .code("54321")
                    .phoneNumber("+61424000002")
                    .build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VerificationCodeVerifyParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
