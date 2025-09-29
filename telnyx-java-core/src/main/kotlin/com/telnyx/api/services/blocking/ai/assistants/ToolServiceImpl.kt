// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.ai.assistants.tools.ToolTestParams
import com.telnyx.api.models.ai.assistants.tools.ToolTestResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ToolServiceImpl internal constructor(private val clientOptions: ClientOptions) : ToolService {

    private val withRawResponse: ToolService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ToolService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService =
        ToolServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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
