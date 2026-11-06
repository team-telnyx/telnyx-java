// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.agentgateways.AgentGatewayCreateParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveSpendLogsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentGatewayServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentGatewayService = client.agentGateways()

        val agentGatewayResponse =
            agentGatewayService.create(
                AgentGatewayCreateParams.builder()
                    .wireguardInterfaceId("c788eb40-a4c0-4bf5-8f84-976027960f8e")
                    .name("support-gw")
                    .build()
            )

        agentGatewayResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentGatewayService = client.agentGateways()

        val agentGatewayResponse =
            agentGatewayService.retrieve("ecffdf4b-93ea-4a7b-8295-51dfd2077996")

        agentGatewayResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentGatewayService = client.agentGateways()

        val page = agentGatewayService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentGatewayService = client.agentGateways()

        val agentGatewayResponse =
            agentGatewayService.delete("ecffdf4b-93ea-4a7b-8295-51dfd2077996")

        agentGatewayResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveModels() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentGatewayService = client.agentGateways()

        val response = agentGatewayService.retrieveModels("32ce035d-3165-4031-b1a7-a7c0c259590a")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveSpendLogs() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentGatewayService = client.agentGateways()

        val response =
            agentGatewayService.retrieveSpendLogs(
                AgentGatewayRetrieveSpendLogsParams.builder()
                    .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .keyId("ecc2efdd09bd231a9ad9bd2aada37aa7ccc3d38a03cc25beb6c28aa0aaa316be")
                    .pageNumber(1L)
                    .pageSize(1L)
                    .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .teamId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
