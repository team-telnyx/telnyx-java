// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.wireless.WirelessRetrieveRegionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WirelessServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRegions() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessServiceAsync = client.wireless()

        val responseFuture =
            wirelessServiceAsync.retrieveRegions(
                WirelessRetrieveRegionsParams.builder().product("public_ips").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
