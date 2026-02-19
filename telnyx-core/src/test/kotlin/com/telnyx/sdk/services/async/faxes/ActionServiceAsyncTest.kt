// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.faxes

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.faxes().actions()

        val responseFuture = actionServiceAsync.cancel("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun refresh() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.faxes().actions()

        val responseFuture = actionServiceAsync.refresh("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }
}
