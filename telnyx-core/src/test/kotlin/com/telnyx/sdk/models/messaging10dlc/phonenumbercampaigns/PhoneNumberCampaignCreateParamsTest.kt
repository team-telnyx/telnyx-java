// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberCampaignCreateParamsTest {

    @Test
    fun create() {
        PhoneNumberCampaignCreateParams.builder()
            .phoneNumberCampaignCreate(
                PhoneNumberCampaignCreate.builder()
                    .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                    .phoneNumber("+18005550199")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PhoneNumberCampaignCreateParams.builder()
                .phoneNumberCampaignCreate(
                    PhoneNumberCampaignCreate.builder()
                        .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                        .phoneNumber("+18005550199")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PhoneNumberCampaignCreate.builder()
                    .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                    .phoneNumber("+18005550199")
                    .build()
            )
    }
}
