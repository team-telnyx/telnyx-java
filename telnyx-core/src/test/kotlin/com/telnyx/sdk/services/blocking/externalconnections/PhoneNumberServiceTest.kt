// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.externalconnections.phonenumbers.PhoneNumberRetrieveParams
import com.telnyx.sdk.models.externalconnections.phonenumbers.PhoneNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.externalConnections().phoneNumbers()

        val phoneNumber =
            phoneNumberService.retrieve(
                PhoneNumberRetrieveParams.builder()
                    .id("1293384261075731499")
                    .phoneNumberId("1234567889")
                    .build()
            )

        phoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.externalConnections().phoneNumbers()

        val phoneNumber =
            phoneNumberService.update(
                PhoneNumberUpdateParams.builder()
                    .id("1293384261075731499")
                    .phoneNumberId("1234567889")
                    .locationId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .build()
            )

        phoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.externalConnections().phoneNumbers()

        val page = phoneNumberService.list("1293384261075731499")

        page.response().validate()
    }
}
