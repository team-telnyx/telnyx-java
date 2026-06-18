// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions.runs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentLinkParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentLinkResponse
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentListParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentListResponse
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentUnlinkParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TelnyxAgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelnyxAgentServiceAsync

    /** List all Telnyx agents linked to a run */
    fun list(
        runId: String,
        params: TelnyxAgentListParams,
    ): CompletableFuture<TelnyxAgentListResponse> = list(runId, params, RequestOptions.none())

    /** @see list */
    fun list(
        runId: String,
        params: TelnyxAgentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxAgentListResponse> =
        list(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see list */
    fun list(params: TelnyxAgentListParams): CompletableFuture<TelnyxAgentListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TelnyxAgentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxAgentListResponse>

    /** Link a Telnyx AI agent (voice/messaging) to a run */
    fun link(
        runId: String,
        params: TelnyxAgentLinkParams,
    ): CompletableFuture<TelnyxAgentLinkResponse> = link(runId, params, RequestOptions.none())

    /** @see link */
    fun link(
        runId: String,
        params: TelnyxAgentLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxAgentLinkResponse> =
        link(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see link */
    fun link(params: TelnyxAgentLinkParams): CompletableFuture<TelnyxAgentLinkResponse> =
        link(params, RequestOptions.none())

    /** @see link */
    fun link(
        params: TelnyxAgentLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxAgentLinkResponse>

    /** Unlink a Telnyx agent from a run */
    fun unlink(telnyxAgentId: String, params: TelnyxAgentUnlinkParams): CompletableFuture<Void?> =
        unlink(telnyxAgentId, params, RequestOptions.none())

    /** @see unlink */
    fun unlink(
        telnyxAgentId: String,
        params: TelnyxAgentUnlinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        unlink(params.toBuilder().telnyxAgentId(telnyxAgentId).build(), requestOptions)

    /** @see unlink */
    fun unlink(params: TelnyxAgentUnlinkParams): CompletableFuture<Void?> =
        unlink(params, RequestOptions.none())

    /** @see unlink */
    fun unlink(
        params: TelnyxAgentUnlinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [TelnyxAgentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelnyxAgentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents`, but is otherwise the same as
         * [TelnyxAgentServiceAsync.list].
         */
        fun list(
            runId: String,
            params: TelnyxAgentListParams,
        ): CompletableFuture<HttpResponseFor<TelnyxAgentListResponse>> =
            list(runId, params, RequestOptions.none())

        /** @see list */
        fun list(
            runId: String,
            params: TelnyxAgentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxAgentListResponse>> =
            list(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see list */
        fun list(
            params: TelnyxAgentListParams
        ): CompletableFuture<HttpResponseFor<TelnyxAgentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TelnyxAgentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxAgentListResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents`, but is otherwise the same as
         * [TelnyxAgentServiceAsync.link].
         */
        fun link(
            runId: String,
            params: TelnyxAgentLinkParams,
        ): CompletableFuture<HttpResponseFor<TelnyxAgentLinkResponse>> =
            link(runId, params, RequestOptions.none())

        /** @see link */
        fun link(
            runId: String,
            params: TelnyxAgentLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxAgentLinkResponse>> =
            link(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see link */
        fun link(
            params: TelnyxAgentLinkParams
        ): CompletableFuture<HttpResponseFor<TelnyxAgentLinkResponse>> =
            link(params, RequestOptions.none())

        /** @see link */
        fun link(
            params: TelnyxAgentLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxAgentLinkResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents/{telnyx_agent_id}`, but is
         * otherwise the same as [TelnyxAgentServiceAsync.unlink].
         */
        fun unlink(
            telnyxAgentId: String,
            params: TelnyxAgentUnlinkParams,
        ): CompletableFuture<HttpResponse> = unlink(telnyxAgentId, params, RequestOptions.none())

        /** @see unlink */
        fun unlink(
            telnyxAgentId: String,
            params: TelnyxAgentUnlinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unlink(params.toBuilder().telnyxAgentId(telnyxAgentId).build(), requestOptions)

        /** @see unlink */
        fun unlink(params: TelnyxAgentUnlinkParams): CompletableFuture<HttpResponse> =
            unlink(params, RequestOptions.none())

        /** @see unlink */
        fun unlink(
            params: TelnyxAgentUnlinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
