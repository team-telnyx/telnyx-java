// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.integrations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val connectionServiceAsync = client.ai().integrations().connections()

        val connectionFuture = connectionServiceAsync.retrieve("user_connection_id")

        val connection = connectionFuture.get()
        connection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val connectionServiceAsync = client.ai().integrations().connections()

        val connectionsFuture = connectionServiceAsync.list()

        val connections = connectionsFuture.get()
        connections.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val connectionServiceAsync = client.ai().integrations().connections()

        val future = connectionServiceAsync.delete("user_connection_id")

        val response = future.get()
    }
}
