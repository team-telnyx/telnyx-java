// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.rooms

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.rooms.actions.ActionGenerateJoinClientTokenParams
import com.telnyx.api.models.rooms.actions.ActionGenerateJoinClientTokenResponse
import com.telnyx.api.models.rooms.actions.ActionRefreshClientTokenParams
import com.telnyx.api.models.rooms.actions.ActionRefreshClientTokenResponse
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
     * Synchronously create an Client Token to join a Room. Client Token is necessary to join a
     * Telnyx Room. Client Token will expire after `token_ttl_secs`, a Refresh Token is also
     * provided to refresh a Client Token, the Refresh Token expires after `refresh_token_ttl_secs`.
     */
    fun generateJoinClientToken(
        roomId: String
    ): CompletableFuture<ActionGenerateJoinClientTokenResponse> =
        generateJoinClientToken(roomId, ActionGenerateJoinClientTokenParams.none())

    /** @see generateJoinClientToken */
    fun generateJoinClientToken(
        roomId: String,
        params: ActionGenerateJoinClientTokenParams = ActionGenerateJoinClientTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionGenerateJoinClientTokenResponse> =
        generateJoinClientToken(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see generateJoinClientToken */
    fun generateJoinClientToken(
        roomId: String,
        params: ActionGenerateJoinClientTokenParams = ActionGenerateJoinClientTokenParams.none(),
    ): CompletableFuture<ActionGenerateJoinClientTokenResponse> =
        generateJoinClientToken(roomId, params, RequestOptions.none())

    /** @see generateJoinClientToken */
    fun generateJoinClientToken(
        params: ActionGenerateJoinClientTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionGenerateJoinClientTokenResponse>

    /** @see generateJoinClientToken */
    fun generateJoinClientToken(
        params: ActionGenerateJoinClientTokenParams
    ): CompletableFuture<ActionGenerateJoinClientTokenResponse> =
        generateJoinClientToken(params, RequestOptions.none())

    /** @see generateJoinClientToken */
    fun generateJoinClientToken(
        roomId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionGenerateJoinClientTokenResponse> =
        generateJoinClientToken(roomId, ActionGenerateJoinClientTokenParams.none(), requestOptions)

    /**
     * Synchronously refresh an Client Token to join a Room. Client Token is necessary to join a
     * Telnyx Room. Client Token will expire after `token_ttl_secs`.
     */
    fun refreshClientToken(
        roomId: String,
        params: ActionRefreshClientTokenParams,
    ): CompletableFuture<ActionRefreshClientTokenResponse> =
        refreshClientToken(roomId, params, RequestOptions.none())

    /** @see refreshClientToken */
    fun refreshClientToken(
        roomId: String,
        params: ActionRefreshClientTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRefreshClientTokenResponse> =
        refreshClientToken(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see refreshClientToken */
    fun refreshClientToken(
        params: ActionRefreshClientTokenParams
    ): CompletableFuture<ActionRefreshClientTokenResponse> =
        refreshClientToken(params, RequestOptions.none())

    /** @see refreshClientToken */
    fun refreshClientToken(
        params: ActionRefreshClientTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRefreshClientTokenResponse>

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
         * Returns a raw HTTP response for `post
         * /rooms/{room_id}/actions/generate_join_client_token`, but is otherwise the same as
         * [ActionServiceAsync.generateJoinClientToken].
         */
        fun generateJoinClientToken(
            roomId: String
        ): CompletableFuture<HttpResponseFor<ActionGenerateJoinClientTokenResponse>> =
            generateJoinClientToken(roomId, ActionGenerateJoinClientTokenParams.none())

        /** @see generateJoinClientToken */
        fun generateJoinClientToken(
            roomId: String,
            params: ActionGenerateJoinClientTokenParams =
                ActionGenerateJoinClientTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionGenerateJoinClientTokenResponse>> =
            generateJoinClientToken(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see generateJoinClientToken */
        fun generateJoinClientToken(
            roomId: String,
            params: ActionGenerateJoinClientTokenParams = ActionGenerateJoinClientTokenParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionGenerateJoinClientTokenResponse>> =
            generateJoinClientToken(roomId, params, RequestOptions.none())

        /** @see generateJoinClientToken */
        fun generateJoinClientToken(
            params: ActionGenerateJoinClientTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionGenerateJoinClientTokenResponse>>

        /** @see generateJoinClientToken */
        fun generateJoinClientToken(
            params: ActionGenerateJoinClientTokenParams
        ): CompletableFuture<HttpResponseFor<ActionGenerateJoinClientTokenResponse>> =
            generateJoinClientToken(params, RequestOptions.none())

        /** @see generateJoinClientToken */
        fun generateJoinClientToken(
            roomId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionGenerateJoinClientTokenResponse>> =
            generateJoinClientToken(
                roomId,
                ActionGenerateJoinClientTokenParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /rooms/{room_id}/actions/refresh_client_token`, but
         * is otherwise the same as [ActionServiceAsync.refreshClientToken].
         */
        fun refreshClientToken(
            roomId: String,
            params: ActionRefreshClientTokenParams,
        ): CompletableFuture<HttpResponseFor<ActionRefreshClientTokenResponse>> =
            refreshClientToken(roomId, params, RequestOptions.none())

        /** @see refreshClientToken */
        fun refreshClientToken(
            roomId: String,
            params: ActionRefreshClientTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRefreshClientTokenResponse>> =
            refreshClientToken(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see refreshClientToken */
        fun refreshClientToken(
            params: ActionRefreshClientTokenParams
        ): CompletableFuture<HttpResponseFor<ActionRefreshClientTokenResponse>> =
            refreshClientToken(params, RequestOptions.none())

        /** @see refreshClientToken */
        fun refreshClientToken(
            params: ActionRefreshClientTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRefreshClientTokenResponse>>
    }
}
