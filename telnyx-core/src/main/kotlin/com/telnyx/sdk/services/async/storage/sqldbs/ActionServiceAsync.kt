// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.sqldbs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.sqldbs.actions.ActionQueryParams
import com.telnyx.sdk.models.storage.sqldbs.actions.ActionQueryResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage SQL databases and run SQL against them */
interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    /**
     * Runs SQL against the database and returns the resulting rows — empty for statements that
     * return none, such as DDL. Bind positional `?` placeholders with `params` rather than
     * interpolating values into the SQL string.
     */
    fun query(id: String, params: ActionQueryParams): CompletableFuture<ActionQueryResponse> =
        query(id, params, RequestOptions.none())

    /** @see query */
    fun query(
        id: String,
        params: ActionQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionQueryResponse> =
        query(params.toBuilder().id(id).build(), requestOptions)

    /** @see query */
    fun query(params: ActionQueryParams): CompletableFuture<ActionQueryResponse> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: ActionQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionQueryResponse>

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/sqldbs/{id}/actions/query`, but is
         * otherwise the same as [ActionServiceAsync.query].
         */
        fun query(
            id: String,
            params: ActionQueryParams,
        ): CompletableFuture<HttpResponseFor<ActionQueryResponse>> =
            query(id, params, RequestOptions.none())

        /** @see query */
        fun query(
            id: String,
            params: ActionQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionQueryResponse>> =
            query(params.toBuilder().id(id).build(), requestOptions)

        /** @see query */
        fun query(
            params: ActionQueryParams
        ): CompletableFuture<HttpResponseFor<ActionQueryResponse>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            params: ActionQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionQueryResponse>>
    }
}
