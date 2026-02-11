// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions.runs

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentLinkParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentLinkResponse
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentListParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentListResponse
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentUnlinkParams
import java.util.function.Consumer

interface TelnyxAgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelnyxAgentService

    /** List all Telnyx agents linked to a run */
    fun list(runId: String, params: TelnyxAgentListParams): TelnyxAgentListResponse =
        list(runId, params, RequestOptions.none())

    /** @see list */
    fun list(
        runId: String,
        params: TelnyxAgentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxAgentListResponse = list(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see list */
    fun list(params: TelnyxAgentListParams): TelnyxAgentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TelnyxAgentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxAgentListResponse

    /** Link a Telnyx AI agent (voice/messaging) to a run */
    fun link(runId: String, params: TelnyxAgentLinkParams): TelnyxAgentLinkResponse =
        link(runId, params, RequestOptions.none())

    /** @see link */
    fun link(
        runId: String,
        params: TelnyxAgentLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxAgentLinkResponse = link(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see link */
    fun link(params: TelnyxAgentLinkParams): TelnyxAgentLinkResponse =
        link(params, RequestOptions.none())

    /** @see link */
    fun link(
        params: TelnyxAgentLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxAgentLinkResponse

    /** Unlink a Telnyx agent from a run */
    fun unlink(telnyxAgentId: String, params: TelnyxAgentUnlinkParams) =
        unlink(telnyxAgentId, params, RequestOptions.none())

    /** @see unlink */
    fun unlink(
        telnyxAgentId: String,
        params: TelnyxAgentUnlinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unlink(params.toBuilder().telnyxAgentId(telnyxAgentId).build(), requestOptions)

    /** @see unlink */
    fun unlink(params: TelnyxAgentUnlinkParams) = unlink(params, RequestOptions.none())

    /** @see unlink */
    fun unlink(
        params: TelnyxAgentUnlinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [TelnyxAgentService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelnyxAgentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents`, but is otherwise the same as
         * [TelnyxAgentService.list].
         */
        @MustBeClosed
        fun list(
            runId: String,
            params: TelnyxAgentListParams,
        ): HttpResponseFor<TelnyxAgentListResponse> = list(runId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            runId: String,
            params: TelnyxAgentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxAgentListResponse> =
            list(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: TelnyxAgentListParams): HttpResponseFor<TelnyxAgentListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TelnyxAgentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxAgentListResponse>

        /**
         * Returns a raw HTTP response for `post
         * /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents`, but is otherwise the same as
         * [TelnyxAgentService.link].
         */
        @MustBeClosed
        fun link(
            runId: String,
            params: TelnyxAgentLinkParams,
        ): HttpResponseFor<TelnyxAgentLinkResponse> = link(runId, params, RequestOptions.none())

        /** @see link */
        @MustBeClosed
        fun link(
            runId: String,
            params: TelnyxAgentLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxAgentLinkResponse> =
            link(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see link */
        @MustBeClosed
        fun link(params: TelnyxAgentLinkParams): HttpResponseFor<TelnyxAgentLinkResponse> =
            link(params, RequestOptions.none())

        /** @see link */
        @MustBeClosed
        fun link(
            params: TelnyxAgentLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxAgentLinkResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents/{telnyx_agent_id}`, but is
         * otherwise the same as [TelnyxAgentService.unlink].
         */
        @MustBeClosed
        fun unlink(telnyxAgentId: String, params: TelnyxAgentUnlinkParams): HttpResponse =
            unlink(telnyxAgentId, params, RequestOptions.none())

        /** @see unlink */
        @MustBeClosed
        fun unlink(
            telnyxAgentId: String,
            params: TelnyxAgentUnlinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unlink(params.toBuilder().telnyxAgentId(telnyxAgentId).build(), requestOptions)

        /** @see unlink */
        @MustBeClosed
        fun unlink(params: TelnyxAgentUnlinkParams): HttpResponse =
            unlink(params, RequestOptions.none())

        /** @see unlink */
        @MustBeClosed
        fun unlink(
            params: TelnyxAgentUnlinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
