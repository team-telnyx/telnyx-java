// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.numberreservations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun extend() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.numberReservations().actions()

        val response = actionService.extend("number_reservation_id")

        response.validate()
    }
}
