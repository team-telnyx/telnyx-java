// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways.keys

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
import com.telnyx.sdk.models.agentgateways.keys.toolpermissions.AgentGatewayToolPermissionsResponse
import com.telnyx.sdk.models.agentgateways.keys.toolpermissions.ToolPermissionCreateParams
import com.telnyx.sdk.models.agentgateways.keys.toolpermissions.ToolPermissionListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** The MCP servers and tools a key or team may use. */
class ToolPermissionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ToolPermissionService {

    private val withRawResponse: ToolPermissionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ToolPermissionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolPermissionService =
        ToolPermissionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ToolPermissionCreateParams,
        requestOptions: RequestOptions,
    ): AgentGatewayToolPermissionsResponse =
        // put /agent_gateways/{instance_id}/keys/{key_id}/tool_permissions
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: ToolPermissionListParams,
        requestOptions: RequestOptions,
    ): AgentGatewayToolPermissionsResponse =
        // get /agent_gateways/{instance_id}/keys/{key_id}/tool_permissions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolPermissionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ToolPermissionService.WithRawResponse =
            ToolPermissionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AgentGatewayToolPermissionsResponse> =
            jsonHandler<AgentGatewayToolPermissionsResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ToolPermissionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayToolPermissionsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("keyId", params.keyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "keys",
                        params._pathParam(1),
                        "tool_permissions",
                    )
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

        private val listHandler: Handler<AgentGatewayToolPermissionsResponse> =
            jsonHandler<AgentGatewayToolPermissionsResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ToolPermissionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayToolPermissionsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("keyId", params.keyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "keys",
                        params._pathParam(1),
                        "tool_permissions",
                    )
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
