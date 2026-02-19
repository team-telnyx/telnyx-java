// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ListServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAll() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val listServiceAsync = client.list()

        val responseFuture = listServiceAsync.retrieveAll()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveByZone() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val listServiceAsync = client.list()

        val responseFuture = listServiceAsync.retrieveByZone("channel_zone_id")

        val response = responseFuture.get()
        response.validate()
    }
}
