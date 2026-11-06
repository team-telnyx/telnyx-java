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
import com.telnyx.sdk.models.agentgateways.policyattachments.AgentGatewayPolicyAttachmentResponse
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentCreateParams
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentDeleteParams
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentListParams
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Where an instance applies each policy. */
class PolicyAttachmentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PolicyAttachmentServiceAsync {

    private val withRawResponse: PolicyAttachmentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PolicyAttachmentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PolicyAttachmentServiceAsync =
        PolicyAttachmentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PolicyAttachmentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayPolicyAttachmentResponse> =
        // post /agent_gateways/{instance_id}/policy_attachments
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: PolicyAttachmentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PolicyAttachmentListResponse> =
        // get /agent_gateways/{instance_id}/policy_attachments
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: PolicyAttachmentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayPolicyAttachmentResponse> =
        // delete /agent_gateways/{instance_id}/policy_attachments/{attachment_id}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PolicyAttachmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PolicyAttachmentServiceAsync.WithRawResponse =
            PolicyAttachmentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AgentGatewayPolicyAttachmentResponse> =
            jsonHandler<AgentGatewayPolicyAttachmentResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PolicyAttachmentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyAttachmentResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "policy_attachments")
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

        private val listHandler: Handler<PolicyAttachmentListResponse> =
            jsonHandler<PolicyAttachmentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PolicyAttachmentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PolicyAttachmentListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "policy_attachments")
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

        private val deleteHandler: Handler<AgentGatewayPolicyAttachmentResponse> =
            jsonHandler<AgentGatewayPolicyAttachmentResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PolicyAttachmentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyAttachmentResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("attachmentId", params.attachmentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "policy_attachments",
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
