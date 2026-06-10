// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallReasonServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callReasonServiceAsync = client.callReasons()

        val pageFuture = callReasonServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun validate() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callReasonServiceAsync = client.callReasons()

        val responseFuture =
            callReasonServiceAsync.validate(listOf("Appointment reminders", "Billing inquiries"))

        val response = responseFuture.get()
        response.validate()
    }
}
