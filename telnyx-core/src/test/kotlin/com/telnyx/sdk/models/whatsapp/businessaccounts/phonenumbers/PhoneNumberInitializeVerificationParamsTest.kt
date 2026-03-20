// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberInitializeVerificationParamsTest {

    @Test
    fun create() {
        PhoneNumberInitializeVerificationParams.builder()
            .id("id")
            .displayName("display_name")
            .phoneNumber("phone_number")
            .language("language")
            .verificationMethod(PhoneNumberInitializeVerificationParams.VerificationMethod.SMS)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberInitializeVerificationParams.builder()
                .id("id")
                .displayName("display_name")
                .phoneNumber("phone_number")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhoneNumberInitializeVerificationParams.builder()
                .id("id")
                .displayName("display_name")
                .phoneNumber("phone_number")
                .language("language")
                .verificationMethod(PhoneNumberInitializeVerificationParams.VerificationMethod.SMS)
                .build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.phoneNumber()).isEqualTo("phone_number")
        assertThat(body.language()).contains("language")
        assertThat(body.verificationMethod())
            .contains(PhoneNumberInitializeVerificationParams.VerificationMethod.SMS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhoneNumberInitializeVerificationParams.builder()
                .id("id")
                .displayName("display_name")
                .phoneNumber("phone_number")
                .build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.phoneNumber()).isEqualTo("phone_number")
    }
}
