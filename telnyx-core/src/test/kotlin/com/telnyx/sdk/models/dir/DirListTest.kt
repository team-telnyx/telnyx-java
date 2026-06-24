// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.callreasons.BrandedCallingPaginationMeta
import com.telnyx.sdk.models.dir.phonenumbers.RejectionReason
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirListTest {

    @Test
    fun create() {
        val dirList =
            DirList.builder()
                .addData(
                    Dir.builder()
                        .id("16635d38-75a6-4481-82e8-69af60e05011")
                        .authorizerEmail("sam@acmeplumbing.example.com")
                        .authorizerName("Sam Owner")
                        .addCallReason(
                            Dir.CallReason.builder()
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
                            Document.builder()
                                .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                                .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                                .description("Certificate of incorporation.")
                                .build()
                        )
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .expiringAt(OffsetDateTime.parse("2027-04-26T18:07:29.537981Z"))
                        .logoUrl("https://acmeplumbing.example.com/logo-256.bmp")
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRejectionReason(
                            RejectionReason.builder()
                                .code("documentation_incomplete")
                                .detail("Provided documents do not establish business identity.")
                                .message("Please re-upload a clearer scan of the certificate.")
                                .title("Documentation incomplete")
                                .build()
                        )
                        .reselling(false)
                        .status(DirStatus.DRAFT)
                        .submittedAt(OffsetDateTime.parse("2026-04-26T18:07:03.716411Z"))
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                        .verifiedAt(OffsetDateTime.parse("2026-04-26T18:07:29.537926Z"))
                        .build()
                )
                .meta(
                    BrandedCallingPaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(dirList.data())
            .containsExactly(
                Dir.builder()
                    .id("16635d38-75a6-4481-82e8-69af60e05011")
                    .authorizerEmail("sam@acmeplumbing.example.com")
                    .authorizerName("Sam Owner")
                    .addCallReason(
                        Dir.CallReason.builder()
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
                        Document.builder()
                            .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                            .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                            .description("Certificate of incorporation.")
                            .build()
                    )
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .expiringAt(OffsetDateTime.parse("2027-04-26T18:07:29.537981Z"))
                    .logoUrl("https://acmeplumbing.example.com/logo-256.bmp")
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addRejectionReason(
                        RejectionReason.builder()
                            .code("documentation_incomplete")
                            .detail("Provided documents do not establish business identity.")
                            .message("Please re-upload a clearer scan of the certificate.")
                            .title("Documentation incomplete")
                            .build()
                    )
                    .reselling(false)
                    .status(DirStatus.DRAFT)
                    .submittedAt(OffsetDateTime.parse("2026-04-26T18:07:03.716411Z"))
                    .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                    .verifiedAt(OffsetDateTime.parse("2026-04-26T18:07:29.537926Z"))
                    .build()
            )
        assertThat(dirList.meta())
            .isEqualTo(
                BrandedCallingPaginationMeta.builder()
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
        val dirList =
            DirList.builder()
                .addData(
                    Dir.builder()
                        .id("16635d38-75a6-4481-82e8-69af60e05011")
                        .authorizerEmail("sam@acmeplumbing.example.com")
                        .authorizerName("Sam Owner")
                        .addCallReason(
                            Dir.CallReason.builder()
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
                            Document.builder()
                                .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                                .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                                .description("Certificate of incorporation.")
                                .build()
                        )
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .expiringAt(OffsetDateTime.parse("2027-04-26T18:07:29.537981Z"))
                        .logoUrl("https://acmeplumbing.example.com/logo-256.bmp")
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRejectionReason(
                            RejectionReason.builder()
                                .code("documentation_incomplete")
                                .detail("Provided documents do not establish business identity.")
                                .message("Please re-upload a clearer scan of the certificate.")
                                .title("Documentation incomplete")
                                .build()
                        )
                        .reselling(false)
                        .status(DirStatus.DRAFT)
                        .submittedAt(OffsetDateTime.parse("2026-04-26T18:07:03.716411Z"))
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                        .verifiedAt(OffsetDateTime.parse("2026-04-26T18:07:29.537926Z"))
                        .build()
                )
                .meta(
                    BrandedCallingPaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedDirList =
            jsonMapper.readValue(jsonMapper.writeValueAsString(dirList), jacksonTypeRef<DirList>())

        assertThat(roundtrippedDirList).isEqualTo(dirList)
    }
}
