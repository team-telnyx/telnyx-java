// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging10dlc

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaignCreate
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberCampaignServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberCampaignServiceAsync = client.messaging10dlc().phoneNumberCampaigns()

        val phoneNumberCampaignFuture =
            phoneNumberCampaignServiceAsync.create(
                PhoneNumberCampaignCreate.builder()
                    .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                    .phoneNumber("+18005550199")
                    .build()
            )

        val phoneNumberCampaign = phoneNumberCampaignFuture.get()
        phoneNumberCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberCampaignServiceAsync = client.messaging10dlc().phoneNumberCampaigns()

        val phoneNumberCampaignFuture = phoneNumberCampaignServiceAsync.retrieve("phoneNumber")

        val phoneNumberCampaign = phoneNumberCampaignFuture.get()
        phoneNumberCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberCampaignServiceAsync = client.messaging10dlc().phoneNumberCampaigns()

        val phoneNumberCampaignFuture =
            phoneNumberCampaignServiceAsync.update(
                PhoneNumberCampaignUpdateParams.builder()
                    .campaignPhoneNumber("phoneNumber")
                    .phoneNumberCampaignCreate(
                        PhoneNumberCampaignCreate.builder()
                            .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                            .phoneNumber("+18005550199")
                            .build()
                    )
                    .build()
            )

        val phoneNumberCampaign = phoneNumberCampaignFuture.get()
        phoneNumberCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberCampaignServiceAsync = client.messaging10dlc().phoneNumberCampaigns()

        val pageFuture = phoneNumberCampaignServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberCampaignServiceAsync = client.messaging10dlc().phoneNumberCampaigns()

        val phoneNumberCampaignFuture = phoneNumberCampaignServiceAsync.delete("phoneNumber")

        val phoneNumberCampaign = phoneNumberCampaignFuture.get()
        phoneNumberCampaign.validate()
    }
}
