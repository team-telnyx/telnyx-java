// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions.runs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanAddStepsToPlanParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanAddStepsToPlanResponse
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanCreateParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanCreateResponse
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanGetStepDetailsParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanGetStepDetailsResponse
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanRetrieveParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanRetrieveResponse
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanUpdateStepParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanUpdateStepResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanServiceAsync

    /** Create the initial plan for a run */
    fun create(runId: String, params: PlanCreateParams): CompletableFuture<PlanCreateResponse> =
        create(runId, params, RequestOptions.none())

    /** @see create */
    fun create(
        runId: String,
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanCreateResponse> =
        create(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see create */
    fun create(params: PlanCreateParams): CompletableFuture<PlanCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanCreateResponse>

    /** Get the plan (all steps) for a run */
    fun retrieve(
        runId: String,
        params: PlanRetrieveParams,
    ): CompletableFuture<PlanRetrieveResponse> = retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanRetrieveResponse> =
        retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: PlanRetrieveParams): CompletableFuture<PlanRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanRetrieveResponse>

    /** Add one or more steps to an existing plan */
    fun addStepsToPlan(
        runId: String,
        params: PlanAddStepsToPlanParams,
    ): CompletableFuture<PlanAddStepsToPlanResponse> =
        addStepsToPlan(runId, params, RequestOptions.none())

    /** @see addStepsToPlan */
    fun addStepsToPlan(
        runId: String,
        params: PlanAddStepsToPlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanAddStepsToPlanResponse> =
        addStepsToPlan(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see addStepsToPlan */
    fun addStepsToPlan(
        params: PlanAddStepsToPlanParams
    ): CompletableFuture<PlanAddStepsToPlanResponse> = addStepsToPlan(params, RequestOptions.none())

    /** @see addStepsToPlan */
    fun addStepsToPlan(
        params: PlanAddStepsToPlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanAddStepsToPlanResponse>

    /** Get details of a specific plan step */
    fun getStepDetails(
        stepId: String,
        params: PlanGetStepDetailsParams,
    ): CompletableFuture<PlanGetStepDetailsResponse> =
        getStepDetails(stepId, params, RequestOptions.none())

    /** @see getStepDetails */
    fun getStepDetails(
        stepId: String,
        params: PlanGetStepDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGetStepDetailsResponse> =
        getStepDetails(params.toBuilder().stepId(stepId).build(), requestOptions)

    /** @see getStepDetails */
    fun getStepDetails(
        params: PlanGetStepDetailsParams
    ): CompletableFuture<PlanGetStepDetailsResponse> = getStepDetails(params, RequestOptions.none())

    /** @see getStepDetails */
    fun getStepDetails(
        params: PlanGetStepDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGetStepDetailsResponse>

    /** Update the status of a plan step */
    fun updateStep(
        stepId: String,
        params: PlanUpdateStepParams,
    ): CompletableFuture<PlanUpdateStepResponse> = updateStep(stepId, params, RequestOptions.none())

    /** @see updateStep */
    fun updateStep(
        stepId: String,
        params: PlanUpdateStepParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanUpdateStepResponse> =
        updateStep(params.toBuilder().stepId(stepId).build(), requestOptions)

    /** @see updateStep */
    fun updateStep(params: PlanUpdateStepParams): CompletableFuture<PlanUpdateStepResponse> =
        updateStep(params, RequestOptions.none())

    /** @see updateStep */
    fun updateStep(
        params: PlanUpdateStepParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanUpdateStepResponse>

    /** A view of [PlanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/plan`, but
         * is otherwise the same as [PlanServiceAsync.create].
         */
        fun create(
            runId: String,
            params: PlanCreateParams,
        ): CompletableFuture<HttpResponseFor<PlanCreateResponse>> =
            create(runId, params, RequestOptions.none())

        /** @see create */
        fun create(
            runId: String,
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanCreateResponse>> =
            create(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see create */
        fun create(
            params: PlanCreateParams
        ): CompletableFuture<HttpResponseFor<PlanCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/runs/{run_id}/plan`, but
         * is otherwise the same as [PlanServiceAsync.retrieve].
         */
        fun retrieve(
            runId: String,
            params: PlanRetrieveParams,
        ): CompletableFuture<HttpResponseFor<PlanRetrieveResponse>> =
            retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            runId: String,
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanRetrieveResponse>> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: PlanRetrieveParams
        ): CompletableFuture<HttpResponseFor<PlanRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /ai/missions/{mission_id}/runs/{run_id}/plan/steps`, but is otherwise the same as
         * [PlanServiceAsync.addStepsToPlan].
         */
        fun addStepsToPlan(
            runId: String,
            params: PlanAddStepsToPlanParams,
        ): CompletableFuture<HttpResponseFor<PlanAddStepsToPlanResponse>> =
            addStepsToPlan(runId, params, RequestOptions.none())

        /** @see addStepsToPlan */
        fun addStepsToPlan(
            runId: String,
            params: PlanAddStepsToPlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanAddStepsToPlanResponse>> =
            addStepsToPlan(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see addStepsToPlan */
        fun addStepsToPlan(
            params: PlanAddStepsToPlanParams
        ): CompletableFuture<HttpResponseFor<PlanAddStepsToPlanResponse>> =
            addStepsToPlan(params, RequestOptions.none())

        /** @see addStepsToPlan */
        fun addStepsToPlan(
            params: PlanAddStepsToPlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanAddStepsToPlanResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /ai/missions/{mission_id}/runs/{run_id}/plan/steps/{step_id}`, but is otherwise the same
         * as [PlanServiceAsync.getStepDetails].
         */
        fun getStepDetails(
            stepId: String,
            params: PlanGetStepDetailsParams,
        ): CompletableFuture<HttpResponseFor<PlanGetStepDetailsResponse>> =
            getStepDetails(stepId, params, RequestOptions.none())

        /** @see getStepDetails */
        fun getStepDetails(
            stepId: String,
            params: PlanGetStepDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGetStepDetailsResponse>> =
            getStepDetails(params.toBuilder().stepId(stepId).build(), requestOptions)

        /** @see getStepDetails */
        fun getStepDetails(
            params: PlanGetStepDetailsParams
        ): CompletableFuture<HttpResponseFor<PlanGetStepDetailsResponse>> =
            getStepDetails(params, RequestOptions.none())

        /** @see getStepDetails */
        fun getStepDetails(
            params: PlanGetStepDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGetStepDetailsResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /ai/missions/{mission_id}/runs/{run_id}/plan/steps/{step_id}`, but is otherwise the same
         * as [PlanServiceAsync.updateStep].
         */
        fun updateStep(
            stepId: String,
            params: PlanUpdateStepParams,
        ): CompletableFuture<HttpResponseFor<PlanUpdateStepResponse>> =
            updateStep(stepId, params, RequestOptions.none())

        /** @see updateStep */
        fun updateStep(
            stepId: String,
            params: PlanUpdateStepParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanUpdateStepResponse>> =
            updateStep(params.toBuilder().stepId(stepId).build(), requestOptions)

        /** @see updateStep */
        fun updateStep(
            params: PlanUpdateStepParams
        ): CompletableFuture<HttpResponseFor<PlanUpdateStepResponse>> =
            updateStep(params, RequestOptions.none())

        /** @see updateStep */
        fun updateStep(
            params: PlanUpdateStepParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanUpdateStepResponse>>
    }
}
