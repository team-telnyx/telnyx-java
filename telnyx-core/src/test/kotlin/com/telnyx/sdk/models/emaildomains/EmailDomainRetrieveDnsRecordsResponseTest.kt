// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainRetrieveDnsRecordsResponseTest {

    @Test
    fun create() {
        val emailDomainRetrieveDnsRecordsResponse =
            EmailDomainRetrieveDnsRecordsResponse.builder()
                .addData(
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
                .build()

        assertThat(emailDomainRetrieveDnsRecordsResponse.data())
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailDomainRetrieveDnsRecordsResponse =
            EmailDomainRetrieveDnsRecordsResponse.builder()
                .addData(
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
                .build()

        val roundtrippedEmailDomainRetrieveDnsRecordsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDomainRetrieveDnsRecordsResponse),
                jacksonTypeRef<EmailDomainRetrieveDnsRecordsResponse>(),
            )

        assertThat(roundtrippedEmailDomainRetrieveDnsRecordsResponse)
            .isEqualTo(emailDomainRetrieveDnsRecordsResponse)
    }
}
