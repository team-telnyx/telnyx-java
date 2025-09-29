// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.storage.migrations

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.storage.migrations.actions.ActionStopParams
import com.telnyx.api.models.storage.migrations.actions.ActionStopResponse
import java.util.function.Consumer

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

    /** Stop a Migration */
    fun stop(id: String): ActionStopResponse = stop(id, ActionStopParams.none())

    /** @see stop */
    fun stop(
        id: String,
        params: ActionStopParams = ActionStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopResponse = stop(params.toBuilder().id(id).build(), requestOptions)

    /** @see stop */
    fun stop(id: String, params: ActionStopParams = ActionStopParams.none()): ActionStopResponse =
        stop(id, params, RequestOptions.none())

    /** @see stop */
    fun stop(
        params: ActionStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopResponse

    /** @see stop */
    fun stop(params: ActionStopParams): ActionStopResponse = stop(params, RequestOptions.none())

    /** @see stop */
    fun stop(id: String, requestOptions: RequestOptions): ActionStopResponse =
        stop(id, ActionStopParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/migrations/{id}/actions/stop`, but is
         * otherwise the same as [ActionService.stop].
         */
        @MustBeClosed
        fun stop(id: String): HttpResponseFor<ActionStopResponse> =
            stop(id, ActionStopParams.none())

        /** @see stop */
        @MustBeClosed
        fun stop(
            id: String,
            params: ActionStopParams = ActionStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopResponse> =
            stop(params.toBuilder().id(id).build(), requestOptions)

        /** @see stop */
        @MustBeClosed
        fun stop(
            id: String,
            params: ActionStopParams = ActionStopParams.none(),
        ): HttpResponseFor<ActionStopResponse> = stop(id, params, RequestOptions.none())

        /** @see stop */
        @MustBeClosed
        fun stop(
            params: ActionStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopResponse>

        /** @see stop */
        @MustBeClosed
        fun stop(params: ActionStopParams): HttpResponseFor<ActionStopResponse> =
            stop(params, RequestOptions.none())

        /** @see stop */
        @MustBeClosed
        fun stop(id: String, requestOptions: RequestOptions): HttpResponseFor<ActionStopResponse> =
            stop(id, ActionStopParams.none(), requestOptions)
    }
}
