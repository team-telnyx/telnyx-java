// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.credentialconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun checkRegistrationStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.credentialConnections().actions()

        val response = actionService.checkRegistrationStatus("id")

        response.validate()
    }
}
