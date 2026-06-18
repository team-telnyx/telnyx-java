// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.AiCreateResponseDeprecatedParams
import com.telnyx.sdk.models.ai.AiCreateResponseDeprecatedResponse
import com.telnyx.sdk.models.ai.AiRetrieveModelsParams
import com.telnyx.sdk.models.ai.AiRetrieveModelsResponse
import com.telnyx.sdk.models.ai.AiSearchConversationHistoriesParams
import com.telnyx.sdk.models.ai.AiSearchConversationHistoriesResponse
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
    fun createResponseDeprecated(
        params: AiCreateResponseDeprecatedParams
    ): AiCreateResponseDeprecatedResponse = createResponseDeprecated(params, RequestOptions.none())

    /** @see createResponseDeprecated */
    @Deprecated("deprecated")
    fun createResponseDeprecated(
        params: AiCreateResponseDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiCreateResponseDeprecatedResponse

    /** @see createResponseDeprecated */
    @Deprecated("deprecated")
    fun createResponseDeprecated(
        body: AiCreateResponseDeprecatedParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiCreateResponseDeprecatedResponse =
        createResponseDeprecated(
            AiCreateResponseDeprecatedParams.builder().body(body).build(),
            requestOptions,
        )

    /** @see createResponseDeprecated */
    @Deprecated("deprecated")
    fun createResponseDeprecated(
        body: AiCreateResponseDeprecatedParams.Body
    ): AiCreateResponseDeprecatedResponse = createResponseDeprecated(body, RequestOptions.none())

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
     * Performs semantic vector search across conversation history records.
     *
     * **How it works:**
     * 1. The query text is embedded into a 1024-dimensional vector using the multilingual-e5-large
     *    model.
     * 2. The vector is sent to regional OpenSearch clusters for kNN search using HNSW cosine
     *    similarity.
     * 3. When no region is specified, all regions are queried in parallel (fan-out) and results are
     *    merged by score.
     * 4. Results are ranked by cosine similarity score (descending) and truncated to `top_k`.
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
     * Top-level filterable fields: `user_id`, `record_type`, `region`, `document_id`, `record_id`,
     * `record_created_at`, `ingested_at`, `retention`
     *
     * Note: `retention` is filter-only — it can be used to narrow results but is not returned in
     * the response body.
     *
     * Metadata fields: any field not in the list above is resolved to `data.metadata.<field>` in
     * OpenSearch (e.g., `filter[language]=en` → `data.metadata.language`).
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
     * GET /v2/ai/conversation_histories?q=billing+issue&record_type=voice&top_k=10
     * GET /v2/ai/conversation_histories?q=setup+guide&record_type=knowledge_base&region=USA&min_score=0.5
     * GET /v2/ai/conversation_histories?q=refund&record_type=voice&filter[record_created_at][gte]=2026-01-01T00:00:00Z
     * GET /v2/ai/conversation_histories?q=outage&record_type=voice&filter[region][in]=USA,DEU
     * GET /v2/ai/conversation_histories?q=hold+time&record_type=voice&filter[language]=en
     * ```
     */
    fun searchConversationHistories(
        params: AiSearchConversationHistoriesParams
    ): AiSearchConversationHistoriesResponse =
        searchConversationHistories(params, RequestOptions.none())

    /** @see searchConversationHistories */
    fun searchConversationHistories(
        params: AiSearchConversationHistoriesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiSearchConversationHistoriesResponse

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
         * [AiService.createResponseDeprecated].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createResponseDeprecated(
            params: AiCreateResponseDeprecatedParams
        ): HttpResponseFor<AiCreateResponseDeprecatedResponse> =
            createResponseDeprecated(params, RequestOptions.none())

        /** @see createResponseDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createResponseDeprecated(
            params: AiCreateResponseDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiCreateResponseDeprecatedResponse>

        /** @see createResponseDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createResponseDeprecated(
            body: AiCreateResponseDeprecatedParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiCreateResponseDeprecatedResponse> =
            createResponseDeprecated(
                AiCreateResponseDeprecatedParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see createResponseDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createResponseDeprecated(
            body: AiCreateResponseDeprecatedParams.Body
        ): HttpResponseFor<AiCreateResponseDeprecatedResponse> =
            createResponseDeprecated(body, RequestOptions.none())

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
         * Returns a raw HTTP response for `get /ai/conversation_histories`, but is otherwise the
         * same as [AiService.searchConversationHistories].
         */
        @MustBeClosed
        fun searchConversationHistories(
            params: AiSearchConversationHistoriesParams
        ): HttpResponseFor<AiSearchConversationHistoriesResponse> =
            searchConversationHistories(params, RequestOptions.none())

        /** @see searchConversationHistories */
        @MustBeClosed
        fun searchConversationHistories(
            params: AiSearchConversationHistoriesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiSearchConversationHistoriesResponse>

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
