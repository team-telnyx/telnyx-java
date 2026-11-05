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
import com.telnyx.sdk.models.agentgateways.teams.AgentGatewayTeamResponse
import com.telnyx.sdk.models.agentgateways.teams.TeamCreateParams
import com.telnyx.sdk.models.agentgateways.teams.TeamDeleteParams
import com.telnyx.sdk.models.agentgateways.teams.TeamListParams
import com.telnyx.sdk.models.agentgateways.teams.TeamListResponse
import com.telnyx.sdk.models.agentgateways.teams.TeamUpdateParams
import com.telnyx.sdk.services.async.agentgateways.teams.ToolPermissionServiceAsync
import com.telnyx.sdk.services.async.agentgateways.teams.ToolPermissionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Teams on an instance: shared model lists, budgets, and rate limits. */
class TeamServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TeamServiceAsync {

    private val withRawResponse: TeamServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val toolPermissions: ToolPermissionServiceAsync by lazy {
        ToolPermissionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): TeamServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamServiceAsync =
        TeamServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** The MCP servers and tools a key or team may use. */
    override fun toolPermissions(): ToolPermissionServiceAsync = toolPermissions

    override fun create(
        params: TeamCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayTeamResponse> =
        // post /agent_gateways/{instance_id}/teams
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun update(
        params: TeamUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayTeamResponse> =
        // patch /agent_gateways/{instance_id}/teams/{team_id}
        withRawResponse().update(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: TeamListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamListResponse> =
        // get /agent_gateways/{instance_id}/teams
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: TeamDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayTeamResponse> =
        // delete /agent_gateways/{instance_id}/teams/{team_id}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TeamServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val toolPermissions: ToolPermissionServiceAsync.WithRawResponse by lazy {
            ToolPermissionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TeamServiceAsync.WithRawResponse =
            TeamServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** The MCP servers and tools a key or team may use. */
        override fun toolPermissions(): ToolPermissionServiceAsync.WithRawResponse = toolPermissions

        private val createHandler: Handler<AgentGatewayTeamResponse> =
            jsonHandler<AgentGatewayTeamResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TeamCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "teams")
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

        private val updateHandler: Handler<AgentGatewayTeamResponse> =
            jsonHandler<AgentGatewayTeamResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("teamId", params.teamId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "teams",
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

        private val listHandler: Handler<TeamListResponse> =
            jsonHandler<TeamListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TeamListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "teams")
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

        private val deleteHandler: Handler<AgentGatewayTeamResponse> =
            jsonHandler<AgentGatewayTeamResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TeamDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("teamId", params.teamId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "teams",
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
