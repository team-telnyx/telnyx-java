// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SignupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val signupServiceAsync = client.whatsapp().signup()

        val pageFuture = signupServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveStatus() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val signupServiceAsync = client.whatsapp().signup()

        val responseFuture = signupServiceAsync.retrieveStatus("id")

        val response = responseFuture.get()
        response.validate()
    }
}
