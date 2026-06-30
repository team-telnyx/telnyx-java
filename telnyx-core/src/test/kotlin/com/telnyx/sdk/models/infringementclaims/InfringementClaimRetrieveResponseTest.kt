// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.infringementclaims

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfringementClaimRetrieveResponseTest {

    @Test
    fun create() {
        val infringementClaimRetrieveResponse =
            InfringementClaimRetrieveResponse.builder()
                .data(
                    InfringementClaimRetrieveResponse.Data.builder()
                        .id("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                        .claimDate(OffsetDateTime.parse("2026-04-22T02:12:54Z"))
                        .claimDescription("Alleged infringement on trademark XYZ.")
                        .claimType(InfringementClaimRetrieveResponse.Data.ClaimType.TRADEMARK)
                        .claimantContact("legal@testclaimant.example.com")
                        .claimantName("Test Claimant LLC")
                        .addContestDocument(
                            InfringementClaimRetrieveResponse.Data.ContestDocument.builder()
                                .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                                .documentType(
                                    InfringementClaimRetrieveResponse.Data.ContestDocument
                                        .DocumentType
                                        .BUSINESS_REGISTRATION
                                )
                                .description("Certificate of incorporation.")
                                .build()
                        )
                        .addContestHistory(
                            InfringementClaimRetrieveResponse.Data.ContestHistory.builder()
                                .documentCount(1L)
                                .notes(
                                    "We own the trademark outright; our registration precedes the claimant by three years."
                                )
                                .submittedAt(OffsetDateTime.parse("2026-04-22T02:13:06.629473Z"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2026-04-22T02:12:55.908411Z"))
                        .dir(
                            InfringementClaimRetrieveResponse.Data.Dir.builder()
                                .id("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                                .displayName("Acme Plumbing")
                                .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                                .status(InfringementClaimRetrieveResponse.Data.Dir.Status.DRAFT)
                                .build()
                        )
                        .dirId("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                        .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                        .resolution(InfringementClaimRetrieveResponse.Data.Resolution.UPHELD)
                        .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .resolutionNotes("resolution_notes")
                        .status(InfringementClaimRetrieveResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2026-04-22T02:12:55.908417Z"))
                        .build()
                )
                .build()

        assertThat(infringementClaimRetrieveResponse.data())
            .isEqualTo(
                InfringementClaimRetrieveResponse.Data.builder()
                    .id("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                    .claimDate(OffsetDateTime.parse("2026-04-22T02:12:54Z"))
                    .claimDescription("Alleged infringement on trademark XYZ.")
                    .claimType(InfringementClaimRetrieveResponse.Data.ClaimType.TRADEMARK)
                    .claimantContact("legal@testclaimant.example.com")
                    .claimantName("Test Claimant LLC")
                    .addContestDocument(
                        InfringementClaimRetrieveResponse.Data.ContestDocument.builder()
                            .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                            .documentType(
                                InfringementClaimRetrieveResponse.Data.ContestDocument.DocumentType
                                    .BUSINESS_REGISTRATION
                            )
                            .description("Certificate of incorporation.")
                            .build()
                    )
                    .addContestHistory(
                        InfringementClaimRetrieveResponse.Data.ContestHistory.builder()
                            .documentCount(1L)
                            .notes(
                                "We own the trademark outright; our registration precedes the claimant by three years."
                            )
                            .submittedAt(OffsetDateTime.parse("2026-04-22T02:13:06.629473Z"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2026-04-22T02:12:55.908411Z"))
                    .dir(
                        InfringementClaimRetrieveResponse.Data.Dir.builder()
                            .id("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                            .displayName("Acme Plumbing")
                            .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                            .status(InfringementClaimRetrieveResponse.Data.Dir.Status.DRAFT)
                            .build()
                    )
                    .dirId("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                    .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                    .resolution(InfringementClaimRetrieveResponse.Data.Resolution.UPHELD)
                    .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .resolutionNotes("resolution_notes")
                    .status(InfringementClaimRetrieveResponse.Data.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2026-04-22T02:12:55.908417Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val infringementClaimRetrieveResponse =
            InfringementClaimRetrieveResponse.builder()
                .data(
                    InfringementClaimRetrieveResponse.Data.builder()
                        .id("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                        .claimDate(OffsetDateTime.parse("2026-04-22T02:12:54Z"))
                        .claimDescription("Alleged infringement on trademark XYZ.")
                        .claimType(InfringementClaimRetrieveResponse.Data.ClaimType.TRADEMARK)
                        .claimantContact("legal@testclaimant.example.com")
                        .claimantName("Test Claimant LLC")
                        .addContestDocument(
                            InfringementClaimRetrieveResponse.Data.ContestDocument.builder()
                                .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                                .documentType(
                                    InfringementClaimRetrieveResponse.Data.ContestDocument
                                        .DocumentType
                                        .BUSINESS_REGISTRATION
                                )
                                .description("Certificate of incorporation.")
                                .build()
                        )
                        .addContestHistory(
                            InfringementClaimRetrieveResponse.Data.ContestHistory.builder()
                                .documentCount(1L)
                                .notes(
                                    "We own the trademark outright; our registration precedes the claimant by three years."
                                )
                                .submittedAt(OffsetDateTime.parse("2026-04-22T02:13:06.629473Z"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2026-04-22T02:12:55.908411Z"))
                        .dir(
                            InfringementClaimRetrieveResponse.Data.Dir.builder()
                                .id("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                                .displayName("Acme Plumbing")
                                .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                                .status(InfringementClaimRetrieveResponse.Data.Dir.Status.DRAFT)
                                .build()
                        )
                        .dirId("42a3f554-7ce3-44c2-bfe9-6e1afe0d7991")
                        .enterpriseId("7eca8226-8081-4e11-abdc-437b5f53a81f")
                        .resolution(InfringementClaimRetrieveResponse.Data.Resolution.UPHELD)
                        .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .resolutionNotes("resolution_notes")
                        .status(InfringementClaimRetrieveResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2026-04-22T02:12:55.908417Z"))
                        .build()
                )
                .build()

        val roundtrippedInfringementClaimRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(infringementClaimRetrieveResponse),
                jacksonTypeRef<InfringementClaimRetrieveResponse>(),
            )

        assertThat(roundtrippedInfringementClaimRetrieveResponse)
            .isEqualTo(infringementClaimRetrieveResponse)
    }
}
