// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.partnercampaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignListSharedByMePageResponseTest {

    @Test
    fun create() {
        val partnerCampaignListSharedByMePageResponse =
            PartnerCampaignListSharedByMePageResponse.builder()
                .page(0L)
                .addRecord(
                    PartnerCampaignListSharedByMeResponse.builder()
                        .brandId("brandId")
                        .campaignId("campaignId")
                        .usecase("usecase")
                        .createDate("createDate")
                        .status("status")
                        .build()
                )
                .totalRecords(0L)
                .build()

        assertThat(partnerCampaignListSharedByMePageResponse.page()).contains(0L)
        assertThat(partnerCampaignListSharedByMePageResponse.records().getOrNull())
            .containsExactly(
                PartnerCampaignListSharedByMeResponse.builder()
                    .brandId("brandId")
                    .campaignId("campaignId")
                    .usecase("usecase")
                    .createDate("createDate")
                    .status("status")
                    .build()
            )
        assertThat(partnerCampaignListSharedByMePageResponse.totalRecords()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val partnerCampaignListSharedByMePageResponse =
            PartnerCampaignListSharedByMePageResponse.builder()
                .page(0L)
                .addRecord(
                    PartnerCampaignListSharedByMeResponse.builder()
                        .brandId("brandId")
                        .campaignId("campaignId")
                        .usecase("usecase")
                        .createDate("createDate")
                        .status("status")
                        .build()
                )
                .totalRecords(0L)
                .build()

        val roundtrippedPartnerCampaignListSharedByMePageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(partnerCampaignListSharedByMePageResponse),
                jacksonTypeRef<PartnerCampaignListSharedByMePageResponse>(),
            )

        assertThat(roundtrippedPartnerCampaignListSharedByMePageResponse)
            .isEqualTo(partnerCampaignListSharedByMePageResponse)
    }
}
