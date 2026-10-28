// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.tests.testframework.v1.V1RetrievePersonalitiesParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.V1RetrievePersonalitiesResponse
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.AiagentService
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.AiagentServiceImpl
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.MetricService
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.MetricServiceImpl
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.ResultService
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.ResultServiceImpl
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.ScenarioService
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.ScenarioServiceImpl
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val aiagents: AiagentService by lazy { AiagentServiceImpl(clientOptions) }

    private val metrics: MetricService by lazy { MetricServiceImpl(clientOptions) }

    private val results: ResultService by lazy { ResultServiceImpl(clientOptions) }

    private val scenarios: ScenarioService by lazy { ScenarioServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun aiagents(): AiagentService = aiagents

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun metrics(): MetricService = metrics

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun results(): ResultService = results

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun scenarios(): ScenarioService = scenarios

    override fun retrievePersonalities(
        params: V1RetrievePersonalitiesParams,
        requestOptions: RequestOptions,
    ): List<V1RetrievePersonalitiesResponse> =
        // get /ai/tests/test_framework/v1/personalities
        withRawResponse().retrievePersonalities(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val aiagents: AiagentService.WithRawResponse by lazy {
            AiagentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val metrics: MetricService.WithRawResponse by lazy {
            MetricServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val results: ResultService.WithRawResponse by lazy {
            ResultServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scenarios: ScenarioService.WithRawResponse by lazy {
            ScenarioServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun aiagents(): AiagentService.WithRawResponse = aiagents

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun metrics(): MetricService.WithRawResponse = metrics

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun results(): ResultService.WithRawResponse = results

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun scenarios(): ScenarioService.WithRawResponse = scenarios

        private val retrievePersonalitiesHandler: Handler<List<V1RetrievePersonalitiesResponse>> =
            jsonHandler<List<V1RetrievePersonalitiesResponse>>(clientOptions.jsonMapper)

        override fun retrievePersonalities(
            params: V1RetrievePersonalitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<V1RetrievePersonalitiesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tests", "test_framework", "v1", "personalities")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrievePersonalitiesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
