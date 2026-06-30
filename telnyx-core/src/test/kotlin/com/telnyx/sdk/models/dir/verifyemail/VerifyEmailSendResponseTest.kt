// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.verifyemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyEmailSendResponseTest {

    @Test
    fun create() {
        val verifyEmailSendResponse =
            VerifyEmailSendResponse.builder()
                .data(
                    VerifyEmailSendResponse.Data.builder()
                        .emailVerified(false)
                        .recordType(VerifyEmailSendResponse.Data.RecordType.EMAIL_VERIFICATION)
                        .status(VerifyEmailSendResponse.Data.Status.SENT)
                        .build()
                )
                .build()

        assertThat(verifyEmailSendResponse.data())
            .isEqualTo(
                VerifyEmailSendResponse.Data.builder()
                    .emailVerified(false)
                    .recordType(VerifyEmailSendResponse.Data.RecordType.EMAIL_VERIFICATION)
                    .status(VerifyEmailSendResponse.Data.Status.SENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyEmailSendResponse =
            VerifyEmailSendResponse.builder()
                .data(
                    VerifyEmailSendResponse.Data.builder()
                        .emailVerified(false)
                        .recordType(VerifyEmailSendResponse.Data.RecordType.EMAIL_VERIFICATION)
                        .status(VerifyEmailSendResponse.Data.Status.SENT)
                        .build()
                )
                .build()

        val roundtrippedVerifyEmailSendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyEmailSendResponse),
                jacksonTypeRef<VerifyEmailSendResponse>(),
            )

        assertThat(roundtrippedVerifyEmailSendResponse).isEqualTo(verifyEmailSendResponse)
    }
}
