// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.sources

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceReplaceParamsTest {

    @Test
    fun create() {
        SourceReplaceParams.builder()
            .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
            .addSource(
                SourceRequest.builder().sourceType(SourceType.VOICE).bucketId("policy-docs").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SourceReplaceParams.builder()
                .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .addSource(SourceRequest.builder().sourceType(SourceType.VOICE).build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SourceReplaceParams.builder()
                .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .addSource(
                    SourceRequest.builder()
                        .sourceType(SourceType.VOICE)
                        .bucketId("policy-docs")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.sources())
            .containsExactly(
                SourceRequest.builder().sourceType(SourceType.VOICE).bucketId("policy-docs").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SourceReplaceParams.builder()
                .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .addSource(SourceRequest.builder().sourceType(SourceType.VOICE).build())
                .build()

        val body = params._body()

        assertThat(body.sources())
            .containsExactly(SourceRequest.builder().sourceType(SourceType.VOICE).build())
    }
}
