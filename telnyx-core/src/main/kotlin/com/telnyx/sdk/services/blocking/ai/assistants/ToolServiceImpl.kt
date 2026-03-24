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
import com.telnyx.sdk.models.ai.assistants.tools.ToolAddParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolAddResponse
import com.telnyx.sdk.models.ai.assistants.tools.ToolRemoveParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolRemoveResponse
import com.telnyx.sdk.models.ai.assistants.tools.ToolTestParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolTestResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Configure AI assistant specifications */
class ToolServiceImpl internal constructor(private val clientOptions: ClientOptions) : ToolService {

    private val withRawResponse: ToolService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ToolService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService =
        ToolServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun add(params: ToolAddParams, requestOptions: RequestOptions): ToolAddResponse =
        // put /ai/assistants/{assistant_id}/tools/{tool_id}
        withRawResponse().add(params, requestOptions).parse()

    override fun remove(
        params: ToolRemoveParams,
        requestOptions: RequestOptions,
    ): ToolRemoveResponse =
        // delete /ai/assistants/{assistant_id}/tools/{tool_id}
        withRawResponse().remove(params, requestOptions).parse()

    override fun test(params: ToolTestParams, requestOptions: RequestOptions): ToolTestResponse =
        // post /ai/assistants/{assistant_id}/tools/{tool_id}/test
        withRawResponse().test(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ToolService.WithRawResponse =
            ToolServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addHandler: Handler<ToolAddResponse> =
            jsonHandler<ToolAddResponse>(clientOptions.jsonMapper)

        override fun add(
            params: ToolAddParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolAddResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "assistants",
                        params._pathParam(0),
                        "tools",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removeHandler: Handler<ToolRemoveResponse> =
            jsonHandler<ToolRemoveResponse>(clientOptions.jsonMapper)

        override fun remove(
            params: ToolRemoveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolRemoveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "assistants",
                        params._pathParam(0),
                        "tools",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { removeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val testHandler: Handler<ToolTestResponse> =
            jsonHandler<ToolTestResponse>(clientOptions.jsonMapper)

        override fun test(
            params: ToolTestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolTestResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "assistants",
                        params._pathParam(0),
                        "tools",
                        params._pathParam(1),
                        "test",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { testHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
