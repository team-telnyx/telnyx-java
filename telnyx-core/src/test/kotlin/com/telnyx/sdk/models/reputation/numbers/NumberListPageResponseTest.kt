// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reputation.numbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberListPageResponseTest {

    @Test
    fun create() {
        val numberListPageResponse =
            NumberListPageResponse.builder()
                .addData(
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
                                    NumberListResponse.ReputationData.InnerReputationData.SpamRisk
                                        .LOW
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    NumberListPageResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(numberListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(numberListPageResponse.meta())
            .contains(
                NumberListPageResponse.Meta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberListPageResponse =
            NumberListPageResponse.builder()
                .addData(
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
                                    NumberListResponse.ReputationData.InnerReputationData.SpamRisk
                                        .LOW
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    NumberListPageResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedNumberListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberListPageResponse),
                jacksonTypeRef<NumberListPageResponse>(),
            )

        assertThat(roundtrippedNumberListPageResponse).isEqualTo(numberListPageResponse)
    }
}
