// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework.v1

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
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentCreateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentDeleteParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentDeleteResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentListParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentListResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentRetrieveParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentUpdateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.TestAgent
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
class AiagentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AiagentService {

    private val withRawResponse: AiagentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AiagentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiagentService =
        AiagentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AiagentCreateParams, requestOptions: RequestOptions): TestAgent =
        // post /ai/tests/test_framework/v1/aiagents
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AiagentRetrieveParams,
        requestOptions: RequestOptions,
    ): TestAgent =
        // get /ai/tests/test_framework/v1/aiagents/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AiagentUpdateParams, requestOptions: RequestOptions): TestAgent =
        // put /ai/tests/test_framework/v1/aiagents/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AiagentListParams,
        requestOptions: RequestOptions,
    ): AiagentListResponse =
        // get /ai/tests/test_framework/v1/aiagents
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AiagentDeleteParams,
        requestOptions: RequestOptions,
    ): AiagentDeleteResponse =
        // delete /ai/tests/test_framework/v1/aiagents/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AiagentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AiagentService.WithRawResponse =
            AiagentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TestAgent> =
            jsonHandler<TestAgent>(clientOptions.jsonMapper)

        override fun create(
            params: AiagentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestAgent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tests", "test_framework", "v1", "aiagents")
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

        private val retrieveHandler: Handler<TestAgent> =
            jsonHandler<TestAgent>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AiagentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestAgent> {
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
                        "aiagents",
                        params._pathParam(0),
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

        private val updateHandler: Handler<TestAgent> =
            jsonHandler<TestAgent>(clientOptions.jsonMapper)

        override fun update(
            params: AiagentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestAgent> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "aiagents",
                        params._pathParam(0),
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

        private val listHandler: Handler<AiagentListResponse> =
            jsonHandler<AiagentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AiagentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AiagentListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tests", "test_framework", "v1", "aiagents")
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

        private val deleteHandler: Handler<AiagentDeleteResponse> =
            jsonHandler<AiagentDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AiagentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AiagentDeleteResponse> {
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
                        "aiagents",
                        params._pathParam(0),
                    )
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
