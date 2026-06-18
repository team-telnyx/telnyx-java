// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifiednumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifiedNumberCreateParamsTest {

    @Test
    fun create() {
        VerifiedNumberCreateParams.builder()
            .phoneNumber("+15551234567")
            .verificationMethod(VerifiedNumberCreateParams.VerificationMethod.SMS)
            .extension("ww243w1")
            .build()
    }

    @Test
    fun body() {
        val params =
            VerifiedNumberCreateParams.builder()
                .phoneNumber("+15551234567")
                .verificationMethod(VerifiedNumberCreateParams.VerificationMethod.SMS)
                .extension("ww243w1")
                .build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+15551234567")
        assertThat(body.verificationMethod())
            .isEqualTo(VerifiedNumberCreateParams.VerificationMethod.SMS)
        assertThat(body.extension()).contains("ww243w1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VerifiedNumberCreateParams.builder()
                .phoneNumber("+15551234567")
                .verificationMethod(VerifiedNumberCreateParams.VerificationMethod.SMS)
                .build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+15551234567")
        assertThat(body.verificationMethod())
            .isEqualTo(VerifiedNumberCreateParams.VerificationMethod.SMS)
    }
}
