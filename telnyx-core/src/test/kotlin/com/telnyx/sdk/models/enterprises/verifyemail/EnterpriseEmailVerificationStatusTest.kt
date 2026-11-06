// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.verifyemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnterpriseEmailVerificationStatusTest {

    @Test
    fun create() {
        val enterpriseEmailVerificationStatus =
            EnterpriseEmailVerificationStatus.builder()
                .emailVerified(false)
                .recordType(EnterpriseEmailVerificationStatus.RecordType.EMAIL_VERIFICATION)
                .status(EnterpriseEmailVerificationStatus.Status.SENT)
                .expiresAt(OffsetDateTime.parse("2026-07-30T17:15:00Z"))
                .sendsRemainingToday(9L)
                .build()

        assertThat(enterpriseEmailVerificationStatus.emailVerified()).isEqualTo(false)
        assertThat(enterpriseEmailVerificationStatus.recordType())
            .isEqualTo(EnterpriseEmailVerificationStatus.RecordType.EMAIL_VERIFICATION)
        assertThat(enterpriseEmailVerificationStatus.status())
            .isEqualTo(EnterpriseEmailVerificationStatus.Status.SENT)
        assertThat(enterpriseEmailVerificationStatus.expiresAt())
            .contains(OffsetDateTime.parse("2026-07-30T17:15:00Z"))
        assertThat(enterpriseEmailVerificationStatus.sendsRemainingToday()).contains(9L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enterpriseEmailVerificationStatus =
            EnterpriseEmailVerificationStatus.builder()
                .emailVerified(false)
                .recordType(EnterpriseEmailVerificationStatus.RecordType.EMAIL_VERIFICATION)
                .status(EnterpriseEmailVerificationStatus.Status.SENT)
                .expiresAt(OffsetDateTime.parse("2026-07-30T17:15:00Z"))
                .sendsRemainingToday(9L)
                .build()

        val roundtrippedEnterpriseEmailVerificationStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enterpriseEmailVerificationStatus),
                jacksonTypeRef<EnterpriseEmailVerificationStatus>(),
            )

        assertThat(roundtrippedEnterpriseEmailVerificationStatus)
            .isEqualTo(enterpriseEmailVerificationStatus)
    }
}
