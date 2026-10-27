// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.testframework.v1

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
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
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.ScenarioGenerationResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.EvaluatorScenarioDetail
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioCreateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioDeleteParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioDeleteResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioGenerateBgParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioListParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioListResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveExportScenariosParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveGenerateProgressParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveGenerateProgressResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveScenarioAgentProgressParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveScenarioAgentProgressResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRunScenariosParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRunScenariosResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioScenarioAgentParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioScenarioAgentResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
class ScenarioServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScenarioServiceAsync {

    private val withRawResponse: ScenarioServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScenarioServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScenarioServiceAsync =
        ScenarioServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ScenarioCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EvaluatorScenarioDetail> =
        // post /ai/tests/test_framework/v1/scenarios
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieve(
        params: ScenarioRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EvaluatorScenarioDetail> =
        // get /ai/tests/test_framework/v1/scenarios/{id}
        withRawResponse().retrieve(params, requestOptions).mapCancellable { it.parse() }

    override fun update(
        params: ScenarioUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EvaluatorScenarioDetail> =
        // patch /ai/tests/test_framework/v1/scenarios/{id}
        withRawResponse().update(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: ScenarioListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScenarioListResponse> =
        // get /ai/tests/test_framework/v1/scenarios
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: ScenarioDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScenarioDeleteResponse> =
        // delete /ai/tests/test_framework/v1/scenarios/{id}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

    override fun generateBg(
        params: ScenarioGenerateBgParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScenarioGenerationResponse> =
        // post /ai/tests/test_framework/v1/scenarios/generate-bg
        withRawResponse().generateBg(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieveExportScenarios(
        params: ScenarioRetrieveExportScenariosParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /ai/tests/test_framework/v1/scenarios/export_scenarios
        withRawResponse().retrieveExportScenarios(params, requestOptions)

    override fun retrieveGenerateProgress(
        params: ScenarioRetrieveGenerateProgressParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScenarioRetrieveGenerateProgressResponse> =
        // get /ai/tests/test_framework/v1/scenarios/generate-progress
        withRawResponse().retrieveGenerateProgress(params, requestOptions).mapCancellable {
            it.parse()
        }

    override fun retrieveScenarioAgentProgress(
        params: ScenarioRetrieveScenarioAgentProgressParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScenarioRetrieveScenarioAgentProgressResponse> =
        // get /ai/tests/test_framework/v1/scenarios/scenario-agent-progress
        withRawResponse().retrieveScenarioAgentProgress(params, requestOptions).mapCancellable {
            it.parse()
        }

    override fun runScenarios(
        params: ScenarioRunScenariosParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScenarioRunScenariosResponse> =
        // post /ai/tests/test_framework/v1/scenarios/run_scenarios
        withRawResponse().runScenarios(params, requestOptions).mapCancellable { it.parse() }

    override fun scenarioAgent(
        params: ScenarioScenarioAgentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScenarioScenarioAgentResponse> =
        // post /ai/tests/test_framework/v1/scenarios/scenario-agent
        withRawResponse().scenarioAgent(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScenarioServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScenarioServiceAsync.WithRawResponse =
            ScenarioServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EvaluatorScenarioDetail> =
            jsonHandler<EvaluatorScenarioDetail>(clientOptions.jsonMapper)

        override fun create(
            params: ScenarioCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tests", "test_framework", "v1", "scenarios")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<EvaluatorScenarioDetail> =
            jsonHandler<EvaluatorScenarioDetail>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ScenarioRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "scenarios",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<EvaluatorScenarioDetail> =
            jsonHandler<EvaluatorScenarioDetail>(clientOptions.jsonMapper)

        override fun update(
            params: ScenarioUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "scenarios",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<ScenarioListResponse> =
            jsonHandler<ScenarioListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ScenarioListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScenarioListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tests", "test_framework", "v1", "scenarios")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ScenarioDeleteResponse> =
            jsonHandler<ScenarioDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ScenarioDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScenarioDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "scenarios",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val generateBgHandler: Handler<ScenarioGenerationResponse> =
            jsonHandler<ScenarioGenerationResponse>(clientOptions.jsonMapper)

        override fun generateBg(
            params: ScenarioGenerateBgParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScenarioGenerationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "scenarios",
                        "generate-bg",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { generateBgHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        override fun retrieveExportScenarios(
            params: ScenarioRetrieveExportScenariosParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "scenarios",
                        "export_scenarios",
                    )
                    .putHeader(
                        "Accept",
                        "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response -> errorHandler.handle(response) }
        }

        private val retrieveGenerateProgressHandler:
            Handler<ScenarioRetrieveGenerateProgressResponse> =
            jsonHandler<ScenarioRetrieveGenerateProgressResponse>(clientOptions.jsonMapper)

        override fun retrieveGenerateProgress(
            params: ScenarioRetrieveGenerateProgressParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScenarioRetrieveGenerateProgressResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "scenarios",
                        "generate-progress",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveGenerateProgressHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveScenarioAgentProgressHandler:
            Handler<ScenarioRetrieveScenarioAgentProgressResponse> =
            jsonHandler<ScenarioRetrieveScenarioAgentProgressResponse>(clientOptions.jsonMapper)

        override fun retrieveScenarioAgentProgress(
            params: ScenarioRetrieveScenarioAgentProgressParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScenarioRetrieveScenarioAgentProgressResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "scenarios",
                        "scenario-agent-progress",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveScenarioAgentProgressHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val runScenariosHandler: Handler<ScenarioRunScenariosResponse> =
            jsonHandler<ScenarioRunScenariosResponse>(clientOptions.jsonMapper)

        override fun runScenarios(
            params: ScenarioRunScenariosParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScenarioRunScenariosResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "scenarios",
                        "run_scenarios",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { runScenariosHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val scenarioAgentHandler: Handler<ScenarioScenarioAgentResponse> =
            jsonHandler<ScenarioScenarioAgentResponse>(clientOptions.jsonMapper)

        override fun scenarioAgent(
            params: ScenarioScenarioAgentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScenarioScenarioAgentResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "scenarios",
                        "scenario-agent",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { scenarioAgentHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
