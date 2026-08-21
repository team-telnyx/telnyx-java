// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.verifyemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailVerificationStatusTest {

    @Test
    fun create() {
        val emailVerificationStatus =
            EmailVerificationStatus.builder()
                .emailVerified(false)
                .recordType(EmailVerificationStatus.RecordType.EMAIL_VERIFICATION)
                .status(EmailVerificationStatus.Status.SENT)
                .expiresAt(OffsetDateTime.parse("2026-07-30T17:15:00Z"))
                .sendsRemainingToday(9L)
                .build()

        assertThat(emailVerificationStatus.emailVerified()).isEqualTo(false)
        assertThat(emailVerificationStatus.recordType())
            .isEqualTo(EmailVerificationStatus.RecordType.EMAIL_VERIFICATION)
        assertThat(emailVerificationStatus.status()).isEqualTo(EmailVerificationStatus.Status.SENT)
        assertThat(emailVerificationStatus.expiresAt())
            .contains(OffsetDateTime.parse("2026-07-30T17:15:00Z"))
        assertThat(emailVerificationStatus.sendsRemainingToday()).contains(9L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailVerificationStatus =
            EmailVerificationStatus.builder()
                .emailVerified(false)
                .recordType(EmailVerificationStatus.RecordType.EMAIL_VERIFICATION)
                .status(EmailVerificationStatus.Status.SENT)
                .expiresAt(OffsetDateTime.parse("2026-07-30T17:15:00Z"))
                .sendsRemainingToday(9L)
                .build()

        val roundtrippedEmailVerificationStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailVerificationStatus),
                jacksonTypeRef<EmailVerificationStatus>(),
            )

        assertThat(roundtrippedEmailVerificationStatus).isEqualTo(emailVerificationStatus)
    }
}
