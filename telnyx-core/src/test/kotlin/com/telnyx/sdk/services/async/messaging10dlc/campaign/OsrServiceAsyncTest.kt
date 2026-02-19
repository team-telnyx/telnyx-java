// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging10dlc.campaign

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OsrServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getAttributes() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val osrServiceAsync = client.messaging10dlc().campaign().osr()

        val responseFuture = osrServiceAsync.getAttributes("campaignId")

        val response = responseFuture.get()
        response.validate()
    }
}
