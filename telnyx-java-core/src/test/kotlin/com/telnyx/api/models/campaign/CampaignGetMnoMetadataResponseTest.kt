// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignGetMnoMetadataResponseTest {

    @Test
    fun create() {
        val campaignGetMnoMetadataResponse =
            CampaignGetMnoMetadataResponse.builder()
                ._10999(
                    CampaignGetMnoMetadataResponse._10999
                        .builder()
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

        assertThat(campaignGetMnoMetadataResponse._10999())
            .contains(
                CampaignGetMnoMetadataResponse._10999
                    .builder()
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
                ._10999(
                    CampaignGetMnoMetadataResponse._10999
                        .builder()
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
