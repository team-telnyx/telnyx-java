// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.managedaccounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.managedaccounts.actions.ActionEnableParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun disable() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.managedAccounts().actions()

        val response = actionService.disable("id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enable() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.managedAccounts().actions()

        val response =
            actionService.enable(
                ActionEnableParams.builder().id("id").reenableAllConnections(true).build()
            )

        response.validate()
    }
}
