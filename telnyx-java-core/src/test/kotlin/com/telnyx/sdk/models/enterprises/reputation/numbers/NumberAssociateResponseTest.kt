// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ReputationData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberAssociateResponseTest {

    @Test
    fun create() {
        val numberAssociateResponse =
            NumberAssociateResponse.builder()
                .addData(
                    NumberAssociateResponse.Data.builder()
                        .id("8a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .phoneNumber("+19493253498")
                        .reputationData(
                            ReputationData.builder()
                                .connectionScore(80L)
                                .engagementScore(64L)
                                .lastRefreshedAt(
                                    OffsetDateTime.parse("2026-04-26T18:09:24.785211Z")
                                )
                                .maturityScore(72L)
                                .sentimentScore(75L)
                                .spamCategory(null)
                                .spamRisk(ReputationData.SpamRisk.LOW)
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                        .build()
                )
                .meta(
                    NumberAssociateResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(numberAssociateResponse.data())
            .containsExactly(
                NumberAssociateResponse.Data.builder()
                    .id("8a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
                    .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .phoneNumber("+19493253498")
                    .reputationData(
                        ReputationData.builder()
                            .connectionScore(80L)
                            .engagementScore(64L)
                            .lastRefreshedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                            .maturityScore(72L)
                            .sentimentScore(75L)
                            .spamCategory(null)
                            .spamRisk(ReputationData.SpamRisk.LOW)
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                    .build()
            )
        assertThat(numberAssociateResponse.meta())
            .isEqualTo(
                NumberAssociateResponse.Meta.builder()
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
        val numberAssociateResponse =
            NumberAssociateResponse.builder()
                .addData(
                    NumberAssociateResponse.Data.builder()
                        .id("8a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .phoneNumber("+19493253498")
                        .reputationData(
                            ReputationData.builder()
                                .connectionScore(80L)
                                .engagementScore(64L)
                                .lastRefreshedAt(
                                    OffsetDateTime.parse("2026-04-26T18:09:24.785211Z")
                                )
                                .maturityScore(72L)
                                .sentimentScore(75L)
                                .spamCategory(null)
                                .spamRisk(ReputationData.SpamRisk.LOW)
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                        .build()
                )
                .meta(
                    NumberAssociateResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedNumberAssociateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberAssociateResponse),
                jacksonTypeRef<NumberAssociateResponse>(),
            )

        assertThat(roundtrippedNumberAssociateResponse).isEqualTo(numberAssociateResponse)
    }
}
