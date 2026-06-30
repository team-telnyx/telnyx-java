// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.verifyemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyEmailConfirmCodeResponseTest {

    @Test
    fun create() {
        val verifyEmailConfirmCodeResponse =
            VerifyEmailConfirmCodeResponse.builder()
                .data(
                    VerifyEmailConfirmCodeResponse.Data.builder()
                        .emailVerified(false)
                        .recordType(
                            VerifyEmailConfirmCodeResponse.Data.RecordType.EMAIL_VERIFICATION
                        )
                        .status(VerifyEmailConfirmCodeResponse.Data.Status.SENT)
                        .build()
                )
                .build()

        assertThat(verifyEmailConfirmCodeResponse.data())
            .isEqualTo(
                VerifyEmailConfirmCodeResponse.Data.builder()
                    .emailVerified(false)
                    .recordType(VerifyEmailConfirmCodeResponse.Data.RecordType.EMAIL_VERIFICATION)
                    .status(VerifyEmailConfirmCodeResponse.Data.Status.SENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyEmailConfirmCodeResponse =
            VerifyEmailConfirmCodeResponse.builder()
                .data(
                    VerifyEmailConfirmCodeResponse.Data.builder()
                        .emailVerified(false)
                        .recordType(
                            VerifyEmailConfirmCodeResponse.Data.RecordType.EMAIL_VERIFICATION
                        )
                        .status(VerifyEmailConfirmCodeResponse.Data.Status.SENT)
                        .build()
                )
                .build()

        val roundtrippedVerifyEmailConfirmCodeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyEmailConfirmCodeResponse),
                jacksonTypeRef<VerifyEmailConfirmCodeResponse>(),
            )

        assertThat(roundtrippedVerifyEmailConfirmCodeResponse)
            .isEqualTo(verifyEmailConfirmCodeResponse)
    }
}
