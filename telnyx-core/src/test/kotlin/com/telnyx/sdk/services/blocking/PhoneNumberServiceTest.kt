// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.phonenumbers.PhoneNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberService = client.phoneNumbers()

        val phoneNumber = phoneNumberService.retrieve("1293384261075731499")

        phoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberService = client.phoneNumbers()

        val phoneNumber =
            phoneNumberService.update(
                PhoneNumberUpdateParams.builder()
                    .phoneNumberId("1293384261075731499")
                    .id("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .billingGroupId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .connectionId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .customerReference("customer-reference")
                    .externalPin("1234")
                    .hdVoiceEnabled(true)
                    .addTag("tag")
                    .build()
            )

        phoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberService = client.phoneNumbers()

        val page = phoneNumberService.list()

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
        val phoneNumberService = client.phoneNumbers()

        val phoneNumber = phoneNumberService.delete("1293384261075731499")

        phoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun slimList() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberService = client.phoneNumbers()

        val page = phoneNumberService.slimList()

        page.response().validate()
    }
}
