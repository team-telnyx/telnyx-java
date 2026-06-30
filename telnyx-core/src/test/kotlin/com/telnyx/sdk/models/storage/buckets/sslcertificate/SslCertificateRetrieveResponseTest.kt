// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.sslcertificate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SslCertificateRetrieveResponseTest {

    @Test
    fun create() {
        val sslCertificateRetrieveResponse =
            SslCertificateRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(sslCertificateRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sslCertificateRetrieveResponse =
            SslCertificateRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedSslCertificateRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sslCertificateRetrieveResponse),
                jacksonTypeRef<SslCertificateRetrieveResponse>(),
            )

        assertThat(roundtrippedSslCertificateRetrieveResponse)
            .isEqualTo(sslCertificateRetrieveResponse)
    }
}
