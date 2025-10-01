// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface MigrationSourceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MigrationSourceService

    /** Create a source from which data can be migrated from. */
    fun create(params: MigrationSourceCreateParams): MigrationSourceCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MigrationSourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSourceCreateResponse

    /** @see create */
    fun create(
        migrationSourceParams: MigrationSourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSourceCreateResponse =
        create(
            MigrationSourceCreateParams.builder()
                .migrationSourceParams(migrationSourceParams)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(migrationSourceParams: MigrationSourceParams): MigrationSourceCreateResponse =
        create(migrationSourceParams, RequestOptions.none())

    /** Get a Migration Source */
    fun retrieve(id: String): MigrationSourceRetrieveResponse =
        retrieve(id, MigrationSourceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MigrationSourceRetrieveParams = MigrationSourceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSourceRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MigrationSourceRetrieveParams = MigrationSourceRetrieveParams.none(),
    ): MigrationSourceRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MigrationSourceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSourceRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MigrationSourceRetrieveParams): MigrationSourceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): MigrationSourceRetrieveResponse =
        retrieve(id, MigrationSourceRetrieveParams.none(), requestOptions)

    /** List all Migration Sources */
    fun list(): MigrationSourceListResponse = list(MigrationSourceListParams.none())

    /** @see list */
    fun list(
        params: MigrationSourceListParams = MigrationSourceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSourceListResponse

    /** @see list */
    fun list(
        params: MigrationSourceListParams = MigrationSourceListParams.none()
    ): MigrationSourceListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MigrationSourceListResponse =
        list(MigrationSourceListParams.none(), requestOptions)

    /** Delete a Migration Source */
    fun delete(id: String): MigrationSourceDeleteResponse =
        delete(id, MigrationSourceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MigrationSourceDeleteParams = MigrationSourceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSourceDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MigrationSourceDeleteParams = MigrationSourceDeleteParams.none(),
    ): MigrationSourceDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MigrationSourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSourceDeleteResponse

    /** @see delete */
    fun delete(params: MigrationSourceDeleteParams): MigrationSourceDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): MigrationSourceDeleteResponse =
        delete(id, MigrationSourceDeleteParams.none(), requestOptions)

    /**
     * A view of [MigrationSourceService] that provides access to raw HTTP responses for each
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
        ): MigrationSourceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/migration_sources`, but is otherwise the
         * same as [MigrationSourceService.create].
         */
        @MustBeClosed
        fun create(
            params: MigrationSourceCreateParams
        ): HttpResponseFor<MigrationSourceCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MigrationSourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSourceCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            migrationSourceParams: MigrationSourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSourceCreateResponse> =
            create(
                MigrationSourceCreateParams.builder()
                    .migrationSourceParams(migrationSourceParams)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            migrationSourceParams: MigrationSourceParams
        ): HttpResponseFor<MigrationSourceCreateResponse> =
            create(migrationSourceParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /storage/migration_sources/{id}`, but is otherwise
         * the same as [MigrationSourceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MigrationSourceRetrieveResponse> =
            retrieve(id, MigrationSourceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MigrationSourceRetrieveParams = MigrationSourceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSourceRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MigrationSourceRetrieveParams = MigrationSourceRetrieveParams.none(),
        ): HttpResponseFor<MigrationSourceRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MigrationSourceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSourceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MigrationSourceRetrieveParams
        ): HttpResponseFor<MigrationSourceRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationSourceRetrieveResponse> =
            retrieve(id, MigrationSourceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/migration_sources`, but is otherwise the
         * same as [MigrationSourceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MigrationSourceListResponse> =
            list(MigrationSourceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MigrationSourceListParams = MigrationSourceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSourceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MigrationSourceListParams = MigrationSourceListParams.none()
        ): HttpResponseFor<MigrationSourceListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MigrationSourceListResponse> =
            list(MigrationSourceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/migration_sources/{id}`, but is
         * otherwise the same as [MigrationSourceService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<MigrationSourceDeleteResponse> =
            delete(id, MigrationSourceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MigrationSourceDeleteParams = MigrationSourceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSourceDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MigrationSourceDeleteParams = MigrationSourceDeleteParams.none(),
        ): HttpResponseFor<MigrationSourceDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MigrationSourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSourceDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MigrationSourceDeleteParams
        ): HttpResponseFor<MigrationSourceDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationSourceDeleteResponse> =
            delete(id, MigrationSourceDeleteParams.none(), requestOptions)
    }
}
