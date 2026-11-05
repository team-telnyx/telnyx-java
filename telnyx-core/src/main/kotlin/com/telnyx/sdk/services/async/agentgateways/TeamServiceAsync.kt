// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.teams.AgentGatewayTeamResponse
import com.telnyx.sdk.models.agentgateways.teams.TeamCreateParams
import com.telnyx.sdk.models.agentgateways.teams.TeamDeleteParams
import com.telnyx.sdk.models.agentgateways.teams.TeamListParams
import com.telnyx.sdk.models.agentgateways.teams.TeamListResponse
import com.telnyx.sdk.models.agentgateways.teams.TeamUpdateParams
import com.telnyx.sdk.services.async.agentgateways.teams.ToolPermissionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Teams on an instance: shared model lists, budgets, and rate limits. */
interface TeamServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamServiceAsync

    /** The MCP servers and tools a key or team may use. */
    fun toolPermissions(): ToolPermissionServiceAsync

    /**
     * Creates a team on the instance. A team is a model list, a budget, and rate limits that its
     * keys share. Names need not be unique; the `id` identifies the team. The instance must be
     * `ready`; otherwise the request answers `409`.
     */
    fun create(
        instanceId: String,
        params: TeamCreateParams,
    ): CompletableFuture<AgentGatewayTeamResponse> =
        create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: TeamCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayTeamResponse> =
        create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(params: TeamCreateParams): CompletableFuture<AgentGatewayTeamResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TeamCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayTeamResponse>

    /**
     * Changes a team's settings. A field left out stays as it is, and `null` clears it. `models:
     * []` lifts the model restriction. Setting `blocked` to `true` makes the instance refuse every
     * key in the team with `401`. The instance must be `ready`; otherwise the request answers
     * `409`.
     */
    fun update(
        teamId: String,
        params: TeamUpdateParams,
    ): CompletableFuture<AgentGatewayTeamResponse> = update(teamId, params, RequestOptions.none())

    /** @see update */
    fun update(
        teamId: String,
        params: TeamUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayTeamResponse> =
        update(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see update */
    fun update(params: TeamUpdateParams): CompletableFuture<AgentGatewayTeamResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TeamUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayTeamResponse>

    /**
     * Lists the instance's teams. The instance must be `ready`; otherwise the request answers
     * `409`.
     */
    fun list(instanceId: String): CompletableFuture<TeamListResponse> =
        list(instanceId, TeamListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: TeamListParams = TeamListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamListResponse> =
        list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(
        instanceId: String,
        params: TeamListParams = TeamListParams.none(),
    ): CompletableFuture<TeamListResponse> = list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TeamListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamListResponse>

    /** @see list */
    fun list(params: TeamListParams): CompletableFuture<TeamListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        instanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamListResponse> = list(instanceId, TeamListParams.none(), requestOptions)

    /**
     * Deletes a team that has no keys and returns it. A team that still has keys answers `409`;
     * delete or move its keys first. The instance must be `ready`; otherwise the request answers
     * `409`.
     */
    fun delete(
        teamId: String,
        params: TeamDeleteParams,
    ): CompletableFuture<AgentGatewayTeamResponse> = delete(teamId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        teamId: String,
        params: TeamDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayTeamResponse> =
        delete(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see delete */
    fun delete(params: TeamDeleteParams): CompletableFuture<AgentGatewayTeamResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TeamDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayTeamResponse>

    /** A view of [TeamServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamServiceAsync.WithRawResponse

        /** The MCP servers and tools a key or team may use. */
        fun toolPermissions(): ToolPermissionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/teams`, but is
         * otherwise the same as [TeamServiceAsync.create].
         */
        fun create(
            instanceId: String,
            params: TeamCreateParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> =
            create(instanceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            instanceId: String,
            params: TeamCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        fun create(
            params: TeamCreateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TeamCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>>

        /**
         * Returns a raw HTTP response for `patch /agent_gateways/{instance_id}/teams/{team_id}`,
         * but is otherwise the same as [TeamServiceAsync.update].
         */
        fun update(
            teamId: String,
            params: TeamUpdateParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> =
            update(teamId, params, RequestOptions.none())

        /** @see update */
        fun update(
            teamId: String,
            params: TeamUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> =
            update(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see update */
        fun update(
            params: TeamUpdateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/teams`, but is
         * otherwise the same as [TeamServiceAsync.list].
         */
        fun list(instanceId: String): CompletableFuture<HttpResponseFor<TeamListResponse>> =
            list(instanceId, TeamListParams.none())

        /** @see list */
        fun list(
            instanceId: String,
            params: TeamListParams = TeamListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamListResponse>> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        fun list(
            instanceId: String,
            params: TeamListParams = TeamListParams.none(),
        ): CompletableFuture<HttpResponseFor<TeamListResponse>> =
            list(instanceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TeamListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamListResponse>>

        /** @see list */
        fun list(params: TeamListParams): CompletableFuture<HttpResponseFor<TeamListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamListResponse>> =
            list(instanceId, TeamListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent_gateways/{instance_id}/teams/{team_id}`,
         * but is otherwise the same as [TeamServiceAsync.delete].
         */
        fun delete(
            teamId: String,
            params: TeamDeleteParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> =
            delete(teamId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            teamId: String,
            params: TeamDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> =
            delete(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: TeamDeleteParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TeamDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayTeamResponse>>
    }
}
