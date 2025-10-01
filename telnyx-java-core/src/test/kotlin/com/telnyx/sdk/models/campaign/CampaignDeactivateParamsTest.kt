// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.campaign

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignDeactivateParamsTest {

    @Test
    fun create() {
        CampaignDeactivateParams.builder().campaignId("campaignId").build()
    }

    @Test
    fun pathParams() {
        val params = CampaignDeactivateParams.builder().campaignId("campaignId").build()

        assertThat(params._pathParam(0)).isEqualTo("campaignId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
