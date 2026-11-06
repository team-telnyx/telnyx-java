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
import com.telnyx.sdk.models.agentgateways.policies.AgentGatewayPolicyResponse
import com.telnyx.sdk.models.agentgateways.policies.PolicyCreateParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyDeleteParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyListParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyListResponse
import com.telnyx.sdk.models.agentgateways.policies.PolicyRetrieveParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Named sets of guardrails an instance applies to requests. */
class PolicyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PolicyService {

    private val withRawResponse: PolicyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PolicyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PolicyService =
        PolicyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PolicyCreateParams,
        requestOptions: RequestOptions,
    ): AgentGatewayPolicyResponse =
        // post /agent_gateways/{instance_id}/policies
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PolicyRetrieveParams,
        requestOptions: RequestOptions,
    ): AgentGatewayPolicyResponse =
        // get /agent_gateways/{instance_id}/policies/{name}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PolicyUpdateParams,
        requestOptions: RequestOptions,
    ): AgentGatewayPolicyResponse =
        // patch /agent_gateways/{instance_id}/policies/{name}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PolicyListParams,
        requestOptions: RequestOptions,
    ): PolicyListResponse =
        // get /agent_gateways/{instance_id}/policies
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PolicyDeleteParams,
        requestOptions: RequestOptions,
    ): AgentGatewayPolicyResponse =
        // delete /agent_gateways/{instance_id}/policies/{name}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PolicyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PolicyService.WithRawResponse =
            PolicyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AgentGatewayPolicyResponse> =
            jsonHandler<AgentGatewayPolicyResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PolicyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayPolicyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "policies")
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

        private val retrieveHandler: Handler<AgentGatewayPolicyResponse> =
            jsonHandler<AgentGatewayPolicyResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PolicyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayPolicyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "policies",
                        params._pathParam(1),
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

        private val updateHandler: Handler<AgentGatewayPolicyResponse> =
            jsonHandler<AgentGatewayPolicyResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PolicyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayPolicyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "policies",
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

        private val listHandler: Handler<PolicyListResponse> =
            jsonHandler<PolicyListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PolicyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PolicyListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "policies")
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

        private val deleteHandler: Handler<AgentGatewayPolicyResponse> =
            jsonHandler<AgentGatewayPolicyResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PolicyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayPolicyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "policies",
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
