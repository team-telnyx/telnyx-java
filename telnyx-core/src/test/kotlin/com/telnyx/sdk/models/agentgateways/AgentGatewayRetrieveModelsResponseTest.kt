// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayRetrieveModelsResponseTest {

    @Test
    fun create() {
        val agentGatewayRetrieveModelsResponse =
            AgentGatewayRetrieveModelsResponse.builder()
                .addData(
                    AgentGatewayRetrieveModelsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .model("model")
                        .name("name")
                        .pricedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .pricing(
                            AgentGatewayRetrieveModelsResponse.Data.Pricing.builder()
                                .cachedInput(0.0)
                                .currency("currency")
                                .input(0.0)
                                .output(0.0)
                                .unit("unit")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(agentGatewayRetrieveModelsResponse.data())
            .containsExactly(
                AgentGatewayRetrieveModelsResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .model("model")
                    .name("name")
                    .pricedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .pricing(
                        AgentGatewayRetrieveModelsResponse.Data.Pricing.builder()
                            .cachedInput(0.0)
                            .currency("currency")
                            .input(0.0)
                            .output(0.0)
                            .unit("unit")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayRetrieveModelsResponse =
            AgentGatewayRetrieveModelsResponse.builder()
                .addData(
                    AgentGatewayRetrieveModelsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .model("model")
                        .name("name")
                        .pricedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .pricing(
                            AgentGatewayRetrieveModelsResponse.Data.Pricing.builder()
                                .cachedInput(0.0)
                                .currency("currency")
                                .input(0.0)
                                .output(0.0)
                                .unit("unit")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedAgentGatewayRetrieveModelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayRetrieveModelsResponse),
                jacksonTypeRef<AgentGatewayRetrieveModelsResponse>(),
            )

        assertThat(roundtrippedAgentGatewayRetrieveModelsResponse)
            .isEqualTo(agentGatewayRetrieveModelsResponse)
    }
}
