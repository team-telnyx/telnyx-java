// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.missions.tools.ToolCreateToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolCreateToolResponse
import com.telnyx.sdk.models.ai.missions.tools.ToolDeleteToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolGetToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolGetToolResponse
import com.telnyx.sdk.models.ai.missions.tools.ToolListToolsParams
import com.telnyx.sdk.models.ai.missions.tools.ToolListToolsResponse
import com.telnyx.sdk.models.ai.missions.tools.ToolUpdateToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolUpdateToolResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ToolServiceImpl internal constructor(private val clientOptions: ClientOptions) : ToolService {

    private val withRawResponse: ToolService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ToolService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService =
        ToolServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createTool(
        params: ToolCreateToolParams,
        requestOptions: RequestOptions,
    ): ToolCreateToolResponse =
        // post /ai/missions/{mission_id}/tools
        withRawResponse().createTool(params, requestOptions).parse()

    override fun deleteTool(params: ToolDeleteToolParams, requestOptions: RequestOptions) {
        // delete /ai/missions/{mission_id}/tools/{tool_id}
        withRawResponse().deleteTool(params, requestOptions)
    }

    override fun getTool(
        params: ToolGetToolParams,
        requestOptions: RequestOptions,
    ): ToolGetToolResponse =
        // get /ai/missions/{mission_id}/tools/{tool_id}
        withRawResponse().getTool(params, requestOptions).parse()

    override fun listTools(
        params: ToolListToolsParams,
        requestOptions: RequestOptions,
    ): ToolListToolsResponse =
        // get /ai/missions/{mission_id}/tools
        withRawResponse().listTools(params, requestOptions).parse()

    override fun updateTool(
        params: ToolUpdateToolParams,
        requestOptions: RequestOptions,
    ): ToolUpdateToolResponse =
        // put /ai/missions/{mission_id}/tools/{tool_id}
        withRawResponse().updateTool(params, requestOptions).parse()

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

        private val createToolHandler: Handler<ToolCreateToolResponse> =
            jsonHandler<ToolCreateToolResponse>(clientOptions.jsonMapper)

        override fun createTool(
            params: ToolCreateToolParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolCreateToolResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0), "tools")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createToolHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteToolHandler: Handler<Void?> = emptyHandler()

        override fun deleteTool(
            params: ToolDeleteToolParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
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
                response.use { deleteToolHandler.handle(it) }
            }
        }

        private val getToolHandler: Handler<ToolGetToolResponse> =
            jsonHandler<ToolGetToolResponse>(clientOptions.jsonMapper)

        override fun getTool(
            params: ToolGetToolParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolGetToolResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "tools",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getToolHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listToolsHandler: Handler<ToolListToolsResponse> =
            jsonHandler<ToolListToolsResponse>(clientOptions.jsonMapper)

        override fun listTools(
            params: ToolListToolsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolListToolsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0), "tools")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listToolsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateToolHandler: Handler<ToolUpdateToolResponse> =
            jsonHandler<ToolUpdateToolResponse>(clientOptions.jsonMapper)

        override fun updateTool(
            params: ToolUpdateToolParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolUpdateToolResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
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
                    .use { updateToolHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
