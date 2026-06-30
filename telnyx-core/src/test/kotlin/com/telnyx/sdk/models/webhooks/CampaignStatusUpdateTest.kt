// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignStatusUpdateTest {

    @Test
    fun create() {
        val campaignStatusUpdate =
            CampaignStatusUpdate.builder()
                .brandId("d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5")
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .createDate("createDate")
                .cspId("cspId")
                .description("Campaign has been marked as dormant")
                .isTMobileRegistered(true)
                .status(CampaignStatusUpdate.Status.DORMANT)
                .type(CampaignStatusUpdate.Type.TELNYX_EVENT)
                .build()

        assertThat(campaignStatusUpdate.brandId()).contains("d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5")
        assertThat(campaignStatusUpdate.campaignId())
            .contains("4b300178-131c-d902-d54e-72d90ba1620j")
        assertThat(campaignStatusUpdate.createDate()).contains("createDate")
        assertThat(campaignStatusUpdate.cspId()).contains("cspId")
        assertThat(campaignStatusUpdate.description())
            .contains("Campaign has been marked as dormant")
        assertThat(campaignStatusUpdate.isTMobileRegistered()).contains(true)
        assertThat(campaignStatusUpdate.status()).contains(CampaignStatusUpdate.Status.DORMANT)
        assertThat(campaignStatusUpdate.type()).contains(CampaignStatusUpdate.Type.TELNYX_EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignStatusUpdate =
            CampaignStatusUpdate.builder()
                .brandId("d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5")
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .createDate("createDate")
                .cspId("cspId")
                .description("Campaign has been marked as dormant")
                .isTMobileRegistered(true)
                .status(CampaignStatusUpdate.Status.DORMANT)
                .type(CampaignStatusUpdate.Type.TELNYX_EVENT)
                .build()

        val roundtrippedCampaignStatusUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignStatusUpdate),
                jacksonTypeRef<CampaignStatusUpdate>(),
            )

        assertThat(roundtrippedCampaignStatusUpdate).isEqualTo(campaignStatusUpdate)
    }
}
