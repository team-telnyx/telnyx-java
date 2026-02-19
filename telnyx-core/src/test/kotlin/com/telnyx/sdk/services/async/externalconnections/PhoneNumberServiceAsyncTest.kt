// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.externalconnections.phonenumbers.PhoneNumberRetrieveParams
import com.telnyx.sdk.models.externalconnections.phonenumbers.PhoneNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.externalConnections().phoneNumbers()

        val phoneNumberFuture =
            phoneNumberServiceAsync.retrieve(
                PhoneNumberRetrieveParams.builder().id("id").phoneNumberId("1234567889").build()
            )

        val phoneNumber = phoneNumberFuture.get()
        phoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.externalConnections().phoneNumbers()

        val phoneNumberFuture =
            phoneNumberServiceAsync.update(
                PhoneNumberUpdateParams.builder()
                    .id("id")
                    .phoneNumberId("1234567889")
                    .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val phoneNumber = phoneNumberFuture.get()
        phoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.externalConnections().phoneNumbers()

        val pageFuture = phoneNumberServiceAsync.list("id")

        val page = pageFuture.get()
        page.response().validate()
    }
}
