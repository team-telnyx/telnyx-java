// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val connectionService = client.connections()

        val connection = connectionService.retrieve("id")

        connection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val connectionService = client.connections()

        val page = connectionService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listActiveCalls() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val connectionService = client.connections()

        val page = connectionService.listActiveCalls("1293384261075731461")

        page.response().validate()
    }
}
