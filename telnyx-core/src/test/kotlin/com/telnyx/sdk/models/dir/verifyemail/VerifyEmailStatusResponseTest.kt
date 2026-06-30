// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.verifyemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyEmailStatusResponseTest {

    @Test
    fun create() {
        val verifyEmailStatusResponse =
            VerifyEmailStatusResponse.builder()
                .data(
                    VerifyEmailStatusResponse.Data.builder()
                        .emailVerified(false)
                        .recordType(VerifyEmailStatusResponse.Data.RecordType.EMAIL_VERIFICATION)
                        .status(VerifyEmailStatusResponse.Data.Status.SENT)
                        .build()
                )
                .build()

        assertThat(verifyEmailStatusResponse.data())
            .isEqualTo(
                VerifyEmailStatusResponse.Data.builder()
                    .emailVerified(false)
                    .recordType(VerifyEmailStatusResponse.Data.RecordType.EMAIL_VERIFICATION)
                    .status(VerifyEmailStatusResponse.Data.Status.SENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyEmailStatusResponse =
            VerifyEmailStatusResponse.builder()
                .data(
                    VerifyEmailStatusResponse.Data.builder()
                        .emailVerified(false)
                        .recordType(VerifyEmailStatusResponse.Data.RecordType.EMAIL_VERIFICATION)
                        .status(VerifyEmailStatusResponse.Data.Status.SENT)
                        .build()
                )
                .build()

        val roundtrippedVerifyEmailStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyEmailStatusResponse),
                jacksonTypeRef<VerifyEmailStatusResponse>(),
            )

        assertThat(roundtrippedVerifyEmailStatusResponse).isEqualTo(verifyEmailStatusResponse)
    }
}
