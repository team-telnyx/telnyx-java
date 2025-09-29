// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.storage.migrations

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.storage.migrations.actions.ActionStopParams
import com.telnyx.api.models.storage.migrations.actions.ActionStopResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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

    /** Stop a Migration */
    fun stop(id: String): CompletableFuture<ActionStopResponse> = stop(id, ActionStopParams.none())

    /** @see stop */
    fun stop(
        id: String,
        params: ActionStopParams = ActionStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopResponse> =
        stop(params.toBuilder().id(id).build(), requestOptions)

    /** @see stop */
    fun stop(
        id: String,
        params: ActionStopParams = ActionStopParams.none(),
    ): CompletableFuture<ActionStopResponse> = stop(id, params, RequestOptions.none())

    /** @see stop */
    fun stop(
        params: ActionStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopResponse>

    /** @see stop */
    fun stop(params: ActionStopParams): CompletableFuture<ActionStopResponse> =
        stop(params, RequestOptions.none())

    /** @see stop */
    fun stop(id: String, requestOptions: RequestOptions): CompletableFuture<ActionStopResponse> =
        stop(id, ActionStopParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /storage/migrations/{id}/actions/stop`, but is
         * otherwise the same as [ActionServiceAsync.stop].
         */
        fun stop(id: String): CompletableFuture<HttpResponseFor<ActionStopResponse>> =
            stop(id, ActionStopParams.none())

        /** @see stop */
        fun stop(
            id: String,
            params: ActionStopParams = ActionStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopResponse>> =
            stop(params.toBuilder().id(id).build(), requestOptions)

        /** @see stop */
        fun stop(
            id: String,
            params: ActionStopParams = ActionStopParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopResponse>> =
            stop(id, params, RequestOptions.none())

        /** @see stop */
        fun stop(
            params: ActionStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopResponse>>

        /** @see stop */
        fun stop(params: ActionStopParams): CompletableFuture<HttpResponseFor<ActionStopResponse>> =
            stop(params, RequestOptions.none())

        /** @see stop */
        fun stop(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopResponse>> =
            stop(id, ActionStopParams.none(), requestOptions)
    }
}
