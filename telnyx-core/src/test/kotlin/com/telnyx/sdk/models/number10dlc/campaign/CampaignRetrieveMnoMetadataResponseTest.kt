// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignRetrieveMnoMetadataResponseTest {

    @Test
    fun create() {
        val campaignRetrieveMnoMetadataResponse =
            CampaignRetrieveMnoMetadataResponse.builder()
                .mno10999(
                    CampaignRetrieveMnoMetadataResponse.Mno10999.builder()
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

        assertThat(campaignRetrieveMnoMetadataResponse.mno10999())
            .contains(
                CampaignRetrieveMnoMetadataResponse.Mno10999.builder()
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
        val campaignRetrieveMnoMetadataResponse =
            CampaignRetrieveMnoMetadataResponse.builder()
                .mno10999(
                    CampaignRetrieveMnoMetadataResponse.Mno10999.builder()
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

        val roundtrippedCampaignRetrieveMnoMetadataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignRetrieveMnoMetadataResponse),
                jacksonTypeRef<CampaignRetrieveMnoMetadataResponse>(),
            )

        assertThat(roundtrippedCampaignRetrieveMnoMetadataResponse)
            .isEqualTo(campaignRetrieveMnoMetadataResponse)
    }
}
