// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.verificationcodes

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationCodeSendParamsTest {

    @Test
    fun create() {
        VerificationCodeSendParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addPhoneNumber("+61424000001")
            .addPhoneNumber("+61424000002")
            .verificationMethod(VerificationCodeSendParams.VerificationMethod.SMS)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VerificationCodeSendParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VerificationCodeSendParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumber("+61424000001")
                .addPhoneNumber("+61424000002")
                .verificationMethod(VerificationCodeSendParams.VerificationMethod.SMS)
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers().getOrNull()).containsExactly("+61424000001", "+61424000002")
        assertThat(body.verificationMethod())
            .contains(VerificationCodeSendParams.VerificationMethod.SMS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VerificationCodeSendParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
