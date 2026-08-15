// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage.sqldbs

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.sqldbs.actions.ActionQueryParams
import com.telnyx.sdk.models.storage.sqldbs.actions.ActionQueryResponse
import java.util.function.Consumer

/** Manage SQL databases and run SQL against them */
interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    /**
     * Runs SQL against the database and returns the resulting rows — empty for statements that
     * return none, such as DDL. Bind positional `?` placeholders with `params` rather than
     * interpolating values into the SQL string.
     */
    fun query(id: String, params: ActionQueryParams): ActionQueryResponse =
        query(id, params, RequestOptions.none())

    /** @see query */
    fun query(
        id: String,
        params: ActionQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionQueryResponse = query(params.toBuilder().id(id).build(), requestOptions)

    /** @see query */
    fun query(params: ActionQueryParams): ActionQueryResponse = query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: ActionQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionQueryResponse

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/sqldbs/{id}/actions/query`, but is
         * otherwise the same as [ActionService.query].
         */
        @MustBeClosed
        fun query(id: String, params: ActionQueryParams): HttpResponseFor<ActionQueryResponse> =
            query(id, params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            id: String,
            params: ActionQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionQueryResponse> =
            query(params.toBuilder().id(id).build(), requestOptions)

        /** @see query */
        @MustBeClosed
        fun query(params: ActionQueryParams): HttpResponseFor<ActionQueryResponse> =
            query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: ActionQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionQueryResponse>
    }
}
