// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignGetSharingStatusResponseTest {

    @Test
    fun create() {
        val campaignGetSharingStatusResponse =
            CampaignGetSharingStatusResponse.builder()
                .sharedByMe(
                    CampaignSharingStatus.builder()
                        .downstreamCnpId("downstreamCnpId")
                        .sharedDate("sharedDate")
                        .sharingStatus("sharingStatus")
                        .statusDate("statusDate")
                        .upstreamCnpId("upstreamCnpId")
                        .build()
                )
                .sharedWithMe(
                    CampaignSharingStatus.builder()
                        .downstreamCnpId("downstreamCnpId")
                        .sharedDate("sharedDate")
                        .sharingStatus("sharingStatus")
                        .statusDate("statusDate")
                        .upstreamCnpId("upstreamCnpId")
                        .build()
                )
                .build()

        assertThat(campaignGetSharingStatusResponse.sharedByMe())
            .contains(
                CampaignSharingStatus.builder()
                    .downstreamCnpId("downstreamCnpId")
                    .sharedDate("sharedDate")
                    .sharingStatus("sharingStatus")
                    .statusDate("statusDate")
                    .upstreamCnpId("upstreamCnpId")
                    .build()
            )
        assertThat(campaignGetSharingStatusResponse.sharedWithMe())
            .contains(
                CampaignSharingStatus.builder()
                    .downstreamCnpId("downstreamCnpId")
                    .sharedDate("sharedDate")
                    .sharingStatus("sharingStatus")
                    .statusDate("statusDate")
                    .upstreamCnpId("upstreamCnpId")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignGetSharingStatusResponse =
            CampaignGetSharingStatusResponse.builder()
                .sharedByMe(
                    CampaignSharingStatus.builder()
                        .downstreamCnpId("downstreamCnpId")
                        .sharedDate("sharedDate")
                        .sharingStatus("sharingStatus")
                        .statusDate("statusDate")
                        .upstreamCnpId("upstreamCnpId")
                        .build()
                )
                .sharedWithMe(
                    CampaignSharingStatus.builder()
                        .downstreamCnpId("downstreamCnpId")
                        .sharedDate("sharedDate")
                        .sharingStatus("sharingStatus")
                        .statusDate("statusDate")
                        .upstreamCnpId("upstreamCnpId")
                        .build()
                )
                .build()

        val roundtrippedCampaignGetSharingStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignGetSharingStatusResponse),
                jacksonTypeRef<CampaignGetSharingStatusResponse>(),
            )

        assertThat(roundtrippedCampaignGetSharingStatusResponse)
            .isEqualTo(campaignGetSharingStatusResponse)
    }
}
