// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.organizations.users

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.organizations.users.actions.ActionRemoveParams
import com.telnyx.sdk.models.organizations.users.actions.ActionRemoveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations related to users in your organization */
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

    /** Deletes a user in your organization. */
    fun remove(id: String): CompletableFuture<ActionRemoveResponse> =
        remove(id, ActionRemoveParams.none())

    /** @see remove */
    fun remove(
        id: String,
        params: ActionRemoveParams = ActionRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRemoveResponse> =
        remove(params.toBuilder().id(id).build(), requestOptions)

    /** @see remove */
    fun remove(
        id: String,
        params: ActionRemoveParams = ActionRemoveParams.none(),
    ): CompletableFuture<ActionRemoveResponse> = remove(id, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: ActionRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRemoveResponse>

    /** @see remove */
    fun remove(params: ActionRemoveParams): CompletableFuture<ActionRemoveResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRemoveResponse> =
        remove(id, ActionRemoveParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /organizations/users/{id}/actions/remove`, but is
         * otherwise the same as [ActionServiceAsync.remove].
         */
        fun remove(id: String): CompletableFuture<HttpResponseFor<ActionRemoveResponse>> =
            remove(id, ActionRemoveParams.none())

        /** @see remove */
        fun remove(
            id: String,
            params: ActionRemoveParams = ActionRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemoveResponse>> =
            remove(params.toBuilder().id(id).build(), requestOptions)

        /** @see remove */
        fun remove(
            id: String,
            params: ActionRemoveParams = ActionRemoveParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemoveResponse>> =
            remove(id, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: ActionRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemoveResponse>>

        /** @see remove */
        fun remove(
            params: ActionRemoveParams
        ): CompletableFuture<HttpResponseFor<ActionRemoveResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRemoveResponse>> =
            remove(id, ActionRemoveParams.none(), requestOptions)
    }
}
