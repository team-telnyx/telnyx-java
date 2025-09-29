// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

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
import com.telnyx.sdk.models.ai.assistants.tests.AssistantTest
import com.telnyx.sdk.models.ai.assistants.tests.TestCreateParams
import com.telnyx.sdk.models.ai.assistants.tests.TestDeleteParams
import com.telnyx.sdk.models.ai.assistants.tests.TestDeleteResponse
import com.telnyx.sdk.models.ai.assistants.tests.TestListParams
import com.telnyx.sdk.models.ai.assistants.tests.TestListResponse
import com.telnyx.sdk.models.ai.assistants.tests.TestRetrieveParams
import com.telnyx.sdk.models.ai.assistants.tests.TestUpdateParams
import com.telnyx.sdk.services.blocking.ai.assistants.tests.RunService
import com.telnyx.sdk.services.blocking.ai.assistants.tests.RunServiceImpl
import com.telnyx.sdk.services.blocking.ai.assistants.tests.TestSuiteService
import com.telnyx.sdk.services.blocking.ai.assistants.tests.TestSuiteServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TestServiceImpl internal constructor(private val clientOptions: ClientOptions) : TestService {

    private val withRawResponse: TestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val testSuites: TestSuiteService by lazy { TestSuiteServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    override fun withRawResponse(): TestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestService =
        TestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun testSuites(): TestSuiteService = testSuites

    override fun runs(): RunService = runs

    override fun create(params: TestCreateParams, requestOptions: RequestOptions): AssistantTest =
        // post /ai/assistants/tests
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: TestRetrieveParams,
        requestOptions: RequestOptions,
    ): AssistantTest =
        // get /ai/assistants/tests/{test_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: TestUpdateParams, requestOptions: RequestOptions): AssistantTest =
        // put /ai/assistants/tests/{test_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: TestListParams, requestOptions: RequestOptions): TestListResponse =
        // get /ai/assistants/tests
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: TestDeleteParams,
        requestOptions: RequestOptions,
    ): TestDeleteResponse =
        // delete /ai/assistants/tests/{test_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val testSuites: TestSuiteService.WithRawResponse by lazy {
            TestSuiteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestService.WithRawResponse =
            TestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun testSuites(): TestSuiteService.WithRawResponse = testSuites

        override fun runs(): RunService.WithRawResponse = runs

        private val createHandler: Handler<AssistantTest> =
            jsonHandler<AssistantTest>(clientOptions.jsonMapper)

        override fun create(
            params: TestCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantTest> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "tests")
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

        private val retrieveHandler: Handler<AssistantTest> =
            jsonHandler<AssistantTest>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TestRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantTest> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("testId", params.testId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "tests", params._pathParam(0))
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

        private val updateHandler: Handler<AssistantTest> =
            jsonHandler<AssistantTest>(clientOptions.jsonMapper)

        override fun update(
            params: TestUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantTest> {
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

        private val listHandler: Handler<TestListResponse> =
            jsonHandler<TestListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TestListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "tests")
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
            }
        }

        private val deleteHandler: Handler<TestDeleteResponse> =
            jsonHandler<TestDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TestDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestDeleteResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
}
