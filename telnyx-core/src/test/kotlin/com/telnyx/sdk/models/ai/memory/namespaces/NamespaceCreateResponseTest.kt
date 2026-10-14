// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespaceCreateResponseTest {

    @Test
    fun create() {
        val namespaceCreateResponse =
            NamespaceCreateResponse.builder()
                .data(Namespace.builder().id("id").name("name").build())
                .build()

        assertThat(namespaceCreateResponse.data())
            .isEqualTo(Namespace.builder().id("id").name("name").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val namespaceCreateResponse =
            NamespaceCreateResponse.builder()
                .data(Namespace.builder().id("id").name("name").build())
                .build()

        val roundtrippedNamespaceCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(namespaceCreateResponse),
                jacksonTypeRef<NamespaceCreateResponse>(),
            )

        assertThat(roundtrippedNamespaceCreateResponse).isEqualTo(namespaceCreateResponse)
    }
}
