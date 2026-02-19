// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WellKnownServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAuthorizationServerMetadata() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wellKnownService = client.wellKnown()

        val response = wellKnownService.retrieveAuthorizationServerMetadata()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveProtectedResourceMetadata() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wellKnownService = client.wellKnown()

        val response = wellKnownService.retrieveProtectedResourceMetadata()

        response.validate()
    }
}
