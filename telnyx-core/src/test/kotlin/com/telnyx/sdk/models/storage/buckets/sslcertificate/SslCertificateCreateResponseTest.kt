// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.sslcertificate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SslCertificateCreateResponseTest {

    @Test
    fun create() {
        val sslCertificateCreateResponse =
            SslCertificateCreateResponse.builder()
                .data(
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
                )
                .build()

        assertThat(sslCertificateCreateResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sslCertificateCreateResponse =
            SslCertificateCreateResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedSslCertificateCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sslCertificateCreateResponse),
                jacksonTypeRef<SslCertificateCreateResponse>(),
            )

        assertThat(roundtrippedSslCertificateCreateResponse).isEqualTo(sslCertificateCreateResponse)
    }
}
