// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

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
import com.telnyx.sdk.models.ai.tools.ToolCreateParams
import com.telnyx.sdk.models.ai.tools.ToolCreateResponse
import com.telnyx.sdk.models.ai.tools.ToolDeleteParams
import com.telnyx.sdk.models.ai.tools.ToolDeleteResponse
import com.telnyx.sdk.models.ai.tools.ToolListPage
import com.telnyx.sdk.models.ai.tools.ToolListPageResponse
import com.telnyx.sdk.models.ai.tools.ToolListParams
import com.telnyx.sdk.models.ai.tools.ToolRetrieveParams
import com.telnyx.sdk.models.ai.tools.ToolRetrieveResponse
import com.telnyx.sdk.models.ai.tools.ToolUpdateParams
import com.telnyx.sdk.models.ai.tools.ToolUpdateResponse
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

    override fun create(
        params: ToolCreateParams,
        requestOptions: RequestOptions,
    ): ToolCreateResponse =
        // post /ai/tools
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ToolRetrieveParams,
        requestOptions: RequestOptions,
    ): ToolRetrieveResponse =
        // get /ai/tools/{tool_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ToolUpdateParams,
        requestOptions: RequestOptions,
    ): ToolUpdateResponse =
        // patch /ai/tools/{tool_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ToolListParams, requestOptions: RequestOptions): ToolListPage =
        // get /ai/tools
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ToolDeleteParams,
        requestOptions: RequestOptions,
    ): ToolDeleteResponse =
        // delete /ai/tools/{tool_id}
        withRawResponse().delete(params, requestOptions).parse()

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

        private val createHandler: Handler<ToolCreateResponse> =
            jsonHandler<ToolCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ToolCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tools")
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

        private val retrieveHandler: Handler<ToolRetrieveResponse> =
            jsonHandler<ToolRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ToolRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tools", params._pathParam(0))
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

        private val updateHandler: Handler<ToolUpdateResponse> =
            jsonHandler<ToolUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ToolUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tools", params._pathParam(0))
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

        private val listHandler: Handler<ToolListPageResponse> =
            jsonHandler<ToolListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ToolListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tools")
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
                    .let {
                        ToolListPage.builder()
                            .service(ToolServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<ToolDeleteResponse> =
            jsonHandler<ToolDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ToolDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tools", params._pathParam(0))
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
