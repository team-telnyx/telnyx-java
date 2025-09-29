// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.buckets.sslcertificate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SslCertificateTest {

    @Test
    fun create() {
        val sslCertificate =
            SslCertificate.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .validFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .validTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(sslCertificate.id()).contains("id")
        assertThat(sslCertificate.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sslCertificate.validTo())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sslCertificate =
            SslCertificate.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .validFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .validTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSslCertificate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sslCertificate),
                jacksonTypeRef<SslCertificate>(),
            )

        assertThat(roundtrippedSslCertificate).isEqualTo(sslCertificate)
    }
}
