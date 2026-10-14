// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting.CallingRoutingPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallingRoutingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callingRoutingServiceAsync = client.whatsapp().phoneNumbers().callingRouting()

        val callingRoutingsFuture = callingRoutingServiceAsync.list("+13125550100")

        val callingRoutings = callingRoutingsFuture.get()
        callingRoutings.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callingRoutingServiceAsync = client.whatsapp().phoneNumbers().callingRouting()

        val responseFuture =
            callingRoutingServiceAsync.patchAll(
                CallingRoutingPatchAllParams.builder()
                    .id("+13125550100")
                    .connectionId("1234567890")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
