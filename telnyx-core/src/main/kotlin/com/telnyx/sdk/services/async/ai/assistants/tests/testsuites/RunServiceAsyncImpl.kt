// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants.tests.testsuites

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.assistants.tests.runs.TestRunResponse
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.PaginatedTestRunList
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.RunListParams
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.RunTriggerParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RunServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RunServiceAsync {

    private val withRawResponse: RunServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RunServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync =
        RunServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: RunListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaginatedTestRunList> =
        // get /ai/assistants/tests/test-suites/{suite_name}/runs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun trigger(
        params: RunTriggerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TestRunResponse>> =
        // post /ai/assistants/tests/test-suites/{suite_name}/runs
        withRawResponse().trigger(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunServiceAsync.WithRawResponse =
            RunServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PaginatedTestRunList> =
            jsonHandler<PaginatedTestRunList>(clientOptions.jsonMapper)

        override fun list(
            params: RunListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaginatedTestRunList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("suiteName", params.suiteName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "assistants",
                        "tests",
                        "test-suites",
                        params._pathParam(0),
                        "runs",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
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

        private val triggerHandler: Handler<List<TestRunResponse>> =
            jsonHandler<List<TestRunResponse>>(clientOptions.jsonMapper)

        override fun trigger(
            params: RunTriggerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TestRunResponse>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("suiteName", params.suiteName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "assistants",
                        "tests",
                        "test-suites",
                        params._pathParam(0),
                        "runs",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { triggerHandler.handle(it) }
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
