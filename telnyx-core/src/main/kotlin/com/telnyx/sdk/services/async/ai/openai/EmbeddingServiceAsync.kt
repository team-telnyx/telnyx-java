// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.openai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateResponse
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListModelsParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListModelsResponse
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
    fun create(params: EmbeddingCreateParams): CompletableFuture<EmbeddingCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmbeddingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddingCreateResponse>

    /**
     * Returns a list of available embedding models. This endpoint is compatible with the OpenAI
     * Models API format.
     */
    fun listModels(): CompletableFuture<EmbeddingListModelsResponse> =
        listModels(EmbeddingListModelsParams.none())

    /** @see listModels */
    fun listModels(
        params: EmbeddingListModelsParams = EmbeddingListModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddingListModelsResponse>

    /** @see listModels */
    fun listModels(
        params: EmbeddingListModelsParams = EmbeddingListModelsParams.none()
    ): CompletableFuture<EmbeddingListModelsResponse> = listModels(params, RequestOptions.none())

    /** @see listModels */
    fun listModels(requestOptions: RequestOptions): CompletableFuture<EmbeddingListModelsResponse> =
        listModels(EmbeddingListModelsParams.none(), requestOptions)

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
         * as [EmbeddingServiceAsync.create].
         */
        fun create(
            params: EmbeddingCreateParams
        ): CompletableFuture<HttpResponseFor<EmbeddingCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmbeddingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/openai/embeddings/models`, but is otherwise the
         * same as [EmbeddingServiceAsync.listModels].
         */
        fun listModels(): CompletableFuture<HttpResponseFor<EmbeddingListModelsResponse>> =
            listModels(EmbeddingListModelsParams.none())

        /** @see listModels */
        fun listModels(
            params: EmbeddingListModelsParams = EmbeddingListModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingListModelsResponse>>

        /** @see listModels */
        fun listModels(
            params: EmbeddingListModelsParams = EmbeddingListModelsParams.none()
        ): CompletableFuture<HttpResponseFor<EmbeddingListModelsResponse>> =
            listModels(params, RequestOptions.none())

        /** @see listModels */
        fun listModels(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmbeddingListModelsResponse>> =
            listModels(EmbeddingListModelsParams.none(), requestOptions)
    }
}
