// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentWebsiteContactTest {

    @Test
    fun create() {
        val agentWebsiteContact =
            AgentWebsiteContact.builder().label("x").url("https://example.com").build()

        assertThat(agentWebsiteContact.label()).isEqualTo("x")
        assertThat(agentWebsiteContact.url()).isEqualTo("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentWebsiteContact =
            AgentWebsiteContact.builder().label("x").url("https://example.com").build()

        val roundtrippedAgentWebsiteContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentWebsiteContact),
                jacksonTypeRef<AgentWebsiteContact>(),
            )

        assertThat(roundtrippedAgentWebsiteContact).isEqualTo(agentWebsiteContact)
    }
}
