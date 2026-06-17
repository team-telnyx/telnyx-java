// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationTriggerSmsParamsTest {

    @Test
    fun create() {
        VerificationTriggerSmsParams.builder()
            .createVerificationRequestSms(
                CreateVerificationRequestSms.builder()
                    .phoneNumber("+13035551234")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .customCode("43612")
                    .timeoutSecs(300L)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            VerificationTriggerSmsParams.builder()
                .createVerificationRequestSms(
                    CreateVerificationRequestSms.builder()
                        .phoneNumber("+13035551234")
                        .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .customCode("43612")
                        .timeoutSecs(300L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateVerificationRequestSms.builder()
                    .phoneNumber("+13035551234")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .customCode("43612")
                    .timeoutSecs(300L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VerificationTriggerSmsParams.builder()
                .createVerificationRequestSms(
                    CreateVerificationRequestSms.builder()
                        .phoneNumber("+13035551234")
                        .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateVerificationRequestSms.builder()
                    .phoneNumber("+13035551234")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .build()
            )
    }
}
