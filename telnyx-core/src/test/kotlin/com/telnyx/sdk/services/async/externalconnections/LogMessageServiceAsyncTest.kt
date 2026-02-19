// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LogMessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val logMessageServiceAsync = client.externalConnections().logMessages()

        val logMessageFuture = logMessageServiceAsync.retrieve("id")

        val logMessage = logMessageFuture.get()
        logMessage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val logMessageServiceAsync = client.externalConnections().logMessages()

        val pageFuture = logMessageServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun dismiss() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val logMessageServiceAsync = client.externalConnections().logMessages()

        val responseFuture = logMessageServiceAsync.dismiss("id")

        val response = responseFuture.get()
        response.validate()
    }
}
