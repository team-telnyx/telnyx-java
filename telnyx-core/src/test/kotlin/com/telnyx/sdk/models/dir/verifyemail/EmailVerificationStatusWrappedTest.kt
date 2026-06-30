// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.verifyemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailVerificationStatusWrappedTest {

    @Test
    fun create() {
        val emailVerificationStatusWrapped =
            EmailVerificationStatusWrapped.builder()
                .data(
                    EmailVerificationStatusWrapped.Data.builder()
                        .emailVerified(false)
                        .recordType(
                            EmailVerificationStatusWrapped.Data.RecordType.EMAIL_VERIFICATION
                        )
                        .status(EmailVerificationStatusWrapped.Data.Status.SENT)
                        .build()
                )
                .build()

        assertThat(emailVerificationStatusWrapped.data())
            .isEqualTo(
                EmailVerificationStatusWrapped.Data.builder()
                    .emailVerified(false)
                    .recordType(EmailVerificationStatusWrapped.Data.RecordType.EMAIL_VERIFICATION)
                    .status(EmailVerificationStatusWrapped.Data.Status.SENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailVerificationStatusWrapped =
            EmailVerificationStatusWrapped.builder()
                .data(
                    EmailVerificationStatusWrapped.Data.builder()
                        .emailVerified(false)
                        .recordType(
                            EmailVerificationStatusWrapped.Data.RecordType.EMAIL_VERIFICATION
                        )
                        .status(EmailVerificationStatusWrapped.Data.Status.SENT)
                        .build()
                )
                .build()

        val roundtrippedEmailVerificationStatusWrapped =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailVerificationStatusWrapped),
                jacksonTypeRef<EmailVerificationStatusWrapped>(),
            )

        assertThat(roundtrippedEmailVerificationStatusWrapped)
            .isEqualTo(emailVerificationStatusWrapped)
    }
}
