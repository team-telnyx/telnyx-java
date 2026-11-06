// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayPolicyTest {

    @Test
    fun create() {
        val agentGatewayPolicy =
            AgentGatewayPolicy.builder()
                .base("base")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .guardrails(
                    AgentGatewayPolicyGuardrails.builder()
                        .addAdd("string")
                        .addRemove("string")
                        .build()
                )
                .model("model")
                .name("name")
                .pipeline(
                    AgentGatewayPolicyPipeline.builder()
                        .hook(AgentGatewayPolicyPipeline.Hook.BEFORE_REQUEST)
                        .addStep(
                            AgentGatewayPolicyStep.builder()
                                .guardrail("guardrail")
                                .message("message")
                                .onError(AgentGatewayPolicyStep.OnError.NEXT)
                                .onFail(AgentGatewayPolicyStep.OnFail.NEXT)
                                .onPass(AgentGatewayPolicyStep.OnPass.NEXT)
                                .passData(true)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(agentGatewayPolicy.base()).contains("base")
        assertThat(agentGatewayPolicy.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGatewayPolicy.description()).contains("description")
        assertThat(agentGatewayPolicy.guardrails())
            .isEqualTo(
                AgentGatewayPolicyGuardrails.builder().addAdd("string").addRemove("string").build()
            )
        assertThat(agentGatewayPolicy.model()).contains("model")
        assertThat(agentGatewayPolicy.name()).isEqualTo("name")
        assertThat(agentGatewayPolicy.pipeline())
            .contains(
                AgentGatewayPolicyPipeline.builder()
                    .hook(AgentGatewayPolicyPipeline.Hook.BEFORE_REQUEST)
                    .addStep(
                        AgentGatewayPolicyStep.builder()
                            .guardrail("guardrail")
                            .message("message")
                            .onError(AgentGatewayPolicyStep.OnError.NEXT)
                            .onFail(AgentGatewayPolicyStep.OnFail.NEXT)
                            .onPass(AgentGatewayPolicyStep.OnPass.NEXT)
                            .passData(true)
                            .build()
                    )
                    .build()
            )
        assertThat(agentGatewayPolicy.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayPolicy =
            AgentGatewayPolicy.builder()
                .base("base")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .guardrails(
                    AgentGatewayPolicyGuardrails.builder()
                        .addAdd("string")
                        .addRemove("string")
                        .build()
                )
                .model("model")
                .name("name")
                .pipeline(
                    AgentGatewayPolicyPipeline.builder()
                        .hook(AgentGatewayPolicyPipeline.Hook.BEFORE_REQUEST)
                        .addStep(
                            AgentGatewayPolicyStep.builder()
                                .guardrail("guardrail")
                                .message("message")
                                .onError(AgentGatewayPolicyStep.OnError.NEXT)
                                .onFail(AgentGatewayPolicyStep.OnFail.NEXT)
                                .onPass(AgentGatewayPolicyStep.OnPass.NEXT)
                                .passData(true)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAgentGatewayPolicy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayPolicy),
                jacksonTypeRef<AgentGatewayPolicy>(),
            )

        assertThat(roundtrippedAgentGatewayPolicy).isEqualTo(agentGatewayPolicy)
    }
}
