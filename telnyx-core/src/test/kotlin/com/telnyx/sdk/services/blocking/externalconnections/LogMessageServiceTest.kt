// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LogMessageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val logMessageService = client.externalConnections().logMessages()

        val logMessage = logMessageService.retrieve("id")

        logMessage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val logMessageService = client.externalConnections().logMessages()

        val page = logMessageService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun dismiss() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val logMessageService = client.externalConnections().logMessages()

        val response = logMessageService.dismiss("id")

        response.validate()
    }
}
