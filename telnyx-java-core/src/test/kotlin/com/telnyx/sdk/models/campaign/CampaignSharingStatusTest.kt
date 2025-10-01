// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignSharingStatusTest {

    @Test
    fun create() {
        val campaignSharingStatus =
            CampaignSharingStatus.builder()
                .downstreamCnpId("downstreamCnpId")
                .sharedDate("sharedDate")
                .sharingStatus("sharingStatus")
                .statusDate("statusDate")
                .upstreamCnpId("upstreamCnpId")
                .build()

        assertThat(campaignSharingStatus.downstreamCnpId()).contains("downstreamCnpId")
        assertThat(campaignSharingStatus.sharedDate()).contains("sharedDate")
        assertThat(campaignSharingStatus.sharingStatus()).contains("sharingStatus")
        assertThat(campaignSharingStatus.statusDate()).contains("statusDate")
        assertThat(campaignSharingStatus.upstreamCnpId()).contains("upstreamCnpId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignSharingStatus =
            CampaignSharingStatus.builder()
                .downstreamCnpId("downstreamCnpId")
                .sharedDate("sharedDate")
                .sharingStatus("sharingStatus")
                .statusDate("statusDate")
                .upstreamCnpId("upstreamCnpId")
                .build()

        val roundtrippedCampaignSharingStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignSharingStatus),
                jacksonTypeRef<CampaignSharingStatus>(),
            )

        assertThat(roundtrippedCampaignSharingStatus).isEqualTo(campaignSharingStatus)
    }
}
