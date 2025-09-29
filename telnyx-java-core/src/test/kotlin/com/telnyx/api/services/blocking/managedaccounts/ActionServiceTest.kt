// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.managedaccounts

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.managedaccounts.actions.ActionEnableParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun disable() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.managedAccounts().actions()

        val response = actionService.disable("id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun enable() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.managedAccounts().actions()

        val response =
            actionService.enable(
                ActionEnableParams.builder().id("id").reenableAllConnections(true).build()
            )

        response.validate()
    }
}
