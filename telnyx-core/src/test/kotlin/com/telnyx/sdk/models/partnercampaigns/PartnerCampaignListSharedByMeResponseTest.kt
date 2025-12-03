// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.partnercampaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignListSharedByMeResponseTest {

    @Test
    fun create() {
        val partnerCampaignListSharedByMeResponse =
            PartnerCampaignListSharedByMeResponse.builder()
                .brandId("brandId")
                .campaignId("campaignId")
                .usecase("usecase")
                .createDate("createDate")
                .status("status")
                .build()

        assertThat(partnerCampaignListSharedByMeResponse.brandId()).isEqualTo("brandId")
        assertThat(partnerCampaignListSharedByMeResponse.campaignId()).isEqualTo("campaignId")
        assertThat(partnerCampaignListSharedByMeResponse.usecase()).isEqualTo("usecase")
        assertThat(partnerCampaignListSharedByMeResponse.createDate()).contains("createDate")
        assertThat(partnerCampaignListSharedByMeResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val partnerCampaignListSharedByMeResponse =
            PartnerCampaignListSharedByMeResponse.builder()
                .brandId("brandId")
                .campaignId("campaignId")
                .usecase("usecase")
                .createDate("createDate")
                .status("status")
                .build()

        val roundtrippedPartnerCampaignListSharedByMeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(partnerCampaignListSharedByMeResponse),
                jacksonTypeRef<PartnerCampaignListSharedByMeResponse>(),
            )

        assertThat(roundtrippedPartnerCampaignListSharedByMeResponse)
            .isEqualTo(partnerCampaignListSharedByMeResponse)
    }
}
