// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayApiTest {

    @Test
    fun create() {
        val agentGatewayApi =
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

        assertThat(agentGatewayApi.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(agentGatewayApi.auth())
            .isEqualTo(AgentGatewayShownAuth.builder().type("type").build())
        assertThat(agentGatewayApi.baseUrl()).contains("base_url")
        assertThat(agentGatewayApi.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGatewayApi.forwardedHeaders()).containsExactly("string")
        assertThat(agentGatewayApi.name()).isEqualTo("name")
        assertThat(agentGatewayApi.openToEveryKey()).isEqualTo(true)
        assertThat(agentGatewayApi.specUrl()).isEqualTo("spec_url")
        assertThat(agentGatewayApi.staticHeaders())
            .isEqualTo(
                AgentGatewayApi.StaticHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(agentGatewayApi.tools()).containsExactly("string")
        assertThat(agentGatewayApi.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayApi =
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

        val roundtrippedAgentGatewayApi =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayApi),
                jacksonTypeRef<AgentGatewayApi>(),
            )

        assertThat(roundtrippedAgentGatewayApi).isEqualTo(agentGatewayApi)
    }
}
