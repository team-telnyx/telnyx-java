// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rooms.sessions

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.rooms.sessions.actions.ActionEndParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionEndResponse
import com.telnyx.sdk.models.rooms.sessions.actions.ActionKickParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionKickResponse
import com.telnyx.sdk.models.rooms.sessions.actions.ActionMuteParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionMuteResponse
import com.telnyx.sdk.models.rooms.sessions.actions.ActionUnmuteParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionUnmuteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Rooms Sessions operations. */
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

    /** Note: this will also kick all participants currently present in the room */
    fun end(roomSessionId: String): CompletableFuture<ActionEndResponse> =
        end(roomSessionId, ActionEndParams.none())

    /** @see end */
    fun end(
        roomSessionId: String,
        params: ActionEndParams = ActionEndParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionEndResponse> =
        end(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

    /** @see end */
    fun end(
        roomSessionId: String,
        params: ActionEndParams = ActionEndParams.none(),
    ): CompletableFuture<ActionEndResponse> = end(roomSessionId, params, RequestOptions.none())

    /** @see end */
    fun end(
        params: ActionEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionEndResponse>

    /** @see end */
    fun end(params: ActionEndParams): CompletableFuture<ActionEndResponse> =
        end(params, RequestOptions.none())

    /** @see end */
    fun end(
        roomSessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionEndResponse> =
        end(roomSessionId, ActionEndParams.none(), requestOptions)

    /** Kick participants from a room session. */
    fun kick(
        roomSessionId: String,
        params: ActionKickParams,
    ): CompletableFuture<ActionKickResponse> = kick(roomSessionId, params, RequestOptions.none())

    /** @see kick */
    fun kick(
        roomSessionId: String,
        params: ActionKickParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionKickResponse> =
        kick(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

    /** @see kick */
    fun kick(params: ActionKickParams): CompletableFuture<ActionKickResponse> =
        kick(params, RequestOptions.none())

    /** @see kick */
    fun kick(
        params: ActionKickParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionKickResponse>

    /** Mute participants in room session. */
    fun mute(
        roomSessionId: String,
        params: ActionMuteParams,
    ): CompletableFuture<ActionMuteResponse> = mute(roomSessionId, params, RequestOptions.none())

    /** @see mute */
    fun mute(
        roomSessionId: String,
        params: ActionMuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionMuteResponse> =
        mute(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

    /** @see mute */
    fun mute(params: ActionMuteParams): CompletableFuture<ActionMuteResponse> =
        mute(params, RequestOptions.none())

    /** @see mute */
    fun mute(
        params: ActionMuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionMuteResponse>

    /** Unmute participants in room session. */
    fun unmute(
        roomSessionId: String,
        params: ActionUnmuteParams,
    ): CompletableFuture<ActionUnmuteResponse> =
        unmute(roomSessionId, params, RequestOptions.none())

    /** @see unmute */
    fun unmute(
        roomSessionId: String,
        params: ActionUnmuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUnmuteResponse> =
        unmute(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

    /** @see unmute */
    fun unmute(params: ActionUnmuteParams): CompletableFuture<ActionUnmuteResponse> =
        unmute(params, RequestOptions.none())

    /** @see unmute */
    fun unmute(
        params: ActionUnmuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUnmuteResponse>

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
         * Returns a raw HTTP response for `post /room_sessions/{room_session_id}/actions/end`, but
         * is otherwise the same as [ActionServiceAsync.end].
         */
        fun end(roomSessionId: String): CompletableFuture<HttpResponseFor<ActionEndResponse>> =
            end(roomSessionId, ActionEndParams.none())

        /** @see end */
        fun end(
            roomSessionId: String,
            params: ActionEndParams = ActionEndParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionEndResponse>> =
            end(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

        /** @see end */
        fun end(
            roomSessionId: String,
            params: ActionEndParams = ActionEndParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionEndResponse>> =
            end(roomSessionId, params, RequestOptions.none())

        /** @see end */
        fun end(
            params: ActionEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionEndResponse>>

        /** @see end */
        fun end(params: ActionEndParams): CompletableFuture<HttpResponseFor<ActionEndResponse>> =
            end(params, RequestOptions.none())

        /** @see end */
        fun end(
            roomSessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionEndResponse>> =
            end(roomSessionId, ActionEndParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /room_sessions/{room_session_id}/actions/kick`, but
         * is otherwise the same as [ActionServiceAsync.kick].
         */
        fun kick(
            roomSessionId: String,
            params: ActionKickParams,
        ): CompletableFuture<HttpResponseFor<ActionKickResponse>> =
            kick(roomSessionId, params, RequestOptions.none())

        /** @see kick */
        fun kick(
            roomSessionId: String,
            params: ActionKickParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionKickResponse>> =
            kick(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

        /** @see kick */
        fun kick(params: ActionKickParams): CompletableFuture<HttpResponseFor<ActionKickResponse>> =
            kick(params, RequestOptions.none())

        /** @see kick */
        fun kick(
            params: ActionKickParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionKickResponse>>

        /**
         * Returns a raw HTTP response for `post /room_sessions/{room_session_id}/actions/mute`, but
         * is otherwise the same as [ActionServiceAsync.mute].
         */
        fun mute(
            roomSessionId: String,
            params: ActionMuteParams,
        ): CompletableFuture<HttpResponseFor<ActionMuteResponse>> =
            mute(roomSessionId, params, RequestOptions.none())

        /** @see mute */
        fun mute(
            roomSessionId: String,
            params: ActionMuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionMuteResponse>> =
            mute(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

        /** @see mute */
        fun mute(params: ActionMuteParams): CompletableFuture<HttpResponseFor<ActionMuteResponse>> =
            mute(params, RequestOptions.none())

        /** @see mute */
        fun mute(
            params: ActionMuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionMuteResponse>>

        /**
         * Returns a raw HTTP response for `post /room_sessions/{room_session_id}/actions/unmute`,
         * but is otherwise the same as [ActionServiceAsync.unmute].
         */
        fun unmute(
            roomSessionId: String,
            params: ActionUnmuteParams,
        ): CompletableFuture<HttpResponseFor<ActionUnmuteResponse>> =
            unmute(roomSessionId, params, RequestOptions.none())

        /** @see unmute */
        fun unmute(
            roomSessionId: String,
            params: ActionUnmuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUnmuteResponse>> =
            unmute(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

        /** @see unmute */
        fun unmute(
            params: ActionUnmuteParams
        ): CompletableFuture<HttpResponseFor<ActionUnmuteResponse>> =
            unmute(params, RequestOptions.none())

        /** @see unmute */
        fun unmute(
            params: ActionUnmuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUnmuteResponse>>
    }
}
