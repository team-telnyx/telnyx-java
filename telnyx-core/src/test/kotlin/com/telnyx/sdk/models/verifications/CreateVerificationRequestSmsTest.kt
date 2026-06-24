// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateVerificationRequestSmsTest {

    @Test
    fun create() {
        val createVerificationRequestSms =
            CreateVerificationRequestSms.builder()
                .phoneNumber("+13035551234")
                .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .customCode("43612")
                .timeoutSecs(300L)
                .build()

        assertThat(createVerificationRequestSms.phoneNumber()).isEqualTo("+13035551234")
        assertThat(createVerificationRequestSms.verifyProfileId())
            .isEqualTo("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(createVerificationRequestSms.customCode()).contains("43612")
        assertThat(createVerificationRequestSms.timeoutSecs()).contains(300L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createVerificationRequestSms =
            CreateVerificationRequestSms.builder()
                .phoneNumber("+13035551234")
                .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .customCode("43612")
                .timeoutSecs(300L)
                .build()

        val roundtrippedCreateVerificationRequestSms =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createVerificationRequestSms),
                jacksonTypeRef<CreateVerificationRequestSms>(),
            )

        assertThat(roundtrippedCreateVerificationRequestSms).isEqualTo(createVerificationRequestSms)
    }
}
