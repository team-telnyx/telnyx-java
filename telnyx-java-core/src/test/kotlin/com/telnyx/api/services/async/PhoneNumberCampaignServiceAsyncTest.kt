// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.phonenumbercampaigns.PhoneNumberCampaignCreate
import com.telnyx.api.models.phonenumbercampaigns.PhoneNumberCampaignListParams
import com.telnyx.api.models.phonenumbercampaigns.PhoneNumberCampaignUpdateParams
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
        val phoneNumberCampaignServiceAsync = client.phoneNumberCampaigns()

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
        val phoneNumberCampaignServiceAsync = client.phoneNumberCampaigns()

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
        val phoneNumberCampaignServiceAsync = client.phoneNumberCampaigns()

        val phoneNumberCampaignFuture =
            phoneNumberCampaignServiceAsync.update(
                PhoneNumberCampaignUpdateParams.builder()
                    .pathPhoneNumber("phoneNumber")
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
        val phoneNumberCampaignServiceAsync = client.phoneNumberCampaigns()

        val phoneNumberCampaignsFuture =
            phoneNumberCampaignServiceAsync.list(
                PhoneNumberCampaignListParams.builder()
                    .filter(
                        PhoneNumberCampaignListParams.Filter.builder()
                            .tcrBrandId("BRANDID")
                            .tcrCampaignId("CAMPID3")
                            .telnyxBrandId("f3575e15-32ce-400e-a4c0-dd78800c20b0")
                            .telnyxCampaignId("f3575e15-32ce-400e-a4c0-dd78800c20b0")
                            .build()
                    )
                    .page(0L)
                    .recordsPerPage(0L)
                    .sort(PhoneNumberCampaignListParams.Sort.ASSIGNMENT_STATUS)
                    .build()
            )

        val phoneNumberCampaigns = phoneNumberCampaignsFuture.get()
        phoneNumberCampaigns.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberCampaignServiceAsync = client.phoneNumberCampaigns()

        val phoneNumberCampaignFuture = phoneNumberCampaignServiceAsync.delete("phoneNumber")

        val phoneNumberCampaign = phoneNumberCampaignFuture.get()
        phoneNumberCampaign.validate()
    }
}
