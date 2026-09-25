// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory.namespaces.profiles

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceDeleteResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceListPageAsync
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceRetrieveParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** What a profile stored, and what its memories came from. */
interface SourceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SourceServiceAsync

    /**
     * One source and its content, as it was stored: an ingested session's payload or a remembered
     * fact. A source whose ingest is still queued answers 404 until it has been stored.
     */
    fun retrieve(
        sourceId: String,
        params: SourceRetrieveParams,
    ): CompletableFuture<SourceRetrieveResponse> = retrieve(sourceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        sourceId: String,
        params: SourceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceRetrieveResponse> =
        retrieve(params.toBuilder().sourceId(sourceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: SourceRetrieveParams): CompletableFuture<SourceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SourceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceRetrieveResponse>

    /**
     * Everything a profile has stored and extracts memories from: each ingested session, and each
     * remembered fact, which has no session. Content is not listed; read one source for it. A
     * source whose ingest is still queued is not here yet. Re-ingesting a session moves it to the
     * front, so a listing paged while sessions are written can repeat or miss one at a page
     * boundary. A `session_id` narrows the listing to the source that session was stored as: one
     * source or none, and none -- an empty page, not a 404 -- for a session never ingested, still
     * queued, or another profile's.
     */
    fun list(profileId: String, params: SourceListParams): CompletableFuture<SourceListPageAsync> =
        list(profileId, params, RequestOptions.none())

    /** @see list */
    fun list(
        profileId: String,
        params: SourceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceListPageAsync> =
        list(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see list */
    fun list(params: SourceListParams): CompletableFuture<SourceListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SourceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceListPageAsync>

    /**
     * Deletes one source -- an ingested session or a remembered fact -- together with the memories
     * derived from it. A memory derived from this source and others is deleted too, and derived
     * again from what remains in the background. It answers only once the source is gone. A source
     * that is not there -- never stored, another profile's, or already deleted -- answers 404, so
     * on a `502` or a `504` repeat the identical request and read a 404 as done. An ingest of the
     * same session that is still queued is not cancelled, and stores the session again when it
     * runs. Nothing here can be undone.
     */
    fun delete(
        sourceId: String,
        params: SourceDeleteParams,
    ): CompletableFuture<SourceDeleteResponse> = delete(sourceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        sourceId: String,
        params: SourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceDeleteResponse> =
        delete(params.toBuilder().sourceId(sourceId).build(), requestOptions)

    /** @see delete */
    fun delete(params: SourceDeleteParams): CompletableFuture<SourceDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceDeleteResponse>

    /**
     * A view of [SourceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SourceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/sources/{source_id}`, but is
         * otherwise the same as [SourceServiceAsync.retrieve].
         */
        fun retrieve(
            sourceId: String,
            params: SourceRetrieveParams,
        ): CompletableFuture<HttpResponseFor<SourceRetrieveResponse>> =
            retrieve(sourceId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            sourceId: String,
            params: SourceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceRetrieveResponse>> =
            retrieve(params.toBuilder().sourceId(sourceId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: SourceRetrieveParams
        ): CompletableFuture<HttpResponseFor<SourceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SourceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/sources`, but is otherwise the
         * same as [SourceServiceAsync.list].
         */
        fun list(
            profileId: String,
            params: SourceListParams,
        ): CompletableFuture<HttpResponseFor<SourceListPageAsync>> =
            list(profileId, params, RequestOptions.none())

        /** @see list */
        fun list(
            profileId: String,
            params: SourceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceListPageAsync>> =
            list(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see list */
        fun list(
            params: SourceListParams
        ): CompletableFuture<HttpResponseFor<SourceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SourceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/sources/{source_id}`, but is
         * otherwise the same as [SourceServiceAsync.delete].
         */
        fun delete(
            sourceId: String,
            params: SourceDeleteParams,
        ): CompletableFuture<HttpResponseFor<SourceDeleteResponse>> =
            delete(sourceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            sourceId: String,
            params: SourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceDeleteResponse>> =
            delete(params.toBuilder().sourceId(sourceId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: SourceDeleteParams
        ): CompletableFuture<HttpResponseFor<SourceDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceDeleteResponse>>
    }
}
