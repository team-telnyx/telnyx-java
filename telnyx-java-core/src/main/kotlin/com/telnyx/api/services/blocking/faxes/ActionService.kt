// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.faxes

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.faxes.actions.ActionCancelParams
import com.telnyx.api.models.faxes.actions.ActionCancelResponse
import com.telnyx.api.models.faxes.actions.ActionRefreshParams
import com.telnyx.api.models.faxes.actions.ActionRefreshResponse
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

    /**
     * Cancel the outbound fax that is in one of the following states: `queued`, `media.processed`,
     * `originated` or `sending`
     */
    fun cancel(id: String): ActionCancelResponse = cancel(id, ActionCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: ActionCancelParams = ActionCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionCancelResponse = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: ActionCancelParams = ActionCancelParams.none(),
    ): ActionCancelResponse = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: ActionCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionCancelResponse

    /** @see cancel */
    fun cancel(params: ActionCancelParams): ActionCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): ActionCancelResponse =
        cancel(id, ActionCancelParams.none(), requestOptions)

    /** Refreshes the inbound fax's media_url when it has expired */
    fun refresh(id: String): ActionRefreshResponse = refresh(id, ActionRefreshParams.none())

    /** @see refresh */
    fun refresh(
        id: String,
        params: ActionRefreshParams = ActionRefreshParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRefreshResponse = refresh(params.toBuilder().id(id).build(), requestOptions)

    /** @see refresh */
    fun refresh(
        id: String,
        params: ActionRefreshParams = ActionRefreshParams.none(),
    ): ActionRefreshResponse = refresh(id, params, RequestOptions.none())

    /** @see refresh */
    fun refresh(
        params: ActionRefreshParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRefreshResponse

    /** @see refresh */
    fun refresh(params: ActionRefreshParams): ActionRefreshResponse =
        refresh(params, RequestOptions.none())

    /** @see refresh */
    fun refresh(id: String, requestOptions: RequestOptions): ActionRefreshResponse =
        refresh(id, ActionRefreshParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /faxes/{id}/actions/cancel`, but is otherwise the
         * same as [ActionService.cancel].
         */
        @MustBeClosed
        fun cancel(id: String): HttpResponseFor<ActionCancelResponse> =
            cancel(id, ActionCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: ActionCancelParams = ActionCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionCancelResponse> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: ActionCancelParams = ActionCancelParams.none(),
        ): HttpResponseFor<ActionCancelResponse> = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: ActionCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: ActionCancelParams): HttpResponseFor<ActionCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionCancelResponse> =
            cancel(id, ActionCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /faxes/{id}/actions/refresh`, but is otherwise the
         * same as [ActionService.refresh].
         */
        @MustBeClosed
        fun refresh(id: String): HttpResponseFor<ActionRefreshResponse> =
            refresh(id, ActionRefreshParams.none())

        /** @see refresh */
        @MustBeClosed
        fun refresh(
            id: String,
            params: ActionRefreshParams = ActionRefreshParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRefreshResponse> =
            refresh(params.toBuilder().id(id).build(), requestOptions)

        /** @see refresh */
        @MustBeClosed
        fun refresh(
            id: String,
            params: ActionRefreshParams = ActionRefreshParams.none(),
        ): HttpResponseFor<ActionRefreshResponse> = refresh(id, params, RequestOptions.none())

        /** @see refresh */
        @MustBeClosed
        fun refresh(
            params: ActionRefreshParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRefreshResponse>

        /** @see refresh */
        @MustBeClosed
        fun refresh(params: ActionRefreshParams): HttpResponseFor<ActionRefreshResponse> =
            refresh(params, RequestOptions.none())

        /** @see refresh */
        @MustBeClosed
        fun refresh(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRefreshResponse> =
            refresh(id, ActionRefreshParams.none(), requestOptions)
    }
}
