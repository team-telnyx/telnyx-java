// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespaceTest {

    @Test
    fun create() {
        val namespace = Namespace.builder().id("id").name("name").build()

        assertThat(namespace.id()).isEqualTo("id")
        assertThat(namespace.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val namespace = Namespace.builder().id("id").name("name").build()

        val roundtrippedNamespace =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(namespace),
                jacksonTypeRef<Namespace>(),
            )

        assertThat(roundtrippedNamespace).isEqualTo(namespace)
    }
}
