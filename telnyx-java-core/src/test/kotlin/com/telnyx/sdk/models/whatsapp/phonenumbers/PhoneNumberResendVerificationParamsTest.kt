// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberResendVerificationParamsTest {

    @Test
    fun create() {
        PhoneNumberResendVerificationParams.builder()
            .phoneNumber("phone_number")
            .verificationMethod(PhoneNumberResendVerificationParams.VerificationMethod.SMS)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberResendVerificationParams.builder().phoneNumber("phone_number").build()

        assertThat(params._pathParam(0)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhoneNumberResendVerificationParams.builder()
                .phoneNumber("phone_number")
                .verificationMethod(PhoneNumberResendVerificationParams.VerificationMethod.SMS)
                .build()

        val body = params._body()

        assertThat(body.verificationMethod())
            .contains(PhoneNumberResendVerificationParams.VerificationMethod.SMS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhoneNumberResendVerificationParams.builder().phoneNumber("phone_number").build()

        val body = params._body()
    }
}
