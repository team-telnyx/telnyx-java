// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.openai.OpenAIListModelsParams
import com.telnyx.sdk.models.ai.openai.OpenAIListModelsResponse
import com.telnyx.sdk.services.async.ai.openai.ChatServiceAsync
import com.telnyx.sdk.services.async.ai.openai.EmbeddingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OpenAIServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenAIServiceAsync

    /** OpenAI-compatible embeddings endpoints for generating vector representations of text */
    fun embeddings(): EmbeddingServiceAsync

    fun chat(): ChatServiceAsync

    /**
     * This endpoint returns a list of Open Source and OpenAI models that are available for use. <br
     * /><br /> **Note**: Model `id`'s will be in the form `{source}/{model_name}`. For example
     * `openai/gpt-4` or `mistralai/Mistral-7B-Instruct-v0.1` consistent with HuggingFace naming
     * conventions.
     */
    fun listModels(): CompletableFuture<OpenAIListModelsResponse> =
        listModels(OpenAIListModelsParams.none())

    /** @see listModels */
    fun listModels(
        params: OpenAIListModelsParams = OpenAIListModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIListModelsResponse>

    /** @see listModels */
    fun listModels(
        params: OpenAIListModelsParams = OpenAIListModelsParams.none()
    ): CompletableFuture<OpenAIListModelsResponse> = listModels(params, RequestOptions.none())

    /** @see listModels */
    fun listModels(requestOptions: RequestOptions): CompletableFuture<OpenAIListModelsResponse> =
        listModels(OpenAIListModelsParams.none(), requestOptions)

    /**
     * A view of [OpenAIServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OpenAIServiceAsync.WithRawResponse

        /** OpenAI-compatible embeddings endpoints for generating vector representations of text */
        fun embeddings(): EmbeddingServiceAsync.WithRawResponse

        fun chat(): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/openai/models`, but is otherwise the same as
         * [OpenAIServiceAsync.listModels].
         */
        fun listModels(): CompletableFuture<HttpResponseFor<OpenAIListModelsResponse>> =
            listModels(OpenAIListModelsParams.none())

        /** @see listModels */
        fun listModels(
            params: OpenAIListModelsParams = OpenAIListModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIListModelsResponse>>

        /** @see listModels */
        fun listModels(
            params: OpenAIListModelsParams = OpenAIListModelsParams.none()
        ): CompletableFuture<HttpResponseFor<OpenAIListModelsResponse>> =
            listModels(params, RequestOptions.none())

        /** @see listModels */
        fun listModels(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OpenAIListModelsResponse>> =
            listModels(OpenAIListModelsParams.none(), requestOptions)
    }
}
