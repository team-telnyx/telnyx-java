// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.sqldbs.SqlDatabaseResponseWrapper
import com.telnyx.sdk.models.storage.sqldbs.SqldbCreateParams
import com.telnyx.sdk.models.storage.sqldbs.SqldbDeleteParams
import com.telnyx.sdk.models.storage.sqldbs.SqldbListPage
import com.telnyx.sdk.models.storage.sqldbs.SqldbListParams
import com.telnyx.sdk.models.storage.sqldbs.SqldbRetrieveParams
import com.telnyx.sdk.services.blocking.storage.sqldbs.ActionService
import java.util.function.Consumer

/** Manage SQL databases and run SQL against them */
interface SqldbService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SqldbService

    /** Manage SQL databases and run SQL against them */
    fun actions(): ActionService

    /**
     * Creates a new SQL database. Provisioning is asynchronous: the database is returned with
     * status `pending` and becomes usable once it reaches `provision_ok`.
     */
    fun create(params: SqldbCreateParams): SqlDatabaseResponseWrapper =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SqldbCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SqlDatabaseResponseWrapper

    /** Retrieves a SQL database by its ID, including its provisioning status. */
    fun retrieve(id: String): SqlDatabaseResponseWrapper = retrieve(id, SqldbRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SqldbRetrieveParams = SqldbRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SqlDatabaseResponseWrapper = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SqldbRetrieveParams = SqldbRetrieveParams.none(),
    ): SqlDatabaseResponseWrapper = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SqldbRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SqlDatabaseResponseWrapper

    /** @see retrieve */
    fun retrieve(params: SqldbRetrieveParams): SqlDatabaseResponseWrapper =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): SqlDatabaseResponseWrapper =
        retrieve(id, SqldbRetrieveParams.none(), requestOptions)

    /**
     * Lists the SQL databases for the authenticated user's organization. Results use page-based
     * pagination (`page[number]`/`page[size]`) and can be filtered and sorted.
     */
    fun list(): SqldbListPage = list(SqldbListParams.none())

    /** @see list */
    fun list(
        params: SqldbListParams = SqldbListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SqldbListPage

    /** @see list */
    fun list(params: SqldbListParams = SqldbListParams.none()): SqldbListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SqldbListPage =
        list(SqldbListParams.none(), requestOptions)

    /**
     * Deletes a SQL database and all of the data it holds. Deletion is asynchronous and returns
     * `202` with an empty body — the record is not removed synchronously. Poll `GET
     * /storage/sqldbs/{id}`, which returns `404` once the database has been purged; there is no
     * durable `deleted` state. A database still bound by a function is refused with `409` unless
     * `force=true`.
     */
    fun delete(id: String) = delete(id, SqldbDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SqldbDeleteParams = SqldbDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: SqldbDeleteParams = SqldbDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SqldbDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SqldbDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SqldbDeleteParams.none(), requestOptions)

    /** A view of [SqldbService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SqldbService.WithRawResponse

        /** Manage SQL databases and run SQL against them */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/sqldbs`, but is otherwise the same as
         * [SqldbService.create].
         */
        @MustBeClosed
        fun create(params: SqldbCreateParams): HttpResponseFor<SqlDatabaseResponseWrapper> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SqldbCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SqlDatabaseResponseWrapper>

        /**
         * Returns a raw HTTP response for `get /storage/sqldbs/{id}`, but is otherwise the same as
         * [SqldbService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<SqlDatabaseResponseWrapper> =
            retrieve(id, SqldbRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SqldbRetrieveParams = SqldbRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SqlDatabaseResponseWrapper> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SqldbRetrieveParams = SqldbRetrieveParams.none(),
        ): HttpResponseFor<SqlDatabaseResponseWrapper> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SqldbRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SqlDatabaseResponseWrapper>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SqldbRetrieveParams): HttpResponseFor<SqlDatabaseResponseWrapper> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SqlDatabaseResponseWrapper> =
            retrieve(id, SqldbRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/sqldbs`, but is otherwise the same as
         * [SqldbService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SqldbListPage> = list(SqldbListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SqldbListParams = SqldbListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SqldbListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SqldbListParams = SqldbListParams.none()): HttpResponseFor<SqldbListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SqldbListPage> =
            list(SqldbListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/sqldbs/{id}`, but is otherwise the same
         * as [SqldbService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, SqldbDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SqldbDeleteParams = SqldbDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: SqldbDeleteParams = SqldbDeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SqldbDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SqldbDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SqldbDeleteParams.none(), requestOptions)
    }
}
