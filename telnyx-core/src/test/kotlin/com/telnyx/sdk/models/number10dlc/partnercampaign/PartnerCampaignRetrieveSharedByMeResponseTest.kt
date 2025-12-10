// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.partnercampaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignRetrieveSharedByMeResponseTest {

    @Test
    fun create() {
        val partnerCampaignRetrieveSharedByMeResponse =
            PartnerCampaignRetrieveSharedByMeResponse.builder()
                .page(0L)
                .addRecord(
                    PartnerCampaignRetrieveSharedByMeResponse.Record.builder()
                        .brandId("brandId")
                        .campaignId("campaignId")
                        .usecase("usecase")
                        .createDate("createDate")
                        .status("status")
                        .build()
                )
                .totalRecords(0L)
                .build()

        assertThat(partnerCampaignRetrieveSharedByMeResponse.page()).contains(0L)
        assertThat(partnerCampaignRetrieveSharedByMeResponse.records().getOrNull())
            .containsExactly(
                PartnerCampaignRetrieveSharedByMeResponse.Record.builder()
                    .brandId("brandId")
                    .campaignId("campaignId")
                    .usecase("usecase")
                    .createDate("createDate")
                    .status("status")
                    .build()
            )
        assertThat(partnerCampaignRetrieveSharedByMeResponse.totalRecords()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val partnerCampaignRetrieveSharedByMeResponse =
            PartnerCampaignRetrieveSharedByMeResponse.builder()
                .page(0L)
                .addRecord(
                    PartnerCampaignRetrieveSharedByMeResponse.Record.builder()
                        .brandId("brandId")
                        .campaignId("campaignId")
                        .usecase("usecase")
                        .createDate("createDate")
                        .status("status")
                        .build()
                )
                .totalRecords(0L)
                .build()

        val roundtrippedPartnerCampaignRetrieveSharedByMeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(partnerCampaignRetrieveSharedByMeResponse),
                jacksonTypeRef<PartnerCampaignRetrieveSharedByMeResponse>(),
            )

        assertThat(roundtrippedPartnerCampaignRetrieveSharedByMeResponse)
            .isEqualTo(partnerCampaignRetrieveSharedByMeResponse)
    }
}
