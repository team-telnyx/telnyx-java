// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.faxes

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.faxes.actions.ActionCancelParams
import com.telnyx.api.models.faxes.actions.ActionCancelResponse
import com.telnyx.api.models.faxes.actions.ActionRefreshParams
import com.telnyx.api.models.faxes.actions.ActionRefreshResponse
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

    /**
     * Cancel the outbound fax that is in one of the following states: `queued`, `media.processed`,
     * `originated` or `sending`
     */
    fun cancel(id: String): CompletableFuture<ActionCancelResponse> =
        cancel(id, ActionCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: ActionCancelParams = ActionCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionCancelResponse> =
        cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: ActionCancelParams = ActionCancelParams.none(),
    ): CompletableFuture<ActionCancelResponse> = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: ActionCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionCancelResponse>

    /** @see cancel */
    fun cancel(params: ActionCancelParams): CompletableFuture<ActionCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionCancelResponse> =
        cancel(id, ActionCancelParams.none(), requestOptions)

    /** Refreshes the inbound fax's media_url when it has expired */
    fun refresh(id: String): CompletableFuture<ActionRefreshResponse> =
        refresh(id, ActionRefreshParams.none())

    /** @see refresh */
    fun refresh(
        id: String,
        params: ActionRefreshParams = ActionRefreshParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRefreshResponse> =
        refresh(params.toBuilder().id(id).build(), requestOptions)

    /** @see refresh */
    fun refresh(
        id: String,
        params: ActionRefreshParams = ActionRefreshParams.none(),
    ): CompletableFuture<ActionRefreshResponse> = refresh(id, params, RequestOptions.none())

    /** @see refresh */
    fun refresh(
        params: ActionRefreshParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRefreshResponse>

    /** @see refresh */
    fun refresh(params: ActionRefreshParams): CompletableFuture<ActionRefreshResponse> =
        refresh(params, RequestOptions.none())

    /** @see refresh */
    fun refresh(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRefreshResponse> =
        refresh(id, ActionRefreshParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /faxes/{id}/actions/cancel`, but is otherwise the
         * same as [ActionServiceAsync.cancel].
         */
        fun cancel(id: String): CompletableFuture<HttpResponseFor<ActionCancelResponse>> =
            cancel(id, ActionCancelParams.none())

        /** @see cancel */
        fun cancel(
            id: String,
            params: ActionCancelParams = ActionCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionCancelResponse>> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            id: String,
            params: ActionCancelParams = ActionCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionCancelResponse>> =
            cancel(id, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: ActionCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: ActionCancelParams
        ): CompletableFuture<HttpResponseFor<ActionCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionCancelResponse>> =
            cancel(id, ActionCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /faxes/{id}/actions/refresh`, but is otherwise the
         * same as [ActionServiceAsync.refresh].
         */
        fun refresh(id: String): CompletableFuture<HttpResponseFor<ActionRefreshResponse>> =
            refresh(id, ActionRefreshParams.none())

        /** @see refresh */
        fun refresh(
            id: String,
            params: ActionRefreshParams = ActionRefreshParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRefreshResponse>> =
            refresh(params.toBuilder().id(id).build(), requestOptions)

        /** @see refresh */
        fun refresh(
            id: String,
            params: ActionRefreshParams = ActionRefreshParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionRefreshResponse>> =
            refresh(id, params, RequestOptions.none())

        /** @see refresh */
        fun refresh(
            params: ActionRefreshParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRefreshResponse>>

        /** @see refresh */
        fun refresh(
            params: ActionRefreshParams
        ): CompletableFuture<HttpResponseFor<ActionRefreshResponse>> =
            refresh(params, RequestOptions.none())

        /** @see refresh */
        fun refresh(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRefreshResponse>> =
            refresh(id, ActionRefreshParams.none(), requestOptions)
    }
}
