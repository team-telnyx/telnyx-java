// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.ai.embeddings.EmbeddingCreateParams
import com.telnyx.api.models.ai.embeddings.EmbeddingListParams
import com.telnyx.api.models.ai.embeddings.EmbeddingSimilaritySearchParams
import com.telnyx.api.models.ai.embeddings.EmbeddingUrlParams
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
        val embeddingService = client.ai().embeddings()

        val embeddingResponse =
            embeddingService.create(
                EmbeddingCreateParams.builder()
                    .bucketName("bucket_name")
                    .documentChunkOverlapSize(0L)
                    .documentChunkSize(0L)
                    .embeddingModel(EmbeddingCreateParams.EmbeddingModel.THENLPER_GTE_LARGE)
                    .loader(EmbeddingCreateParams.Loader.DEFAULT)
                    .build()
            )

        embeddingResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val embeddingService = client.ai().embeddings()

        val embedding = embeddingService.retrieve("task_id")

        embedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val embeddingService = client.ai().embeddings()

        val embeddings =
            embeddingService.list(EmbeddingListParams.builder().addStatus("string").build())

        embeddings.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun similaritySearch() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val embeddingService = client.ai().embeddings()

        val response =
            embeddingService.similaritySearch(
                EmbeddingSimilaritySearchParams.builder()
                    .bucketName("bucket_name")
                    .query("query")
                    .numOfDocs(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun url() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val embeddingService = client.ai().embeddings()

        val embeddingResponse =
            embeddingService.url(
                EmbeddingUrlParams.builder().bucketName("bucket_name").url("url").build()
            )

        embeddingResponse.validate()
    }
}
