// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.ai.assistants.tests.AssistantTest
import com.telnyx.sdk.models.ai.assistants.tests.TestCreateParams
import com.telnyx.sdk.models.ai.assistants.tests.TestDeleteParams
import com.telnyx.sdk.models.ai.assistants.tests.TestListPageAsync
import com.telnyx.sdk.models.ai.assistants.tests.TestListPageResponse
import com.telnyx.sdk.models.ai.assistants.tests.TestListParams
import com.telnyx.sdk.models.ai.assistants.tests.TestRetrieveParams
import com.telnyx.sdk.models.ai.assistants.tests.TestUpdateParams
import com.telnyx.sdk.services.async.ai.assistants.tests.RunServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.tests.RunServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.assistants.tests.TestSuiteServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.tests.TestSuiteServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Configure AI assistant specifications */
class TestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TestServiceAsync {

    private val withRawResponse: TestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val testSuites: TestSuiteServiceAsync by lazy {
        TestSuiteServiceAsyncImpl(clientOptions)
    }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TestServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestServiceAsync =
        TestServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Configure AI assistant specifications */
    override fun testSuites(): TestSuiteServiceAsync = testSuites

    /** Configure AI assistant specifications */
    override fun runs(): RunServiceAsync = runs

    override fun create(
        params: TestCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantTest> =
        // post /ai/assistants/tests
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TestRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantTest> =
        // get /ai/assistants/tests/{test_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TestUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantTest> =
        // put /ai/assistants/tests/{test_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TestListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TestListPageAsync> =
        // get /ai/assistants/tests
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TestDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/assistants/tests/{test_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val testSuites: TestSuiteServiceAsync.WithRawResponse by lazy {
            TestSuiteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestServiceAsync.WithRawResponse =
            TestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Configure AI assistant specifications */
        override fun testSuites(): TestSuiteServiceAsync.WithRawResponse = testSuites

        /** Configure AI assistant specifications */
        override fun runs(): RunServiceAsync.WithRawResponse = runs

        private val createHandler: Handler<AssistantTest> =
            jsonHandler<AssistantTest>(clientOptions.jsonMapper)

        override fun create(
            params: TestCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantTest>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "tests")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
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

        private val retrieveHandler: Handler<AssistantTest> =
            jsonHandler<AssistantTest>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TestRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantTest>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("testId", params.testId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "tests", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
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

        private val updateHandler: Handler<AssistantTest> =
            jsonHandler<AssistantTest>(clientOptions.jsonMapper)

        override fun update(
            params: TestUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantTest>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("testId", params.testId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "tests", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
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

        private val listHandler: Handler<TestListPageResponse> =
            jsonHandler<TestListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TestListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "tests")
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
                            .let {
                                TestListPageAsync.builder()
                                    .service(TestServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TestDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("testId", params.testId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "tests", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
