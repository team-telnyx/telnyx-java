// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.campaign.CampaignSharingStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignRetrieveSharingResponseTest {

    @Test
    fun create() {
        val campaignRetrieveSharingResponse =
            CampaignRetrieveSharingResponse.builder()
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

        assertThat(campaignRetrieveSharingResponse.sharedByMe())
            .contains(
                CampaignSharingStatus.builder()
                    .downstreamCnpId("downstreamCnpId")
                    .sharedDate("sharedDate")
                    .sharingStatus("sharingStatus")
                    .statusDate("statusDate")
                    .upstreamCnpId("upstreamCnpId")
                    .build()
            )
        assertThat(campaignRetrieveSharingResponse.sharedWithMe())
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
        val campaignRetrieveSharingResponse =
            CampaignRetrieveSharingResponse.builder()
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

        val roundtrippedCampaignRetrieveSharingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignRetrieveSharingResponse),
                jacksonTypeRef<CampaignRetrieveSharingResponse>(),
            )

        assertThat(roundtrippedCampaignRetrieveSharingResponse)
            .isEqualTo(campaignRetrieveSharingResponse)
    }
}
