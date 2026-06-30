// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.AiCreateResponseParams
import com.telnyx.sdk.models.ai.AiCreateResponseResponse
import com.telnyx.sdk.models.ai.AiListConversationHistoriesPageAsync
import com.telnyx.sdk.models.ai.AiListConversationHistoriesParams
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
    fun createResponse(
        params: AiCreateResponseParams
    ): CompletableFuture<AiCreateResponseResponse> = createResponse(params, RequestOptions.none())

    /** @see createResponse */
    @Deprecated("deprecated")
    fun createResponse(
        params: AiCreateResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiCreateResponseResponse>

    /** @see createResponse */
    @Deprecated("deprecated")
    fun createResponse(
        input: AiCreateResponseParams.Input,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiCreateResponseResponse> =
        createResponse(AiCreateResponseParams.builder().input(input).build(), requestOptions)

    /** @see createResponse */
    @Deprecated("deprecated")
    fun createResponse(
        input: AiCreateResponseParams.Input
    ): CompletableFuture<AiCreateResponseResponse> = createResponse(input, RequestOptions.none())

    /**
     * Performs semantic vector search across conversation history records.
     *
     * **How it works:**
     * 1. The query text is embedded into a 1024-dimensional vector using the multilingual-e5-large
     *    model.
     * 2. The vector is compared against indexed record chunks using semantic similarity search.
     * 3. When no region is specified, all regions are queried in parallel (fan-out) and results are
     *    merged by score.
     * 4. Results are ranked by similarity score (descending) and paginated via `page[number]` /
     *    `page[size]`.
     *
     * **Authentication:** Requires a Telnyx API key via `Authorization: Bearer <key>`. Results are
     * automatically scoped to the caller's organization — `organization_id` is injected from the
     * auth token and cannot be overridden.
     *
     * **Chunking:** Records are split into chunks of up to 480 tokens with 64-token overlap at
     * ingestion time. Each search result represents a single chunk, with `chunk_index` and
     * `chunk_total` indicating its position within the original record.
     *
     * **Filtering:** Use `filter[field][operator]=value` query parameters to narrow results before
     * vector search.
     *
     * Top-level filterable fields: `user_id`, `region`, `record_id`, `record_created_at`,
     * `ingested_at`, `retention`
     *
     * Note: `retention` is filter-only — it can be used to narrow results but is not returned in
     * the response body.
     *
     * Metadata fields: any field not in the list above is resolved to `data.metadata.<field>`
     * (e.g., `filter[language]=en` → `data.metadata.language`).
     *
     * Supported filter operators:
     * - `eq` — exact match (default when no operator specified)
     * - `in` — match any of comma-separated values
     * - `gte`, `gt`, `lte`, `lt` — range comparisons (useful for date filtering)
     * - `contains` — wildcard substring match
     *
     * **Examples:**
     *
     * ```
     * GET /v2/ai/conversation_histories?q=billing+issue&page[size]=10
     * GET /v2/ai/conversation_histories?q=setup+guide&region=USA&min_score=0.5
     * GET /v2/ai/conversation_histories?q=refund&filter[record_created_at][gte]=2026-01-01T00:00:00Z
     * GET /v2/ai/conversation_histories?q=outage&filter[region][in]=USA,DEU
     * GET /v2/ai/conversation_histories?q=hold+time&filter[language]=en
     * ```
     */
    fun listConversationHistories(
        params: AiListConversationHistoriesParams
    ): CompletableFuture<AiListConversationHistoriesPageAsync> =
        listConversationHistories(params, RequestOptions.none())

    /** @see listConversationHistories */
    fun listConversationHistories(
        params: AiListConversationHistoriesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiListConversationHistoriesPageAsync>

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
         * [AiServiceAsync.createResponse].
         */
        @Deprecated("deprecated")
        fun createResponse(
            params: AiCreateResponseParams
        ): CompletableFuture<HttpResponseFor<AiCreateResponseResponse>> =
            createResponse(params, RequestOptions.none())

        /** @see createResponse */
        @Deprecated("deprecated")
        fun createResponse(
            params: AiCreateResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiCreateResponseResponse>>

        /** @see createResponse */
        @Deprecated("deprecated")
        fun createResponse(
            input: AiCreateResponseParams.Input,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiCreateResponseResponse>> =
            createResponse(AiCreateResponseParams.builder().input(input).build(), requestOptions)

        /** @see createResponse */
        @Deprecated("deprecated")
        fun createResponse(
            input: AiCreateResponseParams.Input
        ): CompletableFuture<HttpResponseFor<AiCreateResponseResponse>> =
            createResponse(input, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /ai/conversation_histories`, but is otherwise the
         * same as [AiServiceAsync.listConversationHistories].
         */
        fun listConversationHistories(
            params: AiListConversationHistoriesParams
        ): CompletableFuture<HttpResponseFor<AiListConversationHistoriesPageAsync>> =
            listConversationHistories(params, RequestOptions.none())

        /** @see listConversationHistories */
        fun listConversationHistories(
            params: AiListConversationHistoriesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiListConversationHistoriesPageAsync>>

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
