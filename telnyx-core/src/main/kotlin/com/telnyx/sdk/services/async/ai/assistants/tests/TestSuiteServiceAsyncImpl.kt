// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants.tests

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.TestSuiteListParams
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.TestSuiteListResponse
import com.telnyx.sdk.services.async.ai.assistants.tests.testsuites.RunServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.tests.testsuites.RunServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Configure AI assistant specifications */
class TestSuiteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TestSuiteServiceAsync {

    private val withRawResponse: TestSuiteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TestSuiteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestSuiteServiceAsync =
        TestSuiteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Configure AI assistant specifications */
    override fun runs(): RunServiceAsync = runs

    override fun list(
        params: TestSuiteListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TestSuiteListResponse> =
        // get /ai/assistants/tests/test-suites
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestSuiteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestSuiteServiceAsync.WithRawResponse =
            TestSuiteServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Configure AI assistant specifications */
        override fun runs(): RunServiceAsync.WithRawResponse = runs

        private val listHandler: Handler<TestSuiteListResponse> =
            jsonHandler<TestSuiteListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TestSuiteListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestSuiteListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "tests", "test-suites")
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
    }
}
