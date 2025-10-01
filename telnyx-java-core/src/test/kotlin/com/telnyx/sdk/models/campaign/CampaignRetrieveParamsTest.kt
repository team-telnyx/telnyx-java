// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.campaign

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignRetrieveParamsTest {

    @Test
    fun create() {
        CampaignRetrieveParams.builder().campaignId("campaignId").build()
    }

    @Test
    fun pathParams() {
        val params = CampaignRetrieveParams.builder().campaignId("campaignId").build()

        assertThat(params._pathParam(0)).isEqualTo("campaignId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
