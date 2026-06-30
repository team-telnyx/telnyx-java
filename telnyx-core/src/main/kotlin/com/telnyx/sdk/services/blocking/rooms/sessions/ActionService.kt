// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rooms.sessions

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Rooms Sessions operations. */
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

    /** Note: this will also kick all participants currently present in the room */
    fun end(roomSessionId: String): ActionEndResponse = end(roomSessionId, ActionEndParams.none())

    /** @see end */
    fun end(
        roomSessionId: String,
        params: ActionEndParams = ActionEndParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionEndResponse =
        end(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

    /** @see end */
    fun end(
        roomSessionId: String,
        params: ActionEndParams = ActionEndParams.none(),
    ): ActionEndResponse = end(roomSessionId, params, RequestOptions.none())

    /** @see end */
    fun end(
        params: ActionEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionEndResponse

    /** @see end */
    fun end(params: ActionEndParams): ActionEndResponse = end(params, RequestOptions.none())

    /** @see end */
    fun end(roomSessionId: String, requestOptions: RequestOptions): ActionEndResponse =
        end(roomSessionId, ActionEndParams.none(), requestOptions)

    /** Kick participants from a room session. */
    fun kick(roomSessionId: String, params: ActionKickParams): ActionKickResponse =
        kick(roomSessionId, params, RequestOptions.none())

    /** @see kick */
    fun kick(
        roomSessionId: String,
        params: ActionKickParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionKickResponse =
        kick(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

    /** @see kick */
    fun kick(params: ActionKickParams): ActionKickResponse = kick(params, RequestOptions.none())

    /** @see kick */
    fun kick(
        params: ActionKickParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionKickResponse

    /** Mute participants in room session. */
    fun mute(roomSessionId: String, params: ActionMuteParams): ActionMuteResponse =
        mute(roomSessionId, params, RequestOptions.none())

    /** @see mute */
    fun mute(
        roomSessionId: String,
        params: ActionMuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionMuteResponse =
        mute(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

    /** @see mute */
    fun mute(params: ActionMuteParams): ActionMuteResponse = mute(params, RequestOptions.none())

    /** @see mute */
    fun mute(
        params: ActionMuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionMuteResponse

    /** Unmute participants in room session. */
    fun unmute(roomSessionId: String, params: ActionUnmuteParams): ActionUnmuteResponse =
        unmute(roomSessionId, params, RequestOptions.none())

    /** @see unmute */
    fun unmute(
        roomSessionId: String,
        params: ActionUnmuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUnmuteResponse =
        unmute(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

    /** @see unmute */
    fun unmute(params: ActionUnmuteParams): ActionUnmuteResponse =
        unmute(params, RequestOptions.none())

    /** @see unmute */
    fun unmute(
        params: ActionUnmuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUnmuteResponse

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /room_sessions/{room_session_id}/actions/end`, but
         * is otherwise the same as [ActionService.end].
         */
        @MustBeClosed
        fun end(roomSessionId: String): HttpResponseFor<ActionEndResponse> =
            end(roomSessionId, ActionEndParams.none())

        /** @see end */
        @MustBeClosed
        fun end(
            roomSessionId: String,
            params: ActionEndParams = ActionEndParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionEndResponse> =
            end(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

        /** @see end */
        @MustBeClosed
        fun end(
            roomSessionId: String,
            params: ActionEndParams = ActionEndParams.none(),
        ): HttpResponseFor<ActionEndResponse> = end(roomSessionId, params, RequestOptions.none())

        /** @see end */
        @MustBeClosed
        fun end(
            params: ActionEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionEndResponse>

        /** @see end */
        @MustBeClosed
        fun end(params: ActionEndParams): HttpResponseFor<ActionEndResponse> =
            end(params, RequestOptions.none())

        /** @see end */
        @MustBeClosed
        fun end(
            roomSessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionEndResponse> =
            end(roomSessionId, ActionEndParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /room_sessions/{room_session_id}/actions/kick`, but
         * is otherwise the same as [ActionService.kick].
         */
        @MustBeClosed
        fun kick(
            roomSessionId: String,
            params: ActionKickParams,
        ): HttpResponseFor<ActionKickResponse> = kick(roomSessionId, params, RequestOptions.none())

        /** @see kick */
        @MustBeClosed
        fun kick(
            roomSessionId: String,
            params: ActionKickParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionKickResponse> =
            kick(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

        /** @see kick */
        @MustBeClosed
        fun kick(params: ActionKickParams): HttpResponseFor<ActionKickResponse> =
            kick(params, RequestOptions.none())

        /** @see kick */
        @MustBeClosed
        fun kick(
            params: ActionKickParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionKickResponse>

        /**
         * Returns a raw HTTP response for `post /room_sessions/{room_session_id}/actions/mute`, but
         * is otherwise the same as [ActionService.mute].
         */
        @MustBeClosed
        fun mute(
            roomSessionId: String,
            params: ActionMuteParams,
        ): HttpResponseFor<ActionMuteResponse> = mute(roomSessionId, params, RequestOptions.none())

        /** @see mute */
        @MustBeClosed
        fun mute(
            roomSessionId: String,
            params: ActionMuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionMuteResponse> =
            mute(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

        /** @see mute */
        @MustBeClosed
        fun mute(params: ActionMuteParams): HttpResponseFor<ActionMuteResponse> =
            mute(params, RequestOptions.none())

        /** @see mute */
        @MustBeClosed
        fun mute(
            params: ActionMuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionMuteResponse>

        /**
         * Returns a raw HTTP response for `post /room_sessions/{room_session_id}/actions/unmute`,
         * but is otherwise the same as [ActionService.unmute].
         */
        @MustBeClosed
        fun unmute(
            roomSessionId: String,
            params: ActionUnmuteParams,
        ): HttpResponseFor<ActionUnmuteResponse> =
            unmute(roomSessionId, params, RequestOptions.none())

        /** @see unmute */
        @MustBeClosed
        fun unmute(
            roomSessionId: String,
            params: ActionUnmuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUnmuteResponse> =
            unmute(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

        /** @see unmute */
        @MustBeClosed
        fun unmute(params: ActionUnmuteParams): HttpResponseFor<ActionUnmuteResponse> =
            unmute(params, RequestOptions.none())

        /** @see unmute */
        @MustBeClosed
        fun unmute(
            params: ActionUnmuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUnmuteResponse>
    }
}
