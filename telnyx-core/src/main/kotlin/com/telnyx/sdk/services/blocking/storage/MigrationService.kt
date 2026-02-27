// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.migrations.MigrationCreateParams
import com.telnyx.sdk.models.storage.migrations.MigrationCreateResponse
import com.telnyx.sdk.models.storage.migrations.MigrationListParams
import com.telnyx.sdk.models.storage.migrations.MigrationListResponse
import com.telnyx.sdk.models.storage.migrations.MigrationParams
import com.telnyx.sdk.models.storage.migrations.MigrationRetrieveParams
import com.telnyx.sdk.models.storage.migrations.MigrationRetrieveResponse
import com.telnyx.sdk.services.blocking.storage.migrations.ActionService
import java.util.function.Consumer

/** Migrate data from an external provider into Telnyx Cloud Storage */
interface MigrationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MigrationService

    /** Migrate data from an external provider into Telnyx Cloud Storage */
    fun actions(): ActionService

    /**
     * Initiate a migration of data from an external provider into Telnyx Cloud Storage. Currently,
     * only S3 is supported.
     */
    fun create(params: MigrationCreateParams): MigrationCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MigrationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationCreateResponse

    /** @see create */
    fun create(
        migrationParams: MigrationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationCreateResponse =
        create(
            MigrationCreateParams.builder().migrationParams(migrationParams).build(),
            requestOptions,
        )

    /** @see create */
    fun create(migrationParams: MigrationParams): MigrationCreateResponse =
        create(migrationParams, RequestOptions.none())

    /** Get a Migration */
    fun retrieve(id: String): MigrationRetrieveResponse =
        retrieve(id, MigrationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
    ): MigrationRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MigrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MigrationRetrieveParams): MigrationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): MigrationRetrieveResponse =
        retrieve(id, MigrationRetrieveParams.none(), requestOptions)

    /** List all Migrations */
    fun list(): MigrationListResponse = list(MigrationListParams.none())

    /** @see list */
    fun list(
        params: MigrationListParams = MigrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationListResponse

    /** @see list */
    fun list(params: MigrationListParams = MigrationListParams.none()): MigrationListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MigrationListResponse =
        list(MigrationListParams.none(), requestOptions)

    /** A view of [MigrationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MigrationService.WithRawResponse

        /** Migrate data from an external provider into Telnyx Cloud Storage */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/migrations`, but is otherwise the same as
         * [MigrationService.create].
         */
        @MustBeClosed
        fun create(params: MigrationCreateParams): HttpResponseFor<MigrationCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MigrationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            migrationParams: MigrationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationCreateResponse> =
            create(
                MigrationCreateParams.builder().migrationParams(migrationParams).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(migrationParams: MigrationParams): HttpResponseFor<MigrationCreateResponse> =
            create(migrationParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /storage/migrations/{id}`, but is otherwise the same
         * as [MigrationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MigrationRetrieveResponse> =
            retrieve(id, MigrationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
        ): HttpResponseFor<MigrationRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MigrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MigrationRetrieveParams): HttpResponseFor<MigrationRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationRetrieveResponse> =
            retrieve(id, MigrationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/migrations`, but is otherwise the same as
         * [MigrationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MigrationListResponse> = list(MigrationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MigrationListParams = MigrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MigrationListParams = MigrationListParams.none()
        ): HttpResponseFor<MigrationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MigrationListResponse> =
            list(MigrationListParams.none(), requestOptions)
    }
}
