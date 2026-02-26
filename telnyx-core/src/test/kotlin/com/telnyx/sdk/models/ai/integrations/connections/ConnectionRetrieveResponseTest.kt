// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.integrations.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionRetrieveResponseTest {

    @Test
    fun create() {
        val connectionRetrieveResponse =
            ConnectionRetrieveResponse.builder()
                .data(
                    IntegrationConnection.builder()
                        .id("id")
                        .addAllowedTool("string")
                        .integrationId("integration_id")
                        .build()
                )
                .build()

        assertThat(connectionRetrieveResponse.data())
            .isEqualTo(
                IntegrationConnection.builder()
                    .id("id")
                    .addAllowedTool("string")
                    .integrationId("integration_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionRetrieveResponse =
            ConnectionRetrieveResponse.builder()
                .data(
                    IntegrationConnection.builder()
                        .id("id")
                        .addAllowedTool("string")
                        .integrationId("integration_id")
                        .build()
                )
                .build()

        val roundtrippedConnectionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionRetrieveResponse),
                jacksonTypeRef<ConnectionRetrieveResponse>(),
            )

        assertThat(roundtrippedConnectionRetrieveResponse).isEqualTo(connectionRetrieveResponse)
    }
}
