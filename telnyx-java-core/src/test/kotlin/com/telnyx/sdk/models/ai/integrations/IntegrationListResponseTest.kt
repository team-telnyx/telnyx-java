// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.integrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationListResponseTest {

    @Test
    fun create() {
        val integrationListResponse =
            IntegrationListResponse.builder()
                .addData(
                    IntegrationListResponse.Data.builder()
                        .id("id")
                        .addAvailableTool("string")
                        .description("description")
                        .displayName("display_name")
                        .logoUrl("logo_url")
                        .name("name")
                        .status(IntegrationListResponse.Data.Status.DISCONNECTED)
                        .build()
                )
                .build()

        assertThat(integrationListResponse.data())
            .containsExactly(
                IntegrationListResponse.Data.builder()
                    .id("id")
                    .addAvailableTool("string")
                    .description("description")
                    .displayName("display_name")
                    .logoUrl("logo_url")
                    .name("name")
                    .status(IntegrationListResponse.Data.Status.DISCONNECTED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationListResponse =
            IntegrationListResponse.builder()
                .addData(
                    IntegrationListResponse.Data.builder()
                        .id("id")
                        .addAvailableTool("string")
                        .description("description")
                        .displayName("display_name")
                        .logoUrl("logo_url")
                        .name("name")
                        .status(IntegrationListResponse.Data.Status.DISCONNECTED)
                        .build()
                )
                .build()

        val roundtrippedIntegrationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationListResponse),
                jacksonTypeRef<IntegrationListResponse>(),
            )

        assertThat(roundtrippedIntegrationListResponse).isEqualTo(integrationListResponse)
    }
}
