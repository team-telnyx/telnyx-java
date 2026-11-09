// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayPolicyGuardrailsTest {

    @Test
    fun create() {
        val agentGatewayPolicyGuardrails =
            AgentGatewayPolicyGuardrails.builder().addAdd("string").addRemove("string").build()

        assertThat(agentGatewayPolicyGuardrails.add().getOrNull()).containsExactly("string")
        assertThat(agentGatewayPolicyGuardrails.remove().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayPolicyGuardrails =
            AgentGatewayPolicyGuardrails.builder().addAdd("string").addRemove("string").build()

        val roundtrippedAgentGatewayPolicyGuardrails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayPolicyGuardrails),
                jacksonTypeRef<AgentGatewayPolicyGuardrails>(),
            )

        assertThat(roundtrippedAgentGatewayPolicyGuardrails).isEqualTo(agentGatewayPolicyGuardrails)
    }
}
