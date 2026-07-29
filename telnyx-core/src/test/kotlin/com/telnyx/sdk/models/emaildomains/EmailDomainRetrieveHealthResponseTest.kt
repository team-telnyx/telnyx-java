// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainRetrieveHealthResponseTest {

    @Test
    fun create() {
        val emailDomainRetrieveHealthResponse =
            EmailDomainRetrieveHealthResponse.builder()
                .data(
                    EmailDomainRetrieveHealthResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .checkedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(
                            EmailDomainRetrieveHealthResponse.Data.RecordType.EMAIL_DOMAIN_HEALTH
                        )
                        .status(EmailDomainRetrieveHealthResponse.Data.Status.PENDING)
                        .usableForInbound(true)
                        .usableForSending(true)
                        .verification(
                            EmailDomainVerification.builder()
                                .dkim(EmailDomainVerification.Dkim.PENDING)
                                .dmarc(EmailDomainVerification.Dmarc.MISSING_OPTIONAL)
                                .mx(EmailDomainVerification.Mx.NOT_REQUIRED)
                                .ownership(EmailDomainVerification.Ownership.PENDING)
                                .spf(EmailDomainVerification.Spf.MISSING_OPTIONAL)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(emailDomainRetrieveHealthResponse.data())
            .isEqualTo(
                EmailDomainRetrieveHealthResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .checkedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recordType(
                        EmailDomainRetrieveHealthResponse.Data.RecordType.EMAIL_DOMAIN_HEALTH
                    )
                    .status(EmailDomainRetrieveHealthResponse.Data.Status.PENDING)
                    .usableForInbound(true)
                    .usableForSending(true)
                    .verification(
                        EmailDomainVerification.builder()
                            .dkim(EmailDomainVerification.Dkim.PENDING)
                            .dmarc(EmailDomainVerification.Dmarc.MISSING_OPTIONAL)
                            .mx(EmailDomainVerification.Mx.NOT_REQUIRED)
                            .ownership(EmailDomainVerification.Ownership.PENDING)
                            .spf(EmailDomainVerification.Spf.MISSING_OPTIONAL)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailDomainRetrieveHealthResponse =
            EmailDomainRetrieveHealthResponse.builder()
                .data(
                    EmailDomainRetrieveHealthResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .checkedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(
                            EmailDomainRetrieveHealthResponse.Data.RecordType.EMAIL_DOMAIN_HEALTH
                        )
                        .status(EmailDomainRetrieveHealthResponse.Data.Status.PENDING)
                        .usableForInbound(true)
                        .usableForSending(true)
                        .verification(
                            EmailDomainVerification.builder()
                                .dkim(EmailDomainVerification.Dkim.PENDING)
                                .dmarc(EmailDomainVerification.Dmarc.MISSING_OPTIONAL)
                                .mx(EmailDomainVerification.Mx.NOT_REQUIRED)
                                .ownership(EmailDomainVerification.Ownership.PENDING)
                                .spf(EmailDomainVerification.Spf.MISSING_OPTIONAL)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedEmailDomainRetrieveHealthResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDomainRetrieveHealthResponse),
                jacksonTypeRef<EmailDomainRetrieveHealthResponse>(),
            )

        assertThat(roundtrippedEmailDomainRetrieveHealthResponse)
            .isEqualTo(emailDomainRetrieveHealthResponse)
    }
}
