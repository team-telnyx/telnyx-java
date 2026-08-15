// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.meetingsessions

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.meetingsessions.actions.ActionAcceptedResponse
import com.telnyx.sdk.models.meetingsessions.actions.ActionSendChatParams
import com.telnyx.sdk.models.meetingsessions.actions.ActionSpeakParams
import com.telnyx.sdk.models.meetingsessions.actions.ActionStopSpeakingParams
import java.util.function.Consumer

/** Send real-time speech and chat actions to an active meeting session. */
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

    /** Sends a chat message into a meeting session. */
    fun sendChat(id: String, params: ActionSendChatParams): ActionAcceptedResponse =
        sendChat(id, params, RequestOptions.none())

    /** @see sendChat */
    fun sendChat(
        id: String,
        params: ActionSendChatParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionAcceptedResponse = sendChat(params.toBuilder().id(id).build(), requestOptions)

    /** @see sendChat */
    fun sendChat(params: ActionSendChatParams): ActionAcceptedResponse =
        sendChat(params, RequestOptions.none())

    /** @see sendChat */
    fun sendChat(
        params: ActionSendChatParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionAcceptedResponse

    /** Sends audio / text-to-speech into a meeting session. */
    fun speak(id: String, params: ActionSpeakParams): ActionAcceptedResponse =
        speak(id, params, RequestOptions.none())

    /** @see speak */
    fun speak(
        id: String,
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionAcceptedResponse = speak(params.toBuilder().id(id).build(), requestOptions)

    /** @see speak */
    fun speak(params: ActionSpeakParams): ActionAcceptedResponse =
        speak(params, RequestOptions.none())

    /** @see speak */
    fun speak(
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionAcceptedResponse

    /** Stops any active text-to-speech playback in a meeting session. */
    fun stopSpeaking(id: String): ActionAcceptedResponse =
        stopSpeaking(id, ActionStopSpeakingParams.none())

    /** @see stopSpeaking */
    fun stopSpeaking(
        id: String,
        params: ActionStopSpeakingParams = ActionStopSpeakingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionAcceptedResponse = stopSpeaking(params.toBuilder().id(id).build(), requestOptions)

    /** @see stopSpeaking */
    fun stopSpeaking(
        id: String,
        params: ActionStopSpeakingParams = ActionStopSpeakingParams.none(),
    ): ActionAcceptedResponse = stopSpeaking(id, params, RequestOptions.none())

    /** @see stopSpeaking */
    fun stopSpeaking(
        params: ActionStopSpeakingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionAcceptedResponse

    /** @see stopSpeaking */
    fun stopSpeaking(params: ActionStopSpeakingParams): ActionAcceptedResponse =
        stopSpeaking(params, RequestOptions.none())

    /** @see stopSpeaking */
    fun stopSpeaking(id: String, requestOptions: RequestOptions): ActionAcceptedResponse =
        stopSpeaking(id, ActionStopSpeakingParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /meeting_sessions/{id}/actions/send_chat`, but is
         * otherwise the same as [ActionService.sendChat].
         */
        @MustBeClosed
        fun sendChat(
            id: String,
            params: ActionSendChatParams,
        ): HttpResponseFor<ActionAcceptedResponse> = sendChat(id, params, RequestOptions.none())

        /** @see sendChat */
        @MustBeClosed
        fun sendChat(
            id: String,
            params: ActionSendChatParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionAcceptedResponse> =
            sendChat(params.toBuilder().id(id).build(), requestOptions)

        /** @see sendChat */
        @MustBeClosed
        fun sendChat(params: ActionSendChatParams): HttpResponseFor<ActionAcceptedResponse> =
            sendChat(params, RequestOptions.none())

        /** @see sendChat */
        @MustBeClosed
        fun sendChat(
            params: ActionSendChatParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionAcceptedResponse>

        /**
         * Returns a raw HTTP response for `post /meeting_sessions/{id}/actions/speak`, but is
         * otherwise the same as [ActionService.speak].
         */
        @MustBeClosed
        fun speak(id: String, params: ActionSpeakParams): HttpResponseFor<ActionAcceptedResponse> =
            speak(id, params, RequestOptions.none())

        /** @see speak */
        @MustBeClosed
        fun speak(
            id: String,
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionAcceptedResponse> =
            speak(params.toBuilder().id(id).build(), requestOptions)

        /** @see speak */
        @MustBeClosed
        fun speak(params: ActionSpeakParams): HttpResponseFor<ActionAcceptedResponse> =
            speak(params, RequestOptions.none())

        /** @see speak */
        @MustBeClosed
        fun speak(
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionAcceptedResponse>

        /**
         * Returns a raw HTTP response for `post /meeting_sessions/{id}/actions/stop_speaking`, but
         * is otherwise the same as [ActionService.stopSpeaking].
         */
        @MustBeClosed
        fun stopSpeaking(id: String): HttpResponseFor<ActionAcceptedResponse> =
            stopSpeaking(id, ActionStopSpeakingParams.none())

        /** @see stopSpeaking */
        @MustBeClosed
        fun stopSpeaking(
            id: String,
            params: ActionStopSpeakingParams = ActionStopSpeakingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionAcceptedResponse> =
            stopSpeaking(params.toBuilder().id(id).build(), requestOptions)

        /** @see stopSpeaking */
        @MustBeClosed
        fun stopSpeaking(
            id: String,
            params: ActionStopSpeakingParams = ActionStopSpeakingParams.none(),
        ): HttpResponseFor<ActionAcceptedResponse> = stopSpeaking(id, params, RequestOptions.none())

        /** @see stopSpeaking */
        @MustBeClosed
        fun stopSpeaking(
            params: ActionStopSpeakingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionAcceptedResponse>

        /** @see stopSpeaking */
        @MustBeClosed
        fun stopSpeaking(
            params: ActionStopSpeakingParams
        ): HttpResponseFor<ActionAcceptedResponse> = stopSpeaking(params, RequestOptions.none())

        /** @see stopSpeaking */
        @MustBeClosed
        fun stopSpeaking(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionAcceptedResponse> =
            stopSpeaking(id, ActionStopSpeakingParams.none(), requestOptions)
    }
}
