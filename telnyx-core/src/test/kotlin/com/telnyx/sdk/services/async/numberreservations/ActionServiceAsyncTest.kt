// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.numberreservations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun extend() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.numberReservations().actions()

        val responseFuture = actionServiceAsync.extend("number_reservation_id")

        val response = responseFuture.get()
        response.validate()
    }
}
