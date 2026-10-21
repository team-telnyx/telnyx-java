// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ttsintegrations

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ttsintegrations.CommunityTtsEngine
import com.telnyx.sdk.models.ttsintegrations.actions.ActionDisableParams
import com.telnyx.sdk.models.ttsintegrations.actions.ActionEnableParams
import com.telnyx.sdk.models.ttsintegrations.actions.ActionRefreshVoicesParams
import com.telnyx.sdk.models.ttsintegrations.actions.ActionRequestReviewParams
import com.telnyx.sdk.models.ttsintegrations.actions.ActionTestConnectionParams
import com.telnyx.sdk.models.ttsintegrations.actions.CommunityTtsConformanceRun
import java.util.function.Consumer

/**
 * Register and manage text-to-speech (TTS) engines you publish, and find the public engines other
 * organizations published, so an AI Assistant, TeXML or Call Control can speak with one of their
 * voices, using your own key for it, instead of a Telnyx-integrated vendor.
 */
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
     * Pause an `active` engine so it stops serving traffic, without deleting it. Owner-initiated
     * and owner-reversible via `enable`. Only an `active` engine can be disabled. While an engine
     * is disabled, no organization can use it, including other organizations if it is `public`.
     */
    fun disable(id: String): CommunityTtsEngine = disable(id, ActionDisableParams.none())

    /** @see disable */
    fun disable(
        id: String,
        params: ActionDisableParams = ActionDisableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommunityTtsEngine = disable(params.toBuilder().id(id).build(), requestOptions)

    /** @see disable */
    fun disable(
        id: String,
        params: ActionDisableParams = ActionDisableParams.none(),
    ): CommunityTtsEngine = disable(id, params, RequestOptions.none())

    /** @see disable */
    fun disable(
        params: ActionDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommunityTtsEngine

    /** @see disable */
    fun disable(params: ActionDisableParams): CommunityTtsEngine =
        disable(params, RequestOptions.none())

    /** @see disable */
    fun disable(id: String, requestOptions: RequestOptions): CommunityTtsEngine =
        disable(id, ActionDisableParams.none(), requestOptions)

    /**
     * Resume a `disabled` engine. Only a `disabled` engine can be enabled; a `suspended` engine can
     * only be reinstated by Telnyx.
     */
    fun enable(id: String): CommunityTtsEngine = enable(id, ActionEnableParams.none())

    /** @see enable */
    fun enable(
        id: String,
        params: ActionEnableParams = ActionEnableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommunityTtsEngine = enable(params.toBuilder().id(id).build(), requestOptions)

    /** @see enable */
    fun enable(
        id: String,
        params: ActionEnableParams = ActionEnableParams.none(),
    ): CommunityTtsEngine = enable(id, params, RequestOptions.none())

    /** @see enable */
    fun enable(
        params: ActionEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommunityTtsEngine

    /** @see enable */
    fun enable(params: ActionEnableParams): CommunityTtsEngine =
        enable(params, RequestOptions.none())

    /** @see enable */
    fun enable(id: String, requestOptions: RequestOptions): CommunityTtsEngine =
        enable(id, ActionEnableParams.none(), requestOptions)

    /**
     * Make Telnyx read the engine's `voices_url` now instead of at the next scheduled read (every
     * 15 minutes). On success the stored list is replaced and `voices_degraded` is cleared. The
     * previous list is kept when the read fails.
     */
    fun refreshVoices(id: String): CommunityTtsEngine =
        refreshVoices(id, ActionRefreshVoicesParams.none())

    /** @see refreshVoices */
    fun refreshVoices(
        id: String,
        params: ActionRefreshVoicesParams = ActionRefreshVoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommunityTtsEngine = refreshVoices(params.toBuilder().id(id).build(), requestOptions)

    /** @see refreshVoices */
    fun refreshVoices(
        id: String,
        params: ActionRefreshVoicesParams = ActionRefreshVoicesParams.none(),
    ): CommunityTtsEngine = refreshVoices(id, params, RequestOptions.none())

    /** @see refreshVoices */
    fun refreshVoices(
        params: ActionRefreshVoicesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommunityTtsEngine

    /** @see refreshVoices */
    fun refreshVoices(params: ActionRefreshVoicesParams): CommunityTtsEngine =
        refreshVoices(params, RequestOptions.none())

    /** @see refreshVoices */
    fun refreshVoices(id: String, requestOptions: RequestOptions): CommunityTtsEngine =
        refreshVoices(id, ActionRefreshVoicesParams.none(), requestOptions)

    /**
     * Ask Telnyx to review a `draft` engine so it can serve other organizations. Only a `draft`
     * engine with no pending or approved review can be submitted (a rejected one can be submitted
     * again). The engine moves to `review_status: pending`; Telnyx approves it (`status: active`,
     * `review_status: approved`) or rejects it with `review_notes`. See the
     * [Community TTS engines guide](/docs/voice/tts/community-engines) for the full review flow.
     */
    fun requestReview(id: String): CommunityTtsEngine =
        requestReview(id, ActionRequestReviewParams.none())

    /** @see requestReview */
    fun requestReview(
        id: String,
        params: ActionRequestReviewParams = ActionRequestReviewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommunityTtsEngine = requestReview(params.toBuilder().id(id).build(), requestOptions)

    /** @see requestReview */
    fun requestReview(
        id: String,
        params: ActionRequestReviewParams = ActionRequestReviewParams.none(),
    ): CommunityTtsEngine = requestReview(id, params, RequestOptions.none())

    /** @see requestReview */
    fun requestReview(
        params: ActionRequestReviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommunityTtsEngine

    /** @see requestReview */
    fun requestReview(params: ActionRequestReviewParams): CommunityTtsEngine =
        requestReview(params, RequestOptions.none())

    /** @see requestReview */
    fun requestReview(id: String, requestOptions: RequestOptions): CommunityTtsEngine =
        requestReview(id, ActionRequestReviewParams.none(), requestOptions)

    /**
     * Check an engine end to end with your own key, without a call. Telnyx reads the voice list,
     * connects to the engine's `websocket_url` with the Integration Secret named by `api_key_ref`,
     * sends a short text, and checks the answer: the handshake, the credentials, the audio, the
     * final frame and a clean close. The result is recorded (see `conformance_runs`) and returned.
     * A test within 10 seconds of the previous one is refused with `429`, and a `suspended` engine
     * cannot be tested. See
     * [Try your engine before approval](/docs/voice/tts/community-engines#try-your-engine-before-approval).
     */
    fun testConnection(id: String, params: ActionTestConnectionParams): CommunityTtsConformanceRun =
        testConnection(id, params, RequestOptions.none())

    /** @see testConnection */
    fun testConnection(
        id: String,
        params: ActionTestConnectionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommunityTtsConformanceRun =
        testConnection(params.toBuilder().id(id).build(), requestOptions)

    /** @see testConnection */
    fun testConnection(params: ActionTestConnectionParams): CommunityTtsConformanceRun =
        testConnection(params, RequestOptions.none())

    /** @see testConnection */
    fun testConnection(
        params: ActionTestConnectionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommunityTtsConformanceRun

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /tts_integrations/{id}/actions/disable`, but is
         * otherwise the same as [ActionService.disable].
         */
        @MustBeClosed
        fun disable(id: String): HttpResponseFor<CommunityTtsEngine> =
            disable(id, ActionDisableParams.none())

        /** @see disable */
        @MustBeClosed
        fun disable(
            id: String,
            params: ActionDisableParams = ActionDisableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommunityTtsEngine> =
            disable(params.toBuilder().id(id).build(), requestOptions)

        /** @see disable */
        @MustBeClosed
        fun disable(
            id: String,
            params: ActionDisableParams = ActionDisableParams.none(),
        ): HttpResponseFor<CommunityTtsEngine> = disable(id, params, RequestOptions.none())

        /** @see disable */
        @MustBeClosed
        fun disable(
            params: ActionDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommunityTtsEngine>

        /** @see disable */
        @MustBeClosed
        fun disable(params: ActionDisableParams): HttpResponseFor<CommunityTtsEngine> =
            disable(params, RequestOptions.none())

        /** @see disable */
        @MustBeClosed
        fun disable(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> =
            disable(id, ActionDisableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /tts_integrations/{id}/actions/enable`, but is
         * otherwise the same as [ActionService.enable].
         */
        @MustBeClosed
        fun enable(id: String): HttpResponseFor<CommunityTtsEngine> =
            enable(id, ActionEnableParams.none())

        /** @see enable */
        @MustBeClosed
        fun enable(
            id: String,
            params: ActionEnableParams = ActionEnableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommunityTtsEngine> =
            enable(params.toBuilder().id(id).build(), requestOptions)

        /** @see enable */
        @MustBeClosed
        fun enable(
            id: String,
            params: ActionEnableParams = ActionEnableParams.none(),
        ): HttpResponseFor<CommunityTtsEngine> = enable(id, params, RequestOptions.none())

        /** @see enable */
        @MustBeClosed
        fun enable(
            params: ActionEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommunityTtsEngine>

        /** @see enable */
        @MustBeClosed
        fun enable(params: ActionEnableParams): HttpResponseFor<CommunityTtsEngine> =
            enable(params, RequestOptions.none())

        /** @see enable */
        @MustBeClosed
        fun enable(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> =
            enable(id, ActionEnableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /tts_integrations/{id}/actions/refresh_voices`, but
         * is otherwise the same as [ActionService.refreshVoices].
         */
        @MustBeClosed
        fun refreshVoices(id: String): HttpResponseFor<CommunityTtsEngine> =
            refreshVoices(id, ActionRefreshVoicesParams.none())

        /** @see refreshVoices */
        @MustBeClosed
        fun refreshVoices(
            id: String,
            params: ActionRefreshVoicesParams = ActionRefreshVoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommunityTtsEngine> =
            refreshVoices(params.toBuilder().id(id).build(), requestOptions)

        /** @see refreshVoices */
        @MustBeClosed
        fun refreshVoices(
            id: String,
            params: ActionRefreshVoicesParams = ActionRefreshVoicesParams.none(),
        ): HttpResponseFor<CommunityTtsEngine> = refreshVoices(id, params, RequestOptions.none())

        /** @see refreshVoices */
        @MustBeClosed
        fun refreshVoices(
            params: ActionRefreshVoicesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommunityTtsEngine>

        /** @see refreshVoices */
        @MustBeClosed
        fun refreshVoices(params: ActionRefreshVoicesParams): HttpResponseFor<CommunityTtsEngine> =
            refreshVoices(params, RequestOptions.none())

        /** @see refreshVoices */
        @MustBeClosed
        fun refreshVoices(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> =
            refreshVoices(id, ActionRefreshVoicesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /tts_integrations/{id}/actions/request_review`, but
         * is otherwise the same as [ActionService.requestReview].
         */
        @MustBeClosed
        fun requestReview(id: String): HttpResponseFor<CommunityTtsEngine> =
            requestReview(id, ActionRequestReviewParams.none())

        /** @see requestReview */
        @MustBeClosed
        fun requestReview(
            id: String,
            params: ActionRequestReviewParams = ActionRequestReviewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommunityTtsEngine> =
            requestReview(params.toBuilder().id(id).build(), requestOptions)

        /** @see requestReview */
        @MustBeClosed
        fun requestReview(
            id: String,
            params: ActionRequestReviewParams = ActionRequestReviewParams.none(),
        ): HttpResponseFor<CommunityTtsEngine> = requestReview(id, params, RequestOptions.none())

        /** @see requestReview */
        @MustBeClosed
        fun requestReview(
            params: ActionRequestReviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommunityTtsEngine>

        /** @see requestReview */
        @MustBeClosed
        fun requestReview(params: ActionRequestReviewParams): HttpResponseFor<CommunityTtsEngine> =
            requestReview(params, RequestOptions.none())

        /** @see requestReview */
        @MustBeClosed
        fun requestReview(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> =
            requestReview(id, ActionRequestReviewParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /tts_integrations/{id}/actions/test_connection`,
         * but is otherwise the same as [ActionService.testConnection].
         */
        @MustBeClosed
        fun testConnection(
            id: String,
            params: ActionTestConnectionParams,
        ): HttpResponseFor<CommunityTtsConformanceRun> =
            testConnection(id, params, RequestOptions.none())

        /** @see testConnection */
        @MustBeClosed
        fun testConnection(
            id: String,
            params: ActionTestConnectionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommunityTtsConformanceRun> =
            testConnection(params.toBuilder().id(id).build(), requestOptions)

        /** @see testConnection */
        @MustBeClosed
        fun testConnection(
            params: ActionTestConnectionParams
        ): HttpResponseFor<CommunityTtsConformanceRun> =
            testConnection(params, RequestOptions.none())

        /** @see testConnection */
        @MustBeClosed
        fun testConnection(
            params: ActionTestConnectionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommunityTtsConformanceRun>
    }
}
