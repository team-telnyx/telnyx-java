// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.organizations.users

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.organizations().users().actions()

        val action = actionService.remove("id")

        action.validate()
    }
}
