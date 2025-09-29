// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.storage

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.storage.migrations.MigrationCreateParams
import com.telnyx.api.models.storage.migrations.MigrationCreateResponse
import com.telnyx.api.models.storage.migrations.MigrationListParams
import com.telnyx.api.models.storage.migrations.MigrationListResponse
import com.telnyx.api.models.storage.migrations.MigrationParams
import com.telnyx.api.models.storage.migrations.MigrationRetrieveParams
import com.telnyx.api.models.storage.migrations.MigrationRetrieveResponse
import com.telnyx.api.services.async.storage.migrations.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MigrationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MigrationServiceAsync

    fun actions(): ActionServiceAsync

    /**
     * Initiate a migration of data from an external provider into Telnyx Cloud Storage. Currently,
     * only S3 is supported.
     */
    fun create(params: MigrationCreateParams): CompletableFuture<MigrationCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MigrationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationCreateResponse>

    /** @see create */
    fun create(
        migrationParams: MigrationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationCreateResponse> =
        create(
            MigrationCreateParams.builder().migrationParams(migrationParams).build(),
            requestOptions,
        )

    /** @see create */
    fun create(migrationParams: MigrationParams): CompletableFuture<MigrationCreateResponse> =
        create(migrationParams, RequestOptions.none())

    /** Get a Migration */
    fun retrieve(id: String): CompletableFuture<MigrationRetrieveResponse> =
        retrieve(id, MigrationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
    ): CompletableFuture<MigrationRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MigrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: MigrationRetrieveParams): CompletableFuture<MigrationRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MigrationRetrieveResponse> =
        retrieve(id, MigrationRetrieveParams.none(), requestOptions)

    /** List all Migrations */
    fun list(): CompletableFuture<MigrationListResponse> = list(MigrationListParams.none())

    /** @see list */
    fun list(
        params: MigrationListParams = MigrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationListResponse>

    /** @see list */
    fun list(
        params: MigrationListParams = MigrationListParams.none()
    ): CompletableFuture<MigrationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MigrationListResponse> =
        list(MigrationListParams.none(), requestOptions)

    /**
     * A view of [MigrationServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MigrationServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/migrations`, but is otherwise the same as
         * [MigrationServiceAsync.create].
         */
        fun create(
            params: MigrationCreateParams
        ): CompletableFuture<HttpResponseFor<MigrationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MigrationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationCreateResponse>>

        /** @see create */
        fun create(
            migrationParams: MigrationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationCreateResponse>> =
            create(
                MigrationCreateParams.builder().migrationParams(migrationParams).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            migrationParams: MigrationParams
        ): CompletableFuture<HttpResponseFor<MigrationCreateResponse>> =
            create(migrationParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /storage/migrations/{id}`, but is otherwise the same
         * as [MigrationServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>> =
            retrieve(id, MigrationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MigrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MigrationRetrieveParams
        ): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>> =
            retrieve(id, MigrationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/migrations`, but is otherwise the same as
         * [MigrationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MigrationListResponse>> =
            list(MigrationListParams.none())

        /** @see list */
        fun list(
            params: MigrationListParams = MigrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationListResponse>>

        /** @see list */
        fun list(
            params: MigrationListParams = MigrationListParams.none()
        ): CompletableFuture<HttpResponseFor<MigrationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MigrationListResponse>> =
            list(MigrationListParams.none(), requestOptions)
    }
}
