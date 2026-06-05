// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.dir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirListPageResponseTest {

    @Test
    fun create() {
        val dirListPageResponse =
            DirListPageResponse.builder()
                .addData(
                    DirListResponse.builder()
                        .id("16635d38-75a6-4481-82e8-69af60e05011")
                        .authorizerEmail("sam@acmeplumbing.example.com")
                        .authorizerName("Sam Owner")
                        .addCallReason(
                            DirListResponse.CallReason.builder()
                                .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                                .reason("Appointment reminders")
                                .build()
                        )
                        .certifyBrandIsAccurate(true)
                        .certifyIpOwnership(true)
                        .certifyNoShaftContent(true)
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                        .displayName("Acme Plumbing")
                        .addDocument(
                            DirListResponse.Document.builder()
                                .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                                .documentType(
                                    DirListResponse.Document.DocumentType.BUSINESS_REGISTRATION
                                )
                                .description("Certificate of incorporation.")
                                .build()
                        )
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .expiringAt(OffsetDateTime.parse("2027-04-26T18:07:29.537981Z"))
                        .logoUrl("https://acmeplumbing.example.com/logo-256.bmp")
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRejectionReason(
                            DirListResponse.RejectionReason.builder()
                                .code("documentation_incomplete")
                                .detail("Provided documents do not establish business identity.")
                                .message("Please re-upload a clearer scan of the certificate.")
                                .title("Documentation incomplete")
                                .build()
                        )
                        .reselling(false)
                        .status(DirListResponse.Status.DRAFT)
                        .submittedAt(OffsetDateTime.parse("2026-04-26T18:07:03.716411Z"))
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                        .verifiedAt(OffsetDateTime.parse("2026-04-26T18:07:29.537926Z"))
                        .build()
                )
                .meta(
                    DirListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(dirListPageResponse.data())
            .containsExactly(
                DirListResponse.builder()
                    .id("16635d38-75a6-4481-82e8-69af60e05011")
                    .authorizerEmail("sam@acmeplumbing.example.com")
                    .authorizerName("Sam Owner")
                    .addCallReason(
                        DirListResponse.CallReason.builder()
                            .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                            .reason("Appointment reminders")
                            .build()
                    )
                    .certifyBrandIsAccurate(true)
                    .certifyIpOwnership(true)
                    .certifyNoShaftContent(true)
                    .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                    .displayName("Acme Plumbing")
                    .addDocument(
                        DirListResponse.Document.builder()
                            .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                            .documentType(
                                DirListResponse.Document.DocumentType.BUSINESS_REGISTRATION
                            )
                            .description("Certificate of incorporation.")
                            .build()
                    )
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .expiringAt(OffsetDateTime.parse("2027-04-26T18:07:29.537981Z"))
                    .logoUrl("https://acmeplumbing.example.com/logo-256.bmp")
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addRejectionReason(
                        DirListResponse.RejectionReason.builder()
                            .code("documentation_incomplete")
                            .detail("Provided documents do not establish business identity.")
                            .message("Please re-upload a clearer scan of the certificate.")
                            .title("Documentation incomplete")
                            .build()
                    )
                    .reselling(false)
                    .status(DirListResponse.Status.DRAFT)
                    .submittedAt(OffsetDateTime.parse("2026-04-26T18:07:03.716411Z"))
                    .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                    .verifiedAt(OffsetDateTime.parse("2026-04-26T18:07:29.537926Z"))
                    .build()
            )
        assertThat(dirListPageResponse.meta())
            .isEqualTo(
                DirListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(3L)
                    .totalResults(42L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dirListPageResponse =
            DirListPageResponse.builder()
                .addData(
                    DirListResponse.builder()
                        .id("16635d38-75a6-4481-82e8-69af60e05011")
                        .authorizerEmail("sam@acmeplumbing.example.com")
                        .authorizerName("Sam Owner")
                        .addCallReason(
                            DirListResponse.CallReason.builder()
                                .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                                .reason("Appointment reminders")
                                .build()
                        )
                        .certifyBrandIsAccurate(true)
                        .certifyIpOwnership(true)
                        .certifyNoShaftContent(true)
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                        .displayName("Acme Plumbing")
                        .addDocument(
                            DirListResponse.Document.builder()
                                .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                                .documentType(
                                    DirListResponse.Document.DocumentType.BUSINESS_REGISTRATION
                                )
                                .description("Certificate of incorporation.")
                                .build()
                        )
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .expiringAt(OffsetDateTime.parse("2027-04-26T18:07:29.537981Z"))
                        .logoUrl("https://acmeplumbing.example.com/logo-256.bmp")
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRejectionReason(
                            DirListResponse.RejectionReason.builder()
                                .code("documentation_incomplete")
                                .detail("Provided documents do not establish business identity.")
                                .message("Please re-upload a clearer scan of the certificate.")
                                .title("Documentation incomplete")
                                .build()
                        )
                        .reselling(false)
                        .status(DirListResponse.Status.DRAFT)
                        .submittedAt(OffsetDateTime.parse("2026-04-26T18:07:03.716411Z"))
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                        .verifiedAt(OffsetDateTime.parse("2026-04-26T18:07:29.537926Z"))
                        .build()
                )
                .meta(
                    DirListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedDirListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dirListPageResponse),
                jacksonTypeRef<DirListPageResponse>(),
            )

        assertThat(roundtrippedDirListPageResponse).isEqualTo(dirListPageResponse)
    }
}
