// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentEmailContactTest {

    @Test
    fun create() {
        val agentEmailContact =
            AgentEmailContact.builder().address("dev@stainless.com").label("x").build()

        assertThat(agentEmailContact.address()).isEqualTo("dev@stainless.com")
        assertThat(agentEmailContact.label()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentEmailContact =
            AgentEmailContact.builder().address("dev@stainless.com").label("x").build()

        val roundtrippedAgentEmailContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentEmailContact),
                jacksonTypeRef<AgentEmailContact>(),
            )

        assertThat(roundtrippedAgentEmailContact).isEqualTo(agentEmailContact)
    }
}
