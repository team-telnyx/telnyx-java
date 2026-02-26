// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.integrations.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConnectionTest {

    @Test
    fun create() {
        val integrationConnection =
            IntegrationConnection.builder()
                .id("id")
                .addAllowedTool("string")
                .integrationId("integration_id")
                .build()

        assertThat(integrationConnection.id()).isEqualTo("id")
        assertThat(integrationConnection.allowedTools()).containsExactly("string")
        assertThat(integrationConnection.integrationId()).isEqualTo("integration_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConnection =
            IntegrationConnection.builder()
                .id("id")
                .addAllowedTool("string")
                .integrationId("integration_id")
                .build()

        val roundtrippedIntegrationConnection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConnection),
                jacksonTypeRef<IntegrationConnection>(),
            )

        assertThat(roundtrippedIntegrationConnection).isEqualTo(integrationConnection)
    }
}
