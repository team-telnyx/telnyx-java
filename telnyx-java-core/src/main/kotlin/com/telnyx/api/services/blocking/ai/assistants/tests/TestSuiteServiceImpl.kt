// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants.tests

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.ai.assistants.tests.testsuites.TestSuiteListParams
import com.telnyx.api.models.ai.assistants.tests.testsuites.TestSuiteListResponse
import com.telnyx.api.services.blocking.ai.assistants.tests.testsuites.RunService
import com.telnyx.api.services.blocking.ai.assistants.tests.testsuites.RunServiceImpl
import java.util.function.Consumer

class TestSuiteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TestSuiteService {

    private val withRawResponse: TestSuiteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    override fun withRawResponse(): TestSuiteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestSuiteService =
        TestSuiteServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun runs(): RunService = runs

    override fun list(
        params: TestSuiteListParams,
        requestOptions: RequestOptions,
    ): TestSuiteListResponse =
        // get /ai/assistants/tests/test-suites
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestSuiteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestSuiteService.WithRawResponse =
            TestSuiteServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun runs(): RunService.WithRawResponse = runs

        private val listHandler: Handler<TestSuiteListResponse> =
            jsonHandler<TestSuiteListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TestSuiteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestSuiteListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "tests", "test-suites")
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
    }
}
