// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.openai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateEmbeddingsParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateEmbeddingsResponse
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListEmbeddingModelsParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListEmbeddingModelsResponse
import java.util.function.Consumer

/** OpenAI-compatible embeddings endpoints for generating vector representations of text */
interface EmbeddingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmbeddingService

    /**
     * Creates an embedding vector representing the input text. This endpoint is compatible with the
     * [OpenAI Embeddings API](https://platform.openai.com/docs/api-reference/embeddings) and may be
     * used with the OpenAI JS or Python SDK by setting the base URL to
     * `https://api.telnyx.com/v2/ai/openai`.
     */
    fun createEmbeddings(
        params: EmbeddingCreateEmbeddingsParams
    ): EmbeddingCreateEmbeddingsResponse = createEmbeddings(params, RequestOptions.none())

    /** @see createEmbeddings */
    fun createEmbeddings(
        params: EmbeddingCreateEmbeddingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddingCreateEmbeddingsResponse

    /**
     * Returns a list of available embedding models. This endpoint is compatible with the OpenAI
     * Models API format.
     */
    fun listEmbeddingModels(): EmbeddingListEmbeddingModelsResponse =
        listEmbeddingModels(EmbeddingListEmbeddingModelsParams.none())

    /** @see listEmbeddingModels */
    fun listEmbeddingModels(
        params: EmbeddingListEmbeddingModelsParams = EmbeddingListEmbeddingModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddingListEmbeddingModelsResponse

    /** @see listEmbeddingModels */
    fun listEmbeddingModels(
        params: EmbeddingListEmbeddingModelsParams = EmbeddingListEmbeddingModelsParams.none()
    ): EmbeddingListEmbeddingModelsResponse = listEmbeddingModels(params, RequestOptions.none())

    /** @see listEmbeddingModels */
    fun listEmbeddingModels(requestOptions: RequestOptions): EmbeddingListEmbeddingModelsResponse =
        listEmbeddingModels(EmbeddingListEmbeddingModelsParams.none(), requestOptions)

    /** A view of [EmbeddingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmbeddingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/openai/embeddings`, but is otherwise the same
         * as [EmbeddingService.createEmbeddings].
         */
        @MustBeClosed
        fun createEmbeddings(
            params: EmbeddingCreateEmbeddingsParams
        ): HttpResponseFor<EmbeddingCreateEmbeddingsResponse> =
            createEmbeddings(params, RequestOptions.none())

        /** @see createEmbeddings */
        @MustBeClosed
        fun createEmbeddings(
            params: EmbeddingCreateEmbeddingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddingCreateEmbeddingsResponse>

        /**
         * Returns a raw HTTP response for `get /ai/openai/embeddings/models`, but is otherwise the
         * same as [EmbeddingService.listEmbeddingModels].
         */
        @MustBeClosed
        fun listEmbeddingModels(): HttpResponseFor<EmbeddingListEmbeddingModelsResponse> =
            listEmbeddingModels(EmbeddingListEmbeddingModelsParams.none())

        /** @see listEmbeddingModels */
        @MustBeClosed
        fun listEmbeddingModels(
            params: EmbeddingListEmbeddingModelsParams = EmbeddingListEmbeddingModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddingListEmbeddingModelsResponse>

        /** @see listEmbeddingModels */
        @MustBeClosed
        fun listEmbeddingModels(
            params: EmbeddingListEmbeddingModelsParams = EmbeddingListEmbeddingModelsParams.none()
        ): HttpResponseFor<EmbeddingListEmbeddingModelsResponse> =
            listEmbeddingModels(params, RequestOptions.none())

        /** @see listEmbeddingModels */
        @MustBeClosed
        fun listEmbeddingModels(
            requestOptions: RequestOptions
        ): HttpResponseFor<EmbeddingListEmbeddingModelsResponse> =
            listEmbeddingModels(EmbeddingListEmbeddingModelsParams.none(), requestOptions)
    }
}
