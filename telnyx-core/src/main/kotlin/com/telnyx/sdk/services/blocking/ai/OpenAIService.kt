// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.ModelsResponse
import com.telnyx.sdk.models.ai.openai.OpenAICreateResponseParams
import com.telnyx.sdk.models.ai.openai.OpenAICreateResponseResponse
import com.telnyx.sdk.models.ai.openai.OpenAIListModelsParams
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
     * Create a response using Telnyx's OpenAI-compatible Responses API. This endpoint is compatible
     * with the
     * [OpenAI Responses API](https://developers.openai.com/api/reference/responses/overview) and
     * may be used with the OpenAI JS or Python SDK by setting the base URL to
     * `https://api.telnyx.com/v2/ai/openai`.
     *
     * The `conversation` parameter refers to a Telnyx Conversation rather than an OpenAI-hosted
     * conversation object. To persist a thread across turns, first
     * [create a conversation](https://developers.telnyx.com/api-reference/conversations/create-a-conversation)
     * with `POST /ai/conversations`, then pass that conversation's `id` in the Responses request as
     * `conversation`. The endpoint appends the new input, assistant output, reasoning, and
     * tool-call messages to that conversation. Reuse the same `conversation` id on subsequent
     * Responses requests, including tool-result followups, so the model receives the prior context.
     *
     * If `conversation` is omitted, the request is processed without persisting messages to a
     * Telnyx conversation. Use the Conversations API to manage history:
     * [list conversations](https://developers.telnyx.com/api-reference/conversations/list-conversations)
     * (optionally filtered by metadata),
     * [fetch messages](https://developers.telnyx.com/api-reference/conversations/get-conversation-messages)
     * for a conversation, and optionally
     * [add messages](https://developers.telnyx.com/api-reference/conversations/create-message)
     * outside the Responses flow.
     *
     * You can attach arbitrary metadata when creating a conversation (for example to tag the
     * conversation's source, channel, or user) and later filter by it when listing conversations.
     */
    fun createResponse(): OpenAICreateResponseResponse =
        createResponse(OpenAICreateResponseParams.none())

    /** @see createResponse */
    fun createResponse(
        params: OpenAICreateResponseParams = OpenAICreateResponseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAICreateResponseResponse

    /** @see createResponse */
    fun createResponse(
        params: OpenAICreateResponseParams = OpenAICreateResponseParams.none()
    ): OpenAICreateResponseResponse = createResponse(params, RequestOptions.none())

    /** @see createResponse */
    fun createResponse(requestOptions: RequestOptions): OpenAICreateResponseResponse =
        createResponse(OpenAICreateResponseParams.none(), requestOptions)

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
    fun listModels(): ModelsResponse = listModels(OpenAIListModelsParams.none())

    /** @see listModels */
    fun listModels(
        params: OpenAIListModelsParams = OpenAIListModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelsResponse

    /** @see listModels */
    fun listModels(params: OpenAIListModelsParams = OpenAIListModelsParams.none()): ModelsResponse =
        listModels(params, RequestOptions.none())

    /** @see listModels */
    fun listModels(requestOptions: RequestOptions): ModelsResponse =
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
        fun createResponse(): HttpResponseFor<OpenAICreateResponseResponse> =
            createResponse(OpenAICreateResponseParams.none())

        /** @see createResponse */
        @MustBeClosed
        fun createResponse(
            params: OpenAICreateResponseParams = OpenAICreateResponseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAICreateResponseResponse>

        /** @see createResponse */
        @MustBeClosed
        fun createResponse(
            params: OpenAICreateResponseParams = OpenAICreateResponseParams.none()
        ): HttpResponseFor<OpenAICreateResponseResponse> =
            createResponse(params, RequestOptions.none())

        /** @see createResponse */
        @MustBeClosed
        fun createResponse(
            requestOptions: RequestOptions
        ): HttpResponseFor<OpenAICreateResponseResponse> =
            createResponse(OpenAICreateResponseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/openai/models`, but is otherwise the same as
         * [OpenAIService.listModels].
         */
        @MustBeClosed
        fun listModels(): HttpResponseFor<ModelsResponse> =
            listModels(OpenAIListModelsParams.none())

        /** @see listModels */
        @MustBeClosed
        fun listModels(
            params: OpenAIListModelsParams = OpenAIListModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelsResponse>

        /** @see listModels */
        @MustBeClosed
        fun listModels(
            params: OpenAIListModelsParams = OpenAIListModelsParams.none()
        ): HttpResponseFor<ModelsResponse> = listModels(params, RequestOptions.none())

        /** @see listModels */
        @MustBeClosed
        fun listModels(requestOptions: RequestOptions): HttpResponseFor<ModelsResponse> =
            listModels(OpenAIListModelsParams.none(), requestOptions)
    }
}
