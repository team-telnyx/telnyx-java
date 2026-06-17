// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.integrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationTest {

    @Test
    fun create() {
        val integration =
            Integration.builder()
                .id("id")
                .addAvailableTool("string")
                .description("description")
                .displayName("display_name")
                .logoUrl("logo_url")
                .name("name")
                .status(Integration.Status.DISCONNECTED)
                .build()

        assertThat(integration.id()).isEqualTo("id")
        assertThat(integration.availableTools()).containsExactly("string")
        assertThat(integration.description()).isEqualTo("description")
        assertThat(integration.displayName()).isEqualTo("display_name")
        assertThat(integration.logoUrl()).isEqualTo("logo_url")
        assertThat(integration.name()).isEqualTo("name")
        assertThat(integration.status()).isEqualTo(Integration.Status.DISCONNECTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integration =
            Integration.builder()
                .id("id")
                .addAvailableTool("string")
                .description("description")
                .displayName("display_name")
                .logoUrl("logo_url")
                .name("name")
                .status(Integration.Status.DISCONNECTED)
                .build()

        val roundtrippedIntegration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integration),
                jacksonTypeRef<Integration>(),
            )

        assertThat(roundtrippedIntegration).isEqualTo(integration)
    }
}
