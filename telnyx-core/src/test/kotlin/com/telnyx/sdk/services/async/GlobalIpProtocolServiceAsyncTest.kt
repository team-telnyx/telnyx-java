// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GlobalIpProtocolServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val globalIpProtocolServiceAsync = client.globalIpProtocols()

        val globalIpProtocolsFuture = globalIpProtocolServiceAsync.list()

        val globalIpProtocols = globalIpProtocolsFuture.get()
        globalIpProtocols.validate()
    }
}
