// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.conferences

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.conferences.actions.ActionHoldParams
import com.telnyx.api.models.conferences.actions.ActionHoldResponse
import com.telnyx.api.models.conferences.actions.ActionJoinParams
import com.telnyx.api.models.conferences.actions.ActionJoinResponse
import com.telnyx.api.models.conferences.actions.ActionLeaveParams
import com.telnyx.api.models.conferences.actions.ActionLeaveResponse
import com.telnyx.api.models.conferences.actions.ActionMuteParams
import com.telnyx.api.models.conferences.actions.ActionMuteResponse
import com.telnyx.api.models.conferences.actions.ActionPlayParams
import com.telnyx.api.models.conferences.actions.ActionPlayResponse
import com.telnyx.api.models.conferences.actions.ActionRecordPauseParams
import com.telnyx.api.models.conferences.actions.ActionRecordPauseResponse
import com.telnyx.api.models.conferences.actions.ActionRecordResumeParams
import com.telnyx.api.models.conferences.actions.ActionRecordResumeResponse
import com.telnyx.api.models.conferences.actions.ActionRecordStartParams
import com.telnyx.api.models.conferences.actions.ActionRecordStartResponse
import com.telnyx.api.models.conferences.actions.ActionRecordStopParams
import com.telnyx.api.models.conferences.actions.ActionRecordStopResponse
import com.telnyx.api.models.conferences.actions.ActionSpeakParams
import com.telnyx.api.models.conferences.actions.ActionSpeakResponse
import com.telnyx.api.models.conferences.actions.ActionStopParams
import com.telnyx.api.models.conferences.actions.ActionStopResponse
import com.telnyx.api.models.conferences.actions.ActionUnholdParams
import com.telnyx.api.models.conferences.actions.ActionUnholdResponse
import com.telnyx.api.models.conferences.actions.ActionUnmuteParams
import com.telnyx.api.models.conferences.actions.ActionUnmuteResponse
import com.telnyx.api.models.conferences.actions.ActionUpdateParams
import com.telnyx.api.models.conferences.actions.ActionUpdateResponse
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

    /** Update conference participant supervisor_role */
    fun update(id: String, params: ActionUpdateParams): ActionUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ActionUpdateParams): ActionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUpdateResponse

    /** Hold a list of participants in a conference call */
    fun hold(id: String): ActionHoldResponse = hold(id, ActionHoldParams.none())

    /** @see hold */
    fun hold(
        id: String,
        params: ActionHoldParams = ActionHoldParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionHoldResponse = hold(params.toBuilder().id(id).build(), requestOptions)

    /** @see hold */
    fun hold(id: String, params: ActionHoldParams = ActionHoldParams.none()): ActionHoldResponse =
        hold(id, params, RequestOptions.none())

    /** @see hold */
    fun hold(
        params: ActionHoldParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionHoldResponse

    /** @see hold */
    fun hold(params: ActionHoldParams): ActionHoldResponse = hold(params, RequestOptions.none())

    /** @see hold */
    fun hold(id: String, requestOptions: RequestOptions): ActionHoldResponse =
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
    fun join(id: String, params: ActionJoinParams): ActionJoinResponse =
        join(id, params, RequestOptions.none())

    /** @see join */
    fun join(
        id: String,
        params: ActionJoinParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionJoinResponse = join(params.toBuilder().id(id).build(), requestOptions)

    /** @see join */
    fun join(params: ActionJoinParams): ActionJoinResponse = join(params, RequestOptions.none())

    /** @see join */
    fun join(
        params: ActionJoinParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionJoinResponse

    /**
     * Removes a call leg from a conference and moves it back to parked state.
     *
     * **Expected Webhooks:**
     * - `conference.participant.left`
     */
    fun leave(id: String, params: ActionLeaveParams): ActionLeaveResponse =
        leave(id, params, RequestOptions.none())

    /** @see leave */
    fun leave(
        id: String,
        params: ActionLeaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionLeaveResponse = leave(params.toBuilder().id(id).build(), requestOptions)

    /** @see leave */
    fun leave(params: ActionLeaveParams): ActionLeaveResponse = leave(params, RequestOptions.none())

    /** @see leave */
    fun leave(
        params: ActionLeaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionLeaveResponse

    /** Mute a list of participants in a conference call */
    fun mute(id: String): ActionMuteResponse = mute(id, ActionMuteParams.none())

    /** @see mute */
    fun mute(
        id: String,
        params: ActionMuteParams = ActionMuteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionMuteResponse = mute(params.toBuilder().id(id).build(), requestOptions)

    /** @see mute */
    fun mute(id: String, params: ActionMuteParams = ActionMuteParams.none()): ActionMuteResponse =
        mute(id, params, RequestOptions.none())

    /** @see mute */
    fun mute(
        params: ActionMuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionMuteResponse

    /** @see mute */
    fun mute(params: ActionMuteParams): ActionMuteResponse = mute(params, RequestOptions.none())

    /** @see mute */
    fun mute(id: String, requestOptions: RequestOptions): ActionMuteResponse =
        mute(id, ActionMuteParams.none(), requestOptions)

    /** Play audio to all or some participants on a conference call. */
    fun play(id: String): ActionPlayResponse = play(id, ActionPlayParams.none())

    /** @see play */
    fun play(
        id: String,
        params: ActionPlayParams = ActionPlayParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionPlayResponse = play(params.toBuilder().id(id).build(), requestOptions)

    /** @see play */
    fun play(id: String, params: ActionPlayParams = ActionPlayParams.none()): ActionPlayResponse =
        play(id, params, RequestOptions.none())

    /** @see play */
    fun play(
        params: ActionPlayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionPlayResponse

    /** @see play */
    fun play(params: ActionPlayParams): ActionPlayResponse = play(params, RequestOptions.none())

    /** @see play */
    fun play(id: String, requestOptions: RequestOptions): ActionPlayResponse =
        play(id, ActionPlayParams.none(), requestOptions)

    /** Pause conference recording. */
    fun recordPause(id: String): ActionRecordPauseResponse =
        recordPause(id, ActionRecordPauseParams.none())

    /** @see recordPause */
    fun recordPause(
        id: String,
        params: ActionRecordPauseParams = ActionRecordPauseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRecordPauseResponse = recordPause(params.toBuilder().id(id).build(), requestOptions)

    /** @see recordPause */
    fun recordPause(
        id: String,
        params: ActionRecordPauseParams = ActionRecordPauseParams.none(),
    ): ActionRecordPauseResponse = recordPause(id, params, RequestOptions.none())

    /** @see recordPause */
    fun recordPause(
        params: ActionRecordPauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRecordPauseResponse

    /** @see recordPause */
    fun recordPause(params: ActionRecordPauseParams): ActionRecordPauseResponse =
        recordPause(params, RequestOptions.none())

    /** @see recordPause */
    fun recordPause(id: String, requestOptions: RequestOptions): ActionRecordPauseResponse =
        recordPause(id, ActionRecordPauseParams.none(), requestOptions)

    /** Resume conference recording. */
    fun recordResume(id: String): ActionRecordResumeResponse =
        recordResume(id, ActionRecordResumeParams.none())

    /** @see recordResume */
    fun recordResume(
        id: String,
        params: ActionRecordResumeParams = ActionRecordResumeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRecordResumeResponse = recordResume(params.toBuilder().id(id).build(), requestOptions)

    /** @see recordResume */
    fun recordResume(
        id: String,
        params: ActionRecordResumeParams = ActionRecordResumeParams.none(),
    ): ActionRecordResumeResponse = recordResume(id, params, RequestOptions.none())

    /** @see recordResume */
    fun recordResume(
        params: ActionRecordResumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRecordResumeResponse

    /** @see recordResume */
    fun recordResume(params: ActionRecordResumeParams): ActionRecordResumeResponse =
        recordResume(params, RequestOptions.none())

    /** @see recordResume */
    fun recordResume(id: String, requestOptions: RequestOptions): ActionRecordResumeResponse =
        recordResume(id, ActionRecordResumeParams.none(), requestOptions)

    /**
     * Start recording the conference. Recording will stop on conference end, or via the Stop
     * Recording command.
     *
     * **Expected Webhooks:**
     * - `conference.recording.saved`
     */
    fun recordStart(id: String, params: ActionRecordStartParams): ActionRecordStartResponse =
        recordStart(id, params, RequestOptions.none())

    /** @see recordStart */
    fun recordStart(
        id: String,
        params: ActionRecordStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRecordStartResponse = recordStart(params.toBuilder().id(id).build(), requestOptions)

    /** @see recordStart */
    fun recordStart(params: ActionRecordStartParams): ActionRecordStartResponse =
        recordStart(params, RequestOptions.none())

    /** @see recordStart */
    fun recordStart(
        params: ActionRecordStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRecordStartResponse

    /**
     * Stop recording the conference.
     *
     * **Expected Webhooks:**
     * - `conference.recording.saved`
     */
    fun recordStop(id: String, params: ActionRecordStopParams): ActionRecordStopResponse =
        recordStop(id, params, RequestOptions.none())

    /** @see recordStop */
    fun recordStop(
        id: String,
        params: ActionRecordStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRecordStopResponse = recordStop(params.toBuilder().id(id).build(), requestOptions)

    /** @see recordStop */
    fun recordStop(params: ActionRecordStopParams): ActionRecordStopResponse =
        recordStop(params, RequestOptions.none())

    /** @see recordStop */
    fun recordStop(
        params: ActionRecordStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRecordStopResponse

    /** Convert text to speech and play it to all or some participants. */
    fun speak(id: String, params: ActionSpeakParams): ActionSpeakResponse =
        speak(id, params, RequestOptions.none())

    /** @see speak */
    fun speak(
        id: String,
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSpeakResponse = speak(params.toBuilder().id(id).build(), requestOptions)

    /** @see speak */
    fun speak(params: ActionSpeakParams): ActionSpeakResponse = speak(params, RequestOptions.none())

    /** @see speak */
    fun speak(
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSpeakResponse

    /** Stop audio being played to all or some participants on a conference call. */
    fun stop(id: String): ActionStopResponse = stop(id, ActionStopParams.none())

    /** @see stop */
    fun stop(
        id: String,
        params: ActionStopParams = ActionStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopResponse = stop(params.toBuilder().id(id).build(), requestOptions)

    /** @see stop */
    fun stop(id: String, params: ActionStopParams = ActionStopParams.none()): ActionStopResponse =
        stop(id, params, RequestOptions.none())

    /** @see stop */
    fun stop(
        params: ActionStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopResponse

    /** @see stop */
    fun stop(params: ActionStopParams): ActionStopResponse = stop(params, RequestOptions.none())

    /** @see stop */
    fun stop(id: String, requestOptions: RequestOptions): ActionStopResponse =
        stop(id, ActionStopParams.none(), requestOptions)

    /** Unhold a list of participants in a conference call */
    fun unhold(id: String, params: ActionUnholdParams): ActionUnholdResponse =
        unhold(id, params, RequestOptions.none())

    /** @see unhold */
    fun unhold(
        id: String,
        params: ActionUnholdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUnholdResponse = unhold(params.toBuilder().id(id).build(), requestOptions)

    /** @see unhold */
    fun unhold(params: ActionUnholdParams): ActionUnholdResponse =
        unhold(params, RequestOptions.none())

    /** @see unhold */
    fun unhold(
        params: ActionUnholdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUnholdResponse

    /** Unmute a list of participants in a conference call */
    fun unmute(id: String): ActionUnmuteResponse = unmute(id, ActionUnmuteParams.none())

    /** @see unmute */
    fun unmute(
        id: String,
        params: ActionUnmuteParams = ActionUnmuteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUnmuteResponse = unmute(params.toBuilder().id(id).build(), requestOptions)

    /** @see unmute */
    fun unmute(
        id: String,
        params: ActionUnmuteParams = ActionUnmuteParams.none(),
    ): ActionUnmuteResponse = unmute(id, params, RequestOptions.none())

    /** @see unmute */
    fun unmute(
        params: ActionUnmuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUnmuteResponse

    /** @see unmute */
    fun unmute(params: ActionUnmuteParams): ActionUnmuteResponse =
        unmute(params, RequestOptions.none())

    /** @see unmute */
    fun unmute(id: String, requestOptions: RequestOptions): ActionUnmuteResponse =
        unmute(id, ActionUnmuteParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/update`, but is otherwise
         * the same as [ActionService.update].
         */
        @MustBeClosed
        fun update(id: String, params: ActionUpdateParams): HttpResponseFor<ActionUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ActionUpdateParams): HttpResponseFor<ActionUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUpdateResponse>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/hold`, but is otherwise
         * the same as [ActionService.hold].
         */
        @MustBeClosed
        fun hold(id: String): HttpResponseFor<ActionHoldResponse> =
            hold(id, ActionHoldParams.none())

        /** @see hold */
        @MustBeClosed
        fun hold(
            id: String,
            params: ActionHoldParams = ActionHoldParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionHoldResponse> =
            hold(params.toBuilder().id(id).build(), requestOptions)

        /** @see hold */
        @MustBeClosed
        fun hold(
            id: String,
            params: ActionHoldParams = ActionHoldParams.none(),
        ): HttpResponseFor<ActionHoldResponse> = hold(id, params, RequestOptions.none())

        /** @see hold */
        @MustBeClosed
        fun hold(
            params: ActionHoldParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionHoldResponse>

        /** @see hold */
        @MustBeClosed
        fun hold(params: ActionHoldParams): HttpResponseFor<ActionHoldResponse> =
            hold(params, RequestOptions.none())

        /** @see hold */
        @MustBeClosed
        fun hold(id: String, requestOptions: RequestOptions): HttpResponseFor<ActionHoldResponse> =
            hold(id, ActionHoldParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/join`, but is otherwise
         * the same as [ActionService.join].
         */
        @MustBeClosed
        fun join(id: String, params: ActionJoinParams): HttpResponseFor<ActionJoinResponse> =
            join(id, params, RequestOptions.none())

        /** @see join */
        @MustBeClosed
        fun join(
            id: String,
            params: ActionJoinParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionJoinResponse> =
            join(params.toBuilder().id(id).build(), requestOptions)

        /** @see join */
        @MustBeClosed
        fun join(params: ActionJoinParams): HttpResponseFor<ActionJoinResponse> =
            join(params, RequestOptions.none())

        /** @see join */
        @MustBeClosed
        fun join(
            params: ActionJoinParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionJoinResponse>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/leave`, but is otherwise
         * the same as [ActionService.leave].
         */
        @MustBeClosed
        fun leave(id: String, params: ActionLeaveParams): HttpResponseFor<ActionLeaveResponse> =
            leave(id, params, RequestOptions.none())

        /** @see leave */
        @MustBeClosed
        fun leave(
            id: String,
            params: ActionLeaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionLeaveResponse> =
            leave(params.toBuilder().id(id).build(), requestOptions)

        /** @see leave */
        @MustBeClosed
        fun leave(params: ActionLeaveParams): HttpResponseFor<ActionLeaveResponse> =
            leave(params, RequestOptions.none())

        /** @see leave */
        @MustBeClosed
        fun leave(
            params: ActionLeaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionLeaveResponse>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/mute`, but is otherwise
         * the same as [ActionService.mute].
         */
        @MustBeClosed
        fun mute(id: String): HttpResponseFor<ActionMuteResponse> =
            mute(id, ActionMuteParams.none())

        /** @see mute */
        @MustBeClosed
        fun mute(
            id: String,
            params: ActionMuteParams = ActionMuteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionMuteResponse> =
            mute(params.toBuilder().id(id).build(), requestOptions)

        /** @see mute */
        @MustBeClosed
        fun mute(
            id: String,
            params: ActionMuteParams = ActionMuteParams.none(),
        ): HttpResponseFor<ActionMuteResponse> = mute(id, params, RequestOptions.none())

        /** @see mute */
        @MustBeClosed
        fun mute(
            params: ActionMuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionMuteResponse>

        /** @see mute */
        @MustBeClosed
        fun mute(params: ActionMuteParams): HttpResponseFor<ActionMuteResponse> =
            mute(params, RequestOptions.none())

        /** @see mute */
        @MustBeClosed
        fun mute(id: String, requestOptions: RequestOptions): HttpResponseFor<ActionMuteResponse> =
            mute(id, ActionMuteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/play`, but is otherwise
         * the same as [ActionService.play].
         */
        @MustBeClosed
        fun play(id: String): HttpResponseFor<ActionPlayResponse> =
            play(id, ActionPlayParams.none())

        /** @see play */
        @MustBeClosed
        fun play(
            id: String,
            params: ActionPlayParams = ActionPlayParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionPlayResponse> =
            play(params.toBuilder().id(id).build(), requestOptions)

        /** @see play */
        @MustBeClosed
        fun play(
            id: String,
            params: ActionPlayParams = ActionPlayParams.none(),
        ): HttpResponseFor<ActionPlayResponse> = play(id, params, RequestOptions.none())

        /** @see play */
        @MustBeClosed
        fun play(
            params: ActionPlayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionPlayResponse>

        /** @see play */
        @MustBeClosed
        fun play(params: ActionPlayParams): HttpResponseFor<ActionPlayResponse> =
            play(params, RequestOptions.none())

        /** @see play */
        @MustBeClosed
        fun play(id: String, requestOptions: RequestOptions): HttpResponseFor<ActionPlayResponse> =
            play(id, ActionPlayParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/record_pause`, but is
         * otherwise the same as [ActionService.recordPause].
         */
        @MustBeClosed
        fun recordPause(id: String): HttpResponseFor<ActionRecordPauseResponse> =
            recordPause(id, ActionRecordPauseParams.none())

        /** @see recordPause */
        @MustBeClosed
        fun recordPause(
            id: String,
            params: ActionRecordPauseParams = ActionRecordPauseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRecordPauseResponse> =
            recordPause(params.toBuilder().id(id).build(), requestOptions)

        /** @see recordPause */
        @MustBeClosed
        fun recordPause(
            id: String,
            params: ActionRecordPauseParams = ActionRecordPauseParams.none(),
        ): HttpResponseFor<ActionRecordPauseResponse> =
            recordPause(id, params, RequestOptions.none())

        /** @see recordPause */
        @MustBeClosed
        fun recordPause(
            params: ActionRecordPauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRecordPauseResponse>

        /** @see recordPause */
        @MustBeClosed
        fun recordPause(
            params: ActionRecordPauseParams
        ): HttpResponseFor<ActionRecordPauseResponse> = recordPause(params, RequestOptions.none())

        /** @see recordPause */
        @MustBeClosed
        fun recordPause(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRecordPauseResponse> =
            recordPause(id, ActionRecordPauseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/record_resume`, but is
         * otherwise the same as [ActionService.recordResume].
         */
        @MustBeClosed
        fun recordResume(id: String): HttpResponseFor<ActionRecordResumeResponse> =
            recordResume(id, ActionRecordResumeParams.none())

        /** @see recordResume */
        @MustBeClosed
        fun recordResume(
            id: String,
            params: ActionRecordResumeParams = ActionRecordResumeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRecordResumeResponse> =
            recordResume(params.toBuilder().id(id).build(), requestOptions)

        /** @see recordResume */
        @MustBeClosed
        fun recordResume(
            id: String,
            params: ActionRecordResumeParams = ActionRecordResumeParams.none(),
        ): HttpResponseFor<ActionRecordResumeResponse> =
            recordResume(id, params, RequestOptions.none())

        /** @see recordResume */
        @MustBeClosed
        fun recordResume(
            params: ActionRecordResumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRecordResumeResponse>

        /** @see recordResume */
        @MustBeClosed
        fun recordResume(
            params: ActionRecordResumeParams
        ): HttpResponseFor<ActionRecordResumeResponse> = recordResume(params, RequestOptions.none())

        /** @see recordResume */
        @MustBeClosed
        fun recordResume(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRecordResumeResponse> =
            recordResume(id, ActionRecordResumeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/record_start`, but is
         * otherwise the same as [ActionService.recordStart].
         */
        @MustBeClosed
        fun recordStart(
            id: String,
            params: ActionRecordStartParams,
        ): HttpResponseFor<ActionRecordStartResponse> =
            recordStart(id, params, RequestOptions.none())

        /** @see recordStart */
        @MustBeClosed
        fun recordStart(
            id: String,
            params: ActionRecordStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRecordStartResponse> =
            recordStart(params.toBuilder().id(id).build(), requestOptions)

        /** @see recordStart */
        @MustBeClosed
        fun recordStart(
            params: ActionRecordStartParams
        ): HttpResponseFor<ActionRecordStartResponse> = recordStart(params, RequestOptions.none())

        /** @see recordStart */
        @MustBeClosed
        fun recordStart(
            params: ActionRecordStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRecordStartResponse>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/record_stop`, but is
         * otherwise the same as [ActionService.recordStop].
         */
        @MustBeClosed
        fun recordStop(
            id: String,
            params: ActionRecordStopParams,
        ): HttpResponseFor<ActionRecordStopResponse> = recordStop(id, params, RequestOptions.none())

        /** @see recordStop */
        @MustBeClosed
        fun recordStop(
            id: String,
            params: ActionRecordStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRecordStopResponse> =
            recordStop(params.toBuilder().id(id).build(), requestOptions)

        /** @see recordStop */
        @MustBeClosed
        fun recordStop(params: ActionRecordStopParams): HttpResponseFor<ActionRecordStopResponse> =
            recordStop(params, RequestOptions.none())

        /** @see recordStop */
        @MustBeClosed
        fun recordStop(
            params: ActionRecordStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRecordStopResponse>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/speak`, but is otherwise
         * the same as [ActionService.speak].
         */
        @MustBeClosed
        fun speak(id: String, params: ActionSpeakParams): HttpResponseFor<ActionSpeakResponse> =
            speak(id, params, RequestOptions.none())

        /** @see speak */
        @MustBeClosed
        fun speak(
            id: String,
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSpeakResponse> =
            speak(params.toBuilder().id(id).build(), requestOptions)

        /** @see speak */
        @MustBeClosed
        fun speak(params: ActionSpeakParams): HttpResponseFor<ActionSpeakResponse> =
            speak(params, RequestOptions.none())

        /** @see speak */
        @MustBeClosed
        fun speak(
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSpeakResponse>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/stop`, but is otherwise
         * the same as [ActionService.stop].
         */
        @MustBeClosed
        fun stop(id: String): HttpResponseFor<ActionStopResponse> =
            stop(id, ActionStopParams.none())

        /** @see stop */
        @MustBeClosed
        fun stop(
            id: String,
            params: ActionStopParams = ActionStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopResponse> =
            stop(params.toBuilder().id(id).build(), requestOptions)

        /** @see stop */
        @MustBeClosed
        fun stop(
            id: String,
            params: ActionStopParams = ActionStopParams.none(),
        ): HttpResponseFor<ActionStopResponse> = stop(id, params, RequestOptions.none())

        /** @see stop */
        @MustBeClosed
        fun stop(
            params: ActionStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopResponse>

        /** @see stop */
        @MustBeClosed
        fun stop(params: ActionStopParams): HttpResponseFor<ActionStopResponse> =
            stop(params, RequestOptions.none())

        /** @see stop */
        @MustBeClosed
        fun stop(id: String, requestOptions: RequestOptions): HttpResponseFor<ActionStopResponse> =
            stop(id, ActionStopParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/unhold`, but is otherwise
         * the same as [ActionService.unhold].
         */
        @MustBeClosed
        fun unhold(id: String, params: ActionUnholdParams): HttpResponseFor<ActionUnholdResponse> =
            unhold(id, params, RequestOptions.none())

        /** @see unhold */
        @MustBeClosed
        fun unhold(
            id: String,
            params: ActionUnholdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUnholdResponse> =
            unhold(params.toBuilder().id(id).build(), requestOptions)

        /** @see unhold */
        @MustBeClosed
        fun unhold(params: ActionUnholdParams): HttpResponseFor<ActionUnholdResponse> =
            unhold(params, RequestOptions.none())

        /** @see unhold */
        @MustBeClosed
        fun unhold(
            params: ActionUnholdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUnholdResponse>

        /**
         * Returns a raw HTTP response for `post /conferences/{id}/actions/unmute`, but is otherwise
         * the same as [ActionService.unmute].
         */
        @MustBeClosed
        fun unmute(id: String): HttpResponseFor<ActionUnmuteResponse> =
            unmute(id, ActionUnmuteParams.none())

        /** @see unmute */
        @MustBeClosed
        fun unmute(
            id: String,
            params: ActionUnmuteParams = ActionUnmuteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUnmuteResponse> =
            unmute(params.toBuilder().id(id).build(), requestOptions)

        /** @see unmute */
        @MustBeClosed
        fun unmute(
            id: String,
            params: ActionUnmuteParams = ActionUnmuteParams.none(),
        ): HttpResponseFor<ActionUnmuteResponse> = unmute(id, params, RequestOptions.none())

        /** @see unmute */
        @MustBeClosed
        fun unmute(
            params: ActionUnmuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUnmuteResponse>

        /** @see unmute */
        @MustBeClosed
        fun unmute(params: ActionUnmuteParams): HttpResponseFor<ActionUnmuteResponse> =
            unmute(params, RequestOptions.none())

        /** @see unmute */
        @MustBeClosed
        fun unmute(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionUnmuteResponse> =
            unmute(id, ActionUnmuteParams.none(), requestOptions)
    }
}
