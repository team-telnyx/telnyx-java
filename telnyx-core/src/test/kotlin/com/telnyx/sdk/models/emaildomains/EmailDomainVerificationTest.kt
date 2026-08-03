// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainVerificationTest {

    @Test
    fun create() {
        val emailDomainVerification =
            EmailDomainVerification.builder()
                .dkim(EmailDomainVerification.Dkim.PENDING)
                .dmarc(EmailDomainVerification.Dmarc.MISSING_OPTIONAL)
                .mx(EmailDomainVerification.Mx.NOT_REQUIRED)
                .ownership(EmailDomainVerification.Ownership.PENDING)
                .spf(EmailDomainVerification.Spf.MISSING_OPTIONAL)
                .build()

        assertThat(emailDomainVerification.dkim()).isEqualTo(EmailDomainVerification.Dkim.PENDING)
        assertThat(emailDomainVerification.dmarc())
            .isEqualTo(EmailDomainVerification.Dmarc.MISSING_OPTIONAL)
        assertThat(emailDomainVerification.mx()).isEqualTo(EmailDomainVerification.Mx.NOT_REQUIRED)
        assertThat(emailDomainVerification.ownership())
            .isEqualTo(EmailDomainVerification.Ownership.PENDING)
        assertThat(emailDomainVerification.spf())
            .isEqualTo(EmailDomainVerification.Spf.MISSING_OPTIONAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailDomainVerification =
            EmailDomainVerification.builder()
                .dkim(EmailDomainVerification.Dkim.PENDING)
                .dmarc(EmailDomainVerification.Dmarc.MISSING_OPTIONAL)
                .mx(EmailDomainVerification.Mx.NOT_REQUIRED)
                .ownership(EmailDomainVerification.Ownership.PENDING)
                .spf(EmailDomainVerification.Spf.MISSING_OPTIONAL)
                .build()

        val roundtrippedEmailDomainVerification =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDomainVerification),
                jacksonTypeRef<EmailDomainVerification>(),
            )

        assertThat(roundtrippedEmailDomainVerification).isEqualTo(emailDomainVerification)
    }
}
