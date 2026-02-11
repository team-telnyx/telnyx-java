// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.openai

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmbeddingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val embeddingServiceAsync = client.ai().openai().embeddings()

        val embeddingFuture =
            embeddingServiceAsync.create(
                EmbeddingCreateParams.builder()
                    .input("The quick brown fox jumps over the lazy dog")
                    .model("thenlper/gte-large")
                    .dimensions(0L)
                    .encodingFormat(EmbeddingCreateParams.EncodingFormat.FLOAT)
                    .user("user")
                    .build()
            )

        val embedding = embeddingFuture.get()
        embedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listModels() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val embeddingServiceAsync = client.ai().openai().embeddings()

        val responseFuture = embeddingServiceAsync.listModels()

        val response = responseFuture.get()
        response.validate()
    }
}
