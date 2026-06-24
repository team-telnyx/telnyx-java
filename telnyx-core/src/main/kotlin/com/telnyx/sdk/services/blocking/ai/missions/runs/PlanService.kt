// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions.runs

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanAddStepsToPlanParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanCreateParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanGetStepDetailsParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanRetrieveParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanRetrieveResponse
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanStepResponse
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanStepsCreatedResponse
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanUpdateStepParams
import java.util.function.Consumer

interface PlanService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService

    /** Create the initial plan for a run */
    fun create(runId: String, params: PlanCreateParams): PlanStepsCreatedResponse =
        create(runId, params, RequestOptions.none())

    /** @see create */
    fun create(
        runId: String,
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanStepsCreatedResponse = create(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see create */
    fun create(params: PlanCreateParams): PlanStepsCreatedResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanStepsCreatedResponse

    /** Get the plan (all steps) for a run */
    fun retrieve(runId: String, params: PlanRetrieveParams): PlanRetrieveResponse =
        retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanRetrieveResponse = retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: PlanRetrieveParams): PlanRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanRetrieveResponse

    /** Add one or more steps to an existing plan */
    fun addStepsToPlan(runId: String, params: PlanAddStepsToPlanParams): PlanStepsCreatedResponse =
        addStepsToPlan(runId, params, RequestOptions.none())

    /** @see addStepsToPlan */
    fun addStepsToPlan(
        runId: String,
        params: PlanAddStepsToPlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanStepsCreatedResponse =
        addStepsToPlan(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see addStepsToPlan */
    fun addStepsToPlan(params: PlanAddStepsToPlanParams): PlanStepsCreatedResponse =
        addStepsToPlan(params, RequestOptions.none())

    /** @see addStepsToPlan */
    fun addStepsToPlan(
        params: PlanAddStepsToPlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanStepsCreatedResponse

    /** Get details of a specific plan step */
    fun getStepDetails(stepId: String, params: PlanGetStepDetailsParams): PlanStepResponse =
        getStepDetails(stepId, params, RequestOptions.none())

    /** @see getStepDetails */
    fun getStepDetails(
        stepId: String,
        params: PlanGetStepDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanStepResponse = getStepDetails(params.toBuilder().stepId(stepId).build(), requestOptions)

    /** @see getStepDetails */
    fun getStepDetails(params: PlanGetStepDetailsParams): PlanStepResponse =
        getStepDetails(params, RequestOptions.none())

    /** @see getStepDetails */
    fun getStepDetails(
        params: PlanGetStepDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanStepResponse

    /** Update the status of a plan step */
    fun updateStep(stepId: String, params: PlanUpdateStepParams): PlanStepResponse =
        updateStep(stepId, params, RequestOptions.none())

    /** @see updateStep */
    fun updateStep(
        stepId: String,
        params: PlanUpdateStepParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanStepResponse = updateStep(params.toBuilder().stepId(stepId).build(), requestOptions)

    /** @see updateStep */
    fun updateStep(params: PlanUpdateStepParams): PlanStepResponse =
        updateStep(params, RequestOptions.none())

    /** @see updateStep */
    fun updateStep(
        params: PlanUpdateStepParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanStepResponse

    /** A view of [PlanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/plan`, but
         * is otherwise the same as [PlanService.create].
         */
        @MustBeClosed
        fun create(
            runId: String,
            params: PlanCreateParams,
        ): HttpResponseFor<PlanStepsCreatedResponse> = create(runId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            runId: String,
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanStepsCreatedResponse> =
            create(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: PlanCreateParams): HttpResponseFor<PlanStepsCreatedResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanStepsCreatedResponse>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/runs/{run_id}/plan`, but
         * is otherwise the same as [PlanService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: PlanRetrieveParams,
        ): HttpResponseFor<PlanRetrieveResponse> = retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanRetrieveResponse> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PlanRetrieveParams): HttpResponseFor<PlanRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post
         * /ai/missions/{mission_id}/runs/{run_id}/plan/steps`, but is otherwise the same as
         * [PlanService.addStepsToPlan].
         */
        @MustBeClosed
        fun addStepsToPlan(
            runId: String,
            params: PlanAddStepsToPlanParams,
        ): HttpResponseFor<PlanStepsCreatedResponse> =
            addStepsToPlan(runId, params, RequestOptions.none())

        /** @see addStepsToPlan */
        @MustBeClosed
        fun addStepsToPlan(
            runId: String,
            params: PlanAddStepsToPlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanStepsCreatedResponse> =
            addStepsToPlan(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see addStepsToPlan */
        @MustBeClosed
        fun addStepsToPlan(
            params: PlanAddStepsToPlanParams
        ): HttpResponseFor<PlanStepsCreatedResponse> = addStepsToPlan(params, RequestOptions.none())

        /** @see addStepsToPlan */
        @MustBeClosed
        fun addStepsToPlan(
            params: PlanAddStepsToPlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanStepsCreatedResponse>

        /**
         * Returns a raw HTTP response for `get
         * /ai/missions/{mission_id}/runs/{run_id}/plan/steps/{step_id}`, but is otherwise the same
         * as [PlanService.getStepDetails].
         */
        @MustBeClosed
        fun getStepDetails(
            stepId: String,
            params: PlanGetStepDetailsParams,
        ): HttpResponseFor<PlanStepResponse> = getStepDetails(stepId, params, RequestOptions.none())

        /** @see getStepDetails */
        @MustBeClosed
        fun getStepDetails(
            stepId: String,
            params: PlanGetStepDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanStepResponse> =
            getStepDetails(params.toBuilder().stepId(stepId).build(), requestOptions)

        /** @see getStepDetails */
        @MustBeClosed
        fun getStepDetails(params: PlanGetStepDetailsParams): HttpResponseFor<PlanStepResponse> =
            getStepDetails(params, RequestOptions.none())

        /** @see getStepDetails */
        @MustBeClosed
        fun getStepDetails(
            params: PlanGetStepDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanStepResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /ai/missions/{mission_id}/runs/{run_id}/plan/steps/{step_id}`, but is otherwise the same
         * as [PlanService.updateStep].
         */
        @MustBeClosed
        fun updateStep(
            stepId: String,
            params: PlanUpdateStepParams,
        ): HttpResponseFor<PlanStepResponse> = updateStep(stepId, params, RequestOptions.none())

        /** @see updateStep */
        @MustBeClosed
        fun updateStep(
            stepId: String,
            params: PlanUpdateStepParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanStepResponse> =
            updateStep(params.toBuilder().stepId(stepId).build(), requestOptions)

        /** @see updateStep */
        @MustBeClosed
        fun updateStep(params: PlanUpdateStepParams): HttpResponseFor<PlanStepResponse> =
            updateStep(params, RequestOptions.none())

        /** @see updateStep */
        @MustBeClosed
        fun updateStep(
            params: PlanUpdateStepParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanStepResponse>
    }
}
