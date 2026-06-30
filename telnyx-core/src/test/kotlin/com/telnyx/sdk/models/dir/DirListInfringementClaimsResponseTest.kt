// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirListInfringementClaimsResponseTest {

    @Test
    fun create() {
        val dirListInfringementClaimsResponse =
            DirListInfringementClaimsResponse.builder()
                .id("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                .claimDate(OffsetDateTime.parse("2026-04-22T02:12:54Z"))
                .claimDescription("Alleged infringement on trademark XYZ.")
                .claimType(DirListInfringementClaimsResponse.ClaimType.TRADEMARK)
                .claimantContact("legal@testclaimant.example.com")
                .claimantName("Test Claimant LLC")
                .addContestDocument(
                    DirListInfringementClaimsResponse.ContestDocument.builder()
                        .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .documentType(
                            DirListInfringementClaimsResponse.ContestDocument.DocumentType
                                .BUSINESS_REGISTRATION
                        )
                        .description("Certificate of incorporation.")
                        .build()
                )
                .addContestHistory(
                    DirListInfringementClaimsResponse.ContestHistory.builder()
                        .documentCount(1L)
                        .notes(
                            "We own the trademark outright; our registration precedes the claimant by three years."
                        )
                        .submittedAt(OffsetDateTime.parse("2026-04-22T02:13:06.629473Z"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2026-04-22T02:12:55.908411Z"))
                .dir(
                    DirListInfringementClaimsResponse.Dir.builder()
                        .id("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                        .displayName("Acme Plumbing")
                        .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                        .status(DirListInfringementClaimsResponse.Dir.Status.DRAFT)
                        .build()
                )
                .dirId("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                .resolution(DirListInfringementClaimsResponse.Resolution.UPHELD)
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNotes("resolution_notes")
                .status(DirListInfringementClaimsResponse.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2026-04-22T02:12:55.908417Z"))
                .build()

        assertThat(dirListInfringementClaimsResponse.id())
            .contains("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
        assertThat(dirListInfringementClaimsResponse.claimDate())
            .contains(OffsetDateTime.parse("2026-04-22T02:12:54Z"))
        assertThat(dirListInfringementClaimsResponse.claimDescription())
            .contains("Alleged infringement on trademark XYZ.")
        assertThat(dirListInfringementClaimsResponse.claimType())
            .contains(DirListInfringementClaimsResponse.ClaimType.TRADEMARK)
        assertThat(dirListInfringementClaimsResponse.claimantContact())
            .contains("legal@testclaimant.example.com")
        assertThat(dirListInfringementClaimsResponse.claimantName()).contains("Test Claimant LLC")
        assertThat(dirListInfringementClaimsResponse.contestDocuments().getOrNull())
            .containsExactly(
                DirListInfringementClaimsResponse.ContestDocument.builder()
                    .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .documentType(
                        DirListInfringementClaimsResponse.ContestDocument.DocumentType
                            .BUSINESS_REGISTRATION
                    )
                    .description("Certificate of incorporation.")
                    .build()
            )
        assertThat(dirListInfringementClaimsResponse.contestHistory().getOrNull())
            .containsExactly(
                DirListInfringementClaimsResponse.ContestHistory.builder()
                    .documentCount(1L)
                    .notes(
                        "We own the trademark outright; our registration precedes the claimant by three years."
                    )
                    .submittedAt(OffsetDateTime.parse("2026-04-22T02:13:06.629473Z"))
                    .build()
            )
        assertThat(dirListInfringementClaimsResponse.createdAt())
            .contains(OffsetDateTime.parse("2026-04-22T02:12:55.908411Z"))
        assertThat(dirListInfringementClaimsResponse.dir())
            .contains(
                DirListInfringementClaimsResponse.Dir.builder()
                    .id("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                    .displayName("Acme Plumbing")
                    .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                    .status(DirListInfringementClaimsResponse.Dir.Status.DRAFT)
                    .build()
            )
        assertThat(dirListInfringementClaimsResponse.dirId())
            .contains("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
        assertThat(dirListInfringementClaimsResponse.enterpriseId())
            .contains("7eca8226-8081-4e11-abdc-437b5f53a81f")
        assertThat(dirListInfringementClaimsResponse.resolution())
            .contains(DirListInfringementClaimsResponse.Resolution.UPHELD)
        assertThat(dirListInfringementClaimsResponse.resolutionDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dirListInfringementClaimsResponse.resolutionNotes()).contains("resolution_notes")
        assertThat(dirListInfringementClaimsResponse.status())
            .contains(DirListInfringementClaimsResponse.Status.PENDING)
        assertThat(dirListInfringementClaimsResponse.updatedAt())
            .contains(OffsetDateTime.parse("2026-04-22T02:12:55.908417Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dirListInfringementClaimsResponse =
            DirListInfringementClaimsResponse.builder()
                .id("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                .claimDate(OffsetDateTime.parse("2026-04-22T02:12:54Z"))
                .claimDescription("Alleged infringement on trademark XYZ.")
                .claimType(DirListInfringementClaimsResponse.ClaimType.TRADEMARK)
                .claimantContact("legal@testclaimant.example.com")
                .claimantName("Test Claimant LLC")
                .addContestDocument(
                    DirListInfringementClaimsResponse.ContestDocument.builder()
                        .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .documentType(
                            DirListInfringementClaimsResponse.ContestDocument.DocumentType
                                .BUSINESS_REGISTRATION
                        )
                        .description("Certificate of incorporation.")
                        .build()
                )
                .addContestHistory(
                    DirListInfringementClaimsResponse.ContestHistory.builder()
                        .documentCount(1L)
                        .notes(
                            "We own the trademark outright; our registration precedes the claimant by three years."
                        )
                        .submittedAt(OffsetDateTime.parse("2026-04-22T02:13:06.629473Z"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2026-04-22T02:12:55.908411Z"))
                .dir(
                    DirListInfringementClaimsResponse.Dir.builder()
                        .id("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                        .displayName("Acme Plumbing")
                        .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                        .status(DirListInfringementClaimsResponse.Dir.Status.DRAFT)
                        .build()
                )
                .dirId("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                .resolution(DirListInfringementClaimsResponse.Resolution.UPHELD)
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNotes("resolution_notes")
                .status(DirListInfringementClaimsResponse.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2026-04-22T02:12:55.908417Z"))
                .build()

        val roundtrippedDirListInfringementClaimsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dirListInfringementClaimsResponse),
                jacksonTypeRef<DirListInfringementClaimsResponse>(),
            )

        assertThat(roundtrippedDirListInfringementClaimsResponse)
            .isEqualTo(dirListInfringementClaimsResponse)
    }
}
