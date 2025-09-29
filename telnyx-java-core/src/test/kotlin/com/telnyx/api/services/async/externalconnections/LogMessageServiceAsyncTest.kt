// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.externalconnections

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.externalconnections.logmessages.LogMessageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LogMessageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logMessageServiceAsync = client.externalConnections().logMessages()

        val logMessageFuture = logMessageServiceAsync.retrieve("id")

        val logMessage = logMessageFuture.get()
        logMessage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logMessageServiceAsync = client.externalConnections().logMessages()

        val logMessagesFuture =
            logMessageServiceAsync.list(
                LogMessageListParams.builder()
                    .filter(
                        LogMessageListParams.Filter.builder()
                            .externalConnectionId("67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2")
                            .telephoneNumber(
                                LogMessageListParams.Filter.TelephoneNumber.builder()
                                    .contains("+123")
                                    .eq("+1234567890")
                                    .build()
                            )
                            .build()
                    )
                    .page(LogMessageListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val logMessages = logMessagesFuture.get()
        logMessages.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun dismiss() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logMessageServiceAsync = client.externalConnections().logMessages()

        val responseFuture = logMessageServiceAsync.dismiss("id")

        val response = responseFuture.get()
        response.validate()
    }
}
