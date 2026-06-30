// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.verifyemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyEmailSendCodeResponseTest {

    @Test
    fun create() {
        val verifyEmailSendCodeResponse =
            VerifyEmailSendCodeResponse.builder()
                .data(
                    VerifyEmailSendCodeResponse.Data.builder()
                        .emailVerified(false)
                        .recordType(VerifyEmailSendCodeResponse.Data.RecordType.EMAIL_VERIFICATION)
                        .status(VerifyEmailSendCodeResponse.Data.Status.SENT)
                        .build()
                )
                .build()

        assertThat(verifyEmailSendCodeResponse.data())
            .isEqualTo(
                VerifyEmailSendCodeResponse.Data.builder()
                    .emailVerified(false)
                    .recordType(VerifyEmailSendCodeResponse.Data.RecordType.EMAIL_VERIFICATION)
                    .status(VerifyEmailSendCodeResponse.Data.Status.SENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyEmailSendCodeResponse =
            VerifyEmailSendCodeResponse.builder()
                .data(
                    VerifyEmailSendCodeResponse.Data.builder()
                        .emailVerified(false)
                        .recordType(VerifyEmailSendCodeResponse.Data.RecordType.EMAIL_VERIFICATION)
                        .status(VerifyEmailSendCodeResponse.Data.Status.SENT)
                        .build()
                )
                .build()

        val roundtrippedVerifyEmailSendCodeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyEmailSendCodeResponse),
                jacksonTypeRef<VerifyEmailSendCodeResponse>(),
            )

        assertThat(roundtrippedVerifyEmailSendCodeResponse).isEqualTo(verifyEmailSendCodeResponse)
    }
}
