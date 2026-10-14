// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ReputationData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReputationPhoneNumberTest {

    @Test
    fun create() {
        val reputationPhoneNumber =
            ReputationPhoneNumber.builder()
                .id("8a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
                .confirmBy(OffsetDateTime.parse("2026-10-08T07:00:00Z"))
                .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .flagReason("carrier_changed")
                .ownershipStatus(ReputationOwnershipStatus.VERIFIED)
                .phoneNumber("+19493253498")
                .removalReason(ReputationPhoneNumber.RemovalReason.UNCONFIRMED_OWNERSHIP)
                .removedAt(OffsetDateTime.parse("2026-10-09T06:02:11Z"))
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
                .source(ReputationNumberSource.EXTERNAL)
                .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                .build()

        assertThat(reputationPhoneNumber.id()).contains("8a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
        assertThat(reputationPhoneNumber.confirmBy())
            .contains(OffsetDateTime.parse("2026-10-08T07:00:00Z"))
        assertThat(reputationPhoneNumber.createdAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
        assertThat(reputationPhoneNumber.enterpriseId())
            .contains("4a6192a4-573d-446d-b3ce-aff9117272a6")
        assertThat(reputationPhoneNumber.flagReason()).contains("carrier_changed")
        assertThat(reputationPhoneNumber.ownershipStatus())
            .contains(ReputationOwnershipStatus.VERIFIED)
        assertThat(reputationPhoneNumber.phoneNumber()).contains("+19493253498")
        assertThat(reputationPhoneNumber.removalReason())
            .contains(ReputationPhoneNumber.RemovalReason.UNCONFIRMED_OWNERSHIP)
        assertThat(reputationPhoneNumber.removedAt())
            .contains(OffsetDateTime.parse("2026-10-09T06:02:11Z"))
        assertThat(reputationPhoneNumber.reputationData())
            .contains(
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
        assertThat(reputationPhoneNumber.source()).contains(ReputationNumberSource.EXTERNAL)
        assertThat(reputationPhoneNumber.updatedAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reputationPhoneNumber =
            ReputationPhoneNumber.builder()
                .id("8a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
                .confirmBy(OffsetDateTime.parse("2026-10-08T07:00:00Z"))
                .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .flagReason("carrier_changed")
                .ownershipStatus(ReputationOwnershipStatus.VERIFIED)
                .phoneNumber("+19493253498")
                .removalReason(ReputationPhoneNumber.RemovalReason.UNCONFIRMED_OWNERSHIP)
                .removedAt(OffsetDateTime.parse("2026-10-09T06:02:11Z"))
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
                .source(ReputationNumberSource.EXTERNAL)
                .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                .build()

        val roundtrippedReputationPhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reputationPhoneNumber),
                jacksonTypeRef<ReputationPhoneNumber>(),
            )

        assertThat(roundtrippedReputationPhoneNumber).isEqualTo(reputationPhoneNumber)
    }
}
