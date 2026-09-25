// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespaceRetrieveParamsTest {

    @Test
    fun create() {
        NamespaceRetrieveParams.builder().namespace("namespace").operationId("operation_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            NamespaceRetrieveParams.builder()
                .namespace("namespace")
                .operationId("operation_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("namespace")
        assertThat(params._pathParam(1)).isEqualTo("operation_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
