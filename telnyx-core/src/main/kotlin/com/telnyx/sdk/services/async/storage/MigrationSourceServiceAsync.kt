// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceCreateParams
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceCreateResponse
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceDeleteParams
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceDeleteResponse
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceListParams
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceListResponse
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceParams
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceRetrieveParams
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Migrate data from an external provider into Telnyx Cloud Storage */
interface MigrationSourceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MigrationSourceServiceAsync

    /** Create a source from which data can be migrated from. */
    fun create(
        params: MigrationSourceCreateParams
    ): CompletableFuture<MigrationSourceCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MigrationSourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationSourceCreateResponse>

    /** @see create */
    fun create(
        migrationSourceParams: MigrationSourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationSourceCreateResponse> =
        create(
            MigrationSourceCreateParams.builder()
                .migrationSourceParams(migrationSourceParams)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        migrationSourceParams: MigrationSourceParams
    ): CompletableFuture<MigrationSourceCreateResponse> =
        create(migrationSourceParams, RequestOptions.none())

    /** Get a Migration Source */
    fun retrieve(id: String): CompletableFuture<MigrationSourceRetrieveResponse> =
        retrieve(id, MigrationSourceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MigrationSourceRetrieveParams = MigrationSourceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationSourceRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MigrationSourceRetrieveParams = MigrationSourceRetrieveParams.none(),
    ): CompletableFuture<MigrationSourceRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MigrationSourceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationSourceRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MigrationSourceRetrieveParams
    ): CompletableFuture<MigrationSourceRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MigrationSourceRetrieveResponse> =
        retrieve(id, MigrationSourceRetrieveParams.none(), requestOptions)

    /** List all Migration Sources */
    fun list(): CompletableFuture<MigrationSourceListResponse> =
        list(MigrationSourceListParams.none())

    /** @see list */
    fun list(
        params: MigrationSourceListParams = MigrationSourceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationSourceListResponse>

    /** @see list */
    fun list(
        params: MigrationSourceListParams = MigrationSourceListParams.none()
    ): CompletableFuture<MigrationSourceListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MigrationSourceListResponse> =
        list(MigrationSourceListParams.none(), requestOptions)

    /** Delete a Migration Source */
    fun delete(id: String): CompletableFuture<MigrationSourceDeleteResponse> =
        delete(id, MigrationSourceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MigrationSourceDeleteParams = MigrationSourceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationSourceDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MigrationSourceDeleteParams = MigrationSourceDeleteParams.none(),
    ): CompletableFuture<MigrationSourceDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MigrationSourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationSourceDeleteResponse>

    /** @see delete */
    fun delete(
        params: MigrationSourceDeleteParams
    ): CompletableFuture<MigrationSourceDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MigrationSourceDeleteResponse> =
        delete(id, MigrationSourceDeleteParams.none(), requestOptions)

    /**
     * A view of [MigrationSourceServiceAsync] that provides access to raw HTTP responses for each
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
        ): MigrationSourceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/migration_sources`, but is otherwise the
         * same as [MigrationSourceServiceAsync.create].
         */
        fun create(
            params: MigrationSourceCreateParams
        ): CompletableFuture<HttpResponseFor<MigrationSourceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MigrationSourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSourceCreateResponse>>

        /** @see create */
        fun create(
            migrationSourceParams: MigrationSourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSourceCreateResponse>> =
            create(
                MigrationSourceCreateParams.builder()
                    .migrationSourceParams(migrationSourceParams)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            migrationSourceParams: MigrationSourceParams
        ): CompletableFuture<HttpResponseFor<MigrationSourceCreateResponse>> =
            create(migrationSourceParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /storage/migration_sources/{id}`, but is otherwise
         * the same as [MigrationSourceServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<MigrationSourceRetrieveResponse>> =
            retrieve(id, MigrationSourceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MigrationSourceRetrieveParams = MigrationSourceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSourceRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MigrationSourceRetrieveParams = MigrationSourceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSourceRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MigrationSourceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSourceRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MigrationSourceRetrieveParams
        ): CompletableFuture<HttpResponseFor<MigrationSourceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MigrationSourceRetrieveResponse>> =
            retrieve(id, MigrationSourceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/migration_sources`, but is otherwise the
         * same as [MigrationSourceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MigrationSourceListResponse>> =
            list(MigrationSourceListParams.none())

        /** @see list */
        fun list(
            params: MigrationSourceListParams = MigrationSourceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSourceListResponse>>

        /** @see list */
        fun list(
            params: MigrationSourceListParams = MigrationSourceListParams.none()
        ): CompletableFuture<HttpResponseFor<MigrationSourceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MigrationSourceListResponse>> =
            list(MigrationSourceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/migration_sources/{id}`, but is
         * otherwise the same as [MigrationSourceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<MigrationSourceDeleteResponse>> =
            delete(id, MigrationSourceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MigrationSourceDeleteParams = MigrationSourceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSourceDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MigrationSourceDeleteParams = MigrationSourceDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSourceDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MigrationSourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSourceDeleteResponse>>

        /** @see delete */
        fun delete(
            params: MigrationSourceDeleteParams
        ): CompletableFuture<HttpResponseFor<MigrationSourceDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MigrationSourceDeleteResponse>> =
            delete(id, MigrationSourceDeleteParams.none(), requestOptions)
    }
}
