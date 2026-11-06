// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

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
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayApiResponse
import com.telnyx.sdk.models.agentgateways.apis.ApiCreateParams
import com.telnyx.sdk.models.agentgateways.apis.ApiDeleteParams
import com.telnyx.sdk.models.agentgateways.apis.ApiListParams
import com.telnyx.sdk.models.agentgateways.apis.ApiListResponse
import com.telnyx.sdk.models.agentgateways.apis.ApiUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** REST APIs on an instance, served to agents as tools. */
class ApiServiceImpl internal constructor(private val clientOptions: ClientOptions) : ApiService {

    private val withRawResponse: ApiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ApiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiService =
        ApiServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ApiCreateParams,
        requestOptions: RequestOptions,
    ): AgentGatewayApiResponse =
        // post /agent_gateways/{instance_id}/apis
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: ApiUpdateParams,
        requestOptions: RequestOptions,
    ): AgentGatewayApiResponse =
        // patch /agent_gateways/{instance_id}/apis/{api_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ApiListParams, requestOptions: RequestOptions): ApiListResponse =
        // get /agent_gateways/{instance_id}/apis
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ApiDeleteParams,
        requestOptions: RequestOptions,
    ): AgentGatewayApiResponse =
        // delete /agent_gateways/{instance_id}/apis/{api_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiService.WithRawResponse =
            ApiServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AgentGatewayApiResponse> =
            jsonHandler<AgentGatewayApiResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ApiCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayApiResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "apis")
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

        private val updateHandler: Handler<AgentGatewayApiResponse> =
            jsonHandler<AgentGatewayApiResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ApiUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayApiResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiId", params.apiId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "apis",
                        params._pathParam(1),
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

        private val listHandler: Handler<ApiListResponse> =
            jsonHandler<ApiListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ApiListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "apis")
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

        private val deleteHandler: Handler<AgentGatewayApiResponse> =
            jsonHandler<AgentGatewayApiResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ApiDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayApiResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiId", params.apiId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "apis",
                        params._pathParam(1),
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
