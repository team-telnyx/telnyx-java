// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.openai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateEmbeddingsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmbeddingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createEmbeddings() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val embeddingService = client.ai().openai().embeddings()

        val response =
            embeddingService.createEmbeddings(
                EmbeddingCreateEmbeddingsParams.builder()
                    .input("The quick brown fox jumps over the lazy dog")
                    .model("thenlper/gte-large")
                    .dimensions(0L)
                    .encodingFormat(EmbeddingCreateEmbeddingsParams.EncodingFormat.FLOAT)
                    .user("user")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listEmbeddingModels() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val embeddingService = client.ai().openai().embeddings()

        val response = embeddingService.listEmbeddingModels()

        response.validate()
    }
}
