// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.openai

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmbeddingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val embeddingService = client.ai().openai().embeddings()

        val embedding =
            embeddingService.create(
                EmbeddingCreateParams.builder()
                    .input("The quick brown fox jumps over the lazy dog")
                    .model("thenlper/gte-large")
                    .dimensions(0L)
                    .encodingFormat(EmbeddingCreateParams.EncodingFormat.FLOAT)
                    .user("user")
                    .build()
            )

        embedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listModels() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val embeddingService = client.ai().openai().embeddings()

        val response = embeddingService.listModels()

        response.validate()
    }
}
