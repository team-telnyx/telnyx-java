// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.sources

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceDeleteParamsTest {

    @Test
    fun create() {
        SourceDeleteParams.builder()
            .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
            .sourceId("42")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SourceDeleteParams.builder()
                .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .sourceId("42")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
        assertThat(params._pathParam(1)).isEqualTo("42")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
