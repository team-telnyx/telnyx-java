// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.integrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationRetrieveResponseTest {

    @Test
    fun create() {
        val integrationRetrieveResponse =
            IntegrationRetrieveResponse.builder()
                .id("id")
                .addAvailableTool("string")
                .description("description")
                .displayName("display_name")
                .logoUrl("logo_url")
                .name("name")
                .status(IntegrationRetrieveResponse.Status.DISCONNECTED)
                .build()

        assertThat(integrationRetrieveResponse.id()).isEqualTo("id")
        assertThat(integrationRetrieveResponse.availableTools()).containsExactly("string")
        assertThat(integrationRetrieveResponse.description()).isEqualTo("description")
        assertThat(integrationRetrieveResponse.displayName()).isEqualTo("display_name")
        assertThat(integrationRetrieveResponse.logoUrl()).isEqualTo("logo_url")
        assertThat(integrationRetrieveResponse.name()).isEqualTo("name")
        assertThat(integrationRetrieveResponse.status())
            .isEqualTo(IntegrationRetrieveResponse.Status.DISCONNECTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationRetrieveResponse =
            IntegrationRetrieveResponse.builder()
                .id("id")
                .addAvailableTool("string")
                .description("description")
                .displayName("display_name")
                .logoUrl("logo_url")
                .name("name")
                .status(IntegrationRetrieveResponse.Status.DISCONNECTED)
                .build()

        val roundtrippedIntegrationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationRetrieveResponse),
                jacksonTypeRef<IntegrationRetrieveResponse>(),
            )

        assertThat(roundtrippedIntegrationRetrieveResponse).isEqualTo(integrationRetrieveResponse)
    }
}
