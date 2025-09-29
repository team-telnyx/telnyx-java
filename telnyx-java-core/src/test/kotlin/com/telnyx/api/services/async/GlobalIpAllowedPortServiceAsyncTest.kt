// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GlobalIpAllowedPortServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAllowedPortServiceAsync = client.globalIpAllowedPorts()

        val globalIpAllowedPortsFuture = globalIpAllowedPortServiceAsync.list()

        val globalIpAllowedPorts = globalIpAllowedPortsFuture.get()
        globalIpAllowedPorts.validate()
    }
}
