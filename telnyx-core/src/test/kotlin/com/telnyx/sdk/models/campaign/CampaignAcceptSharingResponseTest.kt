// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignAcceptSharingResponseTest {

    @Test
    fun create() {
        val campaignAcceptSharingResponse = CampaignAcceptSharingResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignAcceptSharingResponse = CampaignAcceptSharingResponse.builder().build()

        val roundtrippedCampaignAcceptSharingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignAcceptSharingResponse),
                jacksonTypeRef<CampaignAcceptSharingResponse>(),
            )

        assertThat(roundtrippedCampaignAcceptSharingResponse)
            .isEqualTo(campaignAcceptSharingResponse)
    }
}
