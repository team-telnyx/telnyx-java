// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.tunnels

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.tunnels.actions.ActionRotateTokenParams
import com.telnyx.sdk.models.tunnels.actions.ActionRotateTokenResponse
import java.util.function.Consumer

/** Tunnels connect a Network to hosts behind a tunnel process within the user's network. */
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
     * Issues a new `tunnel_token` and invalidates the previous one. Tunnel processes already
     * connected stay connected until they reconnect, and are then refused until they use the new
     * token.
     */
    fun rotateToken(id: String): ActionRotateTokenResponse =
        rotateToken(id, ActionRotateTokenParams.none())

    /** @see rotateToken */
    fun rotateToken(
        id: String,
        params: ActionRotateTokenParams = ActionRotateTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRotateTokenResponse = rotateToken(params.toBuilder().id(id).build(), requestOptions)

    /** @see rotateToken */
    fun rotateToken(
        id: String,
        params: ActionRotateTokenParams = ActionRotateTokenParams.none(),
    ): ActionRotateTokenResponse = rotateToken(id, params, RequestOptions.none())

    /** @see rotateToken */
    fun rotateToken(
        params: ActionRotateTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRotateTokenResponse

    /** @see rotateToken */
    fun rotateToken(params: ActionRotateTokenParams): ActionRotateTokenResponse =
        rotateToken(params, RequestOptions.none())

    /** @see rotateToken */
    fun rotateToken(id: String, requestOptions: RequestOptions): ActionRotateTokenResponse =
        rotateToken(id, ActionRotateTokenParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /tunnels/{id}/actions/rotate_token`, but is
         * otherwise the same as [ActionService.rotateToken].
         */
        @MustBeClosed
        fun rotateToken(id: String): HttpResponseFor<ActionRotateTokenResponse> =
            rotateToken(id, ActionRotateTokenParams.none())

        /** @see rotateToken */
        @MustBeClosed
        fun rotateToken(
            id: String,
            params: ActionRotateTokenParams = ActionRotateTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRotateTokenResponse> =
            rotateToken(params.toBuilder().id(id).build(), requestOptions)

        /** @see rotateToken */
        @MustBeClosed
        fun rotateToken(
            id: String,
            params: ActionRotateTokenParams = ActionRotateTokenParams.none(),
        ): HttpResponseFor<ActionRotateTokenResponse> =
            rotateToken(id, params, RequestOptions.none())

        /** @see rotateToken */
        @MustBeClosed
        fun rotateToken(
            params: ActionRotateTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRotateTokenResponse>

        /** @see rotateToken */
        @MustBeClosed
        fun rotateToken(
            params: ActionRotateTokenParams
        ): HttpResponseFor<ActionRotateTokenResponse> = rotateToken(params, RequestOptions.none())

        /** @see rotateToken */
        @MustBeClosed
        fun rotateToken(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRotateTokenResponse> =
            rotateToken(id, ActionRotateTokenParams.none(), requestOptions)
    }
}
