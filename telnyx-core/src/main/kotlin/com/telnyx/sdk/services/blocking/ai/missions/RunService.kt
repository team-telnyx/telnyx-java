// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.runs.MissionRunResponse
import com.telnyx.sdk.models.ai.missions.runs.RunCancelRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunCreateParams
import com.telnyx.sdk.models.ai.missions.runs.RunListPage
import com.telnyx.sdk.models.ai.missions.runs.RunListParams
import com.telnyx.sdk.models.ai.missions.runs.RunListRunsPage
import com.telnyx.sdk.models.ai.missions.runs.RunListRunsParams
import com.telnyx.sdk.models.ai.missions.runs.RunPauseRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunResumeRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunRetrieveParams
import com.telnyx.sdk.models.ai.missions.runs.RunUpdateParams
import com.telnyx.sdk.services.blocking.ai.missions.runs.EventService
import com.telnyx.sdk.services.blocking.ai.missions.runs.PlanService
import com.telnyx.sdk.services.blocking.ai.missions.runs.TelnyxAgentService
import java.util.function.Consumer

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    fun events(): EventService

    fun plan(): PlanService

    fun telnyxAgents(): TelnyxAgentService

    /** Start a new run for a mission */
    fun create(missionId: String): MissionRunResponse = create(missionId, RunCreateParams.none())

    /** @see create */
    fun create(
        missionId: String,
        params: RunCreateParams = RunCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse = create(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see create */
    fun create(
        missionId: String,
        params: RunCreateParams = RunCreateParams.none(),
    ): MissionRunResponse = create(missionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse

    /** @see create */
    fun create(params: RunCreateParams): MissionRunResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(missionId: String, requestOptions: RequestOptions): MissionRunResponse =
        create(missionId, RunCreateParams.none(), requestOptions)

    /** Get details of a specific run */
    fun retrieve(runId: String, params: RunRetrieveParams): MissionRunResponse =
        retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse = retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): MissionRunResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse

    /** Update run status and/or result */
    fun update(runId: String, params: RunUpdateParams): MissionRunResponse =
        update(runId, params, RequestOptions.none())

    /** @see update */
    fun update(
        runId: String,
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse = update(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see update */
    fun update(params: RunUpdateParams): MissionRunResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse

    /** List all runs for a specific mission */
    fun list(missionId: String): RunListPage = list(missionId, RunListParams.none())

    /** @see list */
    fun list(
        missionId: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunListPage = list(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see list */
    fun list(missionId: String, params: RunListParams = RunListParams.none()): RunListPage =
        list(missionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunListPage

    /** @see list */
    fun list(params: RunListParams): RunListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(missionId: String, requestOptions: RequestOptions): RunListPage =
        list(missionId, RunListParams.none(), requestOptions)

    /** Cancel a running or paused run */
    fun cancelRun(runId: String, params: RunCancelRunParams): MissionRunResponse =
        cancelRun(runId, params, RequestOptions.none())

    /** @see cancelRun */
    fun cancelRun(
        runId: String,
        params: RunCancelRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse = cancelRun(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see cancelRun */
    fun cancelRun(params: RunCancelRunParams): MissionRunResponse =
        cancelRun(params, RequestOptions.none())

    /** @see cancelRun */
    fun cancelRun(
        params: RunCancelRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse

    /** List recent runs across all missions */
    fun listRuns(): RunListRunsPage = listRuns(RunListRunsParams.none())

    /** @see listRuns */
    fun listRuns(
        params: RunListRunsParams = RunListRunsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunListRunsPage

    /** @see listRuns */
    fun listRuns(params: RunListRunsParams = RunListRunsParams.none()): RunListRunsPage =
        listRuns(params, RequestOptions.none())

    /** @see listRuns */
    fun listRuns(requestOptions: RequestOptions): RunListRunsPage =
        listRuns(RunListRunsParams.none(), requestOptions)

    /** Pause a running run */
    fun pauseRun(runId: String, params: RunPauseRunParams): MissionRunResponse =
        pauseRun(runId, params, RequestOptions.none())

    /** @see pauseRun */
    fun pauseRun(
        runId: String,
        params: RunPauseRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse = pauseRun(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see pauseRun */
    fun pauseRun(params: RunPauseRunParams): MissionRunResponse =
        pauseRun(params, RequestOptions.none())

    /** @see pauseRun */
    fun pauseRun(
        params: RunPauseRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse

    /** Resume a paused run */
    fun resumeRun(runId: String, params: RunResumeRunParams): MissionRunResponse =
        resumeRun(runId, params, RequestOptions.none())

    /** @see resumeRun */
    fun resumeRun(
        runId: String,
        params: RunResumeRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse = resumeRun(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see resumeRun */
    fun resumeRun(params: RunResumeRunParams): MissionRunResponse =
        resumeRun(params, RequestOptions.none())

    /** @see resumeRun */
    fun resumeRun(
        params: RunResumeRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRunResponse

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun plan(): PlanService.WithRawResponse

        fun telnyxAgents(): TelnyxAgentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs`, but is otherwise
         * the same as [RunService.create].
         */
        @MustBeClosed
        fun create(missionId: String): HttpResponseFor<MissionRunResponse> =
            create(missionId, RunCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            missionId: String,
            params: RunCreateParams = RunCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse> =
            create(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            missionId: String,
            params: RunCreateParams = RunCreateParams.none(),
        ): HttpResponseFor<MissionRunResponse> = create(missionId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: RunCreateParams): HttpResponseFor<MissionRunResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            missionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MissionRunResponse> =
            create(missionId, RunCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/runs/{run_id}`, but is
         * otherwise the same as [RunService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
        ): HttpResponseFor<MissionRunResponse> = retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RunRetrieveParams): HttpResponseFor<MissionRunResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse>

        /**
         * Returns a raw HTTP response for `patch /ai/missions/{mission_id}/runs/{run_id}`, but is
         * otherwise the same as [RunService.update].
         */
        @MustBeClosed
        fun update(runId: String, params: RunUpdateParams): HttpResponseFor<MissionRunResponse> =
            update(runId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            runId: String,
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse> =
            update(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RunUpdateParams): HttpResponseFor<MissionRunResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/runs`, but is otherwise
         * the same as [RunService.list].
         */
        @MustBeClosed
        fun list(missionId: String): HttpResponseFor<RunListPage> =
            list(missionId, RunListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            missionId: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunListPage> =
            list(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            missionId: String,
            params: RunListParams = RunListParams.none(),
        ): HttpResponseFor<RunListPage> = list(missionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: RunListParams): HttpResponseFor<RunListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(missionId: String, requestOptions: RequestOptions): HttpResponseFor<RunListPage> =
            list(missionId, RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/cancel`,
         * but is otherwise the same as [RunService.cancelRun].
         */
        @MustBeClosed
        fun cancelRun(
            runId: String,
            params: RunCancelRunParams,
        ): HttpResponseFor<MissionRunResponse> = cancelRun(runId, params, RequestOptions.none())

        /** @see cancelRun */
        @MustBeClosed
        fun cancelRun(
            runId: String,
            params: RunCancelRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse> =
            cancelRun(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see cancelRun */
        @MustBeClosed
        fun cancelRun(params: RunCancelRunParams): HttpResponseFor<MissionRunResponse> =
            cancelRun(params, RequestOptions.none())

        /** @see cancelRun */
        @MustBeClosed
        fun cancelRun(
            params: RunCancelRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse>

        /**
         * Returns a raw HTTP response for `get /ai/missions/runs`, but is otherwise the same as
         * [RunService.listRuns].
         */
        @MustBeClosed
        fun listRuns(): HttpResponseFor<RunListRunsPage> = listRuns(RunListRunsParams.none())

        /** @see listRuns */
        @MustBeClosed
        fun listRuns(
            params: RunListRunsParams = RunListRunsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunListRunsPage>

        /** @see listRuns */
        @MustBeClosed
        fun listRuns(
            params: RunListRunsParams = RunListRunsParams.none()
        ): HttpResponseFor<RunListRunsPage> = listRuns(params, RequestOptions.none())

        /** @see listRuns */
        @MustBeClosed
        fun listRuns(requestOptions: RequestOptions): HttpResponseFor<RunListRunsPage> =
            listRuns(RunListRunsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/pause`, but
         * is otherwise the same as [RunService.pauseRun].
         */
        @MustBeClosed
        fun pauseRun(
            runId: String,
            params: RunPauseRunParams,
        ): HttpResponseFor<MissionRunResponse> = pauseRun(runId, params, RequestOptions.none())

        /** @see pauseRun */
        @MustBeClosed
        fun pauseRun(
            runId: String,
            params: RunPauseRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse> =
            pauseRun(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see pauseRun */
        @MustBeClosed
        fun pauseRun(params: RunPauseRunParams): HttpResponseFor<MissionRunResponse> =
            pauseRun(params, RequestOptions.none())

        /** @see pauseRun */
        @MustBeClosed
        fun pauseRun(
            params: RunPauseRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse>

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/resume`,
         * but is otherwise the same as [RunService.resumeRun].
         */
        @MustBeClosed
        fun resumeRun(
            runId: String,
            params: RunResumeRunParams,
        ): HttpResponseFor<MissionRunResponse> = resumeRun(runId, params, RequestOptions.none())

        /** @see resumeRun */
        @MustBeClosed
        fun resumeRun(
            runId: String,
            params: RunResumeRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse> =
            resumeRun(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see resumeRun */
        @MustBeClosed
        fun resumeRun(params: RunResumeRunParams): HttpResponseFor<MissionRunResponse> =
            resumeRun(params, RequestOptions.none())

        /** @see resumeRun */
        @MustBeClosed
        fun resumeRun(
            params: RunResumeRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRunResponse>
    }
}
