// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentPhoneContactTest {

    @Test
    fun create() {
        val agentPhoneContact = AgentPhoneContact.builder().label("x").number("+49605132").build()

        assertThat(agentPhoneContact.label()).isEqualTo("x")
        assertThat(agentPhoneContact.number()).isEqualTo("+49605132")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentPhoneContact = AgentPhoneContact.builder().label("x").number("+49605132").build()

        val roundtrippedAgentPhoneContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentPhoneContact),
                jacksonTypeRef<AgentPhoneContact>(),
            )

        assertThat(roundtrippedAgentPhoneContact).isEqualTo(agentPhoneContact)
    }
}
