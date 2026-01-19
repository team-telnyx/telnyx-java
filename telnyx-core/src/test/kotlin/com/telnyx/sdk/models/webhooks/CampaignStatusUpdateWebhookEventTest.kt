// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignStatusUpdateWebhookEventTest {

    @Test
    fun create() {
        val campaignStatusUpdateWebhookEvent =
            CampaignStatusUpdateWebhookEvent.builder()
                .brandId("d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5")
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .createDate("createDate")
                .cspId("cspId")
                .description("Campaign has been marked as dormant")
                .isTMobileRegistered(true)
                .status(CampaignStatusUpdateWebhookEvent.Status.DORMANT)
                .type(CampaignStatusUpdateWebhookEvent.Type.TELNYX_EVENT)
                .build()

        assertThat(campaignStatusUpdateWebhookEvent.brandId())
            .contains("d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5")
        assertThat(campaignStatusUpdateWebhookEvent.campaignId())
            .contains("4b300178-131c-d902-d54e-72d90ba1620j")
        assertThat(campaignStatusUpdateWebhookEvent.createDate()).contains("createDate")
        assertThat(campaignStatusUpdateWebhookEvent.cspId()).contains("cspId")
        assertThat(campaignStatusUpdateWebhookEvent.description())
            .contains("Campaign has been marked as dormant")
        assertThat(campaignStatusUpdateWebhookEvent.isTMobileRegistered()).contains(true)
        assertThat(campaignStatusUpdateWebhookEvent.status())
            .contains(CampaignStatusUpdateWebhookEvent.Status.DORMANT)
        assertThat(campaignStatusUpdateWebhookEvent.type())
            .contains(CampaignStatusUpdateWebhookEvent.Type.TELNYX_EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignStatusUpdateWebhookEvent =
            CampaignStatusUpdateWebhookEvent.builder()
                .brandId("d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5")
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .createDate("createDate")
                .cspId("cspId")
                .description("Campaign has been marked as dormant")
                .isTMobileRegistered(true)
                .status(CampaignStatusUpdateWebhookEvent.Status.DORMANT)
                .type(CampaignStatusUpdateWebhookEvent.Type.TELNYX_EVENT)
                .build()

        val roundtrippedCampaignStatusUpdateWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignStatusUpdateWebhookEvent),
                jacksonTypeRef<CampaignStatusUpdateWebhookEvent>(),
            )

        assertThat(roundtrippedCampaignStatusUpdateWebhookEvent)
            .isEqualTo(campaignStatusUpdateWebhookEvent)
    }
}
