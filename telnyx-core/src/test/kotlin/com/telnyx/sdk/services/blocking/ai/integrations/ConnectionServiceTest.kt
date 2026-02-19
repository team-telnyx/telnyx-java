// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.integrations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val connectionService = client.ai().integrations().connections()

        val connection = connectionService.retrieve("user_connection_id")

        connection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val connectionService = client.ai().integrations().connections()

        val connections = connectionService.list()

        connections.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val connectionService = client.ai().integrations().connections()

        connectionService.delete("user_connection_id")
    }
}
