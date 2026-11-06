// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.PageMeta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayListPageResponseTest {

    @Test
    fun create() {
        val agentGatewayListPageResponse =
            AgentGatewayListPageResponse.builder()
                .addData(
                    AgentGateway.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .engineVersion("engine_version")
                        .gatewayUrl("gateway_url")
                        .name("name")
                        .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(AgentGateway.Status.PENDING)
                        .wireguardInterfaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .meta(
                    PageMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(agentGatewayListPageResponse.data())
            .containsExactly(
                AgentGateway.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .engineVersion("engine_version")
                    .gatewayUrl("gateway_url")
                    .name("name")
                    .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(AgentGateway.Status.PENDING)
                    .wireguardInterfaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(agentGatewayListPageResponse.meta())
            .isEqualTo(
                PageMeta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayListPageResponse =
            AgentGatewayListPageResponse.builder()
                .addData(
                    AgentGateway.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .engineVersion("engine_version")
                        .gatewayUrl("gateway_url")
                        .name("name")
                        .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(AgentGateway.Status.PENDING)
                        .wireguardInterfaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .meta(
                    PageMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedAgentGatewayListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayListPageResponse),
                jacksonTypeRef<AgentGatewayListPageResponse>(),
            )

        assertThat(roundtrippedAgentGatewayListPageResponse).isEqualTo(agentGatewayListPageResponse)
    }
}
