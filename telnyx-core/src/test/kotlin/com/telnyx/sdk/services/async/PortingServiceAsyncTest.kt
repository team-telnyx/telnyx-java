// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PortingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listUkCarriers() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val portingServiceAsync = client.porting()

        val responseFuture = portingServiceAsync.listUkCarriers()

        val response = responseFuture.get()
        response.validate()
    }
}
