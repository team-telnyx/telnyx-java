// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.openai.OpenAICreateResponseParams
import com.telnyx.sdk.models.ai.openai.OpenAICreateResponseResponse
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
     * Chat with a language model. This endpoint is consistent with the
     * [OpenAI Chat Completions API](https://developers.openai.com/api/reference/resources/responses)
     * and may be used with the OpenAI JS or Python SDK. Response id parameter is not supported at
     * the moment. Use 'conversation' parameter to leverage persistent conversations feature.
     */
    fun createResponse(params: OpenAICreateResponseParams): OpenAICreateResponseResponse =
        createResponse(params, RequestOptions.none())

    /** @see createResponse */
    fun createResponse(
        params: OpenAICreateResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAICreateResponseResponse

    /** @see createResponse */
    fun createResponse(
        body: OpenAICreateResponseParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAICreateResponseResponse =
        createResponse(OpenAICreateResponseParams.builder().body(body).build(), requestOptions)

    /** @see createResponse */
    fun createResponse(body: OpenAICreateResponseParams.Body): OpenAICreateResponseResponse =
        createResponse(body, RequestOptions.none())

    /**
     * Lists every model currently available to your account on Telnyx Inference, including SOTA
     * open-source LLMs hosted on Telnyx GPUs (for example `moonshotai/Kimi-K2.6`,
     * `zai-org/GLM-5.1-FP8`, and `MiniMaxAI/MiniMax-M2.7`), embedding models, and any fine-tuned
     * models you have created.
     *
     * Each entry is a `ModelMetadata` object describing the model id, owner, task, context length,
     * supported languages, billing tier, pricing per 1M tokens, deployment regions, and whether the
     * model supports vision or fine-tuning. Use this endpoint to discover model ids you can pass to
     * `POST /v2/ai/openai/chat/completions`.
     *
     * Model ids follow the `{organization}/{model_name}` convention from Hugging Face (for example
     * `moonshotai/Kimi-K2.6`). This endpoint is OpenAI-compatible: clients pointed at
     * `https://api.telnyx.com/v2/ai/openai` can call `client.models.list()` to retrieve the same
     * payload.
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
         * Returns a raw HTTP response for `post /ai/openai/responses`, but is otherwise the same as
         * [OpenAIService.createResponse].
         */
        @MustBeClosed
        fun createResponse(
            params: OpenAICreateResponseParams
        ): HttpResponseFor<OpenAICreateResponseResponse> =
            createResponse(params, RequestOptions.none())

        /** @see createResponse */
        @MustBeClosed
        fun createResponse(
            params: OpenAICreateResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAICreateResponseResponse>

        /** @see createResponse */
        @MustBeClosed
        fun createResponse(
            body: OpenAICreateResponseParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAICreateResponseResponse> =
            createResponse(OpenAICreateResponseParams.builder().body(body).build(), requestOptions)

        /** @see createResponse */
        @MustBeClosed
        fun createResponse(
            body: OpenAICreateResponseParams.Body
        ): HttpResponseFor<OpenAICreateResponseResponse> =
            createResponse(body, RequestOptions.none())

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
