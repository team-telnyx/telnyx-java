// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
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
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.agentgateways.guardrails.AgentGatewayGuardrailResponse
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailCreateParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailDeleteParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailListParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailListResponse
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Checks an instance runs on model and tool requests. */
class GuardrailServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GuardrailServiceAsync {

    private val withRawResponse: GuardrailServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GuardrailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GuardrailServiceAsync =
        GuardrailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GuardrailCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayGuardrailResponse> =
        // post /agent_gateways/{instance_id}/guardrails
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun update(
        params: GuardrailUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayGuardrailResponse> =
        // patch /agent_gateways/{instance_id}/guardrails/{guardrail_id}
        withRawResponse().update(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: GuardrailListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GuardrailListResponse> =
        // get /agent_gateways/{instance_id}/guardrails
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: GuardrailDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayGuardrailResponse> =
        // delete /agent_gateways/{instance_id}/guardrails/{guardrail_id}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GuardrailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GuardrailServiceAsync.WithRawResponse =
            GuardrailServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AgentGatewayGuardrailResponse> =
            jsonHandler<AgentGatewayGuardrailResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GuardrailCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "guardrails")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val updateHandler: Handler<AgentGatewayGuardrailResponse> =
            jsonHandler<AgentGatewayGuardrailResponse>(clientOptions.jsonMapper)

        override fun update(
            params: GuardrailUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("guardrailId", params.guardrailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "guardrails",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val listHandler: Handler<GuardrailListResponse> =
            jsonHandler<GuardrailListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GuardrailListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GuardrailListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "guardrails")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
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

        private val deleteHandler: Handler<AgentGatewayGuardrailResponse> =
            jsonHandler<AgentGatewayGuardrailResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: GuardrailDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("guardrailId", params.guardrailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "guardrails",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
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
}
