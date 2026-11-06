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
import com.telnyx.sdk.models.agentgateways.teams.AgentGatewayTeamResponse
import com.telnyx.sdk.models.agentgateways.teams.TeamCreateParams
import com.telnyx.sdk.models.agentgateways.teams.TeamDeleteParams
import com.telnyx.sdk.models.agentgateways.teams.TeamListParams
import com.telnyx.sdk.models.agentgateways.teams.TeamListResponse
import com.telnyx.sdk.models.agentgateways.teams.TeamUpdateParams
import com.telnyx.sdk.services.blocking.agentgateways.teams.ToolPermissionService
import com.telnyx.sdk.services.blocking.agentgateways.teams.ToolPermissionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Teams on an instance: shared model lists, budgets, and rate limits. */
class TeamServiceImpl internal constructor(private val clientOptions: ClientOptions) : TeamService {

    private val withRawResponse: TeamService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val toolPermissions: ToolPermissionService by lazy {
        ToolPermissionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): TeamService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamService =
        TeamServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** The MCP servers and tools a key or team may use. */
    override fun toolPermissions(): ToolPermissionService = toolPermissions

    override fun create(
        params: TeamCreateParams,
        requestOptions: RequestOptions,
    ): AgentGatewayTeamResponse =
        // post /agent_gateways/{instance_id}/teams
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: TeamUpdateParams,
        requestOptions: RequestOptions,
    ): AgentGatewayTeamResponse =
        // patch /agent_gateways/{instance_id}/teams/{team_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: TeamListParams, requestOptions: RequestOptions): TeamListResponse =
        // get /agent_gateways/{instance_id}/teams
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: TeamDeleteParams,
        requestOptions: RequestOptions,
    ): AgentGatewayTeamResponse =
        // delete /agent_gateways/{instance_id}/teams/{team_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TeamService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val toolPermissions: ToolPermissionService.WithRawResponse by lazy {
            ToolPermissionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TeamService.WithRawResponse =
            TeamServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** The MCP servers and tools a key or team may use. */
        override fun toolPermissions(): ToolPermissionService.WithRawResponse = toolPermissions

        private val createHandler: Handler<AgentGatewayTeamResponse> =
            jsonHandler<AgentGatewayTeamResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TeamCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayTeamResponse> {
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

        private val updateHandler: Handler<AgentGatewayTeamResponse> =
            jsonHandler<AgentGatewayTeamResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayTeamResponse> {
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

        private val listHandler: Handler<TeamListResponse> =
            jsonHandler<TeamListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TeamListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "teams")
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

        private val deleteHandler: Handler<AgentGatewayTeamResponse> =
            jsonHandler<AgentGatewayTeamResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TeamDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayTeamResponse> {
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
