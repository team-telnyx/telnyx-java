// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.meetingsessions

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.meetingsessions.actions.ActionAcceptedResponse
import com.telnyx.sdk.models.meetingsessions.actions.ActionSendChatParams
import com.telnyx.sdk.models.meetingsessions.actions.ActionSpeakParams
import com.telnyx.sdk.models.meetingsessions.actions.ActionStopSpeakingParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Send real-time speech and chat actions to an active meeting session. */
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

    /** Sends a chat message into a meeting session. */
    fun sendChat(
        id: String,
        params: ActionSendChatParams,
    ): CompletableFuture<ActionAcceptedResponse> = sendChat(id, params, RequestOptions.none())

    /** @see sendChat */
    fun sendChat(
        id: String,
        params: ActionSendChatParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAcceptedResponse> =
        sendChat(params.toBuilder().id(id).build(), requestOptions)

    /** @see sendChat */
    fun sendChat(params: ActionSendChatParams): CompletableFuture<ActionAcceptedResponse> =
        sendChat(params, RequestOptions.none())

    /** @see sendChat */
    fun sendChat(
        params: ActionSendChatParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAcceptedResponse>

    /** Sends audio / text-to-speech into a meeting session. */
    fun speak(id: String, params: ActionSpeakParams): CompletableFuture<ActionAcceptedResponse> =
        speak(id, params, RequestOptions.none())

    /** @see speak */
    fun speak(
        id: String,
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAcceptedResponse> =
        speak(params.toBuilder().id(id).build(), requestOptions)

    /** @see speak */
    fun speak(params: ActionSpeakParams): CompletableFuture<ActionAcceptedResponse> =
        speak(params, RequestOptions.none())

    /** @see speak */
    fun speak(
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAcceptedResponse>

    /** Stops any active text-to-speech playback in a meeting session. */
    fun stopSpeaking(id: String): CompletableFuture<ActionAcceptedResponse> =
        stopSpeaking(id, ActionStopSpeakingParams.none())

    /** @see stopSpeaking */
    fun stopSpeaking(
        id: String,
        params: ActionStopSpeakingParams = ActionStopSpeakingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAcceptedResponse> =
        stopSpeaking(params.toBuilder().id(id).build(), requestOptions)

    /** @see stopSpeaking */
    fun stopSpeaking(
        id: String,
        params: ActionStopSpeakingParams = ActionStopSpeakingParams.none(),
    ): CompletableFuture<ActionAcceptedResponse> = stopSpeaking(id, params, RequestOptions.none())

    /** @see stopSpeaking */
    fun stopSpeaking(
        params: ActionStopSpeakingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAcceptedResponse>

    /** @see stopSpeaking */
    fun stopSpeaking(params: ActionStopSpeakingParams): CompletableFuture<ActionAcceptedResponse> =
        stopSpeaking(params, RequestOptions.none())

    /** @see stopSpeaking */
    fun stopSpeaking(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionAcceptedResponse> =
        stopSpeaking(id, ActionStopSpeakingParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /meeting_sessions/{id}/actions/send_chat`, but is
         * otherwise the same as [ActionServiceAsync.sendChat].
         */
        fun sendChat(
            id: String,
            params: ActionSendChatParams,
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> =
            sendChat(id, params, RequestOptions.none())

        /** @see sendChat */
        fun sendChat(
            id: String,
            params: ActionSendChatParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> =
            sendChat(params.toBuilder().id(id).build(), requestOptions)

        /** @see sendChat */
        fun sendChat(
            params: ActionSendChatParams
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> =
            sendChat(params, RequestOptions.none())

        /** @see sendChat */
        fun sendChat(
            params: ActionSendChatParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>>

        /**
         * Returns a raw HTTP response for `post /meeting_sessions/{id}/actions/speak`, but is
         * otherwise the same as [ActionServiceAsync.speak].
         */
        fun speak(
            id: String,
            params: ActionSpeakParams,
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> =
            speak(id, params, RequestOptions.none())

        /** @see speak */
        fun speak(
            id: String,
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> =
            speak(params.toBuilder().id(id).build(), requestOptions)

        /** @see speak */
        fun speak(
            params: ActionSpeakParams
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> =
            speak(params, RequestOptions.none())

        /** @see speak */
        fun speak(
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>>

        /**
         * Returns a raw HTTP response for `post /meeting_sessions/{id}/actions/stop_speaking`, but
         * is otherwise the same as [ActionServiceAsync.stopSpeaking].
         */
        fun stopSpeaking(id: String): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> =
            stopSpeaking(id, ActionStopSpeakingParams.none())

        /** @see stopSpeaking */
        fun stopSpeaking(
            id: String,
            params: ActionStopSpeakingParams = ActionStopSpeakingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> =
            stopSpeaking(params.toBuilder().id(id).build(), requestOptions)

        /** @see stopSpeaking */
        fun stopSpeaking(
            id: String,
            params: ActionStopSpeakingParams = ActionStopSpeakingParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> =
            stopSpeaking(id, params, RequestOptions.none())

        /** @see stopSpeaking */
        fun stopSpeaking(
            params: ActionStopSpeakingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>>

        /** @see stopSpeaking */
        fun stopSpeaking(
            params: ActionStopSpeakingParams
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> =
            stopSpeaking(params, RequestOptions.none())

        /** @see stopSpeaking */
        fun stopSpeaking(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> =
            stopSpeaking(id, ActionStopSpeakingParams.none(), requestOptions)
    }
}
