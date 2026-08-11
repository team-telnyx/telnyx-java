// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionUpdateParamsTest {

    @Test
    fun create() {
        CollectionUpdateParams.builder()
            .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
            .description("Updated description.")
            .name("Support Transcripts (2026)")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CollectionUpdateParams.builder().uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e").build()

        assertThat(params._pathParam(0)).isEqualTo("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CollectionUpdateParams.builder()
                .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .description("Updated description.")
                .name("Support Transcripts (2026)")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("Updated description.")
        assertThat(body.name()).contains("Support Transcripts (2026)")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CollectionUpdateParams.builder().uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e").build()

        val body = params._body()
    }
}
