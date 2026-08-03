// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DnsRecordTest {

    @Test
    fun create() {
        val dnsRecord =
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

        assertThat(dnsRecord.id()).isEqualTo("123e4567-e89b-12d3-a456-426614174001")
        assertThat(dnsRecord.host()).isEqualTo("_telnyx-email.example.com")
        assertThat(dnsRecord.purpose()).isEqualTo(DnsRecord.Purpose.OWNERSHIP)
        assertThat(dnsRecord.recordType()).isEqualTo(DnsRecord.RecordType.TXT)
        assertThat(dnsRecord.required()).isEqualTo(true)
        assertThat(dnsRecord.status()).isEqualTo(DnsRecord.Status.PENDING)
        assertThat(dnsRecord.value()).isEqualTo("telnyx-domain-verification=abc123")
        assertThat(dnsRecord.actualValue()).isEmpty
        assertThat(dnsRecord.priority()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dnsRecord =
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

        val roundtrippedDnsRecord =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dnsRecord),
                jacksonTypeRef<DnsRecord>(),
            )

        assertThat(roundtrippedDnsRecord).isEqualTo(dnsRecord)
    }
}
