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
                .connectionScore(0L)
                .engagementScore(0L)
                .lastRefreshedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maturityScore(0L)
                .sentimentScore(0L)
                .spamCategory("spam_category")
                .spamRisk(ReputationData.SpamRisk.LOW)
                .build()

        assertThat(reputationData.connectionScore()).contains(0L)
        assertThat(reputationData.engagementScore()).contains(0L)
        assertThat(reputationData.lastRefreshedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(reputationData.maturityScore()).contains(0L)
        assertThat(reputationData.sentimentScore()).contains(0L)
        assertThat(reputationData.spamCategory()).contains("spam_category")
        assertThat(reputationData.spamRisk()).contains(ReputationData.SpamRisk.LOW)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reputationData =
            ReputationData.builder()
                .connectionScore(0L)
                .engagementScore(0L)
                .lastRefreshedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maturityScore(0L)
                .sentimentScore(0L)
                .spamCategory("spam_category")
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
