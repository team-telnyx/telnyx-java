// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponseTest {

    @Test
    fun create() {
        val phoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse =
            PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse.builder()
                .messagingProfileId("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
                .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .tcrCampaignId("CWZTFH1")
                .build()

        assertThat(
                phoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse
                    .messagingProfileId()
            )
            .isEqualTo("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
        assertThat(phoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse.taskId())
            .isEqualTo("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
        assertThat(
                phoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse.campaignId()
            )
            .contains("4b300178-131c-d902-d54e-72d90ba1620j")
        assertThat(
                phoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse.tcrCampaignId()
            )
            .contains("CWZTFH1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse =
            PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse.builder()
                .messagingProfileId("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
                .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .tcrCampaignId("CWZTFH1")
                .build()

        val roundtrippedPhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    phoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse
                ),
                jacksonTypeRef<
                    PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse
                >(),
            )

        assertThat(roundtrippedPhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse)
            .isEqualTo(phoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse)
    }
}
