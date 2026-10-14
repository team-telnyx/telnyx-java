// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespaceCreateParamsTest {

    @Test
    fun create() {
        NamespaceCreateParams.builder().name("staging").build()
    }

    @Test
    fun body() {
        val params = NamespaceCreateParams.builder().name("staging").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("staging")
    }
}
