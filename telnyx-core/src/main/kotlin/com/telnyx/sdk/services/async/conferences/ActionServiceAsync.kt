// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.conferences

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.conferences.actions.ActionHoldParams
import com.telnyx.sdk.models.conferences.actions.ActionHoldResponse
import com.telnyx.sdk.models.conferences.actions.ActionJoinParams
import com.telnyx.sdk.models.conferences.actions.ActionJoinResponse
import com.telnyx.sdk.models.conferences.actions.ActionLeaveParams
import com.telnyx.sdk.models.conferences.actions.ActionLeaveResponse
import com.telnyx.sdk.models.conferences.actions.ActionMuteParams
import com.telnyx.sdk.models.conferences.actions.ActionMuteResponse
import com.telnyx.sdk.models.conferences.actions.ActionPlayParams
import com.telnyx.sdk.models.conferences.actions.ActionPlayResponse
import com.telnyx.sdk.models.conferences.actions.ActionRecordPauseParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordPauseResponse
import com.telnyx.sdk.models.conferences.actions.ActionRecordResumeParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordResumeResponse
import com.telnyx.sdk.models.conferences.actions.ActionRecordStartParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordStartResponse
import com.telnyx.sdk.models.conferences.actions.ActionRecordStopParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordStopResponse
import com.telnyx.sdk.models.conferences.actions.ActionSpeakParams
import com.telnyx.sdk.models.conferences.actions.ActionSpeakResponse
import com.telnyx.sdk.models.conferences.actions.ActionStopParams
import com.telnyx.sdk.models.conferences.actions.ActionStopResponse
import com.telnyx.sdk.models.conferences.actions.ActionUnholdParams
import com.telnyx.sdk.models.conferences.actions.ActionUnholdResponse
import com.telnyx.sdk.models.conferences.actions.ActionUnmuteParams
import com.telnyx.sdk.models.conferences.actions.ActionUnmuteResponse
import com.telnyx.sdk.models.conferences.actions.ActionUpdateParams
import com.telnyx.sdk.models.conferences.actions.ActionUpdateResponse
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

    /** Update conference participant supervisor_role */
    fun update(id: String, params: ActionUpdateParams): CompletableFuture<ActionUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ActionUpdateParams): CompletableFuture<ActionUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUpdateResponse>

    /** Hold a list of participants in a conference call */
    fun hold(id: String): CompletableFuture<ActionHoldResponse> = hold(id, ActionHoldParams.none())

    /** @see hold */
    fun hold(
        id: String,
        params: ActionHoldParams = ActionHoldParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionHoldResponse> =
        hold(params.toBuilder().id(id).build(), requestOptions)

    /** @see hold */
    fun hold(
        id: String,
        params: ActionHoldParams = ActionHoldParams.none(),
    ): CompletableFuture<ActionHoldResponse> = hold(id, params, RequestOptions.none())

    /** @see hold */
    fun hold(
        params: ActionHoldParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionHoldResponse>

    /** @see hold */
    fun hold(params: ActionHoldParams): CompletableFuture<ActionHoldResponse> =
        hold(params, RequestOptions.none())

    /** @see hold */
    fun hold(id: String, requestOptions: RequestOptions): CompletableFuture<ActionHoldResponse> =
        hold(id, ActionHoldParams.none(), requestOptions)

    /**
     * Join an existing call leg to a conference. Issue the Join Conference command with the
     * conference ID in the path and the `call_control_id` of the leg you wish to join to the
     * conference as an attribute. The conference can have up to a certain amount of active
     * participants, as set by the `max_participants` parameter in conference creation request.
     *
     * **Expected Webhooks:**
     * - `conference.participant.joined`
     * - `conference.participant.left`
     */
    fun join(id: String, params: ActionJoinParams): CompletableFuture<ActionJoinResponse> =
        join(id, params, RequestOptions.none())

    /** @see join */
    fun join(
        id: String,
        params: ActionJoinParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionJoinResponse> =
        join(params.toBuilder().id(id).build(), requestOptions)

    /** @see join */
    fun join(params: ActionJoinParams): CompletableFuture<ActionJoinResponse> =
        join(params, RequestOptions.none())

    /** @see join */
    fun join(
        params: ActionJoinParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionJoinResponse>

    /**
     * Removes a call leg from a conference and moves it back to parked state.
     *
     * **Expected Webhooks:**
     * - `conference.participant.left`
     */
    fun leave(id: String, params: ActionLeaveParams): CompletableFuture<ActionLeaveResponse> =
        leave(id, params, RequestOptions.none())

    /** @see leave */
    fun leave(
        id: String,
        params: ActionLeaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionLeaveResponse> =
        leave(params.toBuilder().id(id).build(), requestOptions)

    /** @see leave */
    fun leave(params: ActionLeaveParams): CompletableFuture<ActionLeaveResponse> =
        leave(params, RequestOptions.none())

    /** @see leave */
    fun leave(
        params: ActionLeaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionLeaveResponse>

    /** Mute a list of participants in a conference call */
    fun mute(id: String): CompletableFuture<ActionMuteResponse> = mute(id, ActionMuteParams.none())

    /** @see mute */
    fun mute(
        id: String,
        params: ActionMuteParams = ActionMuteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionMuteResponse> =
        mute(params.toBuilder().id(id).build(), requestOptions)

    /** @see mute */
    fun mute(
        id: String,
        params: ActionMuteParams = ActionMuteParams.none(),
    ): CompletableFuture<ActionMuteResponse> = mute(id, params, RequestOptions.none())

    /** @see mute */
    fun mute(
        params: ActionMuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionMuteResponse>

    /** @see mute */
    fun mute(params: ActionMuteParams): CompletableFuture<ActionMuteResponse> =
        mute(params, RequestOptions.none())

    /** @see mute */
    fun mute(id: String, requestOptions: RequestOptions): CompletableFuture<ActionMuteResponse> =
        mute(id, ActionMuteParams.none(), requestOptions)

    /** Play audio to all or some participants on a conference call. */
    fun play(id: String): CompletableFuture<ActionPlayResponse> = play(id, ActionPlayParams.none())

    /** @see play */
    fun play(
        id: String,
        params: ActionPlayParams = ActionPlayParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionPlayResponse> =
        play(params.toBuilder().id(id).build(), requestOptions)

    /** @see play */
    fun play(
        id: String,
        params: ActionPlayParams = ActionPlayParams.none(),
    ): CompletableFuture<ActionPlayResponse> = play(id, params, RequestOptions.none())

    /** @see play */
    fun play(
        params: ActionPlayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionPlayResponse>

    /** @see play */
    fun play(params: ActionPlayParams): CompletableFuture<ActionPlayResponse> =
        play(params, RequestOptions.none())

    /** @see play */
    fun play(id: String, requestOptions: RequestOptions): CompletableFuture<ActionPlayResponse> =
        play(id, ActionPlayParams.none(), requestOptions)

    /** Pause conference recording. */
    fun recordPause(id: String): CompletableFuture<ActionRecordPauseResponse> =
        recordPause(id, ActionRecordPauseParams.none())

    /** @see recordPause */
    fun recordPause(
        id: String,
        params: ActionRecordPauseParams = ActionRecordPauseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRecordPauseResponse> =
        recordPause(params.toBuilder().id(id).build(), requestOptions)

    /** @see recordPause */
    fun recordPause(
        id: String,
        params: ActionRecordPauseParams = ActionRecordPauseParams.none(),
    ): CompletableFuture<ActionRecordPauseResponse> = recordPause(id, params, RequestOptions.none())

    /** @see recordPause */
    fun recordPause(
        params: ActionRecordPauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRecordPauseResponse>

    /** @see recordPause */
    fun recordPause(params: ActionRecordPauseParams): CompletableFuture<ActionRecordPauseResponse> =
        recordPause(params, RequestOptions.none())

    /** @see recordPause */
    fun recordPause(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRecordPauseResponse> =
        recordPause(id, ActionRecordPauseParams.none(), requestOptions)

    /** Resume conference recording. */
    fun recordResume(id: String): CompletableFuture<ActionRecordResumeResponse> =
        recordResume(id, ActionRecordResumeParams.none())

    /** @see recordResume */
    fun recordResume(
        id: String,
        params: ActionRecordResumeParams = ActionRecordResumeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRecordResumeResponse> =
        recordResume(params.toBuilder().id(id).build(), requestOptions)

    /** @see recordResume */
    fun recordResume(
        id: String,
        params: ActionRecordResumeParams = ActionRecordResumeParams.none(),
    ): CompletableFuture<ActionRecordResumeResponse> =
        recordResume(id, params, RequestOptions.none())

    /** @see recordResume */
    fun recordResume(
        params: ActionRecordResumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRecordResumeResponse>

    /** @see recordResume */
    fun recordResume(
        params: ActionRecordResumeParams
    ): CompletableFuture<ActionRecordResumeResponse> = recordResume(params, RequestOptions.none())

    /** @see recordResume */
    fun recordResume(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRecordResumeResponse> =
        recordResume(id, ActionRecordResumeParams.none(), requestOptions)

    /**
     * Start recording the conference. Recording will stop on conference end, or via the Stop
     * Recording command.
     *
     * **Expected Webhooks:**
     * - `conference.recording.saved`
     */
    fun recordStart(
        id: String,
        params: ActionRecordStartParams,
    ): CompletableFuture<ActionRecordStartResponse> = recordStart(id, params, RequestOptions.none())

    /** @see recordStart */
    fun recordStart(
        id: String,
        params: ActionRecordStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRecordStartResponse> =
        recordStart(params.toBuilder().id(id).build(), requestOptions)

    /** @see recordStart */
    fun recordStart(params: ActionRecordStartParams): CompletableFuture<ActionRecordStartResponse> =
        recordStart(params, RequestOptions.none())

    /** @see recordStart */
    fun recordStart(
        params: ActionRecordStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRecordStartResponse>

    /**
     * Stop recording the conference.
     *
     * **Expected Webhooks:**
     * - `conference.recording.saved`
     */
    fun recordStop(id: String): CompletableFuture<ActionRecordStopResponse> =
        recordStop(id, ActionRecordStopParams.none())

    /** @see recordStop */
    fun recordStop(
        id: String,
        params: ActionRecordStopParams = ActionRecordStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRecordStopResponse> =
        recordStop(params.toBuilder().id(id).build(), requestOptions)

    /** @see recordStop */
    fun recordStop(
        id: String,
        params: ActionRecordStopParams = ActionRecordStopParams.none(),
    ): CompletableFuture<ActionRecordStopResponse> = recordStop(id, params, RequestOptions.none())

    /** @see recordStop */
    fun recordStop(
        params: ActionRecordStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRecordStopResponse>

    /** @see recordStop */
    fun recordStop(params: ActionRecordStopParams): CompletableFuture<ActionRecordStopResponse> =
        recordStop(params, RequestOptions.none())

    /** @see recordStop */
    fun recordStop(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRecordStopResponse> =
        recordStop(id, ActionRecordStopParams.none(), requestOptions)

    /** Convert text to speech and play it to all or some participants. */
    fun speak(id: String, params: ActionSpeakParams): CompletableFuture<ActionSpeakResponse> =
        speak(id, params, RequestOptions.none())

    /** @see speak */
    fun speak(
        id: String,
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSpeakResponse> =
        speak(params.toBuilder().id(id).build(), requestOptions)

    /** @see speak */
    fun speak(params: ActionSpeakParams): CompletableFuture<ActionSpeakResponse> =
        speak(params, RequestOptions.none())

    /** @see speak */
    fun speak(
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSpeakResponse>

    /** Stop audio being played to all or some participants on a conference call. */
    fun stop(id: String): CompletableFuture<ActionStopResponse> = stop(id, ActionStopParams.none())

    /** @see stop */
    fun stop(
        id: String,
        params: ActionStopParams = ActionStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopResponse> =
        stop(params.toBuilder().id(id).build(), requestOptions)

    /** @see stop */
    fun stop(
        id: String,
        params: ActionStopParams = ActionStopParams.none(),
    ): CompletableFuture<ActionStopResponse> = stop(id, params, RequestOptions.none())

    /** @see stop */
    fun stop(
        params: ActionStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopResponse>

    /** @see stop */
    fun stop(params: ActionStopParams): CompletableFuture<ActionStopResponse> =
        stop(params, RequestOptions.none())

    /** @see stop */
    fun stop(id: String, requestOptions: RequestOptions): CompletableFuture<ActionStopResponse> =
        stop(id, ActionStopParams.none(), requestOptions)

    /** Unhold a list of participants in a conference call */
    fun unhold(id: String, params: ActionUnholdParams): CompletableFuture<ActionUnholdResponse> =
        unhold(id, params, RequestOptions.none())

    /** @see unhold */
    fun unhold(
        id: String,
        params: ActionUnholdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUnholdResponse> =
        unhold(params.toBuilder().id(id).build(), requestOptions)

    /** @see unhold */
    fun unhold(params: ActionUnholdParams): CompletableFuture<ActionUnholdResponse> =
        unhold(params, RequestOptions.none())

    /** @see unhold */
    fun unhold(
        params: ActionUnholdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUnholdResponse>

    /** Unmute a list of participants in a conference call */
    fun unmute(id: String): CompletableFuture<ActionUnmuteResponse> =
        unmute(id, ActionUnmuteParams.none())

    /** @see unmute */
    fun unmute(
        id: String,
        params: ActionUnmuteParams = ActionUnmuteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUnmuteResponse> =
        unmute(params.toBuilder().id(id).build(), requestOptions)

    /** @see unmute */
    fun unmute(
        id: String,
        params: ActionUnmuteParams = ActionUnmuteParams.none(),
    ): CompletableFuture<ActionUnmuteResponse> = unmute(id, params, RequestOptions.none())

    /** @see unmute */
    fun unmute(
        params: ActionUnmuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUnmuteResponse>

    /** @see unmute */
    fun unmute(params: ActionUnmuteParams): CompletableFuture<ActionUnmuteResponse> =
        unmute(params, RequestOptions.none())

    /** @see unmute */
    fun unmute(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionUnmuteResponse> =
        unmute(id, ActionUnmuteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /conferences/{id}/actions/update`, but is otherwise
         * the same as [ActionServiceAsync.update].
         */
        fun update(
            id: String,
            params: ActionUpdateParams,
        ): CompletableFuture<HttpResponseFor<ActionUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: ActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: ActionUpdateParams
        ): CompletableFuture<HttpResponseFor<ActionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUpdateResponse>>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/hold`, but is otherwise
         * the same as [ActionServiceAsync.hold].
         */
        fun hold(id: String): CompletableFuture<HttpResponseFor<ActionHoldResponse>> =
            hold(id, ActionHoldParams.none())

        /** @see hold */
        fun hold(
            id: String,
            params: ActionHoldParams = ActionHoldParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionHoldResponse>> =
            hold(params.toBuilder().id(id).build(), requestOptions)

        /** @see hold */
        fun hold(
            id: String,
            params: ActionHoldParams = ActionHoldParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionHoldResponse>> =
            hold(id, params, RequestOptions.none())

        /** @see hold */
        fun hold(
            params: ActionHoldParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionHoldResponse>>

        /** @see hold */
        fun hold(params: ActionHoldParams): CompletableFuture<HttpResponseFor<ActionHoldResponse>> =
            hold(params, RequestOptions.none())

        /** @see hold */
        fun hold(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionHoldResponse>> =
            hold(id, ActionHoldParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/join`, but is otherwise
         * the same as [ActionServiceAsync.join].
         */
        fun join(
            id: String,
            params: ActionJoinParams,
        ): CompletableFuture<HttpResponseFor<ActionJoinResponse>> =
            join(id, params, RequestOptions.none())

        /** @see join */
        fun join(
            id: String,
            params: ActionJoinParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionJoinResponse>> =
            join(params.toBuilder().id(id).build(), requestOptions)

        /** @see join */
        fun join(params: ActionJoinParams): CompletableFuture<HttpResponseFor<ActionJoinResponse>> =
            join(params, RequestOptions.none())

        /** @see join */
        fun join(
            params: ActionJoinParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionJoinResponse>>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/leave`, but is otherwise
         * the same as [ActionServiceAsync.leave].
         */
        fun leave(
            id: String,
            params: ActionLeaveParams,
        ): CompletableFuture<HttpResponseFor<ActionLeaveResponse>> =
            leave(id, params, RequestOptions.none())

        /** @see leave */
        fun leave(
            id: String,
            params: ActionLeaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionLeaveResponse>> =
            leave(params.toBuilder().id(id).build(), requestOptions)

        /** @see leave */
        fun leave(
            params: ActionLeaveParams
        ): CompletableFuture<HttpResponseFor<ActionLeaveResponse>> =
            leave(params, RequestOptions.none())

        /** @see leave */
        fun leave(
            params: ActionLeaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionLeaveResponse>>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/mute`, but is otherwise
         * the same as [ActionServiceAsync.mute].
         */
        fun mute(id: String): CompletableFuture<HttpResponseFor<ActionMuteResponse>> =
            mute(id, ActionMuteParams.none())

        /** @see mute */
        fun mute(
            id: String,
            params: ActionMuteParams = ActionMuteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionMuteResponse>> =
            mute(params.toBuilder().id(id).build(), requestOptions)

        /** @see mute */
        fun mute(
            id: String,
            params: ActionMuteParams = ActionMuteParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionMuteResponse>> =
            mute(id, params, RequestOptions.none())

        /** @see mute */
        fun mute(
            params: ActionMuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionMuteResponse>>

        /** @see mute */
        fun mute(params: ActionMuteParams): CompletableFuture<HttpResponseFor<ActionMuteResponse>> =
            mute(params, RequestOptions.none())

        /** @see mute */
        fun mute(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionMuteResponse>> =
            mute(id, ActionMuteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/play`, but is otherwise
         * the same as [ActionServiceAsync.play].
         */
        fun play(id: String): CompletableFuture<HttpResponseFor<ActionPlayResponse>> =
            play(id, ActionPlayParams.none())

        /** @see play */
        fun play(
            id: String,
            params: ActionPlayParams = ActionPlayParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionPlayResponse>> =
            play(params.toBuilder().id(id).build(), requestOptions)

        /** @see play */
        fun play(
            id: String,
            params: ActionPlayParams = ActionPlayParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionPlayResponse>> =
            play(id, params, RequestOptions.none())

        /** @see play */
        fun play(
            params: ActionPlayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionPlayResponse>>

        /** @see play */
        fun play(params: ActionPlayParams): CompletableFuture<HttpResponseFor<ActionPlayResponse>> =
            play(params, RequestOptions.none())

        /** @see play */
        fun play(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionPlayResponse>> =
            play(id, ActionPlayParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/record_pause`, but is
         * otherwise the same as [ActionServiceAsync.recordPause].
         */
        fun recordPause(id: String): CompletableFuture<HttpResponseFor<ActionRecordPauseResponse>> =
            recordPause(id, ActionRecordPauseParams.none())

        /** @see recordPause */
        fun recordPause(
            id: String,
            params: ActionRecordPauseParams = ActionRecordPauseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRecordPauseResponse>> =
            recordPause(params.toBuilder().id(id).build(), requestOptions)

        /** @see recordPause */
        fun recordPause(
            id: String,
            params: ActionRecordPauseParams = ActionRecordPauseParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionRecordPauseResponse>> =
            recordPause(id, params, RequestOptions.none())

        /** @see recordPause */
        fun recordPause(
            params: ActionRecordPauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRecordPauseResponse>>

        /** @see recordPause */
        fun recordPause(
            params: ActionRecordPauseParams
        ): CompletableFuture<HttpResponseFor<ActionRecordPauseResponse>> =
            recordPause(params, RequestOptions.none())

        /** @see recordPause */
        fun recordPause(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRecordPauseResponse>> =
            recordPause(id, ActionRecordPauseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/record_resume`, but is
         * otherwise the same as [ActionServiceAsync.recordResume].
         */
        fun recordResume(
            id: String
        ): CompletableFuture<HttpResponseFor<ActionRecordResumeResponse>> =
            recordResume(id, ActionRecordResumeParams.none())

        /** @see recordResume */
        fun recordResume(
            id: String,
            params: ActionRecordResumeParams = ActionRecordResumeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRecordResumeResponse>> =
            recordResume(params.toBuilder().id(id).build(), requestOptions)

        /** @see recordResume */
        fun recordResume(
            id: String,
            params: ActionRecordResumeParams = ActionRecordResumeParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionRecordResumeResponse>> =
            recordResume(id, params, RequestOptions.none())

        /** @see recordResume */
        fun recordResume(
            params: ActionRecordResumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRecordResumeResponse>>

        /** @see recordResume */
        fun recordResume(
            params: ActionRecordResumeParams
        ): CompletableFuture<HttpResponseFor<ActionRecordResumeResponse>> =
            recordResume(params, RequestOptions.none())

        /** @see recordResume */
        fun recordResume(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRecordResumeResponse>> =
            recordResume(id, ActionRecordResumeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/record_start`, but is
         * otherwise the same as [ActionServiceAsync.recordStart].
         */
        fun recordStart(
            id: String,
            params: ActionRecordStartParams,
        ): CompletableFuture<HttpResponseFor<ActionRecordStartResponse>> =
            recordStart(id, params, RequestOptions.none())

        /** @see recordStart */
        fun recordStart(
            id: String,
            params: ActionRecordStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRecordStartResponse>> =
            recordStart(params.toBuilder().id(id).build(), requestOptions)

        /** @see recordStart */
        fun recordStart(
            params: ActionRecordStartParams
        ): CompletableFuture<HttpResponseFor<ActionRecordStartResponse>> =
            recordStart(params, RequestOptions.none())

        /** @see recordStart */
        fun recordStart(
            params: ActionRecordStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRecordStartResponse>>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/record_stop`, but is
         * otherwise the same as [ActionServiceAsync.recordStop].
         */
        fun recordStop(id: String): CompletableFuture<HttpResponseFor<ActionRecordStopResponse>> =
            recordStop(id, ActionRecordStopParams.none())

        /** @see recordStop */
        fun recordStop(
            id: String,
            params: ActionRecordStopParams = ActionRecordStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRecordStopResponse>> =
            recordStop(params.toBuilder().id(id).build(), requestOptions)

        /** @see recordStop */
        fun recordStop(
            id: String,
            params: ActionRecordStopParams = ActionRecordStopParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionRecordStopResponse>> =
            recordStop(id, params, RequestOptions.none())

        /** @see recordStop */
        fun recordStop(
            params: ActionRecordStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRecordStopResponse>>

        /** @see recordStop */
        fun recordStop(
            params: ActionRecordStopParams
        ): CompletableFuture<HttpResponseFor<ActionRecordStopResponse>> =
            recordStop(params, RequestOptions.none())

        /** @see recordStop */
        fun recordStop(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRecordStopResponse>> =
            recordStop(id, ActionRecordStopParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/speak`, but is otherwise
         * the same as [ActionServiceAsync.speak].
         */
        fun speak(
            id: String,
            params: ActionSpeakParams,
        ): CompletableFuture<HttpResponseFor<ActionSpeakResponse>> =
            speak(id, params, RequestOptions.none())

        /** @see speak */
        fun speak(
            id: String,
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSpeakResponse>> =
            speak(params.toBuilder().id(id).build(), requestOptions)

        /** @see speak */
        fun speak(
            params: ActionSpeakParams
        ): CompletableFuture<HttpResponseFor<ActionSpeakResponse>> =
            speak(params, RequestOptions.none())

        /** @see speak */
        fun speak(
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSpeakResponse>>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/stop`, but is otherwise
         * the same as [ActionServiceAsync.stop].
         */
        fun stop(id: String): CompletableFuture<HttpResponseFor<ActionStopResponse>> =
            stop(id, ActionStopParams.none())

        /** @see stop */
        fun stop(
            id: String,
            params: ActionStopParams = ActionStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopResponse>> =
            stop(params.toBuilder().id(id).build(), requestOptions)

        /** @see stop */
        fun stop(
            id: String,
            params: ActionStopParams = ActionStopParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopResponse>> =
            stop(id, params, RequestOptions.none())

        /** @see stop */
        fun stop(
            params: ActionStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopResponse>>

        /** @see stop */
        fun stop(params: ActionStopParams): CompletableFuture<HttpResponseFor<ActionStopResponse>> =
            stop(params, RequestOptions.none())

        /** @see stop */
        fun stop(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopResponse>> =
            stop(id, ActionStopParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/unhold`, but is otherwise
         * the same as [ActionServiceAsync.unhold].
         */
        fun unhold(
            id: String,
            params: ActionUnholdParams,
        ): CompletableFuture<HttpResponseFor<ActionUnholdResponse>> =
            unhold(id, params, RequestOptions.none())

        /** @see unhold */
        fun unhold(
            id: String,
            params: ActionUnholdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUnholdResponse>> =
            unhold(params.toBuilder().id(id).build(), requestOptions)

        /** @see unhold */
        fun unhold(
            params: ActionUnholdParams
        ): CompletableFuture<HttpResponseFor<ActionUnholdResponse>> =
            unhold(params, RequestOptions.none())

        /** @see unhold */
        fun unhold(
            params: ActionUnholdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUnholdResponse>>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/unmute`, but is otherwise
         * the same as [ActionServiceAsync.unmute].
         */
        fun unmute(id: String): CompletableFuture<HttpResponseFor<ActionUnmuteResponse>> =
            unmute(id, ActionUnmuteParams.none())

        /** @see unmute */
        fun unmute(
            id: String,
            params: ActionUnmuteParams = ActionUnmuteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUnmuteResponse>> =
            unmute(params.toBuilder().id(id).build(), requestOptions)

        /** @see unmute */
        fun unmute(
            id: String,
            params: ActionUnmuteParams = ActionUnmuteParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionUnmuteResponse>> =
            unmute(id, params, RequestOptions.none())

        /** @see unmute */
        fun unmute(
            params: ActionUnmuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUnmuteResponse>>

        /** @see unmute */
        fun unmute(
            params: ActionUnmuteParams
        ): CompletableFuture<HttpResponseFor<ActionUnmuteResponse>> =
            unmute(params, RequestOptions.none())

        /** @see unmute */
        fun unmute(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionUnmuteResponse>> =
            unmute(id, ActionUnmuteParams.none(), requestOptions)
    }
}
