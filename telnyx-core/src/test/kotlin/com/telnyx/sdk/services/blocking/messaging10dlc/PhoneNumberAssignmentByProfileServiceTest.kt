// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignParams
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileListPhoneNumberStatusParams
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun assign() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberAssignmentByProfileService =
            client.messaging10dlc().phoneNumberAssignmentByProfile()

        val response =
            phoneNumberAssignmentByProfileService.assign(
                PhoneNumberAssignmentByProfileAssignParams.builder()
                    .messagingProfileId("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
                    .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                    .tcrCampaignId("CWZTFH1")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPhoneNumberStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberAssignmentByProfileService =
            client.messaging10dlc().phoneNumberAssignmentByProfile()

        val response =
            phoneNumberAssignmentByProfileService.listPhoneNumberStatus(
                PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.builder()
                    .taskId("taskId")
                    .page(0L)
                    .recordsPerPage(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrievePhoneNumberStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberAssignmentByProfileService =
            client.messaging10dlc().phoneNumberAssignmentByProfile()

        val response =
            phoneNumberAssignmentByProfileService.retrievePhoneNumberStatus(
                PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.builder()
                    .taskId("taskId")
                    .page(0L)
                    .recordsPerPage(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberAssignmentByProfileService =
            client.messaging10dlc().phoneNumberAssignmentByProfile()

        val response = phoneNumberAssignmentByProfileService.retrieveStatus("taskId")

        response.validate()
    }
}
