// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberAssignmentByProfileServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun assign() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberAssignmentByProfileService =
            client.number10dlc().phoneNumberAssignmentByProfile()

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

    @Disabled("Prism tests are disabled")
    @Test
    fun getPhoneNumberStatus() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberAssignmentByProfileService =
            client.number10dlc().phoneNumberAssignmentByProfile()

        val response =
            phoneNumberAssignmentByProfileService.getPhoneNumberStatus(
                PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.builder()
                    .taskId("taskId")
                    .page(0L)
                    .recordsPerPage(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getTaskStatus() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberAssignmentByProfileService =
            client.number10dlc().phoneNumberAssignmentByProfile()

        val response = phoneNumberAssignmentByProfileService.getTaskStatus("taskId")

        response.validate()
    }
}
