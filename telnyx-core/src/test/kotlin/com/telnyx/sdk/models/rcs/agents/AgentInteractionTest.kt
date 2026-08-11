// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentInteractionTest {

    @Test
    fun create() {
        val agentInteraction =
            AgentInteraction.builder()
                .interactionType(AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES)
                .description("x")
                .build()

        assertThat(agentInteraction.interactionType())
            .isEqualTo(AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES)
        assertThat(agentInteraction.description()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentInteraction =
            AgentInteraction.builder()
                .interactionType(AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES)
                .description("x")
                .build()

        val roundtrippedAgentInteraction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentInteraction),
                jacksonTypeRef<AgentInteraction>(),
            )

        assertThat(roundtrippedAgentInteraction).isEqualTo(agentInteraction)
    }
}
