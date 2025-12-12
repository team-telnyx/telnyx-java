// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignGetMnoMetadataResponseTest {

    @Test
    fun create() {
        val campaignGetMnoMetadataResponse =
            CampaignGetMnoMetadataResponse.builder()
                .mno10999(
                    CampaignGetMnoMetadataResponse.Mno10999.builder()
                        .minMsgSamples(1L)
                        .mno("mno")
                        .mnoReview(true)
                        .mnoSupport(true)
                        .noEmbeddedLink(true)
                        .noEmbeddedPhone(true)
                        .qualify(true)
                        .reqSubscriberHelp(true)
                        .reqSubscriberOptin(true)
                        .reqSubscriberOptout(true)
                        .build()
                )
                .build()

        assertThat(campaignGetMnoMetadataResponse.mno10999())
            .contains(
                CampaignGetMnoMetadataResponse.Mno10999.builder()
                    .minMsgSamples(1L)
                    .mno("mno")
                    .mnoReview(true)
                    .mnoSupport(true)
                    .noEmbeddedLink(true)
                    .noEmbeddedPhone(true)
                    .qualify(true)
                    .reqSubscriberHelp(true)
                    .reqSubscriberOptin(true)
                    .reqSubscriberOptout(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignGetMnoMetadataResponse =
            CampaignGetMnoMetadataResponse.builder()
                .mno10999(
                    CampaignGetMnoMetadataResponse.Mno10999.builder()
                        .minMsgSamples(1L)
                        .mno("mno")
                        .mnoReview(true)
                        .mnoSupport(true)
                        .noEmbeddedLink(true)
                        .noEmbeddedPhone(true)
                        .qualify(true)
                        .reqSubscriberHelp(true)
                        .reqSubscriberOptin(true)
                        .reqSubscriberOptout(true)
                        .build()
                )
                .build()

        val roundtrippedCampaignGetMnoMetadataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignGetMnoMetadataResponse),
                jacksonTypeRef<CampaignGetMnoMetadataResponse>(),
            )

        assertThat(roundtrippedCampaignGetMnoMetadataResponse)
            .isEqualTo(campaignGetMnoMetadataResponse)
    }
}
