// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.partnercampaign

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignGetSharingStatusParamsTest {

    @Test
    fun create() {
        PartnerCampaignGetSharingStatusParams.builder().campaignId("campaignId").build()
    }

    @Test
    fun pathParams() {
        val params =
            PartnerCampaignGetSharingStatusParams.builder().campaignId("campaignId").build()

        assertThat(params._pathParam(0)).isEqualTo("campaignId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
