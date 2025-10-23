// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignDeactivateResponseTest {

    @Test
    fun create() {
        val campaignDeactivateResponse =
            CampaignDeactivateResponse.builder()
                .time(0.0)
                .message("message")
                .recordType("record_type")
                .build()

        assertThat(campaignDeactivateResponse.time()).isEqualTo(0.0)
        assertThat(campaignDeactivateResponse.message()).contains("message")
        assertThat(campaignDeactivateResponse.recordType()).contains("record_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignDeactivateResponse =
            CampaignDeactivateResponse.builder()
                .time(0.0)
                .message("message")
                .recordType("record_type")
                .build()

        val roundtrippedCampaignDeactivateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignDeactivateResponse),
                jacksonTypeRef<CampaignDeactivateResponse>(),
            )

        assertThat(roundtrippedCampaignDeactivateResponse).isEqualTo(campaignDeactivateResponse)
    }
}
