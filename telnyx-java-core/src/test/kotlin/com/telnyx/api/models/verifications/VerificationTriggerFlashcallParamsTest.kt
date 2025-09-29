// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationTriggerFlashcallParamsTest {

    @Test
    fun create() {
        VerificationTriggerFlashcallParams.builder()
            .phoneNumber("+13035551234")
            .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
            .timeoutSecs(300L)
            .build()
    }

    @Test
    fun body() {
        val params =
            VerificationTriggerFlashcallParams.builder()
                .phoneNumber("+13035551234")
                .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .timeoutSecs(300L)
                .build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+13035551234")
        assertThat(body.verifyProfileId()).isEqualTo("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(body.timeoutSecs()).contains(300L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VerificationTriggerFlashcallParams.builder()
                .phoneNumber("+13035551234")
                .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+13035551234")
        assertThat(body.verifyProfileId()).isEqualTo("12ade33a-21c0-473b-b055-b3c836e1c292")
    }
}
