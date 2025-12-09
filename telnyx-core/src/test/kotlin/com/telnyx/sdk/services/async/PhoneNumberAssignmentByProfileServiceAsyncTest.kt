// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignParams
import com.telnyx.sdk.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberAssignmentByProfileServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun assign() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberAssignmentByProfileServiceAsync = client.phoneNumberAssignmentByProfile()

        val responseFuture =
            phoneNumberAssignmentByProfileServiceAsync.assign(
                PhoneNumberAssignmentByProfileAssignParams.builder()
                    .messagingProfileId("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
                    .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                    .tcrCampaignId("CWZTFH1")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrievePhoneNumberStatus() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberAssignmentByProfileServiceAsync = client.phoneNumberAssignmentByProfile()

        val responseFuture =
            phoneNumberAssignmentByProfileServiceAsync.retrievePhoneNumberStatus(
                PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.builder()
                    .taskId("taskId")
                    .page(0L)
                    .recordsPerPage(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveStatus() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberAssignmentByProfileServiceAsync = client.phoneNumberAssignmentByProfile()

        val responseFuture = phoneNumberAssignmentByProfileServiceAsync.retrieveStatus("taskId")

        val response = responseFuture.get()
        response.validate()
    }
}
