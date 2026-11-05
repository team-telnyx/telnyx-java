// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayApiResponse
import com.telnyx.sdk.models.agentgateways.apis.ApiCreateParams
import com.telnyx.sdk.models.agentgateways.apis.ApiDeleteParams
import com.telnyx.sdk.models.agentgateways.apis.ApiListParams
import com.telnyx.sdk.models.agentgateways.apis.ApiListResponse
import com.telnyx.sdk.models.agentgateways.apis.ApiUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** REST APIs on an instance, served to agents as tools. */
interface ApiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiServiceAsync

    /**
     * Adds a REST API by its OpenAPI description. Each operation becomes a tool at
     * `{gateway_url}/mcp`, named with the API's `name`, a hyphen, and the lowercased `operationId`.
     * A description the gateway cannot fetch yields an API with no tools. The instance must be
     * `ready`; otherwise the request answers `409`.
     */
    fun create(
        instanceId: String,
        params: ApiCreateParams,
    ): CompletableFuture<AgentGatewayApiResponse> =
        create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: ApiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayApiResponse> =
        create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(params: ApiCreateParams): CompletableFuture<AgentGatewayApiResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ApiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayApiResponse>

    /**
     * Changes an API's settings. A field left out stays as it is, `"base_url": null` clears the
     * base URL, and `auth` is replaced whole. The instance must be `ready`; otherwise the request
     * answers `409`.
     */
    fun update(apiId: String, params: ApiUpdateParams): CompletableFuture<AgentGatewayApiResponse> =
        update(apiId, params, RequestOptions.none())

    /** @see update */
    fun update(
        apiId: String,
        params: ApiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayApiResponse> =
        update(params.toBuilder().apiId(apiId).build(), requestOptions)

    /** @see update */
    fun update(params: ApiUpdateParams): CompletableFuture<AgentGatewayApiResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ApiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayApiResponse>

    /**
     * Lists the REST APIs the instance serves as tools, without their credentials. The instance
     * must be `ready`; otherwise the request answers `409`.
     */
    fun list(instanceId: String): CompletableFuture<ApiListResponse> =
        list(instanceId, ApiListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: ApiListParams = ApiListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiListResponse> =
        list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(
        instanceId: String,
        params: ApiListParams = ApiListParams.none(),
    ): CompletableFuture<ApiListResponse> = list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ApiListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiListResponse>

    /** @see list */
    fun list(params: ApiListParams): CompletableFuture<ApiListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        instanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiListResponse> = list(instanceId, ApiListParams.none(), requestOptions)

    /**
     * Removes an API and returns it as it was. An MCP server's `id` answers `404`. The instance
     * must be `ready`; otherwise the request answers `409`.
     */
    fun delete(apiId: String, params: ApiDeleteParams): CompletableFuture<AgentGatewayApiResponse> =
        delete(apiId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        apiId: String,
        params: ApiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayApiResponse> =
        delete(params.toBuilder().apiId(apiId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ApiDeleteParams): CompletableFuture<AgentGatewayApiResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ApiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayApiResponse>

    /** A view of [ApiServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/apis`, but is
         * otherwise the same as [ApiServiceAsync.create].
         */
        fun create(
            instanceId: String,
            params: ApiCreateParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>> =
            create(instanceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            instanceId: String,
            params: ApiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ApiCreateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ApiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>>

        /**
         * Returns a raw HTTP response for `patch /agent_gateways/{instance_id}/apis/{api_id}`, but
         * is otherwise the same as [ApiServiceAsync.update].
         */
        fun update(
            apiId: String,
            params: ApiUpdateParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>> =
            update(apiId, params, RequestOptions.none())

        /** @see update */
        fun update(
            apiId: String,
            params: ApiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>> =
            update(params.toBuilder().apiId(apiId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ApiUpdateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ApiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/apis`, but is
         * otherwise the same as [ApiServiceAsync.list].
         */
        fun list(instanceId: String): CompletableFuture<HttpResponseFor<ApiListResponse>> =
            list(instanceId, ApiListParams.none())

        /** @see list */
        fun list(
            instanceId: String,
            params: ApiListParams = ApiListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiListResponse>> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        fun list(
            instanceId: String,
            params: ApiListParams = ApiListParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiListResponse>> =
            list(instanceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ApiListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiListResponse>>

        /** @see list */
        fun list(params: ApiListParams): CompletableFuture<HttpResponseFor<ApiListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiListResponse>> =
            list(instanceId, ApiListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent_gateways/{instance_id}/apis/{api_id}`, but
         * is otherwise the same as [ApiServiceAsync.delete].
         */
        fun delete(
            apiId: String,
            params: ApiDeleteParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>> =
            delete(apiId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            apiId: String,
            params: ApiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>> =
            delete(params.toBuilder().apiId(apiId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: ApiDeleteParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ApiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayApiResponse>>
    }
}
