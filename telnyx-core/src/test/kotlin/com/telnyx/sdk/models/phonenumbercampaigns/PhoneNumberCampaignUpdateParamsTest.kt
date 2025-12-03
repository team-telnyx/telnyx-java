// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbercampaigns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberCampaignUpdateParamsTest {

    @Test
    fun create() {
        PhoneNumberCampaignUpdateParams.builder()
            .campaignPhoneNumber("phoneNumber")
            .phoneNumberCampaignCreate(
                PhoneNumberCampaignCreate.builder()
                    .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                    .phoneNumber("+18005550199")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberCampaignUpdateParams.builder()
                .campaignPhoneNumber("phoneNumber")
                .phoneNumberCampaignCreate(
                    PhoneNumberCampaignCreate.builder()
                        .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                        .phoneNumber("+18005550199")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("phoneNumber")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhoneNumberCampaignUpdateParams.builder()
                .campaignPhoneNumber("phoneNumber")
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
