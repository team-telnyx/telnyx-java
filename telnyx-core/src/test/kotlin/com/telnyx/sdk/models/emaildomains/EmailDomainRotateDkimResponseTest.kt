// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainRotateDkimResponseTest {

    @Test
    fun create() {
        val emailDomainRotateDkimResponse =
            EmailDomainRotateDkimResponse.builder()
                .data(
                    EmailDomainRotateDkimResponse.Data.builder()
                        .dkim(
                            EmailDomainRotateDkimResponse.Data.Dkim.builder()
                                .id("123e4567-e89b-12d3-a456-42661417400a")
                                .algorithm(
                                    EmailDomainRotateDkimResponse.Data.Dkim.Algorithm.RSA_SHA256
                                )
                                .keyLength(EmailDomainRotateDkimResponse.Data.Dkim.KeyLength._2048)
                                .selector("telnyx1")
                                .status(EmailDomainRotateDkimResponse.Data.Dkim.Status.ACTIVE)
                                .version(2L)
                                .activatedAt(OffsetDateTime.parse("2026-09-11T12:00:00Z"))
                                .build()
                        )
                        .addDnsRecord(
                            DnsRecord.builder()
                                .id("123e4567-e89b-12d3-a456-42661417400b")
                                .host("telnyx1._domainkey.example.com")
                                .purpose(DnsRecord.Purpose.DKIM)
                                .recordType(DnsRecord.RecordType.TXT)
                                .required(true)
                                .status(DnsRecord.Status.PENDING)
                                .value("v=DKIM1; k=rsa; p=MIIBIjANBgkqh...")
                                .actualValue(null)
                                .priority(null)
                                .build()
                        )
                        .domain("example.com")
                        .domainId("123e4567-e89b-12d3-a456-426614174002")
                        .oldSelectorRetained(false)
                        .previousDkimKey(
                            EmailDomainRotateDkimResponse.Data.PreviousDkimKey.builder()
                                .id("123e4567-e89b-12d3-a456-426614174009")
                                .selector("telnyx1")
                                .status(
                                    EmailDomainRotateDkimResponse.Data.PreviousDkimKey.Status
                                        .RETIRING
                                )
                                .version(1L)
                                .build()
                        )
                        .recordType(
                            EmailDomainRotateDkimResponse.Data.RecordType.EMAIL_DOMAIN_DKIM_ROTATION
                        )
                        .build()
                )
                .build()

        assertThat(emailDomainRotateDkimResponse.data())
            .isEqualTo(
                EmailDomainRotateDkimResponse.Data.builder()
                    .dkim(
                        EmailDomainRotateDkimResponse.Data.Dkim.builder()
                            .id("123e4567-e89b-12d3-a456-42661417400a")
                            .algorithm(EmailDomainRotateDkimResponse.Data.Dkim.Algorithm.RSA_SHA256)
                            .keyLength(EmailDomainRotateDkimResponse.Data.Dkim.KeyLength._2048)
                            .selector("telnyx1")
                            .status(EmailDomainRotateDkimResponse.Data.Dkim.Status.ACTIVE)
                            .version(2L)
                            .activatedAt(OffsetDateTime.parse("2026-09-11T12:00:00Z"))
                            .build()
                    )
                    .addDnsRecord(
                        DnsRecord.builder()
                            .id("123e4567-e89b-12d3-a456-42661417400b")
                            .host("telnyx1._domainkey.example.com")
                            .purpose(DnsRecord.Purpose.DKIM)
                            .recordType(DnsRecord.RecordType.TXT)
                            .required(true)
                            .status(DnsRecord.Status.PENDING)
                            .value("v=DKIM1; k=rsa; p=MIIBIjANBgkqh...")
                            .actualValue(null)
                            .priority(null)
                            .build()
                    )
                    .domain("example.com")
                    .domainId("123e4567-e89b-12d3-a456-426614174002")
                    .oldSelectorRetained(false)
                    .previousDkimKey(
                        EmailDomainRotateDkimResponse.Data.PreviousDkimKey.builder()
                            .id("123e4567-e89b-12d3-a456-426614174009")
                            .selector("telnyx1")
                            .status(
                                EmailDomainRotateDkimResponse.Data.PreviousDkimKey.Status.RETIRING
                            )
                            .version(1L)
                            .build()
                    )
                    .recordType(
                        EmailDomainRotateDkimResponse.Data.RecordType.EMAIL_DOMAIN_DKIM_ROTATION
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailDomainRotateDkimResponse =
            EmailDomainRotateDkimResponse.builder()
                .data(
                    EmailDomainRotateDkimResponse.Data.builder()
                        .dkim(
                            EmailDomainRotateDkimResponse.Data.Dkim.builder()
                                .id("123e4567-e89b-12d3-a456-42661417400a")
                                .algorithm(
                                    EmailDomainRotateDkimResponse.Data.Dkim.Algorithm.RSA_SHA256
                                )
                                .keyLength(EmailDomainRotateDkimResponse.Data.Dkim.KeyLength._2048)
                                .selector("telnyx1")
                                .status(EmailDomainRotateDkimResponse.Data.Dkim.Status.ACTIVE)
                                .version(2L)
                                .activatedAt(OffsetDateTime.parse("2026-09-11T12:00:00Z"))
                                .build()
                        )
                        .addDnsRecord(
                            DnsRecord.builder()
                                .id("123e4567-e89b-12d3-a456-42661417400b")
                                .host("telnyx1._domainkey.example.com")
                                .purpose(DnsRecord.Purpose.DKIM)
                                .recordType(DnsRecord.RecordType.TXT)
                                .required(true)
                                .status(DnsRecord.Status.PENDING)
                                .value("v=DKIM1; k=rsa; p=MIIBIjANBgkqh...")
                                .actualValue(null)
                                .priority(null)
                                .build()
                        )
                        .domain("example.com")
                        .domainId("123e4567-e89b-12d3-a456-426614174002")
                        .oldSelectorRetained(false)
                        .previousDkimKey(
                            EmailDomainRotateDkimResponse.Data.PreviousDkimKey.builder()
                                .id("123e4567-e89b-12d3-a456-426614174009")
                                .selector("telnyx1")
                                .status(
                                    EmailDomainRotateDkimResponse.Data.PreviousDkimKey.Status
                                        .RETIRING
                                )
                                .version(1L)
                                .build()
                        )
                        .recordType(
                            EmailDomainRotateDkimResponse.Data.RecordType.EMAIL_DOMAIN_DKIM_ROTATION
                        )
                        .build()
                )
                .build()

        val roundtrippedEmailDomainRotateDkimResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDomainRotateDkimResponse),
                jacksonTypeRef<EmailDomainRotateDkimResponse>(),
            )

        assertThat(roundtrippedEmailDomainRotateDkimResponse)
            .isEqualTo(emailDomainRotateDkimResponse)
    }
}
