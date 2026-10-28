// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.testframework

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.composeCancellableAsync
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.tests.testframework.v1.V1RetrievePersonalitiesParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.V1RetrievePersonalitiesResponse
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.AiagentServiceAsync
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.AiagentServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.MetricServiceAsync
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.MetricServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.ResultServiceAsync
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.ResultServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.ScenarioServiceAsync
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.ScenarioServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val aiagents: AiagentServiceAsync by lazy { AiagentServiceAsyncImpl(clientOptions) }

    private val metrics: MetricServiceAsync by lazy { MetricServiceAsyncImpl(clientOptions) }

    private val results: ResultServiceAsync by lazy { ResultServiceAsyncImpl(clientOptions) }

    private val scenarios: ScenarioServiceAsync by lazy { ScenarioServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun aiagents(): AiagentServiceAsync = aiagents

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun metrics(): MetricServiceAsync = metrics

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun results(): ResultServiceAsync = results

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun scenarios(): ScenarioServiceAsync = scenarios

    override fun retrievePersonalities(
        params: V1RetrievePersonalitiesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<V1RetrievePersonalitiesResponse>> =
        // get /ai/tests/test_framework/v1/personalities
        withRawResponse().retrievePersonalities(params, requestOptions).mapCancellable {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val aiagents: AiagentServiceAsync.WithRawResponse by lazy {
            AiagentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val metrics: MetricServiceAsync.WithRawResponse by lazy {
            MetricServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val results: ResultServiceAsync.WithRawResponse by lazy {
            ResultServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scenarios: ScenarioServiceAsync.WithRawResponse by lazy {
            ScenarioServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun aiagents(): AiagentServiceAsync.WithRawResponse = aiagents

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun metrics(): MetricServiceAsync.WithRawResponse = metrics

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun results(): ResultServiceAsync.WithRawResponse = results

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun scenarios(): ScenarioServiceAsync.WithRawResponse = scenarios

        private val retrievePersonalitiesHandler: Handler<List<V1RetrievePersonalitiesResponse>> =
            jsonHandler<List<V1RetrievePersonalitiesResponse>>(clientOptions.jsonMapper)

        override fun retrievePersonalities(
            params: V1RetrievePersonalitiesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<V1RetrievePersonalitiesResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tests", "test_framework", "v1", "personalities")
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
}
