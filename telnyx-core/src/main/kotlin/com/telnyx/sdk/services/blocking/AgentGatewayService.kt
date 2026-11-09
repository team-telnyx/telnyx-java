// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.AgentGatewayCreateParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayDeleteParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayListPage
import com.telnyx.sdk.models.agentgateways.AgentGatewayListParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayResponse
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveModelsParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveModelsResponse
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveSpendLogsParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveSpendLogsResponse
import com.telnyx.sdk.services.blocking.agentgateways.ApiService
import com.telnyx.sdk.services.blocking.agentgateways.GuardrailService
import com.telnyx.sdk.services.blocking.agentgateways.KeyService
import com.telnyx.sdk.services.blocking.agentgateways.McpServerService
import com.telnyx.sdk.services.blocking.agentgateways.PolicyAttachmentService
import com.telnyx.sdk.services.blocking.agentgateways.PolicyService
import com.telnyx.sdk.services.blocking.agentgateways.TeamService
import java.util.function.Consumer

interface AgentGatewayService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentGatewayService

    /** REST APIs on an instance, served to agents as tools. */
    fun apis(): ApiService

    /** Checks an instance runs on model and tool requests. */
    fun guardrails(): GuardrailService

    /** Keys on an instance. */
    fun keys(): KeyService

    /** MCP servers on an instance, served to agents at one MCP endpoint. */
    fun mcpServers(): McpServerService

    /** Named sets of guardrails an instance applies to requests. */
    fun policies(): PolicyService

    /** Where an instance applies each policy. */
    fun policyAttachments(): PolicyAttachmentService

    /** Teams on an instance: shared model lists, budgets, and rate limits. */
    fun teams(): TeamService

    /**
     * Creates an Agent Gateway instance on one of the account's WireGuard Interfaces. The instance
     * starts `pending`, moves to `provisioning`, and then to `ready` or `failed`. It joins the
     * WireGuard Interface as a peer named `agw-<instance id>`, and its `gateway_url` is set when it
     * is `ready`.
     */
    fun create(params: AgentGatewayCreateParams): AgentGatewayResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentGatewayCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayResponse

    /** Returns one of the account's Agent Gateway instances. */
    fun retrieve(instanceId: String): AgentGatewayResponse =
        retrieve(instanceId, AgentGatewayRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        instanceId: String,
        params: AgentGatewayRetrieveParams = AgentGatewayRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayResponse =
        retrieve(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        instanceId: String,
        params: AgentGatewayRetrieveParams = AgentGatewayRetrieveParams.none(),
    ): AgentGatewayResponse = retrieve(instanceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentGatewayRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayResponse

    /** @see retrieve */
    fun retrieve(params: AgentGatewayRetrieveParams): AgentGatewayResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(instanceId: String, requestOptions: RequestOptions): AgentGatewayResponse =
        retrieve(instanceId, AgentGatewayRetrieveParams.none(), requestOptions)

    /** Lists the account's Agent Gateway instances, newest first, one page at a time. */
    fun list(): AgentGatewayListPage = list(AgentGatewayListParams.none())

    /** @see list */
    fun list(
        params: AgentGatewayListParams = AgentGatewayListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayListPage

    /** @see list */
    fun list(params: AgentGatewayListParams = AgentGatewayListParams.none()): AgentGatewayListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AgentGatewayListPage =
        list(AgentGatewayListParams.none(), requestOptions)

    /**
     * Deletes an Agent Gateway instance in any status. The response shows it `deleting`; repeating
     * the request answers the same until the instance is gone, and then `404`. The instance's
     * engine and everything stored on it are removed.
     */
    fun delete(instanceId: String): AgentGatewayResponse =
        delete(instanceId, AgentGatewayDeleteParams.none())

    /** @see delete */
    fun delete(
        instanceId: String,
        params: AgentGatewayDeleteParams = AgentGatewayDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayResponse =
        delete(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        instanceId: String,
        params: AgentGatewayDeleteParams = AgentGatewayDeleteParams.none(),
    ): AgentGatewayResponse = delete(instanceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AgentGatewayDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayResponse

    /** @see delete */
    fun delete(params: AgentGatewayDeleteParams): AgentGatewayResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(instanceId: String, requestOptions: RequestOptions): AgentGatewayResponse =
        delete(instanceId, AgentGatewayDeleteParams.none(), requestOptions)

    /**
     * Lists the models the instance serves. Each has the name a request uses, the Telnyx Inference
     * model behind it, and its price per million tokens.
     */
    fun retrieveModels(instanceId: String): AgentGatewayRetrieveModelsResponse =
        retrieveModels(instanceId, AgentGatewayRetrieveModelsParams.none())

    /** @see retrieveModels */
    fun retrieveModels(
        instanceId: String,
        params: AgentGatewayRetrieveModelsParams = AgentGatewayRetrieveModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayRetrieveModelsResponse =
        retrieveModels(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see retrieveModels */
    fun retrieveModels(
        instanceId: String,
        params: AgentGatewayRetrieveModelsParams = AgentGatewayRetrieveModelsParams.none(),
    ): AgentGatewayRetrieveModelsResponse =
        retrieveModels(instanceId, params, RequestOptions.none())

    /** @see retrieveModels */
    fun retrieveModels(
        params: AgentGatewayRetrieveModelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayRetrieveModelsResponse

    /** @see retrieveModels */
    fun retrieveModels(
        params: AgentGatewayRetrieveModelsParams
    ): AgentGatewayRetrieveModelsResponse = retrieveModels(params, RequestOptions.none())

    /** @see retrieveModels */
    fun retrieveModels(
        instanceId: String,
        requestOptions: RequestOptions,
    ): AgentGatewayRetrieveModelsResponse =
        retrieveModels(instanceId, AgentGatewayRetrieveModelsParams.none(), requestOptions)

    /**
     * Lists the requests the instance served with its keys, newest first, one page at a time. The
     * window defaults to the last 24 hours and spans at most 31 days. A row appears a few seconds
     * after its request. The instance must be `ready`; otherwise the request answers `409`.
     */
    fun retrieveSpendLogs(instanceId: String): AgentGatewayRetrieveSpendLogsResponse =
        retrieveSpendLogs(instanceId, AgentGatewayRetrieveSpendLogsParams.none())

    /** @see retrieveSpendLogs */
    fun retrieveSpendLogs(
        instanceId: String,
        params: AgentGatewayRetrieveSpendLogsParams = AgentGatewayRetrieveSpendLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayRetrieveSpendLogsResponse =
        retrieveSpendLogs(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see retrieveSpendLogs */
    fun retrieveSpendLogs(
        instanceId: String,
        params: AgentGatewayRetrieveSpendLogsParams = AgentGatewayRetrieveSpendLogsParams.none(),
    ): AgentGatewayRetrieveSpendLogsResponse =
        retrieveSpendLogs(instanceId, params, RequestOptions.none())

    /** @see retrieveSpendLogs */
    fun retrieveSpendLogs(
        params: AgentGatewayRetrieveSpendLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayRetrieveSpendLogsResponse

    /** @see retrieveSpendLogs */
    fun retrieveSpendLogs(
        params: AgentGatewayRetrieveSpendLogsParams
    ): AgentGatewayRetrieveSpendLogsResponse = retrieveSpendLogs(params, RequestOptions.none())

    /** @see retrieveSpendLogs */
    fun retrieveSpendLogs(
        instanceId: String,
        requestOptions: RequestOptions,
    ): AgentGatewayRetrieveSpendLogsResponse =
        retrieveSpendLogs(instanceId, AgentGatewayRetrieveSpendLogsParams.none(), requestOptions)

    /**
     * A view of [AgentGatewayService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentGatewayService.WithRawResponse

        /** REST APIs on an instance, served to agents as tools. */
        fun apis(): ApiService.WithRawResponse

        /** Checks an instance runs on model and tool requests. */
        fun guardrails(): GuardrailService.WithRawResponse

        /** Keys on an instance. */
        fun keys(): KeyService.WithRawResponse

        /** MCP servers on an instance, served to agents at one MCP endpoint. */
        fun mcpServers(): McpServerService.WithRawResponse

        /** Named sets of guardrails an instance applies to requests. */
        fun policies(): PolicyService.WithRawResponse

        /** Where an instance applies each policy. */
        fun policyAttachments(): PolicyAttachmentService.WithRawResponse

        /** Teams on an instance: shared model lists, budgets, and rate limits. */
        fun teams(): TeamService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways`, but is otherwise the same as
         * [AgentGatewayService.create].
         */
        @MustBeClosed
        fun create(params: AgentGatewayCreateParams): HttpResponseFor<AgentGatewayResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AgentGatewayCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayResponse>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}`, but is otherwise the
         * same as [AgentGatewayService.retrieve].
         */
        @MustBeClosed
        fun retrieve(instanceId: String): HttpResponseFor<AgentGatewayResponse> =
            retrieve(instanceId, AgentGatewayRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            instanceId: String,
            params: AgentGatewayRetrieveParams = AgentGatewayRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayResponse> =
            retrieve(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            instanceId: String,
            params: AgentGatewayRetrieveParams = AgentGatewayRetrieveParams.none(),
        ): HttpResponseFor<AgentGatewayResponse> =
            retrieve(instanceId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AgentGatewayRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AgentGatewayRetrieveParams): HttpResponseFor<AgentGatewayResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            instanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayResponse> =
            retrieve(instanceId, AgentGatewayRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent_gateways`, but is otherwise the same as
         * [AgentGatewayService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AgentGatewayListPage> = list(AgentGatewayListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentGatewayListParams = AgentGatewayListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentGatewayListParams = AgentGatewayListParams.none()
        ): HttpResponseFor<AgentGatewayListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AgentGatewayListPage> =
            list(AgentGatewayListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent_gateways/{instance_id}`, but is otherwise
         * the same as [AgentGatewayService.delete].
         */
        @MustBeClosed
        fun delete(instanceId: String): HttpResponseFor<AgentGatewayResponse> =
            delete(instanceId, AgentGatewayDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            instanceId: String,
            params: AgentGatewayDeleteParams = AgentGatewayDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayResponse> =
            delete(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            instanceId: String,
            params: AgentGatewayDeleteParams = AgentGatewayDeleteParams.none(),
        ): HttpResponseFor<AgentGatewayResponse> = delete(instanceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AgentGatewayDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AgentGatewayDeleteParams): HttpResponseFor<AgentGatewayResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            instanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayResponse> =
            delete(instanceId, AgentGatewayDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/models`, but is
         * otherwise the same as [AgentGatewayService.retrieveModels].
         */
        @MustBeClosed
        fun retrieveModels(
            instanceId: String
        ): HttpResponseFor<AgentGatewayRetrieveModelsResponse> =
            retrieveModels(instanceId, AgentGatewayRetrieveModelsParams.none())

        /** @see retrieveModels */
        @MustBeClosed
        fun retrieveModels(
            instanceId: String,
            params: AgentGatewayRetrieveModelsParams = AgentGatewayRetrieveModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayRetrieveModelsResponse> =
            retrieveModels(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see retrieveModels */
        @MustBeClosed
        fun retrieveModels(
            instanceId: String,
            params: AgentGatewayRetrieveModelsParams = AgentGatewayRetrieveModelsParams.none(),
        ): HttpResponseFor<AgentGatewayRetrieveModelsResponse> =
            retrieveModels(instanceId, params, RequestOptions.none())

        /** @see retrieveModels */
        @MustBeClosed
        fun retrieveModels(
            params: AgentGatewayRetrieveModelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayRetrieveModelsResponse>

        /** @see retrieveModels */
        @MustBeClosed
        fun retrieveModels(
            params: AgentGatewayRetrieveModelsParams
        ): HttpResponseFor<AgentGatewayRetrieveModelsResponse> =
            retrieveModels(params, RequestOptions.none())

        /** @see retrieveModels */
        @MustBeClosed
        fun retrieveModels(
            instanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayRetrieveModelsResponse> =
            retrieveModels(instanceId, AgentGatewayRetrieveModelsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/spend_logs`, but is
         * otherwise the same as [AgentGatewayService.retrieveSpendLogs].
         */
        @MustBeClosed
        fun retrieveSpendLogs(
            instanceId: String
        ): HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse> =
            retrieveSpendLogs(instanceId, AgentGatewayRetrieveSpendLogsParams.none())

        /** @see retrieveSpendLogs */
        @MustBeClosed
        fun retrieveSpendLogs(
            instanceId: String,
            params: AgentGatewayRetrieveSpendLogsParams =
                AgentGatewayRetrieveSpendLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse> =
            retrieveSpendLogs(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see retrieveSpendLogs */
        @MustBeClosed
        fun retrieveSpendLogs(
            instanceId: String,
            params: AgentGatewayRetrieveSpendLogsParams = AgentGatewayRetrieveSpendLogsParams.none(),
        ): HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse> =
            retrieveSpendLogs(instanceId, params, RequestOptions.none())

        /** @see retrieveSpendLogs */
        @MustBeClosed
        fun retrieveSpendLogs(
            params: AgentGatewayRetrieveSpendLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse>

        /** @see retrieveSpendLogs */
        @MustBeClosed
        fun retrieveSpendLogs(
            params: AgentGatewayRetrieveSpendLogsParams
        ): HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse> =
            retrieveSpendLogs(params, RequestOptions.none())

        /** @see retrieveSpendLogs */
        @MustBeClosed
        fun retrieveSpendLogs(
            instanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse> =
            retrieveSpendLogs(
                instanceId,
                AgentGatewayRetrieveSpendLogsParams.none(),
                requestOptions,
            )
    }
}
