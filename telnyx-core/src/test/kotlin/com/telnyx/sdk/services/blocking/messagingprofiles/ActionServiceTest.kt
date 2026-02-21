// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messagingprofiles

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun regenerateSecret() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.messagingProfiles().actions()

        val response = actionService.regenerateSecret("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }
}
