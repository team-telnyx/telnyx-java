// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai.embeddings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingCreateParamsTest {

    @Test
    fun create() {
        EmbeddingCreateParams.builder()
            .input("The quick brown fox jumps over the lazy dog")
            .model("thenlper/gte-large")
            .dimensions(0L)
            .encodingFormat(EmbeddingCreateParams.EncodingFormat.FLOAT)
            .user("user")
            .build()
    }

    @Test
    fun body() {
        val params =
            EmbeddingCreateParams.builder()
                .input("The quick brown fox jumps over the lazy dog")
                .model("thenlper/gte-large")
                .dimensions(0L)
                .encodingFormat(EmbeddingCreateParams.EncodingFormat.FLOAT)
                .user("user")
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(
                EmbeddingCreateParams.Input.ofString("The quick brown fox jumps over the lazy dog")
            )
        assertThat(body.model()).isEqualTo("thenlper/gte-large")
        assertThat(body.dimensions()).contains(0L)
        assertThat(body.encodingFormat()).contains(EmbeddingCreateParams.EncodingFormat.FLOAT)
        assertThat(body.user()).contains("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmbeddingCreateParams.builder()
                .input("The quick brown fox jumps over the lazy dog")
                .model("thenlper/gte-large")
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(
                EmbeddingCreateParams.Input.ofString("The quick brown fox jumps over the lazy dog")
            )
        assertThat(body.model()).isEqualTo("thenlper/gte-large")
    }
}
