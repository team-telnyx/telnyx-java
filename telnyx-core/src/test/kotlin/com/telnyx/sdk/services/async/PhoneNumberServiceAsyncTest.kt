// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.phonenumbers.PhoneNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val phoneNumberFuture = phoneNumberServiceAsync.retrieve("1293384261075731499")

        val phoneNumber = phoneNumberFuture.get()
        phoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val phoneNumberFuture =
            phoneNumberServiceAsync.update(
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

        val phoneNumber = phoneNumberFuture.get()
        phoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val pageFuture = phoneNumberServiceAsync.list()

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
        val phoneNumberServiceAsync = client.phoneNumbers()

        val phoneNumberFuture = phoneNumberServiceAsync.delete("1293384261075731499")

        val phoneNumber = phoneNumberFuture.get()
        phoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun slimList() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val pageFuture = phoneNumberServiceAsync.slimList()

        val page = pageFuture.get()
        page.response().validate()
    }
}
