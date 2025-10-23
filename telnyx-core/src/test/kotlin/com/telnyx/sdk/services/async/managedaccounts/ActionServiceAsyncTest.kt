// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.managedaccounts

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.managedaccounts.actions.ActionEnableParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun disable() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.managedAccounts().actions()

        val responseFuture = actionServiceAsync.disable("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun enable() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.managedAccounts().actions()

        val responseFuture =
            actionServiceAsync.enable(
                ActionEnableParams.builder().id("id").reenableAllConnections(true).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
