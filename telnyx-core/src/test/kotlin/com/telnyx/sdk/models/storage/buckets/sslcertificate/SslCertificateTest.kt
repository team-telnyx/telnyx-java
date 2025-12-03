// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.sslcertificate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SslCertificateTest {

    @Test
    fun create() {
        val sslCertificate =
            SslCertificate.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .issuedBy(
                    SslCertificate.IssuedBy.builder()
                        .commonName("common_name")
                        .organization("organization")
                        .organizationUnit("organization_unit")
                        .build()
                )
                .issuedTo(
                    SslCertificate.IssuedTo.builder()
                        .commonName("common_name")
                        .organization("organization")
                        .organizationUnit("organization_unit")
                        .build()
                )
                .validFrom(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .validTo(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .build()

        assertThat(sslCertificate.id()).contains("id")
        assertThat(sslCertificate.createdAt())
            .contains(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
        assertThat(sslCertificate.issuedBy())
            .contains(
                SslCertificate.IssuedBy.builder()
                    .commonName("common_name")
                    .organization("organization")
                    .organizationUnit("organization_unit")
                    .build()
            )
        assertThat(sslCertificate.issuedTo())
            .contains(
                SslCertificate.IssuedTo.builder()
                    .commonName("common_name")
                    .organization("organization")
                    .organizationUnit("organization_unit")
                    .build()
            )
        assertThat(sslCertificate.validFrom())
            .contains(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
        assertThat(sslCertificate.validTo()).contains(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sslCertificate =
            SslCertificate.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .issuedBy(
                    SslCertificate.IssuedBy.builder()
                        .commonName("common_name")
                        .organization("organization")
                        .organizationUnit("organization_unit")
                        .build()
                )
                .issuedTo(
                    SslCertificate.IssuedTo.builder()
                        .commonName("common_name")
                        .organization("organization")
                        .organizationUnit("organization_unit")
                        .build()
                )
                .validFrom(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .validTo(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .build()

        val roundtrippedSslCertificate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sslCertificate),
                jacksonTypeRef<SslCertificate>(),
            )

        assertThat(roundtrippedSslCertificate).isEqualTo(sslCertificate)
    }
}
