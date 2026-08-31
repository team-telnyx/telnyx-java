// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.collections.CollectionCreateParams
import com.telnyx.sdk.models.ai.collections.CollectionDeleteParams
import com.telnyx.sdk.models.ai.collections.CollectionEnvelope
import com.telnyx.sdk.models.ai.collections.CollectionListPage
import com.telnyx.sdk.models.ai.collections.CollectionListParams
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveByIdParams
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveParams
import com.telnyx.sdk.models.ai.collections.CollectionUpdateParams
import com.telnyx.sdk.services.blocking.ai.collections.SettingService
import com.telnyx.sdk.services.blocking.ai.collections.SourceService
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
     * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
     * sources, and run collection-scoped semantic search.
     */
    fun settings(): SettingService

    /**
     * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
     * sources, and run collection-scoped semantic search.
     */
    fun sources(): SourceService

    /**
     * Creates a new collection scoped to your organization. Optionally attach sources and retrieval
     * settings at creation time. If `slug` is omitted, one is derived from `name` and must be
     * unique within your organization.
     */
    fun create(params: CollectionCreateParams): CollectionEnvelope =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CollectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionEnvelope

    /** Fetches a single collection by its `slug`. */
    fun retrieve(slug: String): CollectionEnvelope = retrieve(slug, CollectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        slug: String,
        params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionEnvelope = retrieve(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        slug: String,
        params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
    ): CollectionEnvelope = retrieve(slug, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CollectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionEnvelope

    /** @see retrieve */
    fun retrieve(params: CollectionRetrieveParams): CollectionEnvelope =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(slug: String, requestOptions: RequestOptions): CollectionEnvelope =
        retrieve(slug, CollectionRetrieveParams.none(), requestOptions)

    /**
     * Updates a collection's metadata (`name` and/or `description`). Sources and settings are
     * managed through their own sub-resources.
     */
    fun update(uuid: String): CollectionEnvelope = update(uuid, CollectionUpdateParams.none())

    /** @see update */
    fun update(
        uuid: String,
        params: CollectionUpdateParams = CollectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionEnvelope = update(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see update */
    fun update(
        uuid: String,
        params: CollectionUpdateParams = CollectionUpdateParams.none(),
    ): CollectionEnvelope = update(uuid, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CollectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionEnvelope

    /** @see update */
    fun update(params: CollectionUpdateParams): CollectionEnvelope =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(uuid: String, requestOptions: RequestOptions): CollectionEnvelope =
        update(uuid, CollectionUpdateParams.none(), requestOptions)

    /** Returns a paginated list of collections in your organization. */
    fun list(): CollectionListPage = list(CollectionListParams.none())

    /** @see list */
    fun list(
        params: CollectionListParams = CollectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionListPage

    /** @see list */
    fun list(params: CollectionListParams = CollectionListParams.none()): CollectionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CollectionListPage =
        list(CollectionListParams.none(), requestOptions)

    /** Soft-deletes a collection. Its `slug` is freed and may be reused by a new collection. */
    fun delete(uuid: String) = delete(uuid, CollectionDeleteParams.none())

    /** @see delete */
    fun delete(
        uuid: String,
        params: CollectionDeleteParams = CollectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see delete */
    fun delete(uuid: String, params: CollectionDeleteParams = CollectionDeleteParams.none()) =
        delete(uuid, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CollectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: CollectionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(uuid: String, requestOptions: RequestOptions) =
        delete(uuid, CollectionDeleteParams.none(), requestOptions)

    /** Fetches a single collection by its `uuid`. */
    fun retrieveById(uuid: String): CollectionEnvelope =
        retrieveById(uuid, CollectionRetrieveByIdParams.none())

    /** @see retrieveById */
    fun retrieveById(
        uuid: String,
        params: CollectionRetrieveByIdParams = CollectionRetrieveByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionEnvelope = retrieveById(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see retrieveById */
    fun retrieveById(
        uuid: String,
        params: CollectionRetrieveByIdParams = CollectionRetrieveByIdParams.none(),
    ): CollectionEnvelope = retrieveById(uuid, params, RequestOptions.none())

    /** @see retrieveById */
    fun retrieveById(
        params: CollectionRetrieveByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionEnvelope

    /** @see retrieveById */
    fun retrieveById(params: CollectionRetrieveByIdParams): CollectionEnvelope =
        retrieveById(params, RequestOptions.none())

    /** @see retrieveById */
    fun retrieveById(uuid: String, requestOptions: RequestOptions): CollectionEnvelope =
        retrieveById(uuid, CollectionRetrieveByIdParams.none(), requestOptions)

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
         * Create and manage logical collections of your Telnyx data, tune retrieval settings,
         * manage sources, and run collection-scoped semantic search.
         */
        fun settings(): SettingService.WithRawResponse

        /**
         * Create and manage logical collections of your Telnyx data, tune retrieval settings,
         * manage sources, and run collection-scoped semantic search.
         */
        fun sources(): SourceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/collections`, but is otherwise the same as
         * [CollectionService.create].
         */
        @MustBeClosed
        fun create(params: CollectionCreateParams): HttpResponseFor<CollectionEnvelope> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CollectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionEnvelope>

        /**
         * Returns a raw HTTP response for `get /ai/collections/slug/{slug}`, but is otherwise the
         * same as [CollectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(slug: String): HttpResponseFor<CollectionEnvelope> =
            retrieve(slug, CollectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            slug: String,
            params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionEnvelope> =
            retrieve(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            slug: String,
            params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
        ): HttpResponseFor<CollectionEnvelope> = retrieve(slug, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CollectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionEnvelope>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CollectionRetrieveParams): HttpResponseFor<CollectionEnvelope> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            slug: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionEnvelope> =
            retrieve(slug, CollectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/collections/{uuid}`, but is otherwise the same
         * as [CollectionService.update].
         */
        @MustBeClosed
        fun update(uuid: String): HttpResponseFor<CollectionEnvelope> =
            update(uuid, CollectionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            uuid: String,
            params: CollectionUpdateParams = CollectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionEnvelope> =
            update(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            uuid: String,
            params: CollectionUpdateParams = CollectionUpdateParams.none(),
        ): HttpResponseFor<CollectionEnvelope> = update(uuid, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CollectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionEnvelope>

        /** @see update */
        @MustBeClosed
        fun update(params: CollectionUpdateParams): HttpResponseFor<CollectionEnvelope> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            uuid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionEnvelope> =
            update(uuid, CollectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/collections`, but is otherwise the same as
         * [CollectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CollectionListPage> = list(CollectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CollectionListParams = CollectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CollectionListParams = CollectionListParams.none()
        ): HttpResponseFor<CollectionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CollectionListPage> =
            list(CollectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/collections/{uuid}`, but is otherwise the
         * same as [CollectionService.delete].
         */
        @MustBeClosed
        fun delete(uuid: String): HttpResponse = delete(uuid, CollectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            uuid: String,
            params: CollectionDeleteParams = CollectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            uuid: String,
            params: CollectionDeleteParams = CollectionDeleteParams.none(),
        ): HttpResponse = delete(uuid, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CollectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CollectionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(uuid: String, requestOptions: RequestOptions): HttpResponse =
            delete(uuid, CollectionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/collections/{uuid}`, but is otherwise the same
         * as [CollectionService.retrieveById].
         */
        @MustBeClosed
        fun retrieveById(uuid: String): HttpResponseFor<CollectionEnvelope> =
            retrieveById(uuid, CollectionRetrieveByIdParams.none())

        /** @see retrieveById */
        @MustBeClosed
        fun retrieveById(
            uuid: String,
            params: CollectionRetrieveByIdParams = CollectionRetrieveByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionEnvelope> =
            retrieveById(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see retrieveById */
        @MustBeClosed
        fun retrieveById(
            uuid: String,
            params: CollectionRetrieveByIdParams = CollectionRetrieveByIdParams.none(),
        ): HttpResponseFor<CollectionEnvelope> = retrieveById(uuid, params, RequestOptions.none())

        /** @see retrieveById */
        @MustBeClosed
        fun retrieveById(
            params: CollectionRetrieveByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionEnvelope>

        /** @see retrieveById */
        @MustBeClosed
        fun retrieveById(
            params: CollectionRetrieveByIdParams
        ): HttpResponseFor<CollectionEnvelope> = retrieveById(params, RequestOptions.none())

        /** @see retrieveById */
        @MustBeClosed
        fun retrieveById(
            uuid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionEnvelope> =
            retrieveById(uuid, CollectionRetrieveByIdParams.none(), requestOptions)
    }
}
