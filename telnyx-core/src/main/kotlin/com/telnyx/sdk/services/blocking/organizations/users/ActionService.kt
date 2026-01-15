// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.organizations.users

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.organizations.users.actions.ActionRemoveParams
import com.telnyx.sdk.models.organizations.users.actions.ActionRemoveResponse
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

    /** Deletes a user in your organization. */
    fun remove(id: String): ActionRemoveResponse = remove(id, ActionRemoveParams.none())

    /** @see remove */
    fun remove(
        id: String,
        params: ActionRemoveParams = ActionRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRemoveResponse = remove(params.toBuilder().id(id).build(), requestOptions)

    /** @see remove */
    fun remove(
        id: String,
        params: ActionRemoveParams = ActionRemoveParams.none(),
    ): ActionRemoveResponse = remove(id, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: ActionRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRemoveResponse

    /** @see remove */
    fun remove(params: ActionRemoveParams): ActionRemoveResponse =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(id: String, requestOptions: RequestOptions): ActionRemoveResponse =
        remove(id, ActionRemoveParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/users/{id}/actions/remove`, but is
         * otherwise the same as [ActionService.remove].
         */
        @MustBeClosed
        fun remove(id: String): HttpResponseFor<ActionRemoveResponse> =
            remove(id, ActionRemoveParams.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            id: String,
            params: ActionRemoveParams = ActionRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRemoveResponse> =
            remove(params.toBuilder().id(id).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(
            id: String,
            params: ActionRemoveParams = ActionRemoveParams.none(),
        ): HttpResponseFor<ActionRemoveResponse> = remove(id, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: ActionRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRemoveResponse>

        /** @see remove */
        @MustBeClosed
        fun remove(params: ActionRemoveParams): HttpResponseFor<ActionRemoveResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRemoveResponse> =
            remove(id, ActionRemoveParams.none(), requestOptions)
    }
}
