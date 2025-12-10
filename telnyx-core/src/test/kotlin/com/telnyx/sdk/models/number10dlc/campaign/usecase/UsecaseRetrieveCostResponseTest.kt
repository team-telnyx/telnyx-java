// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign.usecase

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsecaseRetrieveCostResponseTest {

    @Test
    fun create() {
        val usecaseRetrieveCostResponse =
            UsecaseRetrieveCostResponse.builder()
                .campaignUsecase("campaignUsecase")
                .description("description")
                .monthlyCost("monthlyCost")
                .upFrontCost("upFrontCost")
                .build()

        assertThat(usecaseRetrieveCostResponse.campaignUsecase()).isEqualTo("campaignUsecase")
        assertThat(usecaseRetrieveCostResponse.description()).isEqualTo("description")
        assertThat(usecaseRetrieveCostResponse.monthlyCost()).isEqualTo("monthlyCost")
        assertThat(usecaseRetrieveCostResponse.upFrontCost()).isEqualTo("upFrontCost")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usecaseRetrieveCostResponse =
            UsecaseRetrieveCostResponse.builder()
                .campaignUsecase("campaignUsecase")
                .description("description")
                .monthlyCost("monthlyCost")
                .upFrontCost("upFrontCost")
                .build()

        val roundtrippedUsecaseRetrieveCostResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usecaseRetrieveCostResponse),
                jacksonTypeRef<UsecaseRetrieveCostResponse>(),
            )

        assertThat(roundtrippedUsecaseRetrieveCostResponse).isEqualTo(usecaseRetrieveCostResponse)
    }
}
