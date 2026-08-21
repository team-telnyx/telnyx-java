// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.collections

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.collections.sources.SourceCreateParams
import com.telnyx.sdk.models.ai.collections.sources.SourceCreateResponse
import com.telnyx.sdk.models.ai.collections.sources.SourceDeleteParams
import com.telnyx.sdk.models.ai.collections.sources.SourceListParams
import com.telnyx.sdk.models.ai.collections.sources.SourceListResponse
import com.telnyx.sdk.models.ai.collections.sources.SourceReplaceParams
import com.telnyx.sdk.models.ai.collections.sources.SourceReplaceResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
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
     * Attaches a new content source to the specified collection and returns the created source. The
     * source's content is ingested and embedded so it becomes searchable within the collection.
     */
    fun create(uuid: String, params: SourceCreateParams): CompletableFuture<SourceCreateResponse> =
        create(uuid, params, RequestOptions.none())

    /** @see create */
    fun create(
        uuid: String,
        params: SourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceCreateResponse> =
        create(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see create */
    fun create(params: SourceCreateParams): CompletableFuture<SourceCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceCreateResponse>

    /** Returns the sources attached to a collection. */
    fun list(uuid: String): CompletableFuture<SourceListResponse> =
        list(uuid, SourceListParams.none())

    /** @see list */
    fun list(
        uuid: String,
        params: SourceListParams = SourceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceListResponse> =
        list(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see list */
    fun list(
        uuid: String,
        params: SourceListParams = SourceListParams.none(),
    ): CompletableFuture<SourceListResponse> = list(uuid, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SourceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceListResponse>

    /** @see list */
    fun list(params: SourceListParams): CompletableFuture<SourceListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(uuid: String, requestOptions: RequestOptions): CompletableFuture<SourceListResponse> =
        list(uuid, SourceListParams.none(), requestOptions)

    /** Removes a single source from a collection. */
    fun delete(sourceId: String, params: SourceDeleteParams): CompletableFuture<Void?> =
        delete(sourceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        sourceId: String,
        params: SourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().sourceId(sourceId).build(), requestOptions)

    /** @see delete */
    fun delete(params: SourceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Replaces the collection's entire source set. The response `meta` reports which sources were
     * added, retained, and removed.
     */
    fun replace(
        uuid: String,
        params: SourceReplaceParams,
    ): CompletableFuture<SourceReplaceResponse> = replace(uuid, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        uuid: String,
        params: SourceReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceReplaceResponse> =
        replace(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see replace */
    fun replace(params: SourceReplaceParams): CompletableFuture<SourceReplaceResponse> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: SourceReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceReplaceResponse>

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
         * Returns a raw HTTP response for `post /ai/collections/{uuid}/sources`, but is otherwise
         * the same as [SourceServiceAsync.create].
         */
        fun create(
            uuid: String,
            params: SourceCreateParams,
        ): CompletableFuture<HttpResponseFor<SourceCreateResponse>> =
            create(uuid, params, RequestOptions.none())

        /** @see create */
        fun create(
            uuid: String,
            params: SourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceCreateResponse>> =
            create(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see create */
        fun create(
            params: SourceCreateParams
        ): CompletableFuture<HttpResponseFor<SourceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/collections/{uuid}/sources`, but is otherwise
         * the same as [SourceServiceAsync.list].
         */
        fun list(uuid: String): CompletableFuture<HttpResponseFor<SourceListResponse>> =
            list(uuid, SourceListParams.none())

        /** @see list */
        fun list(
            uuid: String,
            params: SourceListParams = SourceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceListResponse>> =
            list(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see list */
        fun list(
            uuid: String,
            params: SourceListParams = SourceListParams.none(),
        ): CompletableFuture<HttpResponseFor<SourceListResponse>> =
            list(uuid, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SourceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceListResponse>>

        /** @see list */
        fun list(params: SourceListParams): CompletableFuture<HttpResponseFor<SourceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            uuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SourceListResponse>> =
            list(uuid, SourceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/collections/{uuid}/sources/{sourceId}`, but
         * is otherwise the same as [SourceServiceAsync.delete].
         */
        fun delete(sourceId: String, params: SourceDeleteParams): CompletableFuture<HttpResponse> =
            delete(sourceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            sourceId: String,
            params: SourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().sourceId(sourceId).build(), requestOptions)

        /** @see delete */
        fun delete(params: SourceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /ai/collections/{uuid}/sources`, but is otherwise
         * the same as [SourceServiceAsync.replace].
         */
        fun replace(
            uuid: String,
            params: SourceReplaceParams,
        ): CompletableFuture<HttpResponseFor<SourceReplaceResponse>> =
            replace(uuid, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            uuid: String,
            params: SourceReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceReplaceResponse>> =
            replace(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: SourceReplaceParams
        ): CompletableFuture<HttpResponseFor<SourceReplaceResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: SourceReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceReplaceResponse>>
    }
}
