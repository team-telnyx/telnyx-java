// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.AiCreateResponseParams
import com.telnyx.sdk.models.ai.AiCreateResponseResponse
import com.telnyx.sdk.models.ai.AiRetrieveModelsParams
import com.telnyx.sdk.models.ai.AiRetrieveModelsResponse
import com.telnyx.sdk.models.ai.AiSummarizeParams
import com.telnyx.sdk.models.ai.AiSummarizeResponse
import com.telnyx.sdk.services.blocking.ai.AssistantService
import com.telnyx.sdk.services.blocking.ai.AudioService
import com.telnyx.sdk.services.blocking.ai.ChatService
import com.telnyx.sdk.services.blocking.ai.ClusterService
import com.telnyx.sdk.services.blocking.ai.ConversationService
import com.telnyx.sdk.services.blocking.ai.EmbeddingService
import com.telnyx.sdk.services.blocking.ai.FineTuningService
import com.telnyx.sdk.services.blocking.ai.IntegrationService
import com.telnyx.sdk.services.blocking.ai.McpServerService
import com.telnyx.sdk.services.blocking.ai.MissionService
import com.telnyx.sdk.services.blocking.ai.OpenAIService
import com.telnyx.sdk.services.blocking.ai.ToolService
import java.util.function.Consumer

/** Generate text with LLMs */
interface AiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiService

    /** Configure AI assistant specifications */
    fun assistants(): AssistantService

    fun audio(): AudioService

    /** Generate text with LLMs */
    fun chat(): ChatService

    /** Identify common themes and patterns in your embedded documents */
    fun clusters(): ClusterService

    /** Manage historical AI assistant conversations */
    fun conversations(): ConversationService

    /** Embed documents and perform text searches */
    fun embeddings(): EmbeddingService

    fun fineTuning(): FineTuningService

    fun integrations(): IntegrationService

    fun mcpServers(): McpServerService

    fun missions(): MissionService

    fun openai(): OpenAIService

    /** Configure AI assistant specifications */
    fun tools(): ToolService

    /**
     * **Deprecated**: Use `POST /v2/ai/openai/responses` instead. This endpoint is compatible with
     * the [OpenAI Responses API](https://developers.openai.com/api/reference/responses/overview)
     * and may be used with the OpenAI JS or Python SDK. Response id parameter is not supported at
     * the moment. Use the `conversation` parameter with a Telnyx Conversation ID to leverage
     * persistent conversations.
     */
    @Deprecated("deprecated")
    fun createResponse(params: AiCreateResponseParams): AiCreateResponseResponse =
        createResponse(params, RequestOptions.none())

    /** @see createResponse */
    @Deprecated("deprecated")
    fun createResponse(
        params: AiCreateResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiCreateResponseResponse

    /** @see createResponse */
    @Deprecated("deprecated")
    fun createResponse(
        input: AiCreateResponseParams.Input,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiCreateResponseResponse =
        createResponse(AiCreateResponseParams.builder().input(input).build(), requestOptions)

    /** @see createResponse */
    @Deprecated("deprecated")
    fun createResponse(input: AiCreateResponseParams.Input): AiCreateResponseResponse =
        createResponse(input, RequestOptions.none())

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
    fun retrieveModels(): AiRetrieveModelsResponse = retrieveModels(AiRetrieveModelsParams.none())

    /** @see retrieveModels */
    @Deprecated("deprecated")
    fun retrieveModels(
        params: AiRetrieveModelsParams = AiRetrieveModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiRetrieveModelsResponse

    /** @see retrieveModels */
    @Deprecated("deprecated")
    fun retrieveModels(
        params: AiRetrieveModelsParams = AiRetrieveModelsParams.none()
    ): AiRetrieveModelsResponse = retrieveModels(params, RequestOptions.none())

    /** @see retrieveModels */
    @Deprecated("deprecated")
    fun retrieveModels(requestOptions: RequestOptions): AiRetrieveModelsResponse =
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
    fun summarize(params: AiSummarizeParams): AiSummarizeResponse =
        summarize(params, RequestOptions.none())

    /** @see summarize */
    fun summarize(
        params: AiSummarizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiSummarizeResponse

    /** A view of [AiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiService.WithRawResponse

        /** Configure AI assistant specifications */
        fun assistants(): AssistantService.WithRawResponse

        fun audio(): AudioService.WithRawResponse

        /** Generate text with LLMs */
        fun chat(): ChatService.WithRawResponse

        /** Identify common themes and patterns in your embedded documents */
        fun clusters(): ClusterService.WithRawResponse

        /** Manage historical AI assistant conversations */
        fun conversations(): ConversationService.WithRawResponse

        /** Embed documents and perform text searches */
        fun embeddings(): EmbeddingService.WithRawResponse

        fun fineTuning(): FineTuningService.WithRawResponse

        fun integrations(): IntegrationService.WithRawResponse

        fun mcpServers(): McpServerService.WithRawResponse

        fun missions(): MissionService.WithRawResponse

        fun openai(): OpenAIService.WithRawResponse

        /** Configure AI assistant specifications */
        fun tools(): ToolService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/responses`, but is otherwise the same as
         * [AiService.createResponse].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createResponse(
            params: AiCreateResponseParams
        ): HttpResponseFor<AiCreateResponseResponse> = createResponse(params, RequestOptions.none())

        /** @see createResponse */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createResponse(
            params: AiCreateResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiCreateResponseResponse>

        /** @see createResponse */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createResponse(
            input: AiCreateResponseParams.Input,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiCreateResponseResponse> =
            createResponse(AiCreateResponseParams.builder().input(input).build(), requestOptions)

        /** @see createResponse */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createResponse(
            input: AiCreateResponseParams.Input
        ): HttpResponseFor<AiCreateResponseResponse> = createResponse(input, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /ai/models`, but is otherwise the same as
         * [AiService.retrieveModels].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieveModels(): HttpResponseFor<AiRetrieveModelsResponse> =
            retrieveModels(AiRetrieveModelsParams.none())

        /** @see retrieveModels */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieveModels(
            params: AiRetrieveModelsParams = AiRetrieveModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiRetrieveModelsResponse>

        /** @see retrieveModels */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieveModels(
            params: AiRetrieveModelsParams = AiRetrieveModelsParams.none()
        ): HttpResponseFor<AiRetrieveModelsResponse> = retrieveModels(params, RequestOptions.none())

        /** @see retrieveModels */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieveModels(
            requestOptions: RequestOptions
        ): HttpResponseFor<AiRetrieveModelsResponse> =
            retrieveModels(AiRetrieveModelsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/summarize`, but is otherwise the same as
         * [AiService.summarize].
         */
        @MustBeClosed
        fun summarize(params: AiSummarizeParams): HttpResponseFor<AiSummarizeResponse> =
            summarize(params, RequestOptions.none())

        /** @see summarize */
        @MustBeClosed
        fun summarize(
            params: AiSummarizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiSummarizeResponse>
    }
}
