// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReputationPhoneNumberWithReputationDataTest {

    @Test
    fun create() {
        val reputationPhoneNumberWithReputationData =
            ReputationPhoneNumberWithReputationData.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .phoneNumber("+16035551234")
                .reputationData(
                    ReputationData.builder()
                        .connectionScore(0L)
                        .engagementScore(0L)
                        .lastRefreshedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maturityScore(0L)
                        .sentimentScore(0L)
                        .spamCategory("spam_category")
                        .spamRisk(ReputationData.SpamRisk.LOW)
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(reputationPhoneNumberWithReputationData.id())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(reputationPhoneNumberWithReputationData.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(reputationPhoneNumberWithReputationData.enterpriseId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(reputationPhoneNumberWithReputationData.phoneNumber()).contains("+16035551234")
        assertThat(reputationPhoneNumberWithReputationData.reputationData())
            .contains(
                ReputationPhoneNumberWithReputationData.ReputationData.ofReputationData(
                    ReputationData.builder()
                        .connectionScore(0L)
                        .engagementScore(0L)
                        .lastRefreshedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maturityScore(0L)
                        .sentimentScore(0L)
                        .spamCategory("spam_category")
                        .spamRisk(ReputationData.SpamRisk.LOW)
                        .build()
                )
            )
        assertThat(reputationPhoneNumberWithReputationData.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reputationPhoneNumberWithReputationData =
            ReputationPhoneNumberWithReputationData.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .phoneNumber("+16035551234")
                .reputationData(
                    ReputationData.builder()
                        .connectionScore(0L)
                        .engagementScore(0L)
                        .lastRefreshedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maturityScore(0L)
                        .sentimentScore(0L)
                        .spamCategory("spam_category")
                        .spamRisk(ReputationData.SpamRisk.LOW)
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedReputationPhoneNumberWithReputationData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reputationPhoneNumberWithReputationData),
                jacksonTypeRef<ReputationPhoneNumberWithReputationData>(),
            )

        assertThat(roundtrippedReputationPhoneNumberWithReputationData)
            .isEqualTo(reputationPhoneNumberWithReputationData)
    }
}
