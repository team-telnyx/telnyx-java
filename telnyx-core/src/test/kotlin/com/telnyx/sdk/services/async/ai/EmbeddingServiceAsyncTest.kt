// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.embeddings.EmbeddingCreateParams
import com.telnyx.sdk.models.ai.embeddings.EmbeddingListParams
import com.telnyx.sdk.models.ai.embeddings.EmbeddingSimilaritySearchParams
import com.telnyx.sdk.models.ai.embeddings.EmbeddingUrlParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmbeddingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val embeddingServiceAsync = client.ai().embeddings()

        val embeddingResponseFuture =
            embeddingServiceAsync.create(
                EmbeddingCreateParams.builder()
                    .bucketName("bucket_name")
                    .documentChunkOverlapSize(0L)
                    .documentChunkSize(0L)
                    .embeddingModel(EmbeddingCreateParams.EmbeddingModel.THENLPER_GTE_LARGE)
                    .loader(EmbeddingCreateParams.Loader.DEFAULT)
                    .build()
            )

        val embeddingResponse = embeddingResponseFuture.get()
        embeddingResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val embeddingServiceAsync = client.ai().embeddings()

        val embeddingFuture = embeddingServiceAsync.retrieve("task_id")

        val embedding = embeddingFuture.get()
        embedding.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val embeddingServiceAsync = client.ai().embeddings()

        val embeddingsFuture =
            embeddingServiceAsync.list(EmbeddingListParams.builder().addStatus("string").build())

        val embeddings = embeddingsFuture.get()
        embeddings.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun similaritySearch() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val embeddingServiceAsync = client.ai().embeddings()

        val responseFuture =
            embeddingServiceAsync.similaritySearch(
                EmbeddingSimilaritySearchParams.builder()
                    .bucketName("bucket_name")
                    .query("query")
                    .numOfDocs(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun url() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val embeddingServiceAsync = client.ai().embeddings()

        val embeddingResponseFuture =
            embeddingServiceAsync.url(
                EmbeddingUrlParams.builder().bucketName("bucket_name").url("url").build()
            )

        val embeddingResponse = embeddingResponseFuture.get()
        embeddingResponse.validate()
    }
}
