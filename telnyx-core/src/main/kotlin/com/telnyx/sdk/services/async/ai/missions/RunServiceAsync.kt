// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.runs.RunCancelRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunCancelRunResponse
import com.telnyx.sdk.models.ai.missions.runs.RunCreateParams
import com.telnyx.sdk.models.ai.missions.runs.RunCreateResponse
import com.telnyx.sdk.models.ai.missions.runs.RunListPageAsync
import com.telnyx.sdk.models.ai.missions.runs.RunListParams
import com.telnyx.sdk.models.ai.missions.runs.RunListRunsPageAsync
import com.telnyx.sdk.models.ai.missions.runs.RunListRunsParams
import com.telnyx.sdk.models.ai.missions.runs.RunPauseRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunPauseRunResponse
import com.telnyx.sdk.models.ai.missions.runs.RunResumeRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunResumeRunResponse
import com.telnyx.sdk.models.ai.missions.runs.RunRetrieveParams
import com.telnyx.sdk.models.ai.missions.runs.RunRetrieveResponse
import com.telnyx.sdk.models.ai.missions.runs.RunUpdateParams
import com.telnyx.sdk.models.ai.missions.runs.RunUpdateResponse
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
    fun create(missionId: String): CompletableFuture<RunCreateResponse> =
        create(missionId, RunCreateParams.none())

    /** @see create */
    fun create(
        missionId: String,
        params: RunCreateParams = RunCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCreateResponse> =
        create(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see create */
    fun create(
        missionId: String,
        params: RunCreateParams = RunCreateParams.none(),
    ): CompletableFuture<RunCreateResponse> = create(missionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCreateResponse>

    /** @see create */
    fun create(params: RunCreateParams): CompletableFuture<RunCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunCreateResponse> =
        create(missionId, RunCreateParams.none(), requestOptions)

    /** Get details of a specific run */
    fun retrieve(runId: String, params: RunRetrieveParams): CompletableFuture<RunRetrieveResponse> =
        retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunRetrieveResponse> =
        retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): CompletableFuture<RunRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunRetrieveResponse>

    /** Update run status and/or result */
    fun update(runId: String, params: RunUpdateParams): CompletableFuture<RunUpdateResponse> =
        update(runId, params, RequestOptions.none())

    /** @see update */
    fun update(
        runId: String,
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdateResponse> =
        update(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see update */
    fun update(params: RunUpdateParams): CompletableFuture<RunUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdateResponse>

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
    ): CompletableFuture<RunCancelRunResponse> = cancelRun(runId, params, RequestOptions.none())

    /** @see cancelRun */
    fun cancelRun(
        runId: String,
        params: RunCancelRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCancelRunResponse> =
        cancelRun(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see cancelRun */
    fun cancelRun(params: RunCancelRunParams): CompletableFuture<RunCancelRunResponse> =
        cancelRun(params, RequestOptions.none())

    /** @see cancelRun */
    fun cancelRun(
        params: RunCancelRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCancelRunResponse>

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
    fun pauseRun(runId: String, params: RunPauseRunParams): CompletableFuture<RunPauseRunResponse> =
        pauseRun(runId, params, RequestOptions.none())

    /** @see pauseRun */
    fun pauseRun(
        runId: String,
        params: RunPauseRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunPauseRunResponse> =
        pauseRun(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see pauseRun */
    fun pauseRun(params: RunPauseRunParams): CompletableFuture<RunPauseRunResponse> =
        pauseRun(params, RequestOptions.none())

    /** @see pauseRun */
    fun pauseRun(
        params: RunPauseRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunPauseRunResponse>

    /** Resume a paused run */
    fun resumeRun(
        runId: String,
        params: RunResumeRunParams,
    ): CompletableFuture<RunResumeRunResponse> = resumeRun(runId, params, RequestOptions.none())

    /** @see resumeRun */
    fun resumeRun(
        runId: String,
        params: RunResumeRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunResumeRunResponse> =
        resumeRun(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see resumeRun */
    fun resumeRun(params: RunResumeRunParams): CompletableFuture<RunResumeRunResponse> =
        resumeRun(params, RequestOptions.none())

    /** @see resumeRun */
    fun resumeRun(
        params: RunResumeRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunResumeRunResponse>

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
        fun create(missionId: String): CompletableFuture<HttpResponseFor<RunCreateResponse>> =
            create(missionId, RunCreateParams.none())

        /** @see create */
        fun create(
            missionId: String,
            params: RunCreateParams = RunCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCreateResponse>> =
            create(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see create */
        fun create(
            missionId: String,
            params: RunCreateParams = RunCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<RunCreateResponse>> =
            create(missionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCreateResponse>>

        /** @see create */
        fun create(params: RunCreateParams): CompletableFuture<HttpResponseFor<RunCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunCreateResponse>> =
            create(missionId, RunCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/runs/{run_id}`, but is
         * otherwise the same as [RunServiceAsync.retrieve].
         */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
        ): CompletableFuture<HttpResponseFor<RunRetrieveResponse>> =
            retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunRetrieveResponse>> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams
        ): CompletableFuture<HttpResponseFor<RunRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch /ai/missions/{mission_id}/runs/{run_id}`, but is
         * otherwise the same as [RunServiceAsync.update].
         */
        fun update(
            runId: String,
            params: RunUpdateParams,
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(runId, params, RequestOptions.none())

        /** @see update */
        fun update(
            runId: String,
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see update */
        fun update(params: RunUpdateParams): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>>

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
        ): CompletableFuture<HttpResponseFor<RunCancelRunResponse>> =
            cancelRun(runId, params, RequestOptions.none())

        /** @see cancelRun */
        fun cancelRun(
            runId: String,
            params: RunCancelRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCancelRunResponse>> =
            cancelRun(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see cancelRun */
        fun cancelRun(
            params: RunCancelRunParams
        ): CompletableFuture<HttpResponseFor<RunCancelRunResponse>> =
            cancelRun(params, RequestOptions.none())

        /** @see cancelRun */
        fun cancelRun(
            params: RunCancelRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCancelRunResponse>>

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
        ): CompletableFuture<HttpResponseFor<RunPauseRunResponse>> =
            pauseRun(runId, params, RequestOptions.none())

        /** @see pauseRun */
        fun pauseRun(
            runId: String,
            params: RunPauseRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunPauseRunResponse>> =
            pauseRun(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see pauseRun */
        fun pauseRun(
            params: RunPauseRunParams
        ): CompletableFuture<HttpResponseFor<RunPauseRunResponse>> =
            pauseRun(params, RequestOptions.none())

        /** @see pauseRun */
        fun pauseRun(
            params: RunPauseRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunPauseRunResponse>>

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/resume`,
         * but is otherwise the same as [RunServiceAsync.resumeRun].
         */
        fun resumeRun(
            runId: String,
            params: RunResumeRunParams,
        ): CompletableFuture<HttpResponseFor<RunResumeRunResponse>> =
            resumeRun(runId, params, RequestOptions.none())

        /** @see resumeRun */
        fun resumeRun(
            runId: String,
            params: RunResumeRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunResumeRunResponse>> =
            resumeRun(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see resumeRun */
        fun resumeRun(
            params: RunResumeRunParams
        ): CompletableFuture<HttpResponseFor<RunResumeRunResponse>> =
            resumeRun(params, RequestOptions.none())

        /** @see resumeRun */
        fun resumeRun(
            params: RunResumeRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunResumeRunResponse>>
    }
}
