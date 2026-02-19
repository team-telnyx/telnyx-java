// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.organizations.users

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.organizations().users().actions()

        val actionFuture = actionServiceAsync.remove("id")

        val action = actionFuture.get()
        action.validate()
    }
}
