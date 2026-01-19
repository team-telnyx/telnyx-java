// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.operatorconnect

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.operatorconnect.actions.ActionRefreshParams
import com.telnyx.sdk.models.operatorconnect.actions.ActionRefreshResponse
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
     * This endpoint will make an asynchronous request to refresh the Operator Connect integration
     * with Microsoft Teams for the current user. This will create new external connections on the
     * user's account if needed, and/or report the integration results as
     * [log messages](https://developers.telnyx.com/api-reference/external-connections/list-all-log-messages#list-all-log-messages).
     */
    fun refresh(): CompletableFuture<ActionRefreshResponse> = refresh(ActionRefreshParams.none())

    /** @see refresh */
    fun refresh(
        params: ActionRefreshParams = ActionRefreshParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRefreshResponse>

    /** @see refresh */
    fun refresh(
        params: ActionRefreshParams = ActionRefreshParams.none()
    ): CompletableFuture<ActionRefreshResponse> = refresh(params, RequestOptions.none())

    /** @see refresh */
    fun refresh(requestOptions: RequestOptions): CompletableFuture<ActionRefreshResponse> =
        refresh(ActionRefreshParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /operator_connect/actions/refresh`, but is
         * otherwise the same as [ActionServiceAsync.refresh].
         */
        fun refresh(): CompletableFuture<HttpResponseFor<ActionRefreshResponse>> =
            refresh(ActionRefreshParams.none())

        /** @see refresh */
        fun refresh(
            params: ActionRefreshParams = ActionRefreshParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRefreshResponse>>

        /** @see refresh */
        fun refresh(
            params: ActionRefreshParams = ActionRefreshParams.none()
        ): CompletableFuture<HttpResponseFor<ActionRefreshResponse>> =
            refresh(params, RequestOptions.none())

        /** @see refresh */
        fun refresh(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ActionRefreshResponse>> =
            refresh(ActionRefreshParams.none(), requestOptions)
    }
}
