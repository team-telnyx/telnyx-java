// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            ApiUpdateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .apiId("dbe53cc0-bf7e-4f7a-8d84-752d19890eb3")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1)).isEqualTo("dbe53cc0-bf7e-4f7a-8d84-752d19890eb3")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.auth())
            .contains(
                ApiUpdateParams.Auth.ofAgentGatewayNo(
                    AgentGatewayNoAuth.builder().type(AgentGatewayNoAuth.Type.NONE).build()
                )
            )
        assertThat(body.baseUrl()).contains("base_url")
        assertThat(body.forwardedHeaders().getOrNull()).containsExactly("string")
        assertThat(body.name()).contains("name")
        assertThat(body.openToEveryKey()).contains(true)
        assertThat(body.specUrl()).contains("spec_url")
        assertThat(body.staticHeaders())
            .contains(
                ApiUpdateParams.StaticHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.tools().getOrNull()).containsExactly("findpetsbystatus", "getpetbyid")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ApiUpdateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .apiId("dbe53cc0-bf7e-4f7a-8d84-752d19890eb3")
                .build()

        val body = params._body()
    }
}
