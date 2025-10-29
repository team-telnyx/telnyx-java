// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.integrations.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionListResponseTest {

    @Test
    fun create() {
        val connectionListResponse =
            ConnectionListResponse.builder()
                .addData(
                    ConnectionListResponse.Data.builder()
                        .id("id")
                        .addAllowedTool("string")
                        .integrationId("integration_id")
                        .build()
                )
                .build()

        assertThat(connectionListResponse.data())
            .containsExactly(
                ConnectionListResponse.Data.builder()
                    .id("id")
                    .addAllowedTool("string")
                    .integrationId("integration_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionListResponse =
            ConnectionListResponse.builder()
                .addData(
                    ConnectionListResponse.Data.builder()
                        .id("id")
                        .addAllowedTool("string")
                        .integrationId("integration_id")
                        .build()
                )
                .build()

        val roundtrippedConnectionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionListResponse),
                jacksonTypeRef<ConnectionListResponse>(),
            )

        assertThat(roundtrippedConnectionListResponse).isEqualTo(connectionListResponse)
    }
}
