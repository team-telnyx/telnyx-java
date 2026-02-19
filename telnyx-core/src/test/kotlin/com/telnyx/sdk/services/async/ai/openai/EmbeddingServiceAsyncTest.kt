// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.openai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateEmbeddingsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmbeddingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createEmbeddings() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val embeddingServiceAsync = client.ai().openai().embeddings()

        val responseFuture =
            embeddingServiceAsync.createEmbeddings(
                EmbeddingCreateEmbeddingsParams.builder()
                    .input("The quick brown fox jumps over the lazy dog")
                    .model("thenlper/gte-large")
                    .dimensions(0L)
                    .encodingFormat(EmbeddingCreateEmbeddingsParams.EncodingFormat.FLOAT)
                    .user("user")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listEmbeddingModels() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val embeddingServiceAsync = client.ai().openai().embeddings()

        val responseFuture = embeddingServiceAsync.listEmbeddingModels()

        val response = responseFuture.get()
        response.validate()
    }
}
