// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.partnercampaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignListSharedByMeResponseTest {

    @Test
    fun create() {
        val partnerCampaignListSharedByMeResponse =
            PartnerCampaignListSharedByMeResponse.builder()
                .page(0L)
                .addRecord(
                    PartnerCampaignListSharedByMeResponse.Record.builder()
                        .brandId("brandId")
                        .campaignId("campaignId")
                        .usecase("usecase")
                        .createDate("createDate")
                        .status("status")
                        .build()
                )
                .totalRecords(0L)
                .build()

        assertThat(partnerCampaignListSharedByMeResponse.page()).contains(0L)
        assertThat(partnerCampaignListSharedByMeResponse.records().getOrNull())
            .containsExactly(
                PartnerCampaignListSharedByMeResponse.Record.builder()
                    .brandId("brandId")
                    .campaignId("campaignId")
                    .usecase("usecase")
                    .createDate("createDate")
                    .status("status")
                    .build()
            )
        assertThat(partnerCampaignListSharedByMeResponse.totalRecords()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val partnerCampaignListSharedByMeResponse =
            PartnerCampaignListSharedByMeResponse.builder()
                .page(0L)
                .addRecord(
                    PartnerCampaignListSharedByMeResponse.Record.builder()
                        .brandId("brandId")
                        .campaignId("campaignId")
                        .usecase("usecase")
                        .createDate("createDate")
                        .status("status")
                        .build()
                )
                .totalRecords(0L)
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
