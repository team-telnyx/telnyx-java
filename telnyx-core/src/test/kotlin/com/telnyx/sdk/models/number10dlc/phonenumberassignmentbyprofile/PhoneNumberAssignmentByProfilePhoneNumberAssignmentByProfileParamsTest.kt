// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParamsTest {

    @Test
    fun create() {
        PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams.builder()
            .messagingProfileId("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
            .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
            .tcrCampaignId("CWZTFH1")
            .build()
    }

    @Test
    fun body() {
        val params =
            PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams.builder()
                .messagingProfileId("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .tcrCampaignId("CWZTFH1")
                .build()

        val body = params._body()

        assertThat(body.messagingProfileId()).isEqualTo("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
        assertThat(body.campaignId()).contains("4b300178-131c-d902-d54e-72d90ba1620j")
        assertThat(body.tcrCampaignId()).contains("CWZTFH1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams.builder()
                .messagingProfileId("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
                .build()

        val body = params._body()

        assertThat(body.messagingProfileId()).isEqualTo("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
    }
}
