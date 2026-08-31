// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.knowledge

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.knowledge.collections.CollectionRetrieveDocumentsParams
import com.telnyx.sdk.models.ai.knowledge.collections.CollectionRetrieveDocumentsResponse
import java.util.function.Consumer

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
interface CollectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectionService

    /**
     * Runs search over the documents in a collection, ranked by relevance to `query`. Searches
     * currently run `vector` retrieval (semantic similarity). The collection's `retrieval_type`
     * setting is the forward-compatible selector: `hybrid` (vector similarity fused with keyword
     * matching) can be set but cannot be searched yet, and `keyword` (lexical BM25 matching) is not
     * accepted yet -- setting it returns 422 `unsupported_retrieval_type`. A per-request
     * `retrieval_type` is accepted but ignored; `meta.retrieval_type` echoes the mode that actually
     * ran. When `query` is omitted, returns a plain catalog listing of the collection's documents.
     *
     * **How it works:**
     * 1. The `query` text is embedded into a 1024-dimensional vector using the
     *    multilingual-e5-large model.
     * 2. The embedding is compared against the collection's indexed document chunks using semantic
     *    similarity. When `hybrid` and `keyword` execution ship, those scores will be fused with,
     *    or replaced by, lexical BM25 matching.
     * 3. Results are ranked by `score` (descending) and paginated via `page[number]` /
     *    `page[size]`.
     *
     * **Authentication:** Requires a Telnyx API key via `Authorization: Bearer <key>`. Results are
     * automatically scoped to your organization and cannot be overridden.
     *
     * **Filtering:** Use `filter[field][operator]=value` query parameters to narrow results before
     * search. Supported operators: `eq` (default), `in`, `gte`, `gt`, `lte`, `lt`, `contains`.
     * Metadata fields resolve to `metadata.<field>`.
     *
     * **Examples:**
     * - `GET /v2/ai/knowledge/collections/my-collection/documents?query=billing+issue&top_k=10`
     * - `GET
     *   /v2/ai/knowledge/collections/my-collection/documents?query=refund&sources=voice,message`
     * - `GET
     *   /v2/ai/knowledge/collections/my-collection/documents?query=outage&filter[record_created_at][gte]=2026-01-01T00:00:00Z`
     */
    fun retrieveDocuments(slug: String): CollectionRetrieveDocumentsResponse =
        retrieveDocuments(slug, CollectionRetrieveDocumentsParams.none())

    /** @see retrieveDocuments */
    fun retrieveDocuments(
        slug: String,
        params: CollectionRetrieveDocumentsParams = CollectionRetrieveDocumentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionRetrieveDocumentsResponse =
        retrieveDocuments(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see retrieveDocuments */
    fun retrieveDocuments(
        slug: String,
        params: CollectionRetrieveDocumentsParams = CollectionRetrieveDocumentsParams.none(),
    ): CollectionRetrieveDocumentsResponse = retrieveDocuments(slug, params, RequestOptions.none())

    /** @see retrieveDocuments */
    fun retrieveDocuments(
        params: CollectionRetrieveDocumentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionRetrieveDocumentsResponse

    /** @see retrieveDocuments */
    fun retrieveDocuments(
        params: CollectionRetrieveDocumentsParams
    ): CollectionRetrieveDocumentsResponse = retrieveDocuments(params, RequestOptions.none())

    /** @see retrieveDocuments */
    fun retrieveDocuments(
        slug: String,
        requestOptions: RequestOptions,
    ): CollectionRetrieveDocumentsResponse =
        retrieveDocuments(slug, CollectionRetrieveDocumentsParams.none(), requestOptions)

    /** A view of [CollectionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CollectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/knowledge/collections/{slug}/documents`, but is
         * otherwise the same as [CollectionService.retrieveDocuments].
         */
        @MustBeClosed
        fun retrieveDocuments(slug: String): HttpResponseFor<CollectionRetrieveDocumentsResponse> =
            retrieveDocuments(slug, CollectionRetrieveDocumentsParams.none())

        /** @see retrieveDocuments */
        @MustBeClosed
        fun retrieveDocuments(
            slug: String,
            params: CollectionRetrieveDocumentsParams = CollectionRetrieveDocumentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionRetrieveDocumentsResponse> =
            retrieveDocuments(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see retrieveDocuments */
        @MustBeClosed
        fun retrieveDocuments(
            slug: String,
            params: CollectionRetrieveDocumentsParams = CollectionRetrieveDocumentsParams.none(),
        ): HttpResponseFor<CollectionRetrieveDocumentsResponse> =
            retrieveDocuments(slug, params, RequestOptions.none())

        /** @see retrieveDocuments */
        @MustBeClosed
        fun retrieveDocuments(
            params: CollectionRetrieveDocumentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionRetrieveDocumentsResponse>

        /** @see retrieveDocuments */
        @MustBeClosed
        fun retrieveDocuments(
            params: CollectionRetrieveDocumentsParams
        ): HttpResponseFor<CollectionRetrieveDocumentsResponse> =
            retrieveDocuments(params, RequestOptions.none())

        /** @see retrieveDocuments */
        @MustBeClosed
        fun retrieveDocuments(
            slug: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionRetrieveDocumentsResponse> =
            retrieveDocuments(slug, CollectionRetrieveDocumentsParams.none(), requestOptions)
    }
}
