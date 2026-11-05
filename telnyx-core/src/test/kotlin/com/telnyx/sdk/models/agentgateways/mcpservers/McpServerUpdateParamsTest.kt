// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.mcpservers

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayNoAuth
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerUpdateParamsTest {

    @Test
    fun create() {
        McpServerUpdateParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .serverId("88d5a97b-4080-4855-8bac-a39811b1dc24")
            .auth(AgentGatewayNoAuth.builder().type(AgentGatewayNoAuth.Type.NONE).build())
            .addForwardedHeader("string")
            .name("name")
            .openToEveryKey(true)
            .staticHeaders(
                McpServerUpdateParams.StaticHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .addTool("get_order")
            .addTool("create_ticket")
            .transport(McpServerUpdateParams.Transport.HTTP)
            .url("url")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            McpServerUpdateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .serverId("88d5a97b-4080-4855-8bac-a39811b1dc24")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1)).isEqualTo("88d5a97b-4080-4855-8bac-a39811b1dc24")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            McpServerUpdateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .serverId("88d5a97b-4080-4855-8bac-a39811b1dc24")
                .auth(AgentGatewayNoAuth.builder().type(AgentGatewayNoAuth.Type.NONE).build())
                .addForwardedHeader("string")
                .name("name")
                .openToEveryKey(true)
                .staticHeaders(
                    McpServerUpdateParams.StaticHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addTool("get_order")
                .addTool("create_ticket")
                .transport(McpServerUpdateParams.Transport.HTTP)
                .url("url")
                .build()

        val body = params._body()

        assertThat(body.auth())
            .contains(
                McpServerUpdateParams.Auth.ofAgentGatewayNo(
                    AgentGatewayNoAuth.builder().type(AgentGatewayNoAuth.Type.NONE).build()
                )
            )
        assertThat(body.forwardedHeaders().getOrNull()).containsExactly("string")
        assertThat(body.name()).contains("name")
        assertThat(body.openToEveryKey()).contains(true)
        assertThat(body.staticHeaders())
            .contains(
                McpServerUpdateParams.StaticHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.tools().getOrNull()).containsExactly("get_order", "create_ticket")
        assertThat(body.transport()).contains(McpServerUpdateParams.Transport.HTTP)
        assertThat(body.url()).contains("url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            McpServerUpdateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .serverId("88d5a97b-4080-4855-8bac-a39811b1dc24")
                .build()

        val body = params._body()
    }
}
