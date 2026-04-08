// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ReputationData
import com.telnyx.sdk.models.ReputationPhoneNumberWithReputationData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberRetrieveResponseTest {

    @Test
    fun create() {
        val numberRetrieveResponse =
            NumberRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(numberRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberRetrieveResponse =
            NumberRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedNumberRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberRetrieveResponse),
                jacksonTypeRef<NumberRetrieveResponse>(),
            )

        assertThat(roundtrippedNumberRetrieveResponse).isEqualTo(numberRetrieveResponse)
    }
}
