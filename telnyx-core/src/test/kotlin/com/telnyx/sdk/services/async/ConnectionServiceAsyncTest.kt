// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val connectionServiceAsync = client.connections()

        val connectionFuture = connectionServiceAsync.retrieve("id")

        val connection = connectionFuture.get()
        connection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val connectionServiceAsync = client.connections()

        val pageFuture = connectionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listActiveCalls() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val connectionServiceAsync = client.connections()

        val pageFuture = connectionServiceAsync.listActiveCalls("1293384261075731461")

        val page = pageFuture.get()
        page.response().validate()
    }
}
