// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberCampaignCreateTest {

    @Test
    fun create() {
        val phoneNumberCampaignCreate =
            PhoneNumberCampaignCreate.builder()
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .phoneNumber("+18005550199")
                .build()

        assertThat(phoneNumberCampaignCreate.campaignId())
            .isEqualTo("4b300178-131c-d902-d54e-72d90ba1620j")
        assertThat(phoneNumberCampaignCreate.phoneNumber()).isEqualTo("+18005550199")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberCampaignCreate =
            PhoneNumberCampaignCreate.builder()
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .phoneNumber("+18005550199")
                .build()

        val roundtrippedPhoneNumberCampaignCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberCampaignCreate),
                jacksonTypeRef<PhoneNumberCampaignCreate>(),
            )

        assertThat(roundtrippedPhoneNumberCampaignCreate).isEqualTo(phoneNumberCampaignCreate)
    }
}
