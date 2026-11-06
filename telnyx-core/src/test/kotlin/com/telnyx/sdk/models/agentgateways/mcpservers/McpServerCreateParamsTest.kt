// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.mcpservers

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayStaticAuth
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerCreateParamsTest {

    @Test
    fun create() {
        McpServerCreateParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .name("orders")
            .url("http://10.40.3.7:9000/mcp")
            .auth(
                AgentGatewayStaticAuth.builder()
                    .type(AgentGatewayStaticAuth.Type.API_KEY)
                    .value("example-orders-key")
                    .header("header")
                    .build()
            )
            .addForwardedHeader("X-Request-Id")
            .openToEveryKey(true)
            .staticHeaders(
                McpServerCreateParams.StaticHeaders.builder()
                    .putAdditionalProperty("X-Env", JsonValue.from("prod"))
                    .build()
            )
            .addTool("string")
            .transport(McpServerCreateParams.Transport.HTTP)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            McpServerCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("orders")
                .url("http://10.40.3.7:9000/mcp")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            McpServerCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("orders")
                .url("http://10.40.3.7:9000/mcp")
                .auth(
                    AgentGatewayStaticAuth.builder()
                        .type(AgentGatewayStaticAuth.Type.API_KEY)
                        .value("example-orders-key")
                        .header("header")
                        .build()
                )
                .addForwardedHeader("X-Request-Id")
                .openToEveryKey(true)
                .staticHeaders(
                    McpServerCreateParams.StaticHeaders.builder()
                        .putAdditionalProperty("X-Env", JsonValue.from("prod"))
                        .build()
                )
                .addTool("string")
                .transport(McpServerCreateParams.Transport.HTTP)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("orders")
        assertThat(body.url()).isEqualTo("http://10.40.3.7:9000/mcp")
        assertThat(body.auth())
            .contains(
                McpServerCreateParams.Auth.ofAgentGatewayStatic(
                    AgentGatewayStaticAuth.builder()
                        .type(AgentGatewayStaticAuth.Type.API_KEY)
                        .value("example-orders-key")
                        .header("header")
                        .build()
                )
            )
        assertThat(body.forwardedHeaders().getOrNull()).containsExactly("X-Request-Id")
        assertThat(body.openToEveryKey()).contains(true)
        assertThat(body.staticHeaders())
            .contains(
                McpServerCreateParams.StaticHeaders.builder()
                    .putAdditionalProperty("X-Env", JsonValue.from("prod"))
                    .build()
            )
        assertThat(body.tools().getOrNull()).containsExactly("string")
        assertThat(body.transport()).contains(McpServerCreateParams.Transport.HTTP)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            McpServerCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("orders")
                .url("http://10.40.3.7:9000/mcp")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("orders")
        assertThat(body.url()).isEqualTo("http://10.40.3.7:9000/mcp")
    }
}
