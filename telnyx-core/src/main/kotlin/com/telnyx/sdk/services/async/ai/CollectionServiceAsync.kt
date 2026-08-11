// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.collections.CollectionCreateParams
import com.telnyx.sdk.models.ai.collections.CollectionDeleteParams
import com.telnyx.sdk.models.ai.collections.CollectionEnvelope
import com.telnyx.sdk.models.ai.collections.CollectionListPageAsync
import com.telnyx.sdk.models.ai.collections.CollectionListParams
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveByIdParams
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveDocumentsParams
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveDocumentsResponse
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveParams
import com.telnyx.sdk.models.ai.collections.CollectionUpdateParams
import com.telnyx.sdk.services.async.ai.collections.SettingServiceAsync
import com.telnyx.sdk.services.async.ai.collections.SourceServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
interface CollectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectionServiceAsync

    /**
     * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
     * sources, and run collection-scoped semantic search.
     */
    fun settings(): SettingServiceAsync

    /**
     * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
     * sources, and run collection-scoped semantic search.
     */
    fun sources(): SourceServiceAsync

    /**
     * Creates a new collection scoped to your organization. Optionally attach sources and retrieval
     * settings at creation time. If `slug` is omitted, one is derived from `name` and must be
     * unique within your organization.
     */
    fun create(params: CollectionCreateParams): CompletableFuture<CollectionEnvelope> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CollectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionEnvelope>

    /** Fetches a single collection by its `slug`. */
    fun retrieve(slug: String): CompletableFuture<CollectionEnvelope> =
        retrieve(slug, CollectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        slug: String,
        params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionEnvelope> =
        retrieve(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        slug: String,
        params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
    ): CompletableFuture<CollectionEnvelope> = retrieve(slug, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CollectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionEnvelope>

    /** @see retrieve */
    fun retrieve(params: CollectionRetrieveParams): CompletableFuture<CollectionEnvelope> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        slug: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionEnvelope> =
        retrieve(slug, CollectionRetrieveParams.none(), requestOptions)

    /**
     * Updates a collection's metadata (`name` and/or `description`). Sources and settings are
     * managed through their own sub-resources.
     */
    fun update(uuid: String): CompletableFuture<CollectionEnvelope> =
        update(uuid, CollectionUpdateParams.none())

    /** @see update */
    fun update(
        uuid: String,
        params: CollectionUpdateParams = CollectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionEnvelope> =
        update(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see update */
    fun update(
        uuid: String,
        params: CollectionUpdateParams = CollectionUpdateParams.none(),
    ): CompletableFuture<CollectionEnvelope> = update(uuid, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CollectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionEnvelope>

    /** @see update */
    fun update(params: CollectionUpdateParams): CompletableFuture<CollectionEnvelope> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        uuid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionEnvelope> =
        update(uuid, CollectionUpdateParams.none(), requestOptions)

    /** Returns a paginated list of collections in your organization. */
    fun list(): CompletableFuture<CollectionListPageAsync> = list(CollectionListParams.none())

    /** @see list */
    fun list(
        params: CollectionListParams = CollectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionListPageAsync>

    /** @see list */
    fun list(
        params: CollectionListParams = CollectionListParams.none()
    ): CompletableFuture<CollectionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CollectionListPageAsync> =
        list(CollectionListParams.none(), requestOptions)

    /** Soft-deletes a collection. Its `slug` is freed and may be reused by a new collection. */
    fun delete(uuid: String): CompletableFuture<Void?> = delete(uuid, CollectionDeleteParams.none())

    /** @see delete */
    fun delete(
        uuid: String,
        params: CollectionDeleteParams = CollectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see delete */
    fun delete(
        uuid: String,
        params: CollectionDeleteParams = CollectionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(uuid, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CollectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CollectionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(uuid: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(uuid, CollectionDeleteParams.none(), requestOptions)

    /** Fetches a single collection by its `uuid`. */
    fun retrieveById(uuid: String): CompletableFuture<CollectionEnvelope> =
        retrieveById(uuid, CollectionRetrieveByIdParams.none())

    /** @see retrieveById */
    fun retrieveById(
        uuid: String,
        params: CollectionRetrieveByIdParams = CollectionRetrieveByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionEnvelope> =
        retrieveById(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see retrieveById */
    fun retrieveById(
        uuid: String,
        params: CollectionRetrieveByIdParams = CollectionRetrieveByIdParams.none(),
    ): CompletableFuture<CollectionEnvelope> = retrieveById(uuid, params, RequestOptions.none())

    /** @see retrieveById */
    fun retrieveById(
        params: CollectionRetrieveByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionEnvelope>

    /** @see retrieveById */
    fun retrieveById(params: CollectionRetrieveByIdParams): CompletableFuture<CollectionEnvelope> =
        retrieveById(params, RequestOptions.none())

    /** @see retrieveById */
    fun retrieveById(
        uuid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionEnvelope> =
        retrieveById(uuid, CollectionRetrieveByIdParams.none(), requestOptions)

    /**
     * Runs search over the documents in a collection, ranked by relevance to `query`. The
     * collection's `retrieval_type` setting selects the strategy: `vector` (semantic similarity),
     * `hybrid` (vector similarity fused with keyword matching), or `keyword` (lexical BM25
     * matching). When `query` is omitted, returns a plain catalog listing of the collection's
     * documents.
     *
     * **How it works:**
     * 1. For `vector` and `hybrid`, the `query` text is embedded into a 1024-dimensional vector
     *    using the multilingual-e5-large model.
     * 2. For `vector`, the embedding is compared against the collection's indexed document chunks
     *    using semantic similarity; for `hybrid`, those similarity scores are fused with
     *    keyword-match scores; for `keyword`, only lexical BM25 matching is applied.
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
     * - `GET /v2/ai/collections/my-collection/documents?query=billing+issue&top_k=10`
     * - `GET /v2/ai/collections/my-collection/documents?query=refund&sources=voice,message`
     * - `GET
     *   /v2/ai/collections/my-collection/documents?query=outage&filter[record_created_at][gte]=2026-01-01T00:00:00Z`
     */
    fun retrieveDocuments(slug: String): CompletableFuture<CollectionRetrieveDocumentsResponse> =
        retrieveDocuments(slug, CollectionRetrieveDocumentsParams.none())

    /** @see retrieveDocuments */
    fun retrieveDocuments(
        slug: String,
        params: CollectionRetrieveDocumentsParams = CollectionRetrieveDocumentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionRetrieveDocumentsResponse> =
        retrieveDocuments(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see retrieveDocuments */
    fun retrieveDocuments(
        slug: String,
        params: CollectionRetrieveDocumentsParams = CollectionRetrieveDocumentsParams.none(),
    ): CompletableFuture<CollectionRetrieveDocumentsResponse> =
        retrieveDocuments(slug, params, RequestOptions.none())

    /** @see retrieveDocuments */
    fun retrieveDocuments(
        params: CollectionRetrieveDocumentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionRetrieveDocumentsResponse>

    /** @see retrieveDocuments */
    fun retrieveDocuments(
        params: CollectionRetrieveDocumentsParams
    ): CompletableFuture<CollectionRetrieveDocumentsResponse> =
        retrieveDocuments(params, RequestOptions.none())

    /** @see retrieveDocuments */
    fun retrieveDocuments(
        slug: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionRetrieveDocumentsResponse> =
        retrieveDocuments(slug, CollectionRetrieveDocumentsParams.none(), requestOptions)

    /**
     * A view of [CollectionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CollectionServiceAsync.WithRawResponse

        /**
         * Create and manage logical collections of your Telnyx data, tune retrieval settings,
         * manage sources, and run collection-scoped semantic search.
         */
        fun settings(): SettingServiceAsync.WithRawResponse

        /**
         * Create and manage logical collections of your Telnyx data, tune retrieval settings,
         * manage sources, and run collection-scoped semantic search.
         */
        fun sources(): SourceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/collections`, but is otherwise the same as
         * [CollectionServiceAsync.create].
         */
        fun create(
            params: CollectionCreateParams
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CollectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>>

        /**
         * Returns a raw HTTP response for `get /ai/collections/slug/{slug}`, but is otherwise the
         * same as [CollectionServiceAsync.retrieve].
         */
        fun retrieve(slug: String): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            retrieve(slug, CollectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            slug: String,
            params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            retrieve(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            slug: String,
            params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            retrieve(slug, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CollectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>>

        /** @see retrieve */
        fun retrieve(
            params: CollectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            slug: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            retrieve(slug, CollectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/collections/{uuid}`, but is otherwise the same
         * as [CollectionServiceAsync.update].
         */
        fun update(uuid: String): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            update(uuid, CollectionUpdateParams.none())

        /** @see update */
        fun update(
            uuid: String,
            params: CollectionUpdateParams = CollectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            update(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see update */
        fun update(
            uuid: String,
            params: CollectionUpdateParams = CollectionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            update(uuid, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CollectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>>

        /** @see update */
        fun update(
            params: CollectionUpdateParams
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            uuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            update(uuid, CollectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/collections`, but is otherwise the same as
         * [CollectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CollectionListPageAsync>> =
            list(CollectionListParams.none())

        /** @see list */
        fun list(
            params: CollectionListParams = CollectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionListPageAsync>>

        /** @see list */
        fun list(
            params: CollectionListParams = CollectionListParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionListPageAsync>> =
            list(CollectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/collections/{uuid}`, but is otherwise the
         * same as [CollectionServiceAsync.delete].
         */
        fun delete(uuid: String): CompletableFuture<HttpResponse> =
            delete(uuid, CollectionDeleteParams.none())

        /** @see delete */
        fun delete(
            uuid: String,
            params: CollectionDeleteParams = CollectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see delete */
        fun delete(
            uuid: String,
            params: CollectionDeleteParams = CollectionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(uuid, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CollectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CollectionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(uuid: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(uuid, CollectionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/collections/{uuid}`, but is otherwise the same
         * as [CollectionServiceAsync.retrieveById].
         */
        fun retrieveById(uuid: String): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            retrieveById(uuid, CollectionRetrieveByIdParams.none())

        /** @see retrieveById */
        fun retrieveById(
            uuid: String,
            params: CollectionRetrieveByIdParams = CollectionRetrieveByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            retrieveById(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see retrieveById */
        fun retrieveById(
            uuid: String,
            params: CollectionRetrieveByIdParams = CollectionRetrieveByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            retrieveById(uuid, params, RequestOptions.none())

        /** @see retrieveById */
        fun retrieveById(
            params: CollectionRetrieveByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>>

        /** @see retrieveById */
        fun retrieveById(
            params: CollectionRetrieveByIdParams
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            retrieveById(params, RequestOptions.none())

        /** @see retrieveById */
        fun retrieveById(
            uuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> =
            retrieveById(uuid, CollectionRetrieveByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/collections/{slug}/documents`, but is otherwise
         * the same as [CollectionServiceAsync.retrieveDocuments].
         */
        fun retrieveDocuments(
            slug: String
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveDocumentsResponse>> =
            retrieveDocuments(slug, CollectionRetrieveDocumentsParams.none())

        /** @see retrieveDocuments */
        fun retrieveDocuments(
            slug: String,
            params: CollectionRetrieveDocumentsParams = CollectionRetrieveDocumentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveDocumentsResponse>> =
            retrieveDocuments(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see retrieveDocuments */
        fun retrieveDocuments(
            slug: String,
            params: CollectionRetrieveDocumentsParams = CollectionRetrieveDocumentsParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveDocumentsResponse>> =
            retrieveDocuments(slug, params, RequestOptions.none())

        /** @see retrieveDocuments */
        fun retrieveDocuments(
            params: CollectionRetrieveDocumentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveDocumentsResponse>>

        /** @see retrieveDocuments */
        fun retrieveDocuments(
            params: CollectionRetrieveDocumentsParams
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveDocumentsResponse>> =
            retrieveDocuments(params, RequestOptions.none())

        /** @see retrieveDocuments */
        fun retrieveDocuments(
            slug: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveDocumentsResponse>> =
            retrieveDocuments(slug, CollectionRetrieveDocumentsParams.none(), requestOptions)
    }
}
