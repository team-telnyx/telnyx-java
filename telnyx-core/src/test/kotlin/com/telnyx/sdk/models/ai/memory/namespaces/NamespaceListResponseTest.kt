// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespaceListResponseTest {

    @Test
    fun create() {
        val namespaceListResponse =
            NamespaceListResponse.builder()
                .addData(Namespace.builder().id("id").name("name").build())
                .build()

        assertThat(namespaceListResponse.data())
            .containsExactly(Namespace.builder().id("id").name("name").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val namespaceListResponse =
            NamespaceListResponse.builder()
                .addData(Namespace.builder().id("id").name("name").build())
                .build()

        val roundtrippedNamespaceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(namespaceListResponse),
                jacksonTypeRef<NamespaceListResponse>(),
            )

        assertThat(roundtrippedNamespaceListResponse).isEqualTo(namespaceListResponse)
    }
}
