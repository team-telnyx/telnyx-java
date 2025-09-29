// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignGetOperationStatusResponseTest {

    @Test
    fun create() {
        val campaignGetOperationStatusResponse =
            CampaignGetOperationStatusResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignGetOperationStatusResponse =
            CampaignGetOperationStatusResponse.builder().build()

        val roundtrippedCampaignGetOperationStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignGetOperationStatusResponse),
                jacksonTypeRef<CampaignGetOperationStatusResponse>(),
            )

        assertThat(roundtrippedCampaignGetOperationStatusResponse)
            .isEqualTo(campaignGetOperationStatusResponse)
    }
}
