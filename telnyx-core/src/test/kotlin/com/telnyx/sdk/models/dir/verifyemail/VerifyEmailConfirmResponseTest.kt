// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.verifyemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyEmailConfirmResponseTest {

    @Test
    fun create() {
        val verifyEmailConfirmResponse =
            VerifyEmailConfirmResponse.builder()
                .data(
                    VerifyEmailConfirmResponse.Data.builder()
                        .emailVerified(false)
                        .recordType(VerifyEmailConfirmResponse.Data.RecordType.EMAIL_VERIFICATION)
                        .status(VerifyEmailConfirmResponse.Data.Status.SENT)
                        .build()
                )
                .build()

        assertThat(verifyEmailConfirmResponse.data())
            .isEqualTo(
                VerifyEmailConfirmResponse.Data.builder()
                    .emailVerified(false)
                    .recordType(VerifyEmailConfirmResponse.Data.RecordType.EMAIL_VERIFICATION)
                    .status(VerifyEmailConfirmResponse.Data.Status.SENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyEmailConfirmResponse =
            VerifyEmailConfirmResponse.builder()
                .data(
                    VerifyEmailConfirmResponse.Data.builder()
                        .emailVerified(false)
                        .recordType(VerifyEmailConfirmResponse.Data.RecordType.EMAIL_VERIFICATION)
                        .status(VerifyEmailConfirmResponse.Data.Status.SENT)
                        .build()
                )
                .build()

        val roundtrippedVerifyEmailConfirmResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyEmailConfirmResponse),
                jacksonTypeRef<VerifyEmailConfirmResponse>(),
            )

        assertThat(roundtrippedVerifyEmailConfirmResponse).isEqualTo(verifyEmailConfirmResponse)
    }
}
