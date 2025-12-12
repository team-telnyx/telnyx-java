// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumbercampaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberCampaignTest {

    @Test
    fun create() {
        val phoneNumberCampaign =
            PhoneNumberCampaign.builder()
                .campaignId("campaignId")
                .createdAt("2021-03-08T17:57:48.801186")
                .phoneNumber("+18005550199")
                .updatedAt("2021-03-08T17:57:48.801186")
                .assignmentStatus(PhoneNumberCampaign.AssignmentStatus.ASSIGNED)
                .brandId("7ba705b7-22af-493f-addc-ac04b7ca071c")
                .failureReasons("failureReasons")
                .tcrBrandId("BBRAND1")
                .tcrCampaignId("CCAMPA1")
                .telnyxCampaignId("3008dd9f-66d7-40e0-bf23-bf2d8d1a96ba")
                .build()

        assertThat(phoneNumberCampaign.campaignId()).isEqualTo("campaignId")
        assertThat(phoneNumberCampaign.createdAt()).isEqualTo("2021-03-08T17:57:48.801186")
        assertThat(phoneNumberCampaign.phoneNumber()).isEqualTo("+18005550199")
        assertThat(phoneNumberCampaign.updatedAt()).isEqualTo("2021-03-08T17:57:48.801186")
        assertThat(phoneNumberCampaign.assignmentStatus())
            .contains(PhoneNumberCampaign.AssignmentStatus.ASSIGNED)
        assertThat(phoneNumberCampaign.brandId()).contains("7ba705b7-22af-493f-addc-ac04b7ca071c")
        assertThat(phoneNumberCampaign.failureReasons()).contains("failureReasons")
        assertThat(phoneNumberCampaign.tcrBrandId()).contains("BBRAND1")
        assertThat(phoneNumberCampaign.tcrCampaignId()).contains("CCAMPA1")
        assertThat(phoneNumberCampaign.telnyxCampaignId())
            .contains("3008dd9f-66d7-40e0-bf23-bf2d8d1a96ba")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberCampaign =
            PhoneNumberCampaign.builder()
                .campaignId("campaignId")
                .createdAt("2021-03-08T17:57:48.801186")
                .phoneNumber("+18005550199")
                .updatedAt("2021-03-08T17:57:48.801186")
                .assignmentStatus(PhoneNumberCampaign.AssignmentStatus.ASSIGNED)
                .brandId("7ba705b7-22af-493f-addc-ac04b7ca071c")
                .failureReasons("failureReasons")
                .tcrBrandId("BBRAND1")
                .tcrCampaignId("CCAMPA1")
                .telnyxCampaignId("3008dd9f-66d7-40e0-bf23-bf2d8d1a96ba")
                .build()

        val roundtrippedPhoneNumberCampaign =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberCampaign),
                jacksonTypeRef<PhoneNumberCampaign>(),
            )

        assertThat(roundtrippedPhoneNumberCampaign).isEqualTo(phoneNumberCampaign)
    }
}
