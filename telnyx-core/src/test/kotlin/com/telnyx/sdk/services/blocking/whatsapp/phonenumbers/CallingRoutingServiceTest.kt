// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting.CallingRoutingPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallingRoutingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callingRoutingService = client.whatsapp().phoneNumbers().callingRouting()

        val callingRoutings = callingRoutingService.list("+13125550100")

        callingRoutings.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callingRoutingService = client.whatsapp().phoneNumbers().callingRouting()

        val response =
            callingRoutingService.patchAll(
                CallingRoutingPatchAllParams.builder()
                    .id("+13125550100")
                    .connectionId("1234567890")
                    .build()
            )

        response.validate()
    }
}
