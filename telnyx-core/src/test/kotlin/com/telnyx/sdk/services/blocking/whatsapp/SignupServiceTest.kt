// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SignupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val signupService = client.whatsapp().signup()

        val page = signupService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val signupService = client.whatsapp().signup()

        val response = signupService.retrieveStatus("id")

        response.validate()
    }
}
