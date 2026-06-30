// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.callreasons.BrandedCallingPaginationMeta
import com.telnyx.sdk.models.infringementclaims.InfringementClaim
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirRetrieveInfringementClaimsResponseTest {

    @Test
    fun create() {
        val dirRetrieveInfringementClaimsResponse =
            DirRetrieveInfringementClaimsResponse.builder()
                .addData(
                    InfringementClaim.builder()
                        .id("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                        .claimDate(OffsetDateTime.parse("2026-04-22T02:12:54Z"))
                        .claimDescription("Alleged infringement on trademark XYZ.")
                        .claimType(InfringementClaim.ClaimType.TRADEMARK)
                        .claimantContact("legal@testclaimant.example.com")
                        .claimantName("Test Claimant LLC")
                        .addContestDocument(
                            Document.builder()
                                .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                                .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                                .description("Certificate of incorporation.")
                                .build()
                        )
                        .addContestHistory(
                            InfringementClaim.ContestHistory.builder()
                                .documentCount(1L)
                                .notes(
                                    "We own the trademark outright; our registration precedes the claimant by three years."
                                )
                                .submittedAt(OffsetDateTime.parse("2026-04-22T02:13:06.629473Z"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2026-04-22T02:12:55.908411Z"))
                        .dir(
                            InfringementClaim.Dir.builder()
                                .id("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                                .displayName("Acme Plumbing")
                                .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                                .status(DirStatus.DRAFT)
                                .build()
                        )
                        .dirId("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                        .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                        .resolution(InfringementClaim.Resolution.UPHELD)
                        .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .resolutionNotes("resolution_notes")
                        .status(InfringementClaim.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2026-04-22T02:12:55.908417Z"))
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

        assertThat(dirRetrieveInfringementClaimsResponse.data())
            .containsExactly(
                InfringementClaim.builder()
                    .id("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                    .claimDate(OffsetDateTime.parse("2026-04-22T02:12:54Z"))
                    .claimDescription("Alleged infringement on trademark XYZ.")
                    .claimType(InfringementClaim.ClaimType.TRADEMARK)
                    .claimantContact("legal@testclaimant.example.com")
                    .claimantName("Test Claimant LLC")
                    .addContestDocument(
                        Document.builder()
                            .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                            .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                            .description("Certificate of incorporation.")
                            .build()
                    )
                    .addContestHistory(
                        InfringementClaim.ContestHistory.builder()
                            .documentCount(1L)
                            .notes(
                                "We own the trademark outright; our registration precedes the claimant by three years."
                            )
                            .submittedAt(OffsetDateTime.parse("2026-04-22T02:13:06.629473Z"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2026-04-22T02:12:55.908411Z"))
                    .dir(
                        InfringementClaim.Dir.builder()
                            .id("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                            .displayName("Acme Plumbing")
                            .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                            .status(DirStatus.DRAFT)
                            .build()
                    )
                    .dirId("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                    .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                    .resolution(InfringementClaim.Resolution.UPHELD)
                    .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .resolutionNotes("resolution_notes")
                    .status(InfringementClaim.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2026-04-22T02:12:55.908417Z"))
                    .build()
            )
        assertThat(dirRetrieveInfringementClaimsResponse.meta())
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
        val dirRetrieveInfringementClaimsResponse =
            DirRetrieveInfringementClaimsResponse.builder()
                .addData(
                    InfringementClaim.builder()
                        .id("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                        .claimDate(OffsetDateTime.parse("2026-04-22T02:12:54Z"))
                        .claimDescription("Alleged infringement on trademark XYZ.")
                        .claimType(InfringementClaim.ClaimType.TRADEMARK)
                        .claimantContact("legal@testclaimant.example.com")
                        .claimantName("Test Claimant LLC")
                        .addContestDocument(
                            Document.builder()
                                .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                                .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                                .description("Certificate of incorporation.")
                                .build()
                        )
                        .addContestHistory(
                            InfringementClaim.ContestHistory.builder()
                                .documentCount(1L)
                                .notes(
                                    "We own the trademark outright; our registration precedes the claimant by three years."
                                )
                                .submittedAt(OffsetDateTime.parse("2026-04-22T02:13:06.629473Z"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2026-04-22T02:12:55.908411Z"))
                        .dir(
                            InfringementClaim.Dir.builder()
                                .id("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                                .displayName("Acme Plumbing")
                                .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                                .status(DirStatus.DRAFT)
                                .build()
                        )
                        .dirId("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                        .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                        .resolution(InfringementClaim.Resolution.UPHELD)
                        .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .resolutionNotes("resolution_notes")
                        .status(InfringementClaim.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2026-04-22T02:12:55.908417Z"))
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

        val roundtrippedDirRetrieveInfringementClaimsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dirRetrieveInfringementClaimsResponse),
                jacksonTypeRef<DirRetrieveInfringementClaimsResponse>(),
            )

        assertThat(roundtrippedDirRetrieveInfringementClaimsResponse)
            .isEqualTo(dirRetrieveInfringementClaimsResponse)
    }
}
