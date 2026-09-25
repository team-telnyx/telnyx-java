// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespaceRetrieveResponseTest {

    @Test
    fun create() {
        val namespaceRetrieveResponse =
            NamespaceRetrieveResponse.builder()
                .data(
                    NamespaceRetrieveResponse.Data.builder()
                        .operationId("operation_id")
                        .status(NamespaceRetrieveResponse.Data.Status.PENDING)
                        .completedAt("completed_at")
                        .createdAt("created_at")
                        .build()
                )
                .build()

        assertThat(namespaceRetrieveResponse.data())
            .isEqualTo(
                NamespaceRetrieveResponse.Data.builder()
                    .operationId("operation_id")
                    .status(NamespaceRetrieveResponse.Data.Status.PENDING)
                    .completedAt("completed_at")
                    .createdAt("created_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val namespaceRetrieveResponse =
            NamespaceRetrieveResponse.builder()
                .data(
                    NamespaceRetrieveResponse.Data.builder()
                        .operationId("operation_id")
                        .status(NamespaceRetrieveResponse.Data.Status.PENDING)
                        .completedAt("completed_at")
                        .createdAt("created_at")
                        .build()
                )
                .build()

        val roundtrippedNamespaceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(namespaceRetrieveResponse),
                jacksonTypeRef<NamespaceRetrieveResponse>(),
            )

        assertThat(roundtrippedNamespaceRetrieveResponse).isEqualTo(namespaceRetrieveResponse)
    }
}
