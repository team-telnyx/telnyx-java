// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaignCreate
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberCampaignServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberCampaignService = client.messaging10dlc().phoneNumberCampaigns()

        val phoneNumberCampaign =
            phoneNumberCampaignService.create(
                PhoneNumberCampaignCreate.builder()
                    .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                    .phoneNumber("+18005550199")
                    .build()
            )

        phoneNumberCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberCampaignService = client.messaging10dlc().phoneNumberCampaigns()

        val phoneNumberCampaign = phoneNumberCampaignService.retrieve("phoneNumber")

        phoneNumberCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberCampaignService = client.messaging10dlc().phoneNumberCampaigns()

        val phoneNumberCampaign =
            phoneNumberCampaignService.update(
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

        phoneNumberCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberCampaignService = client.messaging10dlc().phoneNumberCampaigns()

        val page = phoneNumberCampaignService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberCampaignService = client.messaging10dlc().phoneNumberCampaigns()

        val phoneNumberCampaign = phoneNumberCampaignService.delete("phoneNumber")

        phoneNumberCampaign.validate()
    }
}
