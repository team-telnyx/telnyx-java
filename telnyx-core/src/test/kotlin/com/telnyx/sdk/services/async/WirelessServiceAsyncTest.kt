// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.wireless.WirelessRetrieveRegionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WirelessServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRegions() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val wirelessServiceAsync = client.wireless()

        val responseFuture =
            wirelessServiceAsync.retrieveRegions(
                WirelessRetrieveRegionsParams.builder().product("public_ips").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
