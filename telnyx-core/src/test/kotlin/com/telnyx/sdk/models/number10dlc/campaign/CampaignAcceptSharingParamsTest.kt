// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignAcceptSharingParamsTest {

    @Test
    fun create() {
        CampaignAcceptSharingParams.builder().campaignId("C26F1KLZN").build()
    }

    @Test
    fun pathParams() {
        val params = CampaignAcceptSharingParams.builder().campaignId("C26F1KLZN").build()

        assertThat(params._pathParam(0)).isEqualTo("C26F1KLZN")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
