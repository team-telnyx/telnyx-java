// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rooms

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.rooms.actions.ActionGenerateJoinClientTokenParams
import com.telnyx.sdk.models.rooms.actions.ActionGenerateJoinClientTokenResponse
import com.telnyx.sdk.models.rooms.actions.ActionRefreshClientTokenParams
import com.telnyx.sdk.models.rooms.actions.ActionRefreshClientTokenResponse
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
     * Synchronously create an Client Token to join a Room. Client Token is necessary to join a
     * Telnyx Room. Client Token will expire after `token_ttl_secs`, a Refresh Token is also
     * provided to refresh a Client Token, the Refresh Token expires after `refresh_token_ttl_secs`.
     */
    fun generateJoinClientToken(roomId: String): ActionGenerateJoinClientTokenResponse =
        generateJoinClientToken(roomId, ActionGenerateJoinClientTokenParams.none())

    /** @see generateJoinClientToken */
    fun generateJoinClientToken(
        roomId: String,
        params: ActionGenerateJoinClientTokenParams = ActionGenerateJoinClientTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionGenerateJoinClientTokenResponse =
        generateJoinClientToken(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see generateJoinClientToken */
    fun generateJoinClientToken(
        roomId: String,
        params: ActionGenerateJoinClientTokenParams = ActionGenerateJoinClientTokenParams.none(),
    ): ActionGenerateJoinClientTokenResponse =
        generateJoinClientToken(roomId, params, RequestOptions.none())

    /** @see generateJoinClientToken */
    fun generateJoinClientToken(
        params: ActionGenerateJoinClientTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionGenerateJoinClientTokenResponse

    /** @see generateJoinClientToken */
    fun generateJoinClientToken(
        params: ActionGenerateJoinClientTokenParams
    ): ActionGenerateJoinClientTokenResponse =
        generateJoinClientToken(params, RequestOptions.none())

    /** @see generateJoinClientToken */
    fun generateJoinClientToken(
        roomId: String,
        requestOptions: RequestOptions,
    ): ActionGenerateJoinClientTokenResponse =
        generateJoinClientToken(roomId, ActionGenerateJoinClientTokenParams.none(), requestOptions)

    /**
     * Synchronously refresh an Client Token to join a Room. Client Token is necessary to join a
     * Telnyx Room. Client Token will expire after `token_ttl_secs`.
     */
    fun refreshClientToken(
        roomId: String,
        params: ActionRefreshClientTokenParams,
    ): ActionRefreshClientTokenResponse = refreshClientToken(roomId, params, RequestOptions.none())

    /** @see refreshClientToken */
    fun refreshClientToken(
        roomId: String,
        params: ActionRefreshClientTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRefreshClientTokenResponse =
        refreshClientToken(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see refreshClientToken */
    fun refreshClientToken(
        params: ActionRefreshClientTokenParams
    ): ActionRefreshClientTokenResponse = refreshClientToken(params, RequestOptions.none())

    /** @see refreshClientToken */
    fun refreshClientToken(
        params: ActionRefreshClientTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRefreshClientTokenResponse

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /rooms/{room_id}/actions/generate_join_client_token`, but is otherwise the same as
         * [ActionService.generateJoinClientToken].
         */
        @MustBeClosed
        fun generateJoinClientToken(
            roomId: String
        ): HttpResponseFor<ActionGenerateJoinClientTokenResponse> =
            generateJoinClientToken(roomId, ActionGenerateJoinClientTokenParams.none())

        /** @see generateJoinClientToken */
        @MustBeClosed
        fun generateJoinClientToken(
            roomId: String,
            params: ActionGenerateJoinClientTokenParams =
                ActionGenerateJoinClientTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionGenerateJoinClientTokenResponse> =
            generateJoinClientToken(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see generateJoinClientToken */
        @MustBeClosed
        fun generateJoinClientToken(
            roomId: String,
            params: ActionGenerateJoinClientTokenParams = ActionGenerateJoinClientTokenParams.none(),
        ): HttpResponseFor<ActionGenerateJoinClientTokenResponse> =
            generateJoinClientToken(roomId, params, RequestOptions.none())

        /** @see generateJoinClientToken */
        @MustBeClosed
        fun generateJoinClientToken(
            params: ActionGenerateJoinClientTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionGenerateJoinClientTokenResponse>

        /** @see generateJoinClientToken */
        @MustBeClosed
        fun generateJoinClientToken(
            params: ActionGenerateJoinClientTokenParams
        ): HttpResponseFor<ActionGenerateJoinClientTokenResponse> =
            generateJoinClientToken(params, RequestOptions.none())

        /** @see generateJoinClientToken */
        @MustBeClosed
        fun generateJoinClientToken(
            roomId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionGenerateJoinClientTokenResponse> =
            generateJoinClientToken(
                roomId,
                ActionGenerateJoinClientTokenParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /rooms/{room_id}/actions/refresh_client_token`, but
         * is otherwise the same as [ActionService.refreshClientToken].
         */
        @MustBeClosed
        fun refreshClientToken(
            roomId: String,
            params: ActionRefreshClientTokenParams,
        ): HttpResponseFor<ActionRefreshClientTokenResponse> =
            refreshClientToken(roomId, params, RequestOptions.none())

        /** @see refreshClientToken */
        @MustBeClosed
        fun refreshClientToken(
            roomId: String,
            params: ActionRefreshClientTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRefreshClientTokenResponse> =
            refreshClientToken(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see refreshClientToken */
        @MustBeClosed
        fun refreshClientToken(
            params: ActionRefreshClientTokenParams
        ): HttpResponseFor<ActionRefreshClientTokenResponse> =
            refreshClientToken(params, RequestOptions.none())

        /** @see refreshClientToken */
        @MustBeClosed
        fun refreshClientToken(
            params: ActionRefreshClientTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRefreshClientTokenResponse>
    }
}
