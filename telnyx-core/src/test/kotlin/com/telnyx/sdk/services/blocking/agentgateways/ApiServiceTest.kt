// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayNoAuth
import com.telnyx.sdk.models.agentgateways.apis.ApiCreateParams
import com.telnyx.sdk.models.agentgateways.apis.ApiDeleteParams
import com.telnyx.sdk.models.agentgateways.apis.ApiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val apiService = client.agentGateways().apis()

        val agentGatewayApiResponse =
            apiService.create(
                ApiCreateParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .name("petstore")
                    .specUrl("https://petstore3.swagger.io/api/v3/openapi.json")
                    .auth(AgentGatewayNoAuth.builder().type(AgentGatewayNoAuth.Type.NONE).build())
                    .baseUrl("https://petstore3.swagger.io/api/v3")
                    .addForwardedHeader("string")
                    .openToEveryKey(true)
                    .staticHeaders(
                        ApiCreateParams.StaticHeaders.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addTool("string")
                    .build()
            )

        agentGatewayApiResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val apiService = client.agentGateways().apis()

        val agentGatewayApiResponse =
            apiService.update(
                ApiUpdateParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .apiId("dbe53cc0-bf7e-4f7a-8d84-752d19890eb3")
                    .auth(AgentGatewayNoAuth.builder().type(AgentGatewayNoAuth.Type.NONE).build())
                    .baseUrl("base_url")
                    .addForwardedHeader("string")
                    .name("name")
                    .openToEveryKey(true)
                    .specUrl("spec_url")
                    .staticHeaders(
                        ApiUpdateParams.StaticHeaders.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addTool("findpetsbystatus")
                    .addTool("getpetbyid")
                    .build()
            )

        agentGatewayApiResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val apiService = client.agentGateways().apis()

        val apis = apiService.list("32ce035d-3165-4031-b1a7-a7c0c259590a")

        apis.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val apiService = client.agentGateways().apis()

        val agentGatewayApiResponse =
            apiService.delete(
                ApiDeleteParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .apiId("dbe53cc0-bf7e-4f7a-8d84-752d19890eb3")
                    .build()
            )

        agentGatewayApiResponse.validate()
    }
}
