// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.loa

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentInputTest {

    @Test
    fun create() {
        val agentInput =
            AgentInput.builder()
                .administrativeArea("administrative_area")
                .city("city")
                .contactEmail("dev@stainless.com")
                .contactName("contact_name")
                .contactPhone("+13125550000")
                .contactTitle("contact_title")
                .country("US")
                .legalName("legal_name")
                .postalCode("postal_code")
                .streetAddress("street_address")
                .dba("dba")
                .extendedAddress("extended_address")
                .build()

        assertThat(agentInput.administrativeArea()).isEqualTo("administrative_area")
        assertThat(agentInput.city()).isEqualTo("city")
        assertThat(agentInput.contactEmail()).isEqualTo("dev@stainless.com")
        assertThat(agentInput.contactName()).isEqualTo("contact_name")
        assertThat(agentInput.contactPhone()).isEqualTo("+13125550000")
        assertThat(agentInput.contactTitle()).isEqualTo("contact_title")
        assertThat(agentInput.country()).isEqualTo("US")
        assertThat(agentInput.legalName()).isEqualTo("legal_name")
        assertThat(agentInput.postalCode()).isEqualTo("postal_code")
        assertThat(agentInput.streetAddress()).isEqualTo("street_address")
        assertThat(agentInput.dba()).contains("dba")
        assertThat(agentInput.extendedAddress()).contains("extended_address")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentInput =
            AgentInput.builder()
                .administrativeArea("administrative_area")
                .city("city")
                .contactEmail("dev@stainless.com")
                .contactName("contact_name")
                .contactPhone("+13125550000")
                .contactTitle("contact_title")
                .country("US")
                .legalName("legal_name")
                .postalCode("postal_code")
                .streetAddress("street_address")
                .dba("dba")
                .extendedAddress("extended_address")
                .build()

        val roundtrippedAgentInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentInput),
                jacksonTypeRef<AgentInput>(),
            )

        assertThat(roundtrippedAgentInput).isEqualTo(agentInput)
    }
}
