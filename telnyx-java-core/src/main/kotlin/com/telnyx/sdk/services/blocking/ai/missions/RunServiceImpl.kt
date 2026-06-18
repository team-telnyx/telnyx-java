// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions

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
import com.telnyx.sdk.models.ai.missions.runs.RunCancelRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunCancelRunResponse
import com.telnyx.sdk.models.ai.missions.runs.RunCreateParams
import com.telnyx.sdk.models.ai.missions.runs.RunCreateResponse
import com.telnyx.sdk.models.ai.missions.runs.RunListPage
import com.telnyx.sdk.models.ai.missions.runs.RunListPageResponse
import com.telnyx.sdk.models.ai.missions.runs.RunListParams
import com.telnyx.sdk.models.ai.missions.runs.RunListRunsPage
import com.telnyx.sdk.models.ai.missions.runs.RunListRunsPageResponse
import com.telnyx.sdk.models.ai.missions.runs.RunListRunsParams
import com.telnyx.sdk.models.ai.missions.runs.RunPauseRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunPauseRunResponse
import com.telnyx.sdk.models.ai.missions.runs.RunResumeRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunResumeRunResponse
import com.telnyx.sdk.models.ai.missions.runs.RunRetrieveParams
import com.telnyx.sdk.models.ai.missions.runs.RunRetrieveResponse
import com.telnyx.sdk.models.ai.missions.runs.RunUpdateParams
import com.telnyx.sdk.models.ai.missions.runs.RunUpdateResponse
import com.telnyx.sdk.services.blocking.ai.missions.runs.EventService
import com.telnyx.sdk.services.blocking.ai.missions.runs.EventServiceImpl
import com.telnyx.sdk.services.blocking.ai.missions.runs.PlanService
import com.telnyx.sdk.services.blocking.ai.missions.runs.PlanServiceImpl
import com.telnyx.sdk.services.blocking.ai.missions.runs.TelnyxAgentService
import com.telnyx.sdk.services.blocking.ai.missions.runs.TelnyxAgentServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RunServiceImpl internal constructor(private val clientOptions: ClientOptions) : RunService {

    private val withRawResponse: RunService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val plan: PlanService by lazy { PlanServiceImpl(clientOptions) }

    private val telnyxAgents: TelnyxAgentService by lazy { TelnyxAgentServiceImpl(clientOptions) }

    override fun withRawResponse(): RunService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService =
        RunServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(): EventService = events

    override fun plan(): PlanService = plan

    override fun telnyxAgents(): TelnyxAgentService = telnyxAgents

    override fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions,
    ): RunCreateResponse =
        // post /ai/missions/{mission_id}/runs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions,
    ): RunRetrieveResponse =
        // get /ai/missions/{mission_id}/runs/{run_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions,
    ): RunUpdateResponse =
        // patch /ai/missions/{mission_id}/runs/{run_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: RunListParams, requestOptions: RequestOptions): RunListPage =
        // get /ai/missions/{mission_id}/runs
        withRawResponse().list(params, requestOptions).parse()

    override fun cancelRun(
        params: RunCancelRunParams,
        requestOptions: RequestOptions,
    ): RunCancelRunResponse =
        // post /ai/missions/{mission_id}/runs/{run_id}/cancel
        withRawResponse().cancelRun(params, requestOptions).parse()

    override fun listRuns(
        params: RunListRunsParams,
        requestOptions: RequestOptions,
    ): RunListRunsPage =
        // get /ai/missions/runs
        withRawResponse().listRuns(params, requestOptions).parse()

    override fun pauseRun(
        params: RunPauseRunParams,
        requestOptions: RequestOptions,
    ): RunPauseRunResponse =
        // post /ai/missions/{mission_id}/runs/{run_id}/pause
        withRawResponse().pauseRun(params, requestOptions).parse()

    override fun resumeRun(
        params: RunResumeRunParams,
        requestOptions: RequestOptions,
    ): RunResumeRunResponse =
        // post /ai/missions/{mission_id}/runs/{run_id}/resume
        withRawResponse().resumeRun(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val plan: PlanService.WithRawResponse by lazy {
            PlanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val telnyxAgents: TelnyxAgentService.WithRawResponse by lazy {
            TelnyxAgentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunService.WithRawResponse =
            RunServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun events(): EventService.WithRawResponse = events

        override fun plan(): PlanService.WithRawResponse = plan

        override fun telnyxAgents(): TelnyxAgentService.WithRawResponse = telnyxAgents

        private val createHandler: Handler<RunCreateResponse> =
            jsonHandler<RunCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0), "runs")
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

        private val retrieveHandler: Handler<RunRetrieveResponse> =
            jsonHandler<RunRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunRetrieveResponse> {
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

        private val updateHandler: Handler<RunUpdateResponse> =
            jsonHandler<RunUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
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
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<RunListPageResponse> =
            jsonHandler<RunListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RunListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0), "runs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        RunListPage.builder()
                            .service(RunServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelRunHandler: Handler<RunCancelRunResponse> =
            jsonHandler<RunCancelRunResponse>(clientOptions.jsonMapper)

        override fun cancelRun(
            params: RunCancelRunParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunCancelRunResponse> {
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
                        "cancel",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelRunHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRunsHandler: Handler<RunListRunsPageResponse> =
            jsonHandler<RunListRunsPageResponse>(clientOptions.jsonMapper)

        override fun listRuns(
            params: RunListRunsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunListRunsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", "runs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRunsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        RunListRunsPage.builder()
                            .service(RunServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val pauseRunHandler: Handler<RunPauseRunResponse> =
            jsonHandler<RunPauseRunResponse>(clientOptions.jsonMapper)

        override fun pauseRun(
            params: RunPauseRunParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunPauseRunResponse> {
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
                        "pause",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { pauseRunHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val resumeRunHandler: Handler<RunResumeRunResponse> =
            jsonHandler<RunResumeRunResponse>(clientOptions.jsonMapper)

        override fun resumeRun(
            params: RunResumeRunParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunResumeRunResponse> {
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
                        "resume",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { resumeRunHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
