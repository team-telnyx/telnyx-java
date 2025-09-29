// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumberorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberOrderCreateVerificationCodesParamsTest {

    @Test
    fun create() {
        MessagingHostedNumberOrderCreateVerificationCodesParams.builder()
            .id("id")
            .addPhoneNumber("string")
            .verificationMethod(
                MessagingHostedNumberOrderCreateVerificationCodesParams.VerificationMethod.SMS
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessagingHostedNumberOrderCreateVerificationCodesParams.builder()
                .id("id")
                .addPhoneNumber("string")
                .verificationMethod(
                    MessagingHostedNumberOrderCreateVerificationCodesParams.VerificationMethod.SMS
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessagingHostedNumberOrderCreateVerificationCodesParams.builder()
                .id("id")
                .addPhoneNumber("string")
                .verificationMethod(
                    MessagingHostedNumberOrderCreateVerificationCodesParams.VerificationMethod.SMS
                )
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers()).containsExactly("string")
        assertThat(body.verificationMethod())
            .isEqualTo(
                MessagingHostedNumberOrderCreateVerificationCodesParams.VerificationMethod.SMS
            )
    }
}
