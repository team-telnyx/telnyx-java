// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.partnercampaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignGetSharedByMeResponseTest {

    @Test
    fun create() {
        val partnerCampaignGetSharedByMeResponse =
            PartnerCampaignGetSharedByMeResponse.builder()
                .page(0L)
                .addRecord(
                    PartnerCampaignGetSharedByMeResponse.Record.builder()
                        .brandId("brandId")
                        .campaignId("campaignId")
                        .usecase("usecase")
                        .createDate("createDate")
                        .status("status")
                        .build()
                )
                .totalRecords(0L)
                .build()

        assertThat(partnerCampaignGetSharedByMeResponse.page()).contains(0L)
        assertThat(partnerCampaignGetSharedByMeResponse.records().getOrNull())
            .containsExactly(
                PartnerCampaignGetSharedByMeResponse.Record.builder()
                    .brandId("brandId")
                    .campaignId("campaignId")
                    .usecase("usecase")
                    .createDate("createDate")
                    .status("status")
                    .build()
            )
        assertThat(partnerCampaignGetSharedByMeResponse.totalRecords()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val partnerCampaignGetSharedByMeResponse =
            PartnerCampaignGetSharedByMeResponse.builder()
                .page(0L)
                .addRecord(
                    PartnerCampaignGetSharedByMeResponse.Record.builder()
                        .brandId("brandId")
                        .campaignId("campaignId")
                        .usecase("usecase")
                        .createDate("createDate")
                        .status("status")
                        .build()
                )
                .totalRecords(0L)
                .build()

        val roundtrippedPartnerCampaignGetSharedByMeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(partnerCampaignGetSharedByMeResponse),
                jacksonTypeRef<PartnerCampaignGetSharedByMeResponse>(),
            )

        assertThat(roundtrippedPartnerCampaignGetSharedByMeResponse)
            .isEqualTo(partnerCampaignGetSharedByMeResponse)
    }
}
