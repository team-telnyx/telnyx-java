// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.wireless.WirelessRetrieveRegionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WirelessServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRegions() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wirelessService = client.wireless()

        val response =
            wirelessService.retrieveRegions(
                WirelessRetrieveRegionsParams.builder().product("public_ips").build()
            )

        response.validate()
    }
}
