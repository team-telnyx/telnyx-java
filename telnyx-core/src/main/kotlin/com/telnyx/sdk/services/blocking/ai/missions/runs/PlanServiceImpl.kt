// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions.runs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanAddStepsToPlanParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanCreateParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanGetStepDetailsParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanRetrieveParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanRetrieveResponse
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanStepResponse
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanStepsCreatedResponse
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanUpdateStepParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PlanServiceImpl internal constructor(private val clientOptions: ClientOptions) : PlanService {

    private val withRawResponse: PlanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlanService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService =
        PlanServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions,
    ): PlanStepsCreatedResponse =
        // post /ai/missions/{mission_id}/runs/{run_id}/plan
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions,
    ): PlanRetrieveResponse =
        // get /ai/missions/{mission_id}/runs/{run_id}/plan
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun addStepsToPlan(
        params: PlanAddStepsToPlanParams,
        requestOptions: RequestOptions,
    ): PlanStepsCreatedResponse =
        // post /ai/missions/{mission_id}/runs/{run_id}/plan/steps
        withRawResponse().addStepsToPlan(params, requestOptions).parse()

    override fun getStepDetails(
        params: PlanGetStepDetailsParams,
        requestOptions: RequestOptions,
    ): PlanStepResponse =
        // get /ai/missions/{mission_id}/runs/{run_id}/plan/steps/{step_id}
        withRawResponse().getStepDetails(params, requestOptions).parse()

    override fun updateStep(
        params: PlanUpdateStepParams,
        requestOptions: RequestOptions,
    ): PlanStepResponse =
        // patch /ai/missions/{mission_id}/runs/{run_id}/plan/steps/{step_id}
        withRawResponse().updateStep(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlanService.WithRawResponse =
            PlanServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PlanStepsCreatedResponse> =
            jsonHandler<PlanStepsCreatedResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanStepsCreatedResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "runs",
                        params._pathParam(1),
                        "plan",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<PlanRetrieveResponse> =
            jsonHandler<PlanRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "runs",
                        params._pathParam(1),
                        "plan",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val addStepsToPlanHandler: Handler<PlanStepsCreatedResponse> =
            jsonHandler<PlanStepsCreatedResponse>(clientOptions.jsonMapper)

        override fun addStepsToPlan(
            params: PlanAddStepsToPlanParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanStepsCreatedResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "runs",
                        params._pathParam(1),
                        "plan",
                        "steps",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addStepsToPlanHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getStepDetailsHandler: Handler<PlanStepResponse> =
            jsonHandler<PlanStepResponse>(clientOptions.jsonMapper)

        override fun getStepDetails(
            params: PlanGetStepDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanStepResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("stepId", params.stepId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "runs",
                        params._pathParam(1),
                        "plan",
                        "steps",
                        params._pathParam(2),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStepDetailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateStepHandler: Handler<PlanStepResponse> =
            jsonHandler<PlanStepResponse>(clientOptions.jsonMapper)

        override fun updateStep(
            params: PlanUpdateStepParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanStepResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("stepId", params.stepId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "runs",
                        params._pathParam(1),
                        "plan",
                        "steps",
                        params._pathParam(2),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateStepHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
