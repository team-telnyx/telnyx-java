// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignSuspendedEventTest {

    @Test
    fun create() {
        val campaignSuspendedEvent =
            CampaignSuspendedEvent.builder()
                .campaignId("4b30019a-9dca-a78d-1124-b080d7dedecc")
                .description("Campaign has been marked as dormant")
                .status(CampaignSuspendedEvent.Status.DORMANT)
                .type(CampaignSuspendedEvent.Type.TELNYX_EVENT)
                .build()

        assertThat(campaignSuspendedEvent.campaignId())
            .contains("4b30019a-9dca-a78d-1124-b080d7dedecc")
        assertThat(campaignSuspendedEvent.description())
            .contains("Campaign has been marked as dormant")
        assertThat(campaignSuspendedEvent.status()).contains(CampaignSuspendedEvent.Status.DORMANT)
        assertThat(campaignSuspendedEvent.type()).contains(CampaignSuspendedEvent.Type.TELNYX_EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignSuspendedEvent =
            CampaignSuspendedEvent.builder()
                .campaignId("4b30019a-9dca-a78d-1124-b080d7dedecc")
                .description("Campaign has been marked as dormant")
                .status(CampaignSuspendedEvent.Status.DORMANT)
                .type(CampaignSuspendedEvent.Type.TELNYX_EVENT)
                .build()

        val roundtrippedCampaignSuspendedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignSuspendedEvent),
                jacksonTypeRef<CampaignSuspendedEvent>(),
            )

        assertThat(roundtrippedCampaignSuspendedEvent).isEqualTo(campaignSuspendedEvent)
    }
}
