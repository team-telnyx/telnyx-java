// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.connections.ConnectionListActiveCallsParams
import com.telnyx.sdk.models.connections.ConnectionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConnectionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val connectionService = client.connections()

        val connection = connectionService.retrieve("id")

        connection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val connectionService = client.connections()

        val connections =
            connectionService.list(
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

        connections.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listActiveCalls() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val connectionService = client.connections()

        val response =
            connectionService.listActiveCalls(
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

        response.validate()
    }
}
