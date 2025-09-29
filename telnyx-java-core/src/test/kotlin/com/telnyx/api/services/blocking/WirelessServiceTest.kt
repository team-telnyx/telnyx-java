// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.wireless.WirelessRetrieveRegionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WirelessServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRegions() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessService = client.wireless()

        val response =
            wirelessService.retrieveRegions(
                WirelessRetrieveRegionsParams.builder().product("public_ips").build()
            )

        response.validate()
    }
}
