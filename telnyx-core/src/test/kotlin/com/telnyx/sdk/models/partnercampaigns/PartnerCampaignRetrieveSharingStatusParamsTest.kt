// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.partnercampaigns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignRetrieveSharingStatusParamsTest {

    @Test
    fun create() {
        PartnerCampaignRetrieveSharingStatusParams.builder().campaignId("campaignId").build()
    }

    @Test
    fun pathParams() {
        val params =
            PartnerCampaignRetrieveSharingStatusParams.builder().campaignId("campaignId").build()

        assertThat(params._pathParam(0)).isEqualTo("campaignId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
