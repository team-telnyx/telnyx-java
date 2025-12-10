// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfileAssignResponseTest {

    @Test
    fun create() {
        val phoneNumberAssignmentByProfileAssignResponse =
            PhoneNumberAssignmentByProfileAssignResponse.builder()
                .messagingProfileId("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
                .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .tcrCampaignId("CWZTFH1")
                .build()

        assertThat(phoneNumberAssignmentByProfileAssignResponse.messagingProfileId())
            .isEqualTo("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
        assertThat(phoneNumberAssignmentByProfileAssignResponse.taskId())
            .isEqualTo("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
        assertThat(phoneNumberAssignmentByProfileAssignResponse.campaignId())
            .contains("4b300178-131c-d902-d54e-72d90ba1620j")
        assertThat(phoneNumberAssignmentByProfileAssignResponse.tcrCampaignId()).contains("CWZTFH1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAssignmentByProfileAssignResponse =
            PhoneNumberAssignmentByProfileAssignResponse.builder()
                .messagingProfileId("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
                .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .tcrCampaignId("CWZTFH1")
                .build()

        val roundtrippedPhoneNumberAssignmentByProfileAssignResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberAssignmentByProfileAssignResponse),
                jacksonTypeRef<PhoneNumberAssignmentByProfileAssignResponse>(),
            )

        assertThat(roundtrippedPhoneNumberAssignmentByProfileAssignResponse)
            .isEqualTo(phoneNumberAssignmentByProfileAssignResponse)
    }
}
