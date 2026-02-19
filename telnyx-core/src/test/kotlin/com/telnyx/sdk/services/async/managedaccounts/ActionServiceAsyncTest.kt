// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.managedaccounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.managedaccounts.actions.ActionEnableParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun disable() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.managedAccounts().actions()

        val responseFuture = actionServiceAsync.disable("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enable() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.managedAccounts().actions()

        val responseFuture =
            actionServiceAsync.enable(
                ActionEnableParams.builder().id("id").reenableAllConnections(true).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
