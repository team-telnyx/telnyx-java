// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayPolicyPipelineTest {

    @Test
    fun create() {
        val agentGatewayPolicyPipeline =
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

        assertThat(agentGatewayPolicyPipeline.hook())
            .isEqualTo(AgentGatewayPolicyPipeline.Hook.BEFORE_REQUEST)
        assertThat(agentGatewayPolicyPipeline.steps())
            .containsExactly(
                AgentGatewayPolicyStep.builder()
                    .guardrail("guardrail")
                    .message("message")
                    .onError(AgentGatewayPolicyStep.OnError.NEXT)
                    .onFail(AgentGatewayPolicyStep.OnFail.NEXT)
                    .onPass(AgentGatewayPolicyStep.OnPass.NEXT)
                    .passData(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayPolicyPipeline =
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

        val roundtrippedAgentGatewayPolicyPipeline =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayPolicyPipeline),
                jacksonTypeRef<AgentGatewayPolicyPipeline>(),
            )

        assertThat(roundtrippedAgentGatewayPolicyPipeline).isEqualTo(agentGatewayPolicyPipeline)
    }
}
