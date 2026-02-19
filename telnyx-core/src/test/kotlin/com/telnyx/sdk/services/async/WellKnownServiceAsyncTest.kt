// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WellKnownServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAuthorizationServerMetadata() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val wellKnownServiceAsync = client.wellKnown()

        val responseFuture = wellKnownServiceAsync.retrieveAuthorizationServerMetadata()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveProtectedResourceMetadata() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val wellKnownServiceAsync = client.wellKnown()

        val responseFuture = wellKnownServiceAsync.retrieveProtectedResourceMetadata()

        val response = responseFuture.get()
        response.validate()
    }
}
