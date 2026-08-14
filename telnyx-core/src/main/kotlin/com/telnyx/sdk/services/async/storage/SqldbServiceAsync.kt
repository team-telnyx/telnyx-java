// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.sqldbs.SqlDatabaseResponseWrapper
import com.telnyx.sdk.models.storage.sqldbs.SqldbCreateParams
import com.telnyx.sdk.models.storage.sqldbs.SqldbDeleteParams
import com.telnyx.sdk.models.storage.sqldbs.SqldbListPageAsync
import com.telnyx.sdk.models.storage.sqldbs.SqldbListParams
import com.telnyx.sdk.models.storage.sqldbs.SqldbRetrieveParams
import com.telnyx.sdk.services.async.storage.sqldbs.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage SQL databases and run SQL against them */
interface SqldbServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SqldbServiceAsync

    /** Manage SQL databases and run SQL against them */
    fun actions(): ActionServiceAsync

    /**
     * Creates a new SQL database. Provisioning is asynchronous: the database is returned with
     * status `pending` and becomes usable once it reaches `provision_ok`.
     */
    fun create(params: SqldbCreateParams): CompletableFuture<SqlDatabaseResponseWrapper> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SqldbCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SqlDatabaseResponseWrapper>

    /** Retrieves a SQL database by its ID, including its provisioning status. */
    fun retrieve(id: String): CompletableFuture<SqlDatabaseResponseWrapper> =
        retrieve(id, SqldbRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SqldbRetrieveParams = SqldbRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SqlDatabaseResponseWrapper> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SqldbRetrieveParams = SqldbRetrieveParams.none(),
    ): CompletableFuture<SqlDatabaseResponseWrapper> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SqldbRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SqlDatabaseResponseWrapper>

    /** @see retrieve */
    fun retrieve(params: SqldbRetrieveParams): CompletableFuture<SqlDatabaseResponseWrapper> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SqlDatabaseResponseWrapper> =
        retrieve(id, SqldbRetrieveParams.none(), requestOptions)

    /**
     * Lists the SQL databases for the authenticated user's organization. Results use page-based
     * pagination (`page[number]`/`page[size]`) and can be filtered and sorted.
     */
    fun list(): CompletableFuture<SqldbListPageAsync> = list(SqldbListParams.none())

    /** @see list */
    fun list(
        params: SqldbListParams = SqldbListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SqldbListPageAsync>

    /** @see list */
    fun list(
        params: SqldbListParams = SqldbListParams.none()
    ): CompletableFuture<SqldbListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SqldbListPageAsync> =
        list(SqldbListParams.none(), requestOptions)

    /**
     * Deletes a SQL database and all of the data it holds. Deletion is asynchronous and returns
     * `202` with an empty body — the record is not removed synchronously. Poll `GET
     * /storage/sqldbs/{id}`, which returns `404` once the database has been purged; there is no
     * durable `deleted` state. A database still bound by a function is refused with `409` unless
     * `force=true`.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, SqldbDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SqldbDeleteParams = SqldbDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SqldbDeleteParams = SqldbDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SqldbDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SqldbDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SqldbDeleteParams.none(), requestOptions)

    /** A view of [SqldbServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SqldbServiceAsync.WithRawResponse

        /** Manage SQL databases and run SQL against them */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/sqldbs`, but is otherwise the same as
         * [SqldbServiceAsync.create].
         */
        fun create(
            params: SqldbCreateParams
        ): CompletableFuture<HttpResponseFor<SqlDatabaseResponseWrapper>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SqldbCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SqlDatabaseResponseWrapper>>

        /**
         * Returns a raw HTTP response for `get /storage/sqldbs/{id}`, but is otherwise the same as
         * [SqldbServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<SqlDatabaseResponseWrapper>> =
            retrieve(id, SqldbRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SqldbRetrieveParams = SqldbRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SqlDatabaseResponseWrapper>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SqldbRetrieveParams = SqldbRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SqlDatabaseResponseWrapper>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SqldbRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SqlDatabaseResponseWrapper>>

        /** @see retrieve */
        fun retrieve(
            params: SqldbRetrieveParams
        ): CompletableFuture<HttpResponseFor<SqlDatabaseResponseWrapper>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SqlDatabaseResponseWrapper>> =
            retrieve(id, SqldbRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/sqldbs`, but is otherwise the same as
         * [SqldbServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SqldbListPageAsync>> =
            list(SqldbListParams.none())

        /** @see list */
        fun list(
            params: SqldbListParams = SqldbListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SqldbListPageAsync>>

        /** @see list */
        fun list(
            params: SqldbListParams = SqldbListParams.none()
        ): CompletableFuture<HttpResponseFor<SqldbListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SqldbListPageAsync>> =
            list(SqldbListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/sqldbs/{id}`, but is otherwise the same
         * as [SqldbServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, SqldbDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SqldbDeleteParams = SqldbDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SqldbDeleteParams = SqldbDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SqldbDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SqldbDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SqldbDeleteParams.none(), requestOptions)
    }
}
