// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaging10dlc.Messaging10dlcGetEnumParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class Messaging10dlcServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEnum() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messaging10dlcServiceAsync = client.messaging10dlc()

        val responseFuture =
            messaging10dlcServiceAsync.getEnum(Messaging10dlcGetEnumParams.Endpoint.MNO)

        val response = responseFuture.get()
        response.validate()
    }
}
