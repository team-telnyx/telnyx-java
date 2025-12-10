// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignDeleteResponseTest {

    @Test
    fun create() {
        val campaignDeleteResponse =
            CampaignDeleteResponse.builder()
                .time(0.0)
                .message("message")
                .recordType("record_type")
                .build()

        assertThat(campaignDeleteResponse.time()).isEqualTo(0.0)
        assertThat(campaignDeleteResponse.message()).contains("message")
        assertThat(campaignDeleteResponse.recordType()).contains("record_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignDeleteResponse =
            CampaignDeleteResponse.builder()
                .time(0.0)
                .message("message")
                .recordType("record_type")
                .build()

        val roundtrippedCampaignDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignDeleteResponse),
                jacksonTypeRef<CampaignDeleteResponse>(),
            )

        assertThat(roundtrippedCampaignDeleteResponse).isEqualTo(campaignDeleteResponse)
    }
}
