// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReputationDataTest {

    @Test
    fun create() {
        val reputationData =
            ReputationData.builder()
                .connectionScore(80L)
                .engagementScore(64L)
                .lastRefreshedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                .maturityScore(72L)
                .sentimentScore(75L)
                .spamCategory(null)
                .spamRisk(ReputationData.SpamRisk.LOW)
                .build()

        assertThat(reputationData.connectionScore()).contains(80L)
        assertThat(reputationData.engagementScore()).contains(64L)
        assertThat(reputationData.lastRefreshedAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
        assertThat(reputationData.maturityScore()).contains(72L)
        assertThat(reputationData.sentimentScore()).contains(75L)
        assertThat(reputationData.spamCategory()).isEmpty
        assertThat(reputationData.spamRisk()).contains(ReputationData.SpamRisk.LOW)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reputationData =
            ReputationData.builder()
                .connectionScore(80L)
                .engagementScore(64L)
                .lastRefreshedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                .maturityScore(72L)
                .sentimentScore(75L)
                .spamCategory(null)
                .spamRisk(ReputationData.SpamRisk.LOW)
                .build()

        val roundtrippedReputationData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reputationData),
                jacksonTypeRef<ReputationData>(),
            )

        assertThat(roundtrippedReputationData).isEqualTo(reputationData)
    }
}
