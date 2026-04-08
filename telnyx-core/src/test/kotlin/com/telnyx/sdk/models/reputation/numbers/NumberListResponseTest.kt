// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reputation.numbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberListResponseTest {

    @Test
    fun create() {
        val numberListResponse =
            NumberListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .phoneNumber("+16035551234")
                .reputationData(
                    NumberListResponse.ReputationData.InnerReputationData.builder()
                        .connectionScore(0L)
                        .engagementScore(0L)
                        .lastRefreshedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maturityScore(0L)
                        .sentimentScore(0L)
                        .spamCategory("spam_category")
                        .spamRisk(
                            NumberListResponse.ReputationData.InnerReputationData.SpamRisk.LOW
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(numberListResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(numberListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(numberListResponse.enterpriseId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(numberListResponse.phoneNumber()).contains("+16035551234")
        assertThat(numberListResponse.reputationData())
            .contains(
                NumberListResponse.ReputationData.ofReputationData(
                    NumberListResponse.ReputationData.InnerReputationData.builder()
                        .connectionScore(0L)
                        .engagementScore(0L)
                        .lastRefreshedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maturityScore(0L)
                        .sentimentScore(0L)
                        .spamCategory("spam_category")
                        .spamRisk(
                            NumberListResponse.ReputationData.InnerReputationData.SpamRisk.LOW
                        )
                        .build()
                )
            )
        assertThat(numberListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberListResponse =
            NumberListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .phoneNumber("+16035551234")
                .reputationData(
                    NumberListResponse.ReputationData.InnerReputationData.builder()
                        .connectionScore(0L)
                        .engagementScore(0L)
                        .lastRefreshedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maturityScore(0L)
                        .sentimentScore(0L)
                        .spamCategory("spam_category")
                        .spamRisk(
                            NumberListResponse.ReputationData.InnerReputationData.SpamRisk.LOW
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberListResponse),
                jacksonTypeRef<NumberListResponse>(),
            )

        assertThat(roundtrippedNumberListResponse).isEqualTo(numberListResponse)
    }
}
