// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayApiResponseTest {

    @Test
    fun create() {
        val agentGatewayApiResponse =
            AgentGatewayApiResponse.builder()
                .data(
                    AgentGatewayApi.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .auth(AgentGatewayShownAuth.builder().type("type").build())
                        .baseUrl("base_url")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addForwardedHeader("string")
                        .name("name")
                        .openToEveryKey(true)
                        .specUrl("spec_url")
                        .staticHeaders(
                            AgentGatewayApi.StaticHeaders.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(agentGatewayApiResponse.data())
            .isEqualTo(
                AgentGatewayApi.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .auth(AgentGatewayShownAuth.builder().type("type").build())
                    .baseUrl("base_url")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addForwardedHeader("string")
                    .name("name")
                    .openToEveryKey(true)
                    .specUrl("spec_url")
                    .staticHeaders(
                        AgentGatewayApi.StaticHeaders.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addTool("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayApiResponse =
            AgentGatewayApiResponse.builder()
                .data(
                    AgentGatewayApi.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .auth(AgentGatewayShownAuth.builder().type("type").build())
                        .baseUrl("base_url")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addForwardedHeader("string")
                        .name("name")
                        .openToEveryKey(true)
                        .specUrl("spec_url")
                        .staticHeaders(
                            AgentGatewayApi.StaticHeaders.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedAgentGatewayApiResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayApiResponse),
                jacksonTypeRef<AgentGatewayApiResponse>(),
            )

        assertThat(roundtrippedAgentGatewayApiResponse).isEqualTo(agentGatewayApiResponse)
    }
}
