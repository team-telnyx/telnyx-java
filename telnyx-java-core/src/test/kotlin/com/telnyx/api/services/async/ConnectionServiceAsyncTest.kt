// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.connections.ConnectionListActiveCallsParams
import com.telnyx.api.models.connections.ConnectionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConnectionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val connectionServiceAsync = client.connections()

        val connectionFuture = connectionServiceAsync.retrieve("id")

        val connection = connectionFuture.get()
        connection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val connectionServiceAsync = client.connections()

        val connectionsFuture =
            connectionServiceAsync.list(
                ConnectionListParams.builder()
                    .filter(
                        ConnectionListParams.Filter.builder()
                            .connectionName(
                                ConnectionListParams.Filter.ConnectionName.builder()
                                    .contains("contains")
                                    .build()
                            )
                            .fqdn("fqdn")
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .build()
                    )
                    .page(ConnectionListParams.Page.builder().number(1L).size(1L).build())
                    .sort(ConnectionListParams.Sort.CONNECTION_NAME)
                    .build()
            )

        val connections = connectionsFuture.get()
        connections.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listActiveCalls() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val connectionServiceAsync = client.connections()

        val responseFuture =
            connectionServiceAsync.listActiveCalls(
                ConnectionListActiveCallsParams.builder()
                    .connectionId("1293384261075731461")
                    .page(
                        ConnectionListActiveCallsParams.Page.builder()
                            .after("after")
                            .before("before")
                            .limit(1L)
                            .number(1L)
                            .size(1L)
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
