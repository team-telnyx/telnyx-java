// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.collections

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
interface SourceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SourceService

    /** Attaches a new source to a collection. */
    fun create(uuid: String, params: SourceCreateParams): SourceCreateResponse =
        create(uuid, params, RequestOptions.none())

    /** @see create */
    fun create(
        uuid: String,
        params: SourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceCreateResponse = create(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see create */
    fun create(params: SourceCreateParams): SourceCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceCreateResponse

    /** Returns the sources attached to a collection. */
    fun list(uuid: String): SourceListResponse = list(uuid, SourceListParams.none())

    /** @see list */
    fun list(
        uuid: String,
        params: SourceListParams = SourceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceListResponse = list(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see list */
    fun list(uuid: String, params: SourceListParams = SourceListParams.none()): SourceListResponse =
        list(uuid, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SourceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceListResponse

    /** @see list */
    fun list(params: SourceListParams): SourceListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(uuid: String, requestOptions: RequestOptions): SourceListResponse =
        list(uuid, SourceListParams.none(), requestOptions)

    /** Removes a single source from a collection. */
    fun delete(sourceId: String, params: SourceDeleteParams) =
        delete(sourceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        sourceId: String,
        params: SourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().sourceId(sourceId).build(), requestOptions)

    /** @see delete */
    fun delete(params: SourceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SourceDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Replaces the collection's entire source set. The response `meta` reports which sources were
     * added, retained, and removed.
     */
    fun replace(uuid: String, params: SourceReplaceParams): SourceReplaceResponse =
        replace(uuid, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        uuid: String,
        params: SourceReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceReplaceResponse = replace(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see replace */
    fun replace(params: SourceReplaceParams): SourceReplaceResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: SourceReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceReplaceResponse

    /** A view of [SourceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SourceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/collections/{uuid}/sources`, but is otherwise
         * the same as [SourceService.create].
         */
        @MustBeClosed
        fun create(
            uuid: String,
            params: SourceCreateParams,
        ): HttpResponseFor<SourceCreateResponse> = create(uuid, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            uuid: String,
            params: SourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceCreateResponse> =
            create(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: SourceCreateParams): HttpResponseFor<SourceCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceCreateResponse>

        /**
         * Returns a raw HTTP response for `get /ai/collections/{uuid}/sources`, but is otherwise
         * the same as [SourceService.list].
         */
        @MustBeClosed
        fun list(uuid: String): HttpResponseFor<SourceListResponse> =
            list(uuid, SourceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            uuid: String,
            params: SourceListParams = SourceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceListResponse> =
            list(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            uuid: String,
            params: SourceListParams = SourceListParams.none(),
        ): HttpResponseFor<SourceListResponse> = list(uuid, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SourceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: SourceListParams): HttpResponseFor<SourceListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            uuid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SourceListResponse> = list(uuid, SourceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/collections/{uuid}/sources/{sourceId}`, but
         * is otherwise the same as [SourceService.delete].
         */
        @MustBeClosed
        fun delete(sourceId: String, params: SourceDeleteParams): HttpResponse =
            delete(sourceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            sourceId: String,
            params: SourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().sourceId(sourceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: SourceDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /ai/collections/{uuid}/sources`, but is otherwise
         * the same as [SourceService.replace].
         */
        @MustBeClosed
        fun replace(
            uuid: String,
            params: SourceReplaceParams,
        ): HttpResponseFor<SourceReplaceResponse> = replace(uuid, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            uuid: String,
            params: SourceReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceReplaceResponse> =
            replace(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(params: SourceReplaceParams): HttpResponseFor<SourceReplaceResponse> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: SourceReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceReplaceResponse>
    }
}
