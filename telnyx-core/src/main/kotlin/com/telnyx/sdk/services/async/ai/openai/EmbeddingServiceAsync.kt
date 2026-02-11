// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.openai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateEmbeddingsParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateEmbeddingsResponse
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListEmbeddingModelsParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListEmbeddingModelsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EmbeddingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmbeddingServiceAsync

    /**
     * Creates an embedding vector representing the input text. This endpoint is compatible with the
     * [OpenAI Embeddings API](https://platform.openai.com/docs/api-reference/embeddings) and may be
     * used with the OpenAI JS or Python SDK by setting the base URL to
     * `https://api.telnyx.com/v2/ai/openai`.
     */
    fun createEmbeddings(
        params: EmbeddingCreateEmbeddingsParams
    ): CompletableFuture<EmbeddingCreateEmbeddingsResponse> =
        createEmbeddings(params, RequestOptions.none())

    /** @see createEmbeddings */
    fun createEmbeddings(
        params: EmbeddingCreateEmbeddingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddingCreateEmbeddingsResponse>

    /**
     * Returns a list of available embedding models. This endpoint is compatible with the OpenAI
     * Models API format.
     */
    fun listEmbeddingModels(): CompletableFuture<EmbeddingListEmbeddingModelsResponse> =
        listEmbeddingModels(EmbeddingListEmbeddingModelsParams.none())

    /** @see listEmbeddingModels */
    fun listEmbeddingModels(
        params: EmbeddingListEmbeddingModelsParams = EmbeddingListEmbeddingModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddingListEmbeddingModelsResponse>

    /** @see listEmbeddingModels */
    fun listEmbeddingModels(
        params: EmbeddingListEmbeddingModelsParams = EmbeddingListEmbeddingModelsParams.none()
    ): CompletableFuture<EmbeddingListEmbeddingModelsResponse> =
        listEmbeddingModels(params, RequestOptions.none())

    /** @see listEmbeddingModels */
    fun listEmbeddingModels(
        requestOptions: RequestOptions
    ): CompletableFuture<EmbeddingListEmbeddingModelsResponse> =
        listEmbeddingModels(EmbeddingListEmbeddingModelsParams.none(), requestOptions)

    /**
     * A view of [EmbeddingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmbeddingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/openai/embeddings`, but is otherwise the same
         * as [EmbeddingServiceAsync.createEmbeddings].
         */
        fun createEmbeddings(
            params: EmbeddingCreateEmbeddingsParams
        ): CompletableFuture<HttpResponseFor<EmbeddingCreateEmbeddingsResponse>> =
            createEmbeddings(params, RequestOptions.none())

        /** @see createEmbeddings */
        fun createEmbeddings(
            params: EmbeddingCreateEmbeddingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingCreateEmbeddingsResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/openai/embeddings/models`, but is otherwise the
         * same as [EmbeddingServiceAsync.listEmbeddingModels].
         */
        fun listEmbeddingModels():
            CompletableFuture<HttpResponseFor<EmbeddingListEmbeddingModelsResponse>> =
            listEmbeddingModels(EmbeddingListEmbeddingModelsParams.none())

        /** @see listEmbeddingModels */
        fun listEmbeddingModels(
            params: EmbeddingListEmbeddingModelsParams = EmbeddingListEmbeddingModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingListEmbeddingModelsResponse>>

        /** @see listEmbeddingModels */
        fun listEmbeddingModels(
            params: EmbeddingListEmbeddingModelsParams = EmbeddingListEmbeddingModelsParams.none()
        ): CompletableFuture<HttpResponseFor<EmbeddingListEmbeddingModelsResponse>> =
            listEmbeddingModels(params, RequestOptions.none())

        /** @see listEmbeddingModels */
        fun listEmbeddingModels(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmbeddingListEmbeddingModelsResponse>> =
            listEmbeddingModels(EmbeddingListEmbeddingModelsParams.none(), requestOptions)
    }
}
