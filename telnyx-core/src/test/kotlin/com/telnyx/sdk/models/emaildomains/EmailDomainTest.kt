// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainTest {

    @Test
    fun create() {
        val emailDomain =
            EmailDomain.builder()
                .id("123e4567-e89b-12d3-a456-426614174000")
                .createdAt(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                .dkim(
                    EmailDomain.Dkim.builder()
                        .active(false)
                        .algorithm(null)
                        .keyLength(null)
                        .rotatedAt(null)
                        .selector(null)
                        .build()
                )
                .dmarcPolicy(
                    EmailDmarcPolicy.builder()
                        .p(EmailDmarcPolicy.P.NONE)
                        .pct(100L)
                        .rua("mailto:dmarc@telnyx.com")
                        .sp(EmailDmarcPolicy.Sp.NONE)
                        .build()
                )
                .addDnsRecord(
                    DnsRecord.builder()
                        .id("123e4567-e89b-12d3-a456-426614174001")
                        .host("_telnyx-email.example.com")
                        .purpose(DnsRecord.Purpose.OWNERSHIP)
                        .recordType(DnsRecord.RecordType.TXT)
                        .required(true)
                        .status(DnsRecord.Status.PENDING)
                        .value("telnyx-domain-verification=abc123")
                        .actualValue(null)
                        .priority(null)
                        .build()
                )
                .domain("example.com")
                .inbound(
                    EmailDomain.Inbound.builder()
                        .catchAll(false)
                        .enabled(false)
                        .mxRequired(false)
                        .build()
                )
                .recordType(EmailDomain.RecordType.EMAIL_DOMAIN)
                .status(EmailDomainStatus.PENDING)
                .tracking(
                    DomainsTrackingSettings.builder()
                        .clickTracking(false)
                        .openTracking(false)
                        .unsubscribeTracking(false)
                        .build()
                )
                .type(EmailDomainType.CUSTOM)
                .updatedAt(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                .usableForInbound(false)
                .usableForSending(false)
                .verification(
                    EmailDomainVerification.builder()
                        .dkim(EmailDomainVerification.Dkim.PENDING)
                        .dmarc(EmailDomainVerification.Dmarc.MISSING_OPTIONAL)
                        .mx(EmailDomainVerification.Mx.NOT_REQUIRED)
                        .ownership(EmailDomainVerification.Ownership.PENDING)
                        .spf(EmailDomainVerification.Spf.MISSING_OPTIONAL)
                        .build()
                )
                .reputation(
                    EmailDomain.Reputation.builder()
                        .band("band")
                        .breakdown(
                            EmailDomain.Reputation.Breakdown.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .computedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .verifiedAt(null)
                .build()

        assertThat(emailDomain.id()).isEqualTo("123e4567-e89b-12d3-a456-426614174000")
        assertThat(emailDomain.createdAt()).isEqualTo(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
        assertThat(emailDomain.dkim())
            .isEqualTo(
                EmailDomain.Dkim.builder()
                    .active(false)
                    .algorithm(null)
                    .keyLength(null)
                    .rotatedAt(null)
                    .selector(null)
                    .build()
            )
        assertThat(emailDomain.dmarcPolicy())
            .contains(
                EmailDmarcPolicy.builder()
                    .p(EmailDmarcPolicy.P.NONE)
                    .pct(100L)
                    .rua("mailto:dmarc@telnyx.com")
                    .sp(EmailDmarcPolicy.Sp.NONE)
                    .build()
            )
        assertThat(emailDomain.dnsRecords())
            .containsExactly(
                DnsRecord.builder()
                    .id("123e4567-e89b-12d3-a456-426614174001")
                    .host("_telnyx-email.example.com")
                    .purpose(DnsRecord.Purpose.OWNERSHIP)
                    .recordType(DnsRecord.RecordType.TXT)
                    .required(true)
                    .status(DnsRecord.Status.PENDING)
                    .value("telnyx-domain-verification=abc123")
                    .actualValue(null)
                    .priority(null)
                    .build()
            )
        assertThat(emailDomain.domain()).isEqualTo("example.com")
        assertThat(emailDomain.inbound())
            .isEqualTo(
                EmailDomain.Inbound.builder()
                    .catchAll(false)
                    .enabled(false)
                    .mxRequired(false)
                    .build()
            )
        assertThat(emailDomain.recordType()).isEqualTo(EmailDomain.RecordType.EMAIL_DOMAIN)
        assertThat(emailDomain.status()).isEqualTo(EmailDomainStatus.PENDING)
        assertThat(emailDomain.tracking())
            .isEqualTo(
                DomainsTrackingSettings.builder()
                    .clickTracking(false)
                    .openTracking(false)
                    .unsubscribeTracking(false)
                    .build()
            )
        assertThat(emailDomain.type()).isEqualTo(EmailDomainType.CUSTOM)
        assertThat(emailDomain.updatedAt()).isEqualTo(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
        assertThat(emailDomain.usableForInbound()).isEqualTo(false)
        assertThat(emailDomain.usableForSending()).isEqualTo(false)
        assertThat(emailDomain.verification())
            .isEqualTo(
                EmailDomainVerification.builder()
                    .dkim(EmailDomainVerification.Dkim.PENDING)
                    .dmarc(EmailDomainVerification.Dmarc.MISSING_OPTIONAL)
                    .mx(EmailDomainVerification.Mx.NOT_REQUIRED)
                    .ownership(EmailDomainVerification.Ownership.PENDING)
                    .spf(EmailDomainVerification.Spf.MISSING_OPTIONAL)
                    .build()
            )
        assertThat(emailDomain.reputation())
            .contains(
                EmailDomain.Reputation.builder()
                    .band("band")
                    .breakdown(
                        EmailDomain.Reputation.Breakdown.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .computedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(emailDomain.verifiedAt()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailDomain =
            EmailDomain.builder()
                .id("123e4567-e89b-12d3-a456-426614174000")
                .createdAt(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                .dkim(
                    EmailDomain.Dkim.builder()
                        .active(false)
                        .algorithm(null)
                        .keyLength(null)
                        .rotatedAt(null)
                        .selector(null)
                        .build()
                )
                .dmarcPolicy(
                    EmailDmarcPolicy.builder()
                        .p(EmailDmarcPolicy.P.NONE)
                        .pct(100L)
                        .rua("mailto:dmarc@telnyx.com")
                        .sp(EmailDmarcPolicy.Sp.NONE)
                        .build()
                )
                .addDnsRecord(
                    DnsRecord.builder()
                        .id("123e4567-e89b-12d3-a456-426614174001")
                        .host("_telnyx-email.example.com")
                        .purpose(DnsRecord.Purpose.OWNERSHIP)
                        .recordType(DnsRecord.RecordType.TXT)
                        .required(true)
                        .status(DnsRecord.Status.PENDING)
                        .value("telnyx-domain-verification=abc123")
                        .actualValue(null)
                        .priority(null)
                        .build()
                )
                .domain("example.com")
                .inbound(
                    EmailDomain.Inbound.builder()
                        .catchAll(false)
                        .enabled(false)
                        .mxRequired(false)
                        .build()
                )
                .recordType(EmailDomain.RecordType.EMAIL_DOMAIN)
                .status(EmailDomainStatus.PENDING)
                .tracking(
                    DomainsTrackingSettings.builder()
                        .clickTracking(false)
                        .openTracking(false)
                        .unsubscribeTracking(false)
                        .build()
                )
                .type(EmailDomainType.CUSTOM)
                .updatedAt(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                .usableForInbound(false)
                .usableForSending(false)
                .verification(
                    EmailDomainVerification.builder()
                        .dkim(EmailDomainVerification.Dkim.PENDING)
                        .dmarc(EmailDomainVerification.Dmarc.MISSING_OPTIONAL)
                        .mx(EmailDomainVerification.Mx.NOT_REQUIRED)
                        .ownership(EmailDomainVerification.Ownership.PENDING)
                        .spf(EmailDomainVerification.Spf.MISSING_OPTIONAL)
                        .build()
                )
                .reputation(
                    EmailDomain.Reputation.builder()
                        .band("band")
                        .breakdown(
                            EmailDomain.Reputation.Breakdown.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .computedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .verifiedAt(null)
                .build()

        val roundtrippedEmailDomain =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDomain),
                jacksonTypeRef<EmailDomain>(),
            )

        assertThat(roundtrippedEmailDomain).isEqualTo(emailDomain)
    }
}
