// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LogMessageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logMessageService = client.externalConnections().logMessages()

        val logMessage = logMessageService.retrieve("id")

        logMessage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logMessageService = client.externalConnections().logMessages()

        val logMessages =
            logMessageService.list(
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

        logMessages.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun dismiss() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logMessageService = client.externalConnections().logMessages()

        val response = logMessageService.dismiss("id")

        response.validate()
    }
}
