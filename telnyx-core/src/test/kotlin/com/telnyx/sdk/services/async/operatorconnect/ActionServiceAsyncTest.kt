// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.operatorconnect

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun refresh() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.operatorConnect().actions()

        val responseFuture = actionServiceAsync.refresh()

        val response = responseFuture.get()
        response.validate()
    }
}
