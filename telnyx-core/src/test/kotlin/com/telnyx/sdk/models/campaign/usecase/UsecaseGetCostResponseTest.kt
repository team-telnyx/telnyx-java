// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.campaign.usecase

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsecaseGetCostResponseTest {

    @Test
    fun create() {
        val usecaseGetCostResponse =
            UsecaseGetCostResponse.builder()
                .campaignUsecase("campaignUsecase")
                .description("description")
                .monthlyCost("monthlyCost")
                .upFrontCost("upFrontCost")
                .build()

        assertThat(usecaseGetCostResponse.campaignUsecase()).isEqualTo("campaignUsecase")
        assertThat(usecaseGetCostResponse.description()).isEqualTo("description")
        assertThat(usecaseGetCostResponse.monthlyCost()).isEqualTo("monthlyCost")
        assertThat(usecaseGetCostResponse.upFrontCost()).isEqualTo("upFrontCost")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usecaseGetCostResponse =
            UsecaseGetCostResponse.builder()
                .campaignUsecase("campaignUsecase")
                .description("description")
                .monthlyCost("monthlyCost")
                .upFrontCost("upFrontCost")
                .build()

        val roundtrippedUsecaseGetCostResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usecaseGetCostResponse),
                jacksonTypeRef<UsecaseGetCostResponse>(),
            )

        assertThat(roundtrippedUsecaseGetCostResponse).isEqualTo(usecaseGetCostResponse)
    }
}
