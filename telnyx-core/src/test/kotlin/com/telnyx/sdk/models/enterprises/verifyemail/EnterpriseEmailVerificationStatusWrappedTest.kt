// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.verifyemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnterpriseEmailVerificationStatusWrappedTest {

    @Test
    fun create() {
        val enterpriseEmailVerificationStatusWrapped =
            EnterpriseEmailVerificationStatusWrapped.builder()
                .data(
                    EnterpriseEmailVerificationStatusWrapped.Data.builder()
                        .emailVerified(false)
                        .recordType(
                            EnterpriseEmailVerificationStatusWrapped.Data.RecordType
                                .EMAIL_VERIFICATION
                        )
                        .status(EnterpriseEmailVerificationStatusWrapped.Data.Status.SENT)
                        .expiresAt(OffsetDateTime.parse("2026-07-30T17:15:00Z"))
                        .sendsRemainingToday(9L)
                        .build()
                )
                .build()

        assertThat(enterpriseEmailVerificationStatusWrapped.data())
            .isEqualTo(
                EnterpriseEmailVerificationStatusWrapped.Data.builder()
                    .emailVerified(false)
                    .recordType(
                        EnterpriseEmailVerificationStatusWrapped.Data.RecordType.EMAIL_VERIFICATION
                    )
                    .status(EnterpriseEmailVerificationStatusWrapped.Data.Status.SENT)
                    .expiresAt(OffsetDateTime.parse("2026-07-30T17:15:00Z"))
                    .sendsRemainingToday(9L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enterpriseEmailVerificationStatusWrapped =
            EnterpriseEmailVerificationStatusWrapped.builder()
                .data(
                    EnterpriseEmailVerificationStatusWrapped.Data.builder()
                        .emailVerified(false)
                        .recordType(
                            EnterpriseEmailVerificationStatusWrapped.Data.RecordType
                                .EMAIL_VERIFICATION
                        )
                        .status(EnterpriseEmailVerificationStatusWrapped.Data.Status.SENT)
                        .expiresAt(OffsetDateTime.parse("2026-07-30T17:15:00Z"))
                        .sendsRemainingToday(9L)
                        .build()
                )
                .build()

        val roundtrippedEnterpriseEmailVerificationStatusWrapped =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enterpriseEmailVerificationStatusWrapped),
                jacksonTypeRef<EnterpriseEmailVerificationStatusWrapped>(),
            )

        assertThat(roundtrippedEnterpriseEmailVerificationStatusWrapped)
            .isEqualTo(enterpriseEmailVerificationStatusWrapped)
    }
}
