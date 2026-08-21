// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.AiRetrieveConversationHistoriesPage
import com.telnyx.sdk.models.ai.AiRetrieveConversationHistoriesParams
import com.telnyx.sdk.models.ai.AiSummarizeParams
import com.telnyx.sdk.models.ai.AiSummarizeResponse
import com.telnyx.sdk.services.blocking.ai.AnthropicService
import com.telnyx.sdk.services.blocking.ai.AssistantService
import com.telnyx.sdk.services.blocking.ai.AudioService
import com.telnyx.sdk.services.blocking.ai.ChatService
import com.telnyx.sdk.services.blocking.ai.ClusterService
import com.telnyx.sdk.services.blocking.ai.CollectionService
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

    fun chat(): ChatService

    /** Identify common themes and patterns in your embedded documents */
    fun clusters(): ClusterService

    /**
     * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
     * sources, and run collection-scoped semantic search.
     */
    fun collections(): CollectionService

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

    fun anthropic(): AnthropicService

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
     * - `GET /v2/ai/conversation_histories?q=billing+issue&page[size]=10`
     * - `GET /v2/ai/conversation_histories?q=setup+guide&region=USA&min_score=0.5`
     * - `GET
     *   /v2/ai/conversation_histories?q=refund&filter[record_created_at][gte]=2026-01-01T00:00:00Z`
     * - `GET /v2/ai/conversation_histories?q=outage&filter[region][in]=USA,DEU`
     * - `GET /v2/ai/conversation_histories?q=hold+time&filter[language]=en`
     */
    fun retrieveConversationHistories(
        params: AiRetrieveConversationHistoriesParams
    ): AiRetrieveConversationHistoriesPage =
        retrieveConversationHistories(params, RequestOptions.none())

    /** @see retrieveConversationHistories */
    fun retrieveConversationHistories(
        params: AiRetrieveConversationHistoriesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiRetrieveConversationHistoriesPage

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

        fun chat(): ChatService.WithRawResponse

        /** Identify common themes and patterns in your embedded documents */
        fun clusters(): ClusterService.WithRawResponse

        /**
         * Create and manage logical collections of your Telnyx data, tune retrieval settings,
         * manage sources, and run collection-scoped semantic search.
         */
        fun collections(): CollectionService.WithRawResponse

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

        fun anthropic(): AnthropicService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/conversation_histories`, but is otherwise the
         * same as [AiService.retrieveConversationHistories].
         */
        @MustBeClosed
        fun retrieveConversationHistories(
            params: AiRetrieveConversationHistoriesParams
        ): HttpResponseFor<AiRetrieveConversationHistoriesPage> =
            retrieveConversationHistories(params, RequestOptions.none())

        /** @see retrieveConversationHistories */
        @MustBeClosed
        fun retrieveConversationHistories(
            params: AiRetrieveConversationHistoriesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiRetrieveConversationHistoriesPage>

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
