// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberCampaignListPageResponseTest {

    @Test
    fun create() {
        val phoneNumberCampaignListPageResponse =
            PhoneNumberCampaignListPageResponse.builder()
                .page(0L)
                .addRecord(
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
                )
                .totalRecords(0L)
                .build()

        assertThat(phoneNumberCampaignListPageResponse.page()).isEqualTo(0L)
        assertThat(phoneNumberCampaignListPageResponse.records())
            .containsExactly(
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
            )
        assertThat(phoneNumberCampaignListPageResponse.totalRecords()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberCampaignListPageResponse =
            PhoneNumberCampaignListPageResponse.builder()
                .page(0L)
                .addRecord(
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
                )
                .totalRecords(0L)
                .build()

        val roundtrippedPhoneNumberCampaignListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberCampaignListPageResponse),
                jacksonTypeRef<PhoneNumberCampaignListPageResponse>(),
            )

        assertThat(roundtrippedPhoneNumberCampaignListPageResponse)
            .isEqualTo(phoneNumberCampaignListPageResponse)
    }
}
