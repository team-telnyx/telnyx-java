// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.AgentGatewayCreateParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayDeleteParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayListPageAsync
import com.telnyx.sdk.models.agentgateways.AgentGatewayListParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayResponse
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveModelsParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveModelsResponse
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveSpendLogsParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveSpendLogsResponse
import com.telnyx.sdk.services.async.agentgateways.ApiServiceAsync
import com.telnyx.sdk.services.async.agentgateways.GuardrailServiceAsync
import com.telnyx.sdk.services.async.agentgateways.KeyServiceAsync
import com.telnyx.sdk.services.async.agentgateways.McpServerServiceAsync
import com.telnyx.sdk.services.async.agentgateways.PolicyAttachmentServiceAsync
import com.telnyx.sdk.services.async.agentgateways.PolicyServiceAsync
import com.telnyx.sdk.services.async.agentgateways.TeamServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AgentGatewayServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentGatewayServiceAsync

    /** REST APIs on an instance, served to agents as tools. */
    fun apis(): ApiServiceAsync

    /** Checks an instance runs on model and tool requests. */
    fun guardrails(): GuardrailServiceAsync

    /** Keys on an instance. */
    fun keys(): KeyServiceAsync

    /** MCP servers on an instance, served to agents at one MCP endpoint. */
    fun mcpServers(): McpServerServiceAsync

    /** Named sets of guardrails an instance applies to requests. */
    fun policies(): PolicyServiceAsync

    /** Where an instance applies each policy. */
    fun policyAttachments(): PolicyAttachmentServiceAsync

    /** Teams on an instance: shared model lists, budgets, and rate limits. */
    fun teams(): TeamServiceAsync

    /**
     * Creates an Agent Gateway instance on one of the account's WireGuard Interfaces. The instance
     * starts `pending`, moves to `provisioning`, and then to `ready` or `failed`. It joins the
     * WireGuard Interface as a peer named `agw-<instance id>`, and its `gateway_url` is set when it
     * is `ready`.
     */
    fun create(params: AgentGatewayCreateParams): CompletableFuture<AgentGatewayResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentGatewayCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayResponse>

    /** Returns one of the account's Agent Gateway instances. */
    fun retrieve(instanceId: String): CompletableFuture<AgentGatewayResponse> =
        retrieve(instanceId, AgentGatewayRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        instanceId: String,
        params: AgentGatewayRetrieveParams = AgentGatewayRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayResponse> =
        retrieve(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        instanceId: String,
        params: AgentGatewayRetrieveParams = AgentGatewayRetrieveParams.none(),
    ): CompletableFuture<AgentGatewayResponse> = retrieve(instanceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentGatewayRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayResponse>

    /** @see retrieve */
    fun retrieve(params: AgentGatewayRetrieveParams): CompletableFuture<AgentGatewayResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        instanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayResponse> =
        retrieve(instanceId, AgentGatewayRetrieveParams.none(), requestOptions)

    /** Lists the account's Agent Gateway instances, newest first, one page at a time. */
    fun list(): CompletableFuture<AgentGatewayListPageAsync> = list(AgentGatewayListParams.none())

    /** @see list */
    fun list(
        params: AgentGatewayListParams = AgentGatewayListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayListPageAsync>

    /** @see list */
    fun list(
        params: AgentGatewayListParams = AgentGatewayListParams.none()
    ): CompletableFuture<AgentGatewayListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AgentGatewayListPageAsync> =
        list(AgentGatewayListParams.none(), requestOptions)

    /**
     * Deletes an Agent Gateway instance in any status. The response shows it `deleting`; repeating
     * the request answers the same until the instance is gone, and then `404`. The instance's
     * engine and everything stored on it are removed.
     */
    fun delete(instanceId: String): CompletableFuture<AgentGatewayResponse> =
        delete(instanceId, AgentGatewayDeleteParams.none())

    /** @see delete */
    fun delete(
        instanceId: String,
        params: AgentGatewayDeleteParams = AgentGatewayDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayResponse> =
        delete(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        instanceId: String,
        params: AgentGatewayDeleteParams = AgentGatewayDeleteParams.none(),
    ): CompletableFuture<AgentGatewayResponse> = delete(instanceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AgentGatewayDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayResponse>

    /** @see delete */
    fun delete(params: AgentGatewayDeleteParams): CompletableFuture<AgentGatewayResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        instanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayResponse> =
        delete(instanceId, AgentGatewayDeleteParams.none(), requestOptions)

    /**
     * Lists the models the instance serves. Each has the name a request uses, the Telnyx Inference
     * model behind it, and its price per million tokens.
     */
    fun retrieveModels(instanceId: String): CompletableFuture<AgentGatewayRetrieveModelsResponse> =
        retrieveModels(instanceId, AgentGatewayRetrieveModelsParams.none())

    /** @see retrieveModels */
    fun retrieveModels(
        instanceId: String,
        params: AgentGatewayRetrieveModelsParams = AgentGatewayRetrieveModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayRetrieveModelsResponse> =
        retrieveModels(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see retrieveModels */
    fun retrieveModels(
        instanceId: String,
        params: AgentGatewayRetrieveModelsParams = AgentGatewayRetrieveModelsParams.none(),
    ): CompletableFuture<AgentGatewayRetrieveModelsResponse> =
        retrieveModels(instanceId, params, RequestOptions.none())

    /** @see retrieveModels */
    fun retrieveModels(
        params: AgentGatewayRetrieveModelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayRetrieveModelsResponse>

    /** @see retrieveModels */
    fun retrieveModels(
        params: AgentGatewayRetrieveModelsParams
    ): CompletableFuture<AgentGatewayRetrieveModelsResponse> =
        retrieveModels(params, RequestOptions.none())

    /** @see retrieveModels */
    fun retrieveModels(
        instanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayRetrieveModelsResponse> =
        retrieveModels(instanceId, AgentGatewayRetrieveModelsParams.none(), requestOptions)

    /**
     * Lists the requests the instance served with its keys, newest first, one page at a time. The
     * window defaults to the last 24 hours and spans at most 31 days. A row appears a few seconds
     * after its request. The instance must be `ready`; otherwise the request answers `409`.
     */
    fun retrieveSpendLogs(
        instanceId: String
    ): CompletableFuture<AgentGatewayRetrieveSpendLogsResponse> =
        retrieveSpendLogs(instanceId, AgentGatewayRetrieveSpendLogsParams.none())

    /** @see retrieveSpendLogs */
    fun retrieveSpendLogs(
        instanceId: String,
        params: AgentGatewayRetrieveSpendLogsParams = AgentGatewayRetrieveSpendLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayRetrieveSpendLogsResponse> =
        retrieveSpendLogs(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see retrieveSpendLogs */
    fun retrieveSpendLogs(
        instanceId: String,
        params: AgentGatewayRetrieveSpendLogsParams = AgentGatewayRetrieveSpendLogsParams.none(),
    ): CompletableFuture<AgentGatewayRetrieveSpendLogsResponse> =
        retrieveSpendLogs(instanceId, params, RequestOptions.none())

    /** @see retrieveSpendLogs */
    fun retrieveSpendLogs(
        params: AgentGatewayRetrieveSpendLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayRetrieveSpendLogsResponse>

    /** @see retrieveSpendLogs */
    fun retrieveSpendLogs(
        params: AgentGatewayRetrieveSpendLogsParams
    ): CompletableFuture<AgentGatewayRetrieveSpendLogsResponse> =
        retrieveSpendLogs(params, RequestOptions.none())

    /** @see retrieveSpendLogs */
    fun retrieveSpendLogs(
        instanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayRetrieveSpendLogsResponse> =
        retrieveSpendLogs(instanceId, AgentGatewayRetrieveSpendLogsParams.none(), requestOptions)

    /**
     * A view of [AgentGatewayServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentGatewayServiceAsync.WithRawResponse

        /** REST APIs on an instance, served to agents as tools. */
        fun apis(): ApiServiceAsync.WithRawResponse

        /** Checks an instance runs on model and tool requests. */
        fun guardrails(): GuardrailServiceAsync.WithRawResponse

        /** Keys on an instance. */
        fun keys(): KeyServiceAsync.WithRawResponse

        /** MCP servers on an instance, served to agents at one MCP endpoint. */
        fun mcpServers(): McpServerServiceAsync.WithRawResponse

        /** Named sets of guardrails an instance applies to requests. */
        fun policies(): PolicyServiceAsync.WithRawResponse

        /** Where an instance applies each policy. */
        fun policyAttachments(): PolicyAttachmentServiceAsync.WithRawResponse

        /** Teams on an instance: shared model lists, budgets, and rate limits. */
        fun teams(): TeamServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways`, but is otherwise the same as
         * [AgentGatewayServiceAsync.create].
         */
        fun create(
            params: AgentGatewayCreateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AgentGatewayCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}`, but is otherwise the
         * same as [AgentGatewayServiceAsync.retrieve].
         */
        fun retrieve(instanceId: String): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> =
            retrieve(instanceId, AgentGatewayRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            instanceId: String,
            params: AgentGatewayRetrieveParams = AgentGatewayRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> =
            retrieve(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            instanceId: String,
            params: AgentGatewayRetrieveParams = AgentGatewayRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> =
            retrieve(instanceId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AgentGatewayRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AgentGatewayRetrieveParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            instanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> =
            retrieve(instanceId, AgentGatewayRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent_gateways`, but is otherwise the same as
         * [AgentGatewayServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AgentGatewayListPageAsync>> =
            list(AgentGatewayListParams.none())

        /** @see list */
        fun list(
            params: AgentGatewayListParams = AgentGatewayListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayListPageAsync>>

        /** @see list */
        fun list(
            params: AgentGatewayListParams = AgentGatewayListParams.none()
        ): CompletableFuture<HttpResponseFor<AgentGatewayListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AgentGatewayListPageAsync>> =
            list(AgentGatewayListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent_gateways/{instance_id}`, but is otherwise
         * the same as [AgentGatewayServiceAsync.delete].
         */
        fun delete(instanceId: String): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> =
            delete(instanceId, AgentGatewayDeleteParams.none())

        /** @see delete */
        fun delete(
            instanceId: String,
            params: AgentGatewayDeleteParams = AgentGatewayDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> =
            delete(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see delete */
        fun delete(
            instanceId: String,
            params: AgentGatewayDeleteParams = AgentGatewayDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> =
            delete(instanceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AgentGatewayDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>>

        /** @see delete */
        fun delete(
            params: AgentGatewayDeleteParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            instanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> =
            delete(instanceId, AgentGatewayDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/models`, but is
         * otherwise the same as [AgentGatewayServiceAsync.retrieveModels].
         */
        fun retrieveModels(
            instanceId: String
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveModelsResponse>> =
            retrieveModels(instanceId, AgentGatewayRetrieveModelsParams.none())

        /** @see retrieveModels */
        fun retrieveModels(
            instanceId: String,
            params: AgentGatewayRetrieveModelsParams = AgentGatewayRetrieveModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveModelsResponse>> =
            retrieveModels(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see retrieveModels */
        fun retrieveModels(
            instanceId: String,
            params: AgentGatewayRetrieveModelsParams = AgentGatewayRetrieveModelsParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveModelsResponse>> =
            retrieveModels(instanceId, params, RequestOptions.none())

        /** @see retrieveModels */
        fun retrieveModels(
            params: AgentGatewayRetrieveModelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveModelsResponse>>

        /** @see retrieveModels */
        fun retrieveModels(
            params: AgentGatewayRetrieveModelsParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveModelsResponse>> =
            retrieveModels(params, RequestOptions.none())

        /** @see retrieveModels */
        fun retrieveModels(
            instanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveModelsResponse>> =
            retrieveModels(instanceId, AgentGatewayRetrieveModelsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/spend_logs`, but is
         * otherwise the same as [AgentGatewayServiceAsync.retrieveSpendLogs].
         */
        fun retrieveSpendLogs(
            instanceId: String
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse>> =
            retrieveSpendLogs(instanceId, AgentGatewayRetrieveSpendLogsParams.none())

        /** @see retrieveSpendLogs */
        fun retrieveSpendLogs(
            instanceId: String,
            params: AgentGatewayRetrieveSpendLogsParams =
                AgentGatewayRetrieveSpendLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse>> =
            retrieveSpendLogs(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see retrieveSpendLogs */
        fun retrieveSpendLogs(
            instanceId: String,
            params: AgentGatewayRetrieveSpendLogsParams = AgentGatewayRetrieveSpendLogsParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse>> =
            retrieveSpendLogs(instanceId, params, RequestOptions.none())

        /** @see retrieveSpendLogs */
        fun retrieveSpendLogs(
            params: AgentGatewayRetrieveSpendLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse>>

        /** @see retrieveSpendLogs */
        fun retrieveSpendLogs(
            params: AgentGatewayRetrieveSpendLogsParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse>> =
            retrieveSpendLogs(params, RequestOptions.none())

        /** @see retrieveSpendLogs */
        fun retrieveSpendLogs(
            instanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse>> =
            retrieveSpendLogs(
                instanceId,
                AgentGatewayRetrieveSpendLogsParams.none(),
                requestOptions,
            )
    }
}
