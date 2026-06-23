// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.runs.MissionRunResponse
import com.telnyx.sdk.models.ai.missions.runs.RunCancelRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunCreateParams
import com.telnyx.sdk.models.ai.missions.runs.RunListPageAsync
import com.telnyx.sdk.models.ai.missions.runs.RunListParams
import com.telnyx.sdk.models.ai.missions.runs.RunListRunsPageAsync
import com.telnyx.sdk.models.ai.missions.runs.RunListRunsParams
import com.telnyx.sdk.models.ai.missions.runs.RunPauseRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunResumeRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunRetrieveParams
import com.telnyx.sdk.models.ai.missions.runs.RunUpdateParams
import com.telnyx.sdk.services.async.ai.missions.runs.EventServiceAsync
import com.telnyx.sdk.services.async.ai.missions.runs.PlanServiceAsync
import com.telnyx.sdk.services.async.ai.missions.runs.TelnyxAgentServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync

    fun events(): EventServiceAsync

    fun plan(): PlanServiceAsync

    fun telnyxAgents(): TelnyxAgentServiceAsync

    /** Start a new run for a mission */
    fun create(missionId: String): CompletableFuture<MissionRunResponse> =
        create(missionId, RunCreateParams.none())

    /** @see create */
    fun create(
        missionId: String,
        params: RunCreateParams = RunCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse> =
        create(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see create */
    fun create(
        missionId: String,
        params: RunCreateParams = RunCreateParams.none(),
    ): CompletableFuture<MissionRunResponse> = create(missionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse>

    /** @see create */
    fun create(params: RunCreateParams): CompletableFuture<MissionRunResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MissionRunResponse> =
        create(missionId, RunCreateParams.none(), requestOptions)

    /** Get details of a specific run */
    fun retrieve(runId: String, params: RunRetrieveParams): CompletableFuture<MissionRunResponse> =
        retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse> =
        retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): CompletableFuture<MissionRunResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse>

    /** Update run status and/or result */
    fun update(runId: String, params: RunUpdateParams): CompletableFuture<MissionRunResponse> =
        update(runId, params, RequestOptions.none())

    /** @see update */
    fun update(
        runId: String,
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse> =
        update(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see update */
    fun update(params: RunUpdateParams): CompletableFuture<MissionRunResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse>

    /** List all runs for a specific mission */
    fun list(missionId: String): CompletableFuture<RunListPageAsync> =
        list(missionId, RunListParams.none())

    /** @see list */
    fun list(
        missionId: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunListPageAsync> =
        list(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see list */
    fun list(
        missionId: String,
        params: RunListParams = RunListParams.none(),
    ): CompletableFuture<RunListPageAsync> = list(missionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunListPageAsync>

    /** @see list */
    fun list(params: RunListParams): CompletableFuture<RunListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunListPageAsync> = list(missionId, RunListParams.none(), requestOptions)

    /** Cancel a running or paused run */
    fun cancelRun(
        runId: String,
        params: RunCancelRunParams,
    ): CompletableFuture<MissionRunResponse> = cancelRun(runId, params, RequestOptions.none())

    /** @see cancelRun */
    fun cancelRun(
        runId: String,
        params: RunCancelRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse> =
        cancelRun(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see cancelRun */
    fun cancelRun(params: RunCancelRunParams): CompletableFuture<MissionRunResponse> =
        cancelRun(params, RequestOptions.none())

    /** @see cancelRun */
    fun cancelRun(
        params: RunCancelRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse>

    /** List recent runs across all missions */
    fun listRuns(): CompletableFuture<RunListRunsPageAsync> = listRuns(RunListRunsParams.none())

    /** @see listRuns */
    fun listRuns(
        params: RunListRunsParams = RunListRunsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunListRunsPageAsync>

    /** @see listRuns */
    fun listRuns(
        params: RunListRunsParams = RunListRunsParams.none()
    ): CompletableFuture<RunListRunsPageAsync> = listRuns(params, RequestOptions.none())

    /** @see listRuns */
    fun listRuns(requestOptions: RequestOptions): CompletableFuture<RunListRunsPageAsync> =
        listRuns(RunListRunsParams.none(), requestOptions)

    /** Pause a running run */
    fun pauseRun(runId: String, params: RunPauseRunParams): CompletableFuture<MissionRunResponse> =
        pauseRun(runId, params, RequestOptions.none())

    /** @see pauseRun */
    fun pauseRun(
        runId: String,
        params: RunPauseRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse> =
        pauseRun(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see pauseRun */
    fun pauseRun(params: RunPauseRunParams): CompletableFuture<MissionRunResponse> =
        pauseRun(params, RequestOptions.none())

    /** @see pauseRun */
    fun pauseRun(
        params: RunPauseRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse>

    /** Resume a paused run */
    fun resumeRun(
        runId: String,
        params: RunResumeRunParams,
    ): CompletableFuture<MissionRunResponse> = resumeRun(runId, params, RequestOptions.none())

    /** @see resumeRun */
    fun resumeRun(
        runId: String,
        params: RunResumeRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse> =
        resumeRun(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see resumeRun */
    fun resumeRun(params: RunResumeRunParams): CompletableFuture<MissionRunResponse> =
        resumeRun(params, RequestOptions.none())

    /** @see resumeRun */
    fun resumeRun(
        params: RunResumeRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRunResponse>

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        fun plan(): PlanServiceAsync.WithRawResponse

        fun telnyxAgents(): TelnyxAgentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs`, but is otherwise
         * the same as [RunServiceAsync.create].
         */
        fun create(missionId: String): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            create(missionId, RunCreateParams.none())

        /** @see create */
        fun create(
            missionId: String,
            params: RunCreateParams = RunCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            create(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see create */
        fun create(
            missionId: String,
            params: RunCreateParams = RunCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            create(missionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>>

        /** @see create */
        fun create(
            params: RunCreateParams
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            create(missionId, RunCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/runs/{run_id}`, but is
         * otherwise the same as [RunServiceAsync.retrieve].
         */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>>

        /**
         * Returns a raw HTTP response for `patch /ai/missions/{mission_id}/runs/{run_id}`, but is
         * otherwise the same as [RunServiceAsync.update].
         */
        fun update(
            runId: String,
            params: RunUpdateParams,
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            update(runId, params, RequestOptions.none())

        /** @see update */
        fun update(
            runId: String,
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            update(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see update */
        fun update(
            params: RunUpdateParams
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/runs`, but is otherwise
         * the same as [RunServiceAsync.list].
         */
        fun list(missionId: String): CompletableFuture<HttpResponseFor<RunListPageAsync>> =
            list(missionId, RunListParams.none())

        /** @see list */
        fun list(
            missionId: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunListPageAsync>> =
            list(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see list */
        fun list(
            missionId: String,
            params: RunListParams = RunListParams.none(),
        ): CompletableFuture<HttpResponseFor<RunListPageAsync>> =
            list(missionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunListPageAsync>>

        /** @see list */
        fun list(params: RunListParams): CompletableFuture<HttpResponseFor<RunListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunListPageAsync>> =
            list(missionId, RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/cancel`,
         * but is otherwise the same as [RunServiceAsync.cancelRun].
         */
        fun cancelRun(
            runId: String,
            params: RunCancelRunParams,
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            cancelRun(runId, params, RequestOptions.none())

        /** @see cancelRun */
        fun cancelRun(
            runId: String,
            params: RunCancelRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            cancelRun(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see cancelRun */
        fun cancelRun(
            params: RunCancelRunParams
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            cancelRun(params, RequestOptions.none())

        /** @see cancelRun */
        fun cancelRun(
            params: RunCancelRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/missions/runs`, but is otherwise the same as
         * [RunServiceAsync.listRuns].
         */
        fun listRuns(): CompletableFuture<HttpResponseFor<RunListRunsPageAsync>> =
            listRuns(RunListRunsParams.none())

        /** @see listRuns */
        fun listRuns(
            params: RunListRunsParams = RunListRunsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunListRunsPageAsync>>

        /** @see listRuns */
        fun listRuns(
            params: RunListRunsParams = RunListRunsParams.none()
        ): CompletableFuture<HttpResponseFor<RunListRunsPageAsync>> =
            listRuns(params, RequestOptions.none())

        /** @see listRuns */
        fun listRuns(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RunListRunsPageAsync>> =
            listRuns(RunListRunsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/pause`, but
         * is otherwise the same as [RunServiceAsync.pauseRun].
         */
        fun pauseRun(
            runId: String,
            params: RunPauseRunParams,
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            pauseRun(runId, params, RequestOptions.none())

        /** @see pauseRun */
        fun pauseRun(
            runId: String,
            params: RunPauseRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            pauseRun(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see pauseRun */
        fun pauseRun(
            params: RunPauseRunParams
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            pauseRun(params, RequestOptions.none())

        /** @see pauseRun */
        fun pauseRun(
            params: RunPauseRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>>

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/resume`,
         * but is otherwise the same as [RunServiceAsync.resumeRun].
         */
        fun resumeRun(
            runId: String,
            params: RunResumeRunParams,
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            resumeRun(runId, params, RequestOptions.none())

        /** @see resumeRun */
        fun resumeRun(
            runId: String,
            params: RunResumeRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            resumeRun(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see resumeRun */
        fun resumeRun(
            params: RunResumeRunParams
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>> =
            resumeRun(params, RequestOptions.none())

        /** @see resumeRun */
        fun resumeRun(
            params: RunResumeRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRunResponse>>
    }
}
