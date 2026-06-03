// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.AiCreateResponseDeprecatedParams
import com.telnyx.sdk.models.ai.AiCreateResponseDeprecatedResponse
import com.telnyx.sdk.models.ai.AiRetrieveModelsParams
import com.telnyx.sdk.models.ai.AiRetrieveModelsResponse
import com.telnyx.sdk.models.ai.AiSummarizeParams
import com.telnyx.sdk.models.ai.AiSummarizeResponse
import com.telnyx.sdk.services.async.ai.AssistantServiceAsync
import com.telnyx.sdk.services.async.ai.AudioServiceAsync
import com.telnyx.sdk.services.async.ai.ChatServiceAsync
import com.telnyx.sdk.services.async.ai.ClusterServiceAsync
import com.telnyx.sdk.services.async.ai.ConversationServiceAsync
import com.telnyx.sdk.services.async.ai.EmbeddingServiceAsync
import com.telnyx.sdk.services.async.ai.FineTuningServiceAsync
import com.telnyx.sdk.services.async.ai.IntegrationServiceAsync
import com.telnyx.sdk.services.async.ai.McpServerServiceAsync
import com.telnyx.sdk.services.async.ai.MissionServiceAsync
import com.telnyx.sdk.services.async.ai.OpenAIServiceAsync
import com.telnyx.sdk.services.async.ai.ToolServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Generate text with LLMs */
interface AiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiServiceAsync

    /** Configure AI assistant specifications */
    fun assistants(): AssistantServiceAsync

    fun audio(): AudioServiceAsync

    /** Generate text with LLMs */
    fun chat(): ChatServiceAsync

    /** Identify common themes and patterns in your embedded documents */
    fun clusters(): ClusterServiceAsync

    /** Manage historical AI assistant conversations */
    fun conversations(): ConversationServiceAsync

    /** Embed documents and perform text searches */
    fun embeddings(): EmbeddingServiceAsync

    fun fineTuning(): FineTuningServiceAsync

    fun integrations(): IntegrationServiceAsync

    fun mcpServers(): McpServerServiceAsync

    fun missions(): MissionServiceAsync

    fun openai(): OpenAIServiceAsync

    /** Configure AI assistant specifications */
    fun tools(): ToolServiceAsync

    /**
     * **Deprecated**: Use `POST /v2/ai/openai/responses` instead. This endpoint is compatible with
     * the [OpenAI Responses API](https://developers.openai.com/api/reference/responses/overview)
     * and may be used with the OpenAI JS or Python SDK. Response id parameter is not supported at
     * the moment. Use the `conversation` parameter with a Telnyx Conversation ID to leverage
     * persistent conversations.
     */
    @Deprecated("deprecated")
    fun createResponseDeprecated(
        params: AiCreateResponseDeprecatedParams
    ): CompletableFuture<AiCreateResponseDeprecatedResponse> =
        createResponseDeprecated(params, RequestOptions.none())

    /** @see createResponseDeprecated */
    @Deprecated("deprecated")
    fun createResponseDeprecated(
        params: AiCreateResponseDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiCreateResponseDeprecatedResponse>

    /** @see createResponseDeprecated */
    @Deprecated("deprecated")
    fun createResponseDeprecated(
        body: AiCreateResponseDeprecatedParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiCreateResponseDeprecatedResponse> =
        createResponseDeprecated(
            AiCreateResponseDeprecatedParams.builder().body(body).build(),
            requestOptions,
        )

    /** @see createResponseDeprecated */
    @Deprecated("deprecated")
    fun createResponseDeprecated(
        body: AiCreateResponseDeprecatedParams.Body
    ): CompletableFuture<AiCreateResponseDeprecatedResponse> =
        createResponseDeprecated(body, RequestOptions.none())

    /**
     * **Deprecated**: Use `GET /v2/ai/openai/models` instead.
     *
     * Returns the same `ModelsResponse` payload as the OpenAI-compatible endpoint — open-source
     * LLMs hosted on Telnyx (e.g. `moonshotai/Kimi-K2.6`, `zai-org/GLM-5.1-FP8`,
     * `MiniMaxAI/MiniMax-M2.7`), embedding models, and fine-tuned models — kept around for
     * backwards compatibility. New integrations should use `/v2/ai/openai/models`.
     *
     * Model ids follow the `{organization}/{model_name}` convention from Hugging Face.
     */
    @Deprecated("deprecated")
    fun retrieveModels(): CompletableFuture<AiRetrieveModelsResponse> =
        retrieveModels(AiRetrieveModelsParams.none())

    /** @see retrieveModels */
    @Deprecated("deprecated")
    fun retrieveModels(
        params: AiRetrieveModelsParams = AiRetrieveModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiRetrieveModelsResponse>

    /** @see retrieveModels */
    @Deprecated("deprecated")
    fun retrieveModels(
        params: AiRetrieveModelsParams = AiRetrieveModelsParams.none()
    ): CompletableFuture<AiRetrieveModelsResponse> = retrieveModels(params, RequestOptions.none())

    /** @see retrieveModels */
    @Deprecated("deprecated")
    fun retrieveModels(
        requestOptions: RequestOptions
    ): CompletableFuture<AiRetrieveModelsResponse> =
        retrieveModels(AiRetrieveModelsParams.none(), requestOptions)

    /**
     * Generate a summary of a file's contents.
     *
     * Supports the following text formats:
     * - PDF, HTML, txt, json, csv
     *
     * Supports the following media formats (billed for both the transcription and summary):
     * - flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm
     * - Up to 100 MB
     */
    fun summarize(params: AiSummarizeParams): CompletableFuture<AiSummarizeResponse> =
        summarize(params, RequestOptions.none())

    /** @see summarize */
    fun summarize(
        params: AiSummarizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiSummarizeResponse>

    /** A view of [AiServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun assistants(): AssistantServiceAsync.WithRawResponse

        fun audio(): AudioServiceAsync.WithRawResponse

        /** Generate text with LLMs */
        fun chat(): ChatServiceAsync.WithRawResponse

        /** Identify common themes and patterns in your embedded documents */
        fun clusters(): ClusterServiceAsync.WithRawResponse

        /** Manage historical AI assistant conversations */
        fun conversations(): ConversationServiceAsync.WithRawResponse

        /** Embed documents and perform text searches */
        fun embeddings(): EmbeddingServiceAsync.WithRawResponse

        fun fineTuning(): FineTuningServiceAsync.WithRawResponse

        fun integrations(): IntegrationServiceAsync.WithRawResponse

        fun mcpServers(): McpServerServiceAsync.WithRawResponse

        fun missions(): MissionServiceAsync.WithRawResponse

        fun openai(): OpenAIServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun tools(): ToolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/responses`, but is otherwise the same as
         * [AiServiceAsync.createResponseDeprecated].
         */
        @Deprecated("deprecated")
        fun createResponseDeprecated(
            params: AiCreateResponseDeprecatedParams
        ): CompletableFuture<HttpResponseFor<AiCreateResponseDeprecatedResponse>> =
            createResponseDeprecated(params, RequestOptions.none())

        /** @see createResponseDeprecated */
        @Deprecated("deprecated")
        fun createResponseDeprecated(
            params: AiCreateResponseDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiCreateResponseDeprecatedResponse>>

        /** @see createResponseDeprecated */
        @Deprecated("deprecated")
        fun createResponseDeprecated(
            body: AiCreateResponseDeprecatedParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiCreateResponseDeprecatedResponse>> =
            createResponseDeprecated(
                AiCreateResponseDeprecatedParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see createResponseDeprecated */
        @Deprecated("deprecated")
        fun createResponseDeprecated(
            body: AiCreateResponseDeprecatedParams.Body
        ): CompletableFuture<HttpResponseFor<AiCreateResponseDeprecatedResponse>> =
            createResponseDeprecated(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /ai/models`, but is otherwise the same as
         * [AiServiceAsync.retrieveModels].
         */
        @Deprecated("deprecated")
        fun retrieveModels(): CompletableFuture<HttpResponseFor<AiRetrieveModelsResponse>> =
            retrieveModels(AiRetrieveModelsParams.none())

        /** @see retrieveModels */
        @Deprecated("deprecated")
        fun retrieveModels(
            params: AiRetrieveModelsParams = AiRetrieveModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiRetrieveModelsResponse>>

        /** @see retrieveModels */
        @Deprecated("deprecated")
        fun retrieveModels(
            params: AiRetrieveModelsParams = AiRetrieveModelsParams.none()
        ): CompletableFuture<HttpResponseFor<AiRetrieveModelsResponse>> =
            retrieveModels(params, RequestOptions.none())

        /** @see retrieveModels */
        @Deprecated("deprecated")
        fun retrieveModels(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AiRetrieveModelsResponse>> =
            retrieveModels(AiRetrieveModelsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/summarize`, but is otherwise the same as
         * [AiServiceAsync.summarize].
         */
        fun summarize(
            params: AiSummarizeParams
        ): CompletableFuture<HttpResponseFor<AiSummarizeResponse>> =
            summarize(params, RequestOptions.none())

        /** @see summarize */
        fun summarize(
            params: AiSummarizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiSummarizeResponse>>
    }
}
