// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifications.byphonenumber.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyVerificationCodeResponseTest {

    @Test
    fun create() {
        val verifyVerificationCodeResponse =
            VerifyVerificationCodeResponse.builder()
                .data(
                    VerifyVerificationCodeResponse.Data.builder()
                        .phoneNumber("+13035551234")
                        .responseCode(VerifyVerificationCodeResponse.Data.ResponseCode.ACCEPTED)
                        .build()
                )
                .build()

        assertThat(verifyVerificationCodeResponse.data())
            .isEqualTo(
                VerifyVerificationCodeResponse.Data.builder()
                    .phoneNumber("+13035551234")
                    .responseCode(VerifyVerificationCodeResponse.Data.ResponseCode.ACCEPTED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyVerificationCodeResponse =
            VerifyVerificationCodeResponse.builder()
                .data(
                    VerifyVerificationCodeResponse.Data.builder()
                        .phoneNumber("+13035551234")
                        .responseCode(VerifyVerificationCodeResponse.Data.ResponseCode.ACCEPTED)
                        .build()
                )
                .build()

        val roundtrippedVerifyVerificationCodeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyVerificationCodeResponse),
                jacksonTypeRef<VerifyVerificationCodeResponse>(),
            )

        assertThat(roundtrippedVerifyVerificationCodeResponse)
            .isEqualTo(verifyVerificationCodeResponse)
    }
}
