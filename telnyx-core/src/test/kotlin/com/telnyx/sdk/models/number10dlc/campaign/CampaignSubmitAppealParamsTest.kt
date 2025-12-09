// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignSubmitAppealParamsTest {

    @Test
    fun create() {
        CampaignSubmitAppealParams.builder()
            .campaignId("5eb13888-32b7-4cab-95e6-d834dde21d64")
            .appealReason(
                "The website has been updated to include the required privacy policy and terms of service."
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CampaignSubmitAppealParams.builder()
                .campaignId("5eb13888-32b7-4cab-95e6-d834dde21d64")
                .appealReason(
                    "The website has been updated to include the required privacy policy and terms of service."
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("5eb13888-32b7-4cab-95e6-d834dde21d64")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CampaignSubmitAppealParams.builder()
                .campaignId("5eb13888-32b7-4cab-95e6-d834dde21d64")
                .appealReason(
                    "The website has been updated to include the required privacy policy and terms of service."
                )
                .build()

        val body = params._body()

        assertThat(body.appealReason())
            .isEqualTo(
                "The website has been updated to include the required privacy policy and terms of service."
            )
    }
}
