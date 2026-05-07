// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.openai.OpenAIListModelsParams
import com.telnyx.sdk.models.ai.openai.OpenAIListModelsResponse
import com.telnyx.sdk.services.blocking.ai.openai.ChatService
import com.telnyx.sdk.services.blocking.ai.openai.EmbeddingService
import java.util.function.Consumer

interface OpenAIService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenAIService

    /** OpenAI-compatible embeddings endpoints for generating vector representations of text */
    fun embeddings(): EmbeddingService

    fun chat(): ChatService

    /**
     * This endpoint returns a list of Open Source and OpenAI models that are available for use. <br
     * /><br /> **Note**: Model `id`'s will be in the form `{source}/{model_name}`. For example
     * `openai/gpt-4` or `mistralai/Mistral-7B-Instruct-v0.1` consistent with HuggingFace naming
     * conventions.
     */
    fun listModels(): OpenAIListModelsResponse = listModels(OpenAIListModelsParams.none())

    /** @see listModels */
    fun listModels(
        params: OpenAIListModelsParams = OpenAIListModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIListModelsResponse

    /** @see listModels */
    fun listModels(
        params: OpenAIListModelsParams = OpenAIListModelsParams.none()
    ): OpenAIListModelsResponse = listModels(params, RequestOptions.none())

    /** @see listModels */
    fun listModels(requestOptions: RequestOptions): OpenAIListModelsResponse =
        listModels(OpenAIListModelsParams.none(), requestOptions)

    /** A view of [OpenAIService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenAIService.WithRawResponse

        /** OpenAI-compatible embeddings endpoints for generating vector representations of text */
        fun embeddings(): EmbeddingService.WithRawResponse

        fun chat(): ChatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/openai/models`, but is otherwise the same as
         * [OpenAIService.listModels].
         */
        @MustBeClosed
        fun listModels(): HttpResponseFor<OpenAIListModelsResponse> =
            listModels(OpenAIListModelsParams.none())

        /** @see listModels */
        @MustBeClosed
        fun listModels(
            params: OpenAIListModelsParams = OpenAIListModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIListModelsResponse>

        /** @see listModels */
        @MustBeClosed
        fun listModels(
            params: OpenAIListModelsParams = OpenAIListModelsParams.none()
        ): HttpResponseFor<OpenAIListModelsResponse> = listModels(params, RequestOptions.none())

        /** @see listModels */
        @MustBeClosed
        fun listModels(requestOptions: RequestOptions): HttpResponseFor<OpenAIListModelsResponse> =
            listModels(OpenAIListModelsParams.none(), requestOptions)
    }
}
