// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayPolicyStepTest {

    @Test
    fun create() {
        val agentGatewayPolicyStep =
            AgentGatewayPolicyStep.builder()
                .guardrail("guardrail")
                .message("message")
                .onError(AgentGatewayPolicyStep.OnError.NEXT)
                .onFail(AgentGatewayPolicyStep.OnFail.NEXT)
                .onPass(AgentGatewayPolicyStep.OnPass.NEXT)
                .passData(true)
                .build()

        assertThat(agentGatewayPolicyStep.guardrail()).isEqualTo("guardrail")
        assertThat(agentGatewayPolicyStep.message()).contains("message")
        assertThat(agentGatewayPolicyStep.onError()).contains(AgentGatewayPolicyStep.OnError.NEXT)
        assertThat(agentGatewayPolicyStep.onFail()).contains(AgentGatewayPolicyStep.OnFail.NEXT)
        assertThat(agentGatewayPolicyStep.onPass()).contains(AgentGatewayPolicyStep.OnPass.NEXT)
        assertThat(agentGatewayPolicyStep.passData()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayPolicyStep =
            AgentGatewayPolicyStep.builder()
                .guardrail("guardrail")
                .message("message")
                .onError(AgentGatewayPolicyStep.OnError.NEXT)
                .onFail(AgentGatewayPolicyStep.OnFail.NEXT)
                .onPass(AgentGatewayPolicyStep.OnPass.NEXT)
                .passData(true)
                .build()

        val roundtrippedAgentGatewayPolicyStep =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayPolicyStep),
                jacksonTypeRef<AgentGatewayPolicyStep>(),
            )

        assertThat(roundtrippedAgentGatewayPolicyStep).isEqualTo(agentGatewayPolicyStep)
    }
}
