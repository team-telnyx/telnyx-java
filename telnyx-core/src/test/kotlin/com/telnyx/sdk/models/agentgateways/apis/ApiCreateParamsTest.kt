// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            ApiCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("petstore")
                .specUrl("https://petstore3.swagger.io/api/v3/openapi.json")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.name()).isEqualTo("petstore")
        assertThat(body.specUrl()).isEqualTo("https://petstore3.swagger.io/api/v3/openapi.json")
        assertThat(body.auth())
            .contains(
                ApiCreateParams.Auth.ofAgentGatewayNo(
                    AgentGatewayNoAuth.builder().type(AgentGatewayNoAuth.Type.NONE).build()
                )
            )
        assertThat(body.baseUrl()).contains("https://petstore3.swagger.io/api/v3")
        assertThat(body.forwardedHeaders().getOrNull()).containsExactly("string")
        assertThat(body.openToEveryKey()).contains(true)
        assertThat(body.staticHeaders())
            .contains(
                ApiCreateParams.StaticHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.tools().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ApiCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("petstore")
                .specUrl("https://petstore3.swagger.io/api/v3/openapi.json")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("petstore")
        assertThat(body.specUrl()).isEqualTo("https://petstore3.swagger.io/api/v3/openapi.json")
    }
}
